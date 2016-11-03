/**
 * Created by Kalend Zhang on 2016/10/25,025 .
 */

package com.arvato.thoroughly.controller;

import com.arvato.thoroughly.util.CommonUtils;
import com.arvato.thoroughly.vo.request.TradeDownloadRequest;
import com.arvato.thoroughly.vo.response.TmallAppResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/biz/trade")
public class TradeController
{
   private static final Logger LOGGER = LoggerFactory.getLogger(TradeController.class);


   @RequestMapping(value = "/test")
   public TmallAppResponse init(@RequestBody final TradeDownloadRequest data){

      if (data != null)
      {
         final String jsonContent = CommonUtils.getGsonByBuilder(false).toJson(data);
         LOGGER.info(jsonContent);

      }

      return new TmallAppResponse();
   }
}
