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
package my.cyclingracinguiip.stageranking.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cyclingracinguiip.model.CyclistModel;
import my.cyclingracinguiip.model.StageModel;
import my.cyclingracinguiip.model.StageRankingModel;
import my.cyclingracinguiip.stageranking.dao.StageRankingDao;


/**
 *
 */
public class DefaultStageRankingDao extends AbstractItemDao implements StageRankingDao
{

	@Override
	public List<StageRankingModel> findStageRankingTotTimeByCyclist(final StageModel stage, final CyclistModel cyclist)
	{
		final String sql = "SELECT {s.time}, " + "FROM{StageRanking as s JOIN Cyclist as c on {s.cyclist}={c.PK}}"
				+ " WHERE {s.stage}=&stage AND {c.PK}=&cyclist";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(sql);
		fsq.addQueryParameter("stage", stage);
		fsq.addQueryParameter("cyclist", cyclist);
		final SearchResult<StageRankingModel> result = getFlexibleSearchService().search(fsq);
		final List<StageRankingModel> list = result.getResult();
		return list;
	}

}
