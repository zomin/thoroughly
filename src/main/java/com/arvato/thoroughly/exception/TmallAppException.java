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
package com.arvato.thoroughly.exception;

import com.arvato.thoroughly.util.CommonUtils;
import com.arvato.thoroughly.vo.response.TmallAppResponse;
import com.taobao.api.TaobaoResponse;

import org.apache.commons.lang3.StringUtils;


public class TmallAppException extends RuntimeException
{

	private static final long serialVersionUID = -5325392504946334907L;

	protected static TmallAppResponse tmallAppResponse;

	/**
	 * AppException
	 */
	public TmallAppException()
	{
		super();
	}

	public TmallAppException(String code, TaobaoResponse taobaoResponse)
	{
		super(parseTaobaoResponse(code, taobaoResponse));
	}

	/**
	 * @param code
	 * @param msg
	 */
	public TmallAppException(String code, String msg)
	{
		super(initErrorMessage(code, msg, null));
	}

	/**
	 * @param code
	 * @param msg
	 * @param body
	 */
	public TmallAppException(String code, String msg, Object body)
	{
		super(initErrorMessage(code, msg, body));
	}

	private static String initErrorMessage(String code, String msg, Object body)
	{
		if (StringUtils.isEmpty(msg))
		{
			msg = "Unknown exception, please contact the administrator.";
		}
		tmallAppResponse = new TmallAppResponse(code, msg, body);
		String responseJson = CommonUtils.getGsonByBuilder(false).toJson(tmallAppResponse);
		return responseJson;
	}

	private static String parseTaobaoResponse(String code, TaobaoResponse taobaoResponse)
	{
		String msg = taobaoResponse.getSubMsg();
		if (StringUtils.isEmpty(msg))
		{
			msg = taobaoResponse.getSubCode();
		}
		return initErrorMessage(code, msg, null);
	}
}
