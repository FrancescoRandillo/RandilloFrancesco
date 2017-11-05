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
package my.hospitaluiipcore.visit.interceptor;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import org.springframework.beans.factory.annotation.Autowired;

import my.hospitaluiipcore.event.VisitEvent;
import my.hospitaluiipcore.model.PatientModel;
import my.hospitaluiipcore.model.VisitModel;


public class VisitPrepareInterceptor implements PrepareInterceptor<VisitModel>
{

	@Autowired
	EventService eventService;

	@Override
	public void onPrepare(final VisitModel visitModel, final InterceptorContext ctx) throws InterceptorException
	{

		if (visitModel.getResult().getCode().equals("POSITIVE"))
		{
			final PatientModel patient = visitModel.getPatient();
			eventService.publishEvent(new VisitEvent(patient));
		}

	}

}
