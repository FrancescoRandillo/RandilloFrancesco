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
package my.cyclingracinguiip.stage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingracinguiip.model.StageModel;
import my.cyclingracinguiip.stage.dao.StageDao;
import my.cyclingracinguiip.stage.service.StageService;


/**
 *
 */
public class DefaultStageService implements StageService
{
	StageDao stageDao;

	/**
	 * @return the stageDao
	 */
	public StageDao getStageDao()
	{
		return stageDao;
	}

	/**
	 * @param stageDao
	 *           the stageDao to set
	 */
	@Required
	public void setStageDao(final StageDao stageDao)
	{
		this.stageDao = stageDao;
	}

	@Override
	public List<StageModel> getStage()
	{
		final List<StageModel> stageList = stageDao.findStagebyOntrial();
		if (stageList.isEmpty())
		{
			return null;
		}
		else
		{
			return stageList;
		}
	}

}
