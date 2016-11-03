/**
 * Created by Kalend Zhang on 2016/10/25,025 .
 */

package com.arvato.thoroughly.job;

import com.arvato.thoroughly.model.JdpTbTrade;
import com.arvato.thoroughly.model.SyncBatch;
import com.arvato.thoroughly.service.tmall.TradeService;
import com.arvato.thoroughly.util.CommonUtils;
import com.arvato.thoroughly.vo.response.JdpTbTradeResponse;

import org.apache.commons.lang3.StringUtils;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;



public class JstClientJob
{
   private static final Logger LOGGER = LoggerFactory.getLogger(JstClientJob.class);
//
//   @Autowired
//   private JobLauncher jobLauncher;
//
//   @Autowired
//   private ApplicationContext ctx;

   @Value("${persistence.url}")
   private String persistenceUrl;

   @Resource(name = "tmall.tradeService")
   private TradeService tradeService;

   @Value("${sync.limit}")
   private Integer limitCount;  //一次同步的条数

   private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

   public void execute() throws JobExecutionException
   {
      SyncBatch syncBatch = null;
      String tradeSyncJson = CommonUtils.readFile(persistenceUrl + "tradeSync.json");
      String content ="";
      if (StringUtils.isNotEmpty(tradeSyncJson))
      {
         syncBatch = CommonUtils.getGsonByBuilder().fromJson(tradeSyncJson, SyncBatch.class);
      }
      try{
         String startDate = null;

         if(null != syncBatch){
            startDate = syncBatch.getSyncLastTime();
         }
         final List<Map<String, Date>> dateItems =
               CommonUtils.findDates(
                     CommonUtils.stringToDate(startDate) ,new Date()
               );

         for(Map<String,Date> dateItem : dateItems){
            List<JdpTbTrade> jdpTbTrades = tradeService.getJdpTbTrade(dateItem.get("start"),dateItem.get("end"));

            List<List<JdpTbTrade>> splitJdpTradeLists = CommonUtils.splitList(jdpTbTrades,limitCount);

            for (int i = 0; i < splitJdpTradeLists.size(); i++) {
               List<JdpTbTrade> resultsplirtList = splitJdpTradeLists.get(i);
               JdpTbTradeResponse jdpTbTradeResponse = new JdpTbTradeResponse();
               jdpTbTradeResponse.setJdpTbTrades(resultsplirtList);

               tradeService.pushJdpTbTrade(jdpTbTradeResponse);
               //            CommonUtils.getGsonByBuilder().fromJson(response, JdpTradeResponse.class);
            }
            SyncBatch syncBatch1 = new SyncBatch();
            syncBatch1.setSyncLastTime(sdf.format(dateItem.get("end")));
            content = CommonUtils.getGsonByBuilder().toJson(syncBatch1);
         }

         CommonUtils.writeFile(persistenceUrl + "tradeSync",content);
      }catch (Exception ex){
         ex.printStackTrace();
      }


   }
}
