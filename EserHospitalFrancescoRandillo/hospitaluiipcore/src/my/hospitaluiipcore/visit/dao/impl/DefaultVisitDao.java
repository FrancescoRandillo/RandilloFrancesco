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
package my.hospitaluiipcore.visit.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Date;
import java.util.List;

import my.hospitaluiipcore.model.PatientModel;
import my.hospitaluiipcore.model.VisitModel;
import my.hospitaluiipcore.visit.dao.VisitDao;


public class DefaultVisitDao extends AbstractItemDao implements VisitDao
{

	@Override
	public List<VisitModel> findVisitByPatient(final PatientModel patient)
	{
		final String sql = "SELECT {PK} FROM{Visit} WHERE{patient}=?patient";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(sql);
		fsq.addQueryParameter("patient", patient);
		final SearchResult<VisitModel> result = getFlexibleSearchService().search(fsq);
		final List<VisitModel> visits = result.getResult();
		return visits;

	}

	@Override
	public List<VisitModel> findVisitofTomorrow(final Date date)
	{
		final String sql = "SELECT {PK} FROM{Visit} WHERE{date}=?date";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(sql);
		fsq.addQueryParameter("date", date);
		final SearchResult<VisitModel> result = getFlexibleSearchService().search(fsq);
		final List<VisitModel> visits = result.getResult();
		return visits;
	}

}
