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
package my.hospitaluiipfacade.department.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.hospitaluiipcore.model.DepartmentModel;
import my.hospitaluiipfacade.data.DepartmentData;


/**
 *
 */
public class DepartmentPopulator implements Populator<DepartmentModel, DepartmentData>
{

	@Override
	public void populate(final DepartmentModel source, final DepartmentData target) throws ConversionException
	{
		target.setId(source.getId());
		target.setName(source.getName());
	}

}
