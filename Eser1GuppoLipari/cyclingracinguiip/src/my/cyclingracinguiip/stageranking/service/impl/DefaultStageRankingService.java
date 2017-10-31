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
package my.cyclingracinguiip.stageranking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingracinguiip.model.CyclistModel;
import my.cyclingracinguiip.model.StageModel;
import my.cyclingracinguiip.model.StageRankingModel;
import my.cyclingracinguiip.stageranking.dao.StageRankingDao;
import my.cyclingracinguiip.stageranking.service.StageRankingService;


/**
 *
 */
public class DefaultStageRankingService implements StageRankingService
{
	StageRankingDao stageRankingDao;

	/**
	 * @return the stageRankingDao
	 */
	public StageRankingDao getStageRankingDao()
	{
		return stageRankingDao;
	}

	/**
	 * @param stageRankingDao
	 *           the stageRankingDao to set
	 */
	@Required
	public void setStageRankingDao(final StageRankingDao stageRankingDao)
	{
		this.stageRankingDao = stageRankingDao;
	}

	@Override
	public List<StageRankingModel> getStageRankingTotTimeForCyclist(final StageModel stage, final CyclistModel cyclist)
	{
		final List<StageRankingModel> list = stageRankingDao.findStageRankingTotTimeByCyclist(stage, cyclist);
		return list;
	}

}
