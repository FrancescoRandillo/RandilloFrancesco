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
package my.cyclingracinguiip.cyclistranking.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cyclingracinguiip.cyclistranking.dao.CyclistRankingDao;
import my.cyclingracinguiip.model.CyclistModel;
import my.cyclingracinguiip.model.CyclistRankingModel;


/**
 *
 */
public class DefaultCyclistRankingDao extends AbstractItemDao implements CyclistRankingDao
{

	@Override
	public List<CyclistRankingModel> findCyclingRanking()
	{
		final String sql = "SELECT {PK} " + "FROM{CyclistRanking}" + "ORDER BY{totRacing}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(sql);
		final SearchResult<CyclistRankingModel> result = getFlexibleSearchService().search(fsq);
		final List<CyclistRankingModel> list = result.getResult();
		return list;
	}

	@Override
	public List<CyclistRankingModel> findCyclistRankingByCyclistID(final CyclistModel cyclist)
	{
		final String sql = "SELECT {PK} " + "FROM{CyclistRanking as cr JOIN Cyclist as c on {as.cyclist}={c.PK}}"
				+ "WHERE {c.PK}=&cyclist";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(sql);
		fsq.addQueryParameter("cyclist", cyclist);
		final SearchResult<CyclistRankingModel> result = getFlexibleSearchService().search(fsq);
		final List<CyclistRankingModel> list = result.getResult();
		return list;
	}
}
