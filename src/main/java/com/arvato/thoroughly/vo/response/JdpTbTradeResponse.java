/**
 * Created by Kalend Zhang on 2016/10/27,027 .
 */

package com.arvato.thoroughly.vo.response;

import com.google.gson.annotations.Expose;

import com.arvato.thoroughly.model.JdpTbTrade;

import java.util.List;


public class JdpTbTradeResponse
{
   @Expose
   private List<JdpTbTrade> jdpTbTrades;

   public List<JdpTbTrade> getJdpTbTrades()
   {
      return jdpTbTrades;
   }

   public void setJdpTbTrades(List<JdpTbTrade> jdpTbTrades)
   {
      this.jdpTbTrades = jdpTbTrades;
   }
}
