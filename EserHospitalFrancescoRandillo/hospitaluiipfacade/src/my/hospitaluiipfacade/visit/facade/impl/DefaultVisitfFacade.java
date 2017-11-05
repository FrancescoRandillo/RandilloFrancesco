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
package my.hospitaluiipfacade.visit.facade.impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.hospitaluiipcore.model.PatientModel;
import my.hospitaluiipcore.model.VisitModel;
import my.hospitaluiipcore.visit.service.VisitService;
import my.hospitaluiipfacade.data.VisitData;
import my.hospitaluiipfacade.visit.facade.VisitFacade;


/**
 *
 */
public class DefaultVisitfFacade implements VisitFacade
{
	VisitService visitService;
	AbstractPopulatingConverter<VisitModel, VisitData> visitConverter;

	public AbstractPopulatingConverter<VisitModel, VisitData> getVisitConverter()
	{
		return visitConverter;
	}

	@Required
	public void setVisitConverter(final AbstractPopulatingConverter<VisitModel, VisitData> visitConverter)
	{
		this.visitConverter = visitConverter;
	}

	public VisitService getVisitService()
	{
		return visitService;
	}

	@Required
	public void setVisitService(final VisitService visitService)
	{
		this.visitService = visitService;
	}

	@Override
	public List<VisitData> getVisitForPatient(final PatientModel patient)
	{
		final List<VisitModel> list = visitService.getVisitForPatient(patient);
		final List<VisitData> listData = new ArrayList<VisitData>();
		for (final VisitModel v : list)
		{
			listData.add(visitConverter.convert(v));
		}
		return listData;
	}

	@Override
	public List<VisitData> getVisitofTomorrow()
	{
		final List<VisitModel> list = visitService.getVisitofTomorrow();
		final List<VisitData> listData = new ArrayList<VisitData>();
		for (final VisitModel v : list)
		{
			listData.add(visitConverter.convert(v));
		}
		return listData;
	}

}
