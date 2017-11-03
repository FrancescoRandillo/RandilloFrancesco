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
package my.cyclingracingfacadeuiip.stagerace.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.cyclingracingfacadeuiip.data.StageRaceData;
import my.cyclingracinguiip.model.StageRaceModel;


/**
 *
 */
public class StageRacePopulator implements Populator<StageRaceModel, StageRaceData>
{

	@Override
	public void populate(final StageRaceModel source, final StageRaceData target) throws ConversionException
	{
		target.setId(source.getId());
		target.setName(source.getName());
		target.setClosingDate(source.getClosingDate());
	}

}
