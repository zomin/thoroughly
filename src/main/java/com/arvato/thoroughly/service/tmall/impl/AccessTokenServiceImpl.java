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
package com.arvato.thoroughly.service.tmall.impl;

import com.arvato.thoroughly.exception.TmallAppException;
import com.arvato.thoroughly.model.AccessToken;
import com.arvato.thoroughly.service.tmall.AccessTokenService;

import org.springframework.stereotype.Service;

import java.io.IOException;


/**
 * AccessTokenServiceImpl
 */
@Service("tmall.accessTokenServiceImpl")
public class AccessTokenServiceImpl extends BaseServiceImpl implements AccessTokenService
{
//	@Autowired
//	private AttributeEncryptionStrategy encryptionTools;

	@Override
	public void save(final AccessToken accessToken) throws TmallAppException
	{
		super.save(accessToken);
	}

	@Override
	public AccessToken get(final String integrationId) throws TmallAppException
	{
		return super.get(integrationId);
	}

	@Override
	public AccessToken get(final String code, final String appkey, final String secret) throws IOException
	{
		return super.get(code, appkey, secret);
	}

	@Override
	public AccessToken refresh(final String appkey, final String secret, final String refreshToken) throws IOException
	{
		return super.refresh(appkey, secret, refreshToken);
	}

}
