/**
 * Created by Kalend Zhang on 2016/10/25,025 .
 */

package com.arvato.thoroughly.service.tmall;

import com.arvato.thoroughly.vo.response.JdpTbTradeResponse;
import com.arvato.thoroughly.model.JdpTbTrade;

import java.util.Date;
import java.util.List;


public interface TradeService
{
   public List<JdpTbTrade> getJdpTbTrade(Date start,Date end);

   public void pushJdpTbTrade(JdpTbTradeResponse jdpTbTradeResponse);
}
