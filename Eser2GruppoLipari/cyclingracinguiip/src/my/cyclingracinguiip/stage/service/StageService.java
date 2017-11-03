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
package my.cyclingracinguiip.stage.service;

import java.util.List;

import my.cyclingracinguiip.model.StageModel;
import my.cyclingracinguiip.model.StageRaceModel;


/**
 *
 */
public interface StageService
{
	public List<StageModel> getStage();

	public List<StageModel> getStageForStageRace(StageRaceModel stageRaceModel);

}
