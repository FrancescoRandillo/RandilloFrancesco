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
package my.cyclingracingfacadeuiip.cyclistteam.facade;

import java.util.List;

import my.cyclingracingfacadeuiip.data.CyclistData;
import my.cyclingracingfacadeuiip.data.CyclistTeamData;
import my.cyclingracingfacadeuiip.data.ManagerData;


/**
 *
 */
public interface CyclistTeamFacade
{
	public List<CyclistTeamData> getAllTeam();

	public List<CyclistData> getCyclistForTeam(CyclistTeamData t);

	public ManagerData getManagerForTeam(CyclistTeamData t);
}
