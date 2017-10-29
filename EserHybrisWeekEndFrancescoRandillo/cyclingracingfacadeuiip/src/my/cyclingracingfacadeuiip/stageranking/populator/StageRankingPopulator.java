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

import my.cyclingracingfacadeuiip.data.StageData;
import my.cyclingracingfacadeuiip.data.StageRankingData;
import my.cyclingracinguiip.model.StageModel;
import my.cyclingracinguiip.model.StageRankingModel;


public class StageRankingPopulator implements Populator<StageRankingModel, StageRankingData>
{

	AbstractConverter<StageModel, StageData> stageConverter;

	public AbstractConverter<StageModel, StageData> getStageConverter()
	{
		return stageConverter;
	}

	@Required
	public void setStageConverter(final AbstractConverter<StageModel, StageData> stageConverter)
	{
		this.stageConverter = stageConverter;
	}

	@Override
	public void populate(final StageRankingModel source, final StageRankingData target) throws ConversionException
	{
		final StageData stageData = stageConverter.convert(source.getStage());
		target.setId(source.getId());
		target.setRacing(source.getRacing());
		target.setStage(stageData);
		target.setTime(source.getTime());
		target.setState(source.getState().getCode());
	}

}
