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

import com.arvato.thoroughly.service.tmall.impl.AccessTokenServiceImpl;
import com.arvato.thoroughly.model.JdpTbTrade;
import com.arvato.thoroughly.service.tmall.APIService;
import com.arvato.thoroughly.service.tmall.TradeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemProcessListener;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * Trade Processor
 */
@Component("tmall.tradeProcessor")
@Scope(value = "step")
public class TradeProcessor implements ItemProcessor<JdpTbTrade, JdpTbTrade>, ItemProcessListener<JdpTbTrade, JdpTbTrade>
{

	private static final Logger LOGGER = LoggerFactory.getLogger(AccessTokenServiceImpl.class);

	@Resource(name = "tmall.APIServiceImpl")
	private APIService apiService;

	@Resource(name = "tmall.tradeService")
	private TradeService orderService;

	@Value("#{jobParameters['integrationId']}")
	private String integrationId;

	@Override
	public JdpTbTrade process(JdpTbTrade jdpTbTrade) throws Exception
	{
		return jdpTbTrade;
	}
	@Override
	public void onProcessError(final JdpTbTrade item, final Exception e)
	{
		LOGGER.error("An exception occurs in the processor, the item code is :" + item);
	}

	@Override
	public void beforeProcess(final JdpTbTrade item)
	{
	}

	@Override
	public void afterProcess(JdpTbTrade aLong, JdpTbTrade jdpTbTrade)
	{

	}

}
