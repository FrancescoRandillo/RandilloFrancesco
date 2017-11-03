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
package my.cyclingracinguiip.cyclistteam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingracinguiip.cyclistteam.dao.CyclistTeamDao;
import my.cyclingracinguiip.cyclistteam.service.CyclistTeamService;
import my.cyclingracinguiip.model.CyclistModel;
import my.cyclingracinguiip.model.CyclistTeamModel;
import my.cyclingracinguiip.model.ManagerModel;


/**
 *
 */
public class DefaultCyclistTeamService implements CyclistTeamService
{
	CyclistTeamDao teamDao;


	public CyclistTeamDao getTeamDao()
	{
		return teamDao;
	}

	@Required
	public void setTeamDao(final CyclistTeamDao teamDao)
	{
		this.teamDao = teamDao;
	}

	@Override
	public List<CyclistModel> getCyclistForTeam(final CyclistTeamModel team)
	{
		final List<CyclistModel> cyclistList = teamDao.findCyclistbyTeam(team);
		if (cyclistList.isEmpty())
		{
			return null;
		}
		else
		{
			return cyclistList;
		}
	}

	@Override
	public ManagerModel getManagerForTeam(final CyclistTeamModel team)
	{
		final List<ManagerModel> managerList = teamDao.findManagerbyTeam(team);
		if (managerList.isEmpty())
		{
			return null;
		}
		else if (managerList.size() > 1)
		{
			System.out.println("non ci puo essere più di un risultato");
		}
		else
		{
			return managerList.get(0);
		}
		return null;
	}

	@Override
	public List<CyclistTeamModel> getAllTeam()
	{

		final List<CyclistTeamModel> teamList = teamDao.findAllTeam();
		if (teamList.isEmpty())
		{
			return null;
		}
		else
		{
			return teamList;
		}
	}

}
