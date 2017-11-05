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
package my.hospitaluiipfacade.doctor.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import my.hospitaluiipcore.model.DepartmentModel;
import my.hospitaluiipcore.model.DoctorModel;
import my.hospitaluiipfacade.data.DepartmentData;
import my.hospitaluiipfacade.data.DoctorData;


public class DoctorPopulator implements Populator<DoctorModel, DoctorData>
{
	AbstractPopulatingConverter<DepartmentModel, DepartmentData> departmentConverter;

	public AbstractPopulatingConverter<DepartmentModel, DepartmentData> getDepartmentConverter()
	{
		return departmentConverter;
	}

	@Required
	public void setDepartmentConverter(final AbstractPopulatingConverter<DepartmentModel, DepartmentData> departmentConverter)
	{
		this.departmentConverter = departmentConverter;
	}

	@Override
	public void populate(final DoctorModel source, final DoctorData target) throws ConversionException
	{
		final DepartmentData departmentdata = departmentConverter.convert(source.getDepartment());
		target.setId(source.getId());
		target.setBirthPlace(source.getBirthPlace());
		target.setCf(source.getCf());
		target.setDateOfBirth(source.getDateOfBirth());
		target.setGender(source.getGender().getCode());
		target.setName(source.getName());
		target.setSurname(source.getSurname());
		target.setRegistrationNumber(source.getRegistrationNumber());
		target.setDepartment(departmentdata);

	}

}
