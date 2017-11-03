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
package my.cyclingracinguiip.stage.interceptor;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.Calendar;
import java.util.Date;

import my.cyclingracinguiip.model.StageModel;


/**
 *
 */
public class MyStageInitInterceptor implements InitDefaultsInterceptor<StageModel>
{

	@Override
	public void onInitDefaults(final StageModel stageModel, final InterceptorContext ctx) throws InterceptorException
	{
		//get the defaoult local time zone
		//and subtract 1 day
		Date date = new Date();
		final Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -1);
		date = cal.getTime();
		stageModel.setStartDateStage(date);
	}

}
