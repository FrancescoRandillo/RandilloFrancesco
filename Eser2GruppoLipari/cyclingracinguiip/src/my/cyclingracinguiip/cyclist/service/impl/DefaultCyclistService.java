/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2017 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.cyclingracinguiip.cyclist.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingracinguiip.cyclist.dao.CyclistDao;
import my.cyclingracinguiip.cyclist.service.CyclistService;
import my.cyclingracinguiip.model.CyclistModel;


/**
 *
 */
public class DefaultCyclistService implements CyclistService
{
	CyclistDao cyclistDao;

	@Override
	public List<CyclistModel> getAllCyclist()
	{
		final List<CyclistModel> list = cyclistDao.findAllCyclist();
		return list;
	}

	/**
	 * @return the cyclistDao
	 */
	public CyclistDao getCyclistDao()
	{
		return cyclistDao;
	}

	/**
	 * @param cyclistDao
	 *           the cyclistDao to set
	 */
	@Required
	public void setCyclistDao(final CyclistDao cyclistDao)
	{
		this.cyclistDao = cyclistDao;
	}

}
