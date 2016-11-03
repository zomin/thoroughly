/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package com.arvato.thoroughly.trade;

import com.arvato.thoroughly.util.CommonUtils;
import com.arvato.thoroughly.model.JdpTbTrade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemWriteListener;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Trade Writer
 */
@Component("tmall.tradeWriter")
@Scope(value = "step")
public class TradeWriter implements ItemWriter<JdpTbTrade>, ItemWriteListener<JdpTbTrade>
{

	private static final Logger LOGGER = LoggerFactory.getLogger(TradeWriter.class);


	@Override
	public void write(final List<? extends JdpTbTrade> jdpTbTrades) throws Exception
	{

 		final String body = CommonUtils.getGsonByBuilder(false).toJson(jdpTbTrades);
		LOGGER.info("witer:"+body);
	}

	@Override
	public void beforeWrite(final List<? extends JdpTbTrade> items)
	{

	}

	@Override
	public void afterWrite(final List<? extends JdpTbTrade> items)
	{
		LOGGER.info("Post to datahub :" + items.size());
	}

	@Override
	public void onWriteError(final Exception exception, final List<? extends JdpTbTrade> items)
	{
		LOGGER.error("Failed to send the current order list:" + items.size());
	}


}
