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
package my.cyclingracinguiip.cyclistteam.dao;

import java.util.List;

import my.cyclingracinguiip.model.CyclistModel;
import my.cyclingracinguiip.model.CyclistTeamModel;
import my.cyclingracinguiip.model.ManagerModel;


/**
 *
 */
public interface CyclistTeamDao
{
	public List<CyclistTeamModel> findAllTeam();

	public List<CyclistModel> findCyclistbyTeam(CyclistTeamModel team);

	public List<ManagerModel> findManagerbyTeam(CyclistTeamModel team);
}
