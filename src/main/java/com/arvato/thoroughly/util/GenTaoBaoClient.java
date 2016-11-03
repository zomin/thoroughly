package com.arvato.thoroughly.util;

import com.google.gson.Gson;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.LogisticsOrdersDetailGetRequest;

import java.util.Date;


/**
 * Created by ZHAO130 on 2016/10/28.
 */
public class GenTaoBaoClient {


    public static TaobaoClient genDefaultClient() {
        String url = "";
        String appKey = "";
        String appSecret = "";

        return new DefaultTaobaoClient(url, appKey, appSecret);
    }

    public static void main(String[] asd){
        LogisticsOrdersDetailGetRequest logisticsOrdersDetailGetRequest = new LogisticsOrdersDetailGetRequest();
        logisticsOrdersDetailGetRequest.setFields("");
        logisticsOrdersDetailGetRequest.setTid(123l);
        logisticsOrdersDetailGetRequest.setBuyerNick("123");
        logisticsOrdersDetailGetRequest.setEndCreated(new Date());
        logisticsOrdersDetailGetRequest.setFreightPayer("123");
        logisticsOrdersDetailGetRequest.setPageNo(1l);
        logisticsOrdersDetailGetRequest.setPageSize(10l);
        logisticsOrdersDetailGetRequest.setReceiverName("123");
        logisticsOrdersDetailGetRequest.setSellerConfirm("123");
        logisticsOrdersDetailGetRequest.setStartCreated(new Date());
        logisticsOrdersDetailGetRequest.setType("123");
//        logisticsOnlineSendRequest.setBatchApiOrder(01);
//        logisticsOnlineSendRequest.setBatchApiSession("");
//        Map<String,String> map=new HashMap<String,String>();
//        logisticsOnlineSendRequest.setHeaderMap(map);
//        logisticsOnlineSendRequest.setTargetAppKey("");
//        logisticsOnlineSendRequest.setTimestamp(Timestamp.valueOf("2016-10-23 12:23:34").getTime());
//        logisticsOnlineSendRequest.setTopMixParams("");
        Gson gson = new Gson();
        String json = gson.toJson(logisticsOrdersDetailGetRequest);
        System.out.println(json);
    }
}
