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
package my.cyclingracinguiip.stagerace.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingracinguiip.model.StageModel;
import my.cyclingracinguiip.model.StageRaceModel;
import my.cyclingracinguiip.stage.service.StageService;


/**
 *
 */
public class MyStageRaceInterceptor implements PrepareInterceptor<StageRaceModel>
{
	StageService stageService;

	public StageService getStageService()
	{
		return stageService;
	}

	@Required
	public void setStageService(final StageService stageService)
	{
		this.stageService = stageService;
	}




	@Override
	public void onPrepare(final StageRaceModel stageRaceModel, final InterceptorContext arg1) throws InterceptorException
	{
		if (stageRaceModel.getClosingDate() != null)
		{
			final List<StageModel> list = stageService.getStageForStageRace(stageRaceModel);
			for (final StageModel s : list)
			{
				final int gg = s.getDays().intValue();
				Date d = s.getStartDateStage();

				final Calendar cal = Calendar.getInstance();
				cal.setTime(d);
				cal.add(Calendar.DATE, gg);
				d = cal.getTime();
				s.setEndDateStage(d);
				//quando si agisce su model esterni bisogna esplicitare il salvataggio
				//nel seguente modo
				arg1.getModelService().save(s);
			}
		}


	}

}
