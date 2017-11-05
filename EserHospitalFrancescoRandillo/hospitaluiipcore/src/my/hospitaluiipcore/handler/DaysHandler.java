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
package my.hospitaluiipcore.handler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.util.Date;

import my.hospitaluiipcore.model.PatientModel;


public class DaysHandler implements DynamicAttributeHandler<Integer, PatientModel>
{

	@Override
	public Integer get(final PatientModel patient)
	{
		final Date startDate = patient.getAdmissionDate();
		final Date endDate = patient.getExitDate();
		final long startTime = startDate.getTime();
		final long endTime = endDate.getTime();
		final long diffTime = endTime - startTime;
		final long diffDays = diffTime / (1000 * 60 * 60 * 24);
		final Integer days = new Integer((int) diffDays);
		return days;
	}

	@Override
	public void set(final PatientModel arg0, final Integer arg1)
	{
		// YTODO Auto-generated method stub

	}

}
