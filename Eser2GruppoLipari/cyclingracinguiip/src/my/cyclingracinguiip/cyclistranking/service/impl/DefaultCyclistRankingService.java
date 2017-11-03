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
package my.cyclingracinguiip.cyclistranking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingracinguiip.cyclistranking.dao.CyclistRankingDao;
import my.cyclingracinguiip.cyclistranking.service.CyclistRankingService;
import my.cyclingracinguiip.model.CyclistModel;
import my.cyclingracinguiip.model.CyclistRankingModel;


/**
 *
 */
public class DefaultCyclistRankingService implements CyclistRankingService
{
	CyclistRankingDao cyclistRankingDao;

	/**
	 * @return the cyclistRankingDao
	 */
	public CyclistRankingDao getCyclistRankingDao()
	{
		return cyclistRankingDao;
	}

	/**
	 * @param cyclistRankingDao
	 *           the cyclistRankingDao to set
	 */
	@Required
	public void setCyclistRankingDao(final CyclistRankingDao cyclistRankingDao)
	{
		this.cyclistRankingDao = cyclistRankingDao;
	}

	@Override
	public List<CyclistRankingModel> getCyclistRankingInOrder()
	{
		final List<CyclistRankingModel> stageList = cyclistRankingDao.findCyclingRanking();
		if (stageList.isEmpty())
		{
			return null;
		}
		else
		{
			return stageList;
		}
	}

	@Override
	public CyclistRankingModel getCyclistRankingForCyclistID(final CyclistModel cyclistModel)
	{
		final List<CyclistRankingModel> stageList = cyclistRankingDao.findCyclistRankingByCyclistID(cyclistModel);
		if (stageList.isEmpty())
		{
			return null;
		}
		else if (stageList.size() > 1)
		{
			System.out.println("there can be no more than one result");
			return null;
		}
		else
		{
			return stageList.get(0);
		}
	}

}
