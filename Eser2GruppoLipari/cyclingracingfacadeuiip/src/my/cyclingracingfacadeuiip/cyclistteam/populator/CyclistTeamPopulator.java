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
package my.cyclingracingfacadeuiip.cyclistteam.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingracingfacadeuiip.data.CyclistTeamData;
import my.cyclingracingfacadeuiip.data.ManagerData;
import my.cyclingracinguiip.model.CyclistTeamModel;
import my.cyclingracinguiip.model.ManagerModel;


/**
 *
 */
public class CyclistTeamPopulator implements Populator<CyclistTeamModel, CyclistTeamData>
{
	AbstractPopulatingConverter<ManagerModel, ManagerData> managerCoverter;


	public AbstractPopulatingConverter<ManagerModel, ManagerData> getManagerCoverter()
	{
		return managerCoverter;
	}

	@Required
	public void setManagerCoverter(final AbstractPopulatingConverter<ManagerModel, ManagerData> managerCoverter)
	{
		this.managerCoverter = managerCoverter;
	}

	@Override
	public void populate(final CyclistTeamModel source, final CyclistTeamData target) throws ConversionException
	{
		final ManagerData manager = managerCoverter.convert(source.getManager());
		target.setId(source.getId());
		target.setCountry(source.getCountry());
		target.setBicycle(source.getBicycle());
		target.setYear(source.getYear());
		target.setManager(manager);

	}

}
