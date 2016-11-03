/**
 * Created by Kalend Zhang on 2016/10/25,025 .
 */

package com.arvato.thoroughly.service.tmall.impl;

import com.google.gson.JsonObject;

import com.arvato.thoroughly.dao.JdpTbTradeMapper;
import com.arvato.thoroughly.model.JdpTbTrade;
import com.arvato.thoroughly.service.tmall.TradeService;
import com.arvato.thoroughly.util.CommonUtils;
import com.arvato.thoroughly.util.RestTemplateUtil;
import com.arvato.thoroughly.vo.response.JdpTbTradeResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service("tmall.tradeService")
public class TradeServiceImpl extends BaseServiceImpl implements TradeService
{
   private static final Logger LOGGER = LoggerFactory.getLogger(TradeServiceImpl.class);
   @Value("${hybris.server.url}")
   private String hybrisServiceUrl;

   @Autowired
   private JdpTbTradeMapper jdpTbTradeMapper;

   @Autowired
   protected RestTemplateUtil restTemplateUtil;

   @Override
   public List<JdpTbTrade> getJdpTbTrade(Date start, Date end)
   {
      return jdpTbTradeMapper.selectByModify(start,end);
   }


   @Override
   public void pushJdpTbTrade(JdpTbTradeResponse jdpTbTradeResponse)
   {
      String content = CommonUtils.getGsonByBuilder(false).toJson(jdpTbTradeResponse);
      LOGGER.info(content);
      JsonObject responseResults  = restTemplateUtil.post(hybrisServiceUrl,content);

      Boolean flag = responseResults.get("flag").getAsBoolean();
      String tids = responseResults.get("tids").getAsString();
      LOGGER.info("flag:"+flag+"tids:"+tids);
   }
}
