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
package my.cyclingracinguiip.cyclist.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cyclingracinguiip.cyclist.dao.CyclistDao;
import my.cyclingracinguiip.model.CyclistModel;


/**
 *
 */
public class DefaultCyclistDao extends AbstractItemDao implements CyclistDao
{

	@Override
	public List<CyclistModel> findAllCyclist()
	{
		final String sql = "SELECT {PK} " + "FROM{Cyclist}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(sql);
		final SearchResult<CyclistModel> result = getFlexibleSearchService().search(fsq);
		final List<CyclistModel> list = result.getResult();
		return list;
	}

}
