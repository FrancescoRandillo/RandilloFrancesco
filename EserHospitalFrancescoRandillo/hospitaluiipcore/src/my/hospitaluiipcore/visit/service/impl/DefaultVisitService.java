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
package my.hospitaluiipcore.visit.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.hospitaluiipcore.model.PatientModel;
import my.hospitaluiipcore.model.VisitModel;
import my.hospitaluiipcore.visit.dao.VisitDao;
import my.hospitaluiipcore.visit.service.VisitService;


/**
 *
 */
public class DefaultVisitService implements VisitService
{
	VisitDao visitDao;

	public VisitDao getVisitDao()
	{
		return visitDao;
	}

	@Required
	public void setVisitDao(final VisitDao visitDao)
	{
		this.visitDao = visitDao;
	}

	@Override
	public List<VisitModel> getVisitForPatient(final PatientModel patient)
	{
		final List<VisitModel> visitList = visitDao.findVisitByPatient(patient);
		return visitList;
	}

	@Override
	public List<VisitModel> getVisitofTomorrow()
	{
		//calculate date of tomorrow
		Date date = new Date();
		final Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, 1);
		date = c.getTime();

		final List<VisitModel> visitList = visitDao.findVisitofTomorrow(date);
		return visitList;
	}

}
