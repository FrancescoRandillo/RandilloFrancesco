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
package my.cyclingracinguiip.cyclistteam.service;

import java.util.List;

import my.cyclingracingfacadeuiip.data.CyclistTeamData;
import my.cyclingracinguiip.model.CyclistModel;
import my.cyclingracinguiip.model.CyclistTeamModel;
import my.cyclingracinguiip.model.ManagerModel;


/**
 *
 */
public interface CyclistTeamService
{
	public List<CyclistTeamModel> getAllTeam();

	public List<CyclistModel> getCyclistForTeam(CyclistTeamData team);

	public ManagerModel getManagerForTeam(CyclistTeamData team);
}
