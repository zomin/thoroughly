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

import com.arvato.thoroughly.model.JdpTbTrade;
import com.arvato.thoroughly.service.tmall.TradeService;
import com.arvato.thoroughly.service.tmall.impl.AccessTokenServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.annotation.OnReadError;
import org.springframework.batch.item.support.ListItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

import javax.annotation.Resource;


/**
 * Trade Reader
 */
@Component("tmall.tradeReader")
@Scope(value = "step")
public class TradeReader extends ListItemReader<JdpTbTrade>
{

	private static final Logger LOGGER = LoggerFactory.getLogger(AccessTokenServiceImpl.class);


	@Resource(name = "tmall.tradeService")
	private TradeService tradeService;
	/**
	 *
	 * @throws Exception
	 */
	@Autowired
	public TradeReader(@Value("#{jobParameters['start']}") final Date start,
	@Value("#{jobParameters['end']}") final Date end,final TradeService tradeService)
		throws Exception
	{
		super(tradeService.getJdpTbTrade(start,end));
	}

	/**
	 * Handle error
	 */
	@OnReadError
	public void onError()
	{
	}
}
