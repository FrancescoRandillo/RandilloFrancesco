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
package my.cyclingracingfacadeuiip.stage.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.cyclingracingfacadeuiip.data.StageData;
import my.cyclingracinguiip.model.StageModel;



public class StagePopulator implements Populator<StageModel, StageData>
{


	@Override
	public void populate(final StageModel source, final StageData target) throws ConversionException
	{
		target.setId(source.getId());
		target.setNameStage(source.getNameStage());
		target.setStartDateStage(source.getStartDateStage());
		target.setEndDateStage(source.getEndDateStage());
		target.setDays(source.getDays());
	}

}
