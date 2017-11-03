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
package my.cyclingracinguiip.cyclistteam.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cyclingracinguiip.cyclistteam.dao.CyclistTeamDao;
import my.cyclingracinguiip.model.CyclistModel;
import my.cyclingracinguiip.model.CyclistTeamModel;
import my.cyclingracinguiip.model.ManagerModel;


/**
 *
 */
public class DefaultCyclistTeamDao extends AbstractItemDao implements CyclistTeamDao
{

	@Override
	public List<CyclistTeamModel> findAllTeam()
	{
		final String sql = "SELECT {PK} " + "FROM{CyclistTeam}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(sql);
		final SearchResult<CyclistTeamModel> result = getFlexibleSearchService().search(fsq);
		final List<CyclistTeamModel> teams = result.getResult();
		return teams;
	}

	@Override
	public List<CyclistModel> findCyclistbyTeam(final CyclistTeamModel team)
	{
		final String sql = "SELECT {c.PK} " + "FROM{Cyclist as c JOIN CyclistTeam as ct on {c.cyclistTeam}={ct.PK}}"
				+ " WHERE {c.cyclistTeam}=?team";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(sql);
		fsq.addQueryParameter("team", team);
		final SearchResult<CyclistModel> result = getFlexibleSearchService().search(fsq);

		final List<CyclistModel> cyclists = result.getResult();
		return cyclists;
	}

	@Override
	public List<ManagerModel> findManagerbyTeam(final CyclistTeamModel team)
	{
		final String sql = "SELECT {manager} " + "FROM{CyclistTeam}" + " WHERE {PK}=?team";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(sql);
		fsq.addQueryParameter("team", team);
		final SearchResult<ManagerModel> result = getFlexibleSearchService().search(fsq);

		final List<ManagerModel> cyclists = result.getResult();
		return cyclists;
	}

}
