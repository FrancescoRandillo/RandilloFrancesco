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
package my.hospitaluiipcore.jobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import my.hospitaluiipcore.model.VisitModel;
import my.hospitaluiipcore.visit.service.VisitService;


public class VisitJob extends AbstractJobPerformable<CronJobModel>
{
	private static final Logger LOG = Logger.getLogger(VisitJob.class);

	VisitService visitService;

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
	public PerformResult perform(final CronJobModel arg0)
	{
		final List<VisitModel> list = visitService.getVisitofTomorrow();
		LOG.info("LISTA PRENOTAZIONI DI DOMANI");
		for (final VisitModel vm : list)
		{
			LOG.info("Patient: " + vm.getPatient().getName() + " " + vm.getPatient().getSurname());
			LOG.info("Name Visit: " + vm.getName());
			LOG.info("Department: " + vm.getDepartment());
			LOG.info("Doctor: " + vm.getDoctor());
		}
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

}
