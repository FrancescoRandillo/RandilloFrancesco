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
package my.cyclingracingfacadeuiip.stageranking.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingracingfacadeuiip.data.CyclistData;
import my.cyclingracingfacadeuiip.data.StageRankingData;
import my.cyclingracinguiip.model.CyclistModel;
import my.cyclingracinguiip.model.StageRankingModel;


public class StageRankingPopulator implements Populator<StageRankingModel, StageRankingData>
{

	AbstractConverter<CyclistModel, CyclistData> cyclistConverter;

	public AbstractConverter<CyclistModel, CyclistData> getCyclistConverter()
	{
		return cyclistConverter;
	}

	@Required
	public void setCyclistConverter(final AbstractConverter<CyclistModel, CyclistData> cyclistConverter)
	{
		this.cyclistConverter = cyclistConverter;
	}

	@Override
	public void populate(final StageRankingModel source, final StageRankingData target) throws ConversionException
	{
		final CyclistData cyclistData = cyclistConverter.convert(source.getCyclist());
		target.setId(source.getId());
		target.setRanking(source.getRanking());
		target.setTime(source.getTime());
		target.setState(source.getState().getCode());
		target.setCyclist(cyclistData);
	}

}
