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
package my.cyclingracingfacadeuiip.cyclistranking.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingracingfacadeuiip.data.CyclistData;
import my.cyclingracingfacadeuiip.data.CyclistRankingData;
import my.cyclingracinguiip.model.CyclistModel;
import my.cyclingracinguiip.model.CyclistRankingModel;


/**
 *
 */
public class CyclistRankingPopulator implements Populator<CyclistRankingModel, CyclistRankingData>
{
	AbstractPopulatingConverter<CyclistModel, CyclistData> cyclistCoverter;

	public AbstractPopulatingConverter<CyclistModel, CyclistData> getCyclistCoverter()
	{
		return cyclistCoverter;
	}

	@Required
	public void setCyclistCoverter(final AbstractPopulatingConverter<CyclistModel, CyclistData> cyclistCoverter)
	{
		this.cyclistCoverter = cyclistCoverter;
	}


	@Override
	public void populate(final CyclistRankingModel source, final CyclistRankingData target) throws ConversionException
	{
		target.setId(source.getId());
		target.setTotRacing(source.getTotRacing());
		target.setTotTime(source.getTotTime());
		final CyclistData cyclist = cyclistCoverter.convert(source.getCyclist());
		target.setCyclist(cyclist);


	}

}
