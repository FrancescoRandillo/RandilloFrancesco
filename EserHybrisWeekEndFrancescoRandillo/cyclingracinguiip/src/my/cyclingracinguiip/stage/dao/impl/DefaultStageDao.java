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
package my.cyclingracinguiip.stage.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cyclingracinguiip.model.StageModel;
import my.cyclingracinguiip.stage.dao.StageDao;


/**
 *
 */
public class DefaultStageDao extends AbstractItemDao implements StageDao
{

	@Override
	public List<StageModel> findStagebyOntrial()
	{
		final String sql = "SELECT {PK} " + "FROM{Stage}" + " WHERE {onTrial}='NO'";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(sql);
		final SearchResult<StageModel> result = getFlexibleSearchService().search(fsq);
		final List<StageModel> stages = result.getResult();
		return stages;
	}

}
