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
package my.hospitaluiipfacade.patient.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.hospitaluiipcore.model.PatientModel;
import my.hospitaluiipfacade.data.PatientData;


/**
 *
 */
public class PatientPopulator implements Populator<PatientModel, PatientData>
{

	@Override
	public void populate(final PatientModel source, final PatientData target) throws ConversionException
	{
		target.setId(source.getId());
		target.setBirthPlace(source.getBirthPlace());
		target.setCf(source.getCf());
		target.setDateOfBirth(source.getDateOfBirth());
		target.setGender(source.getGender().getCode());
		target.setName(source.getName());
		target.setSurname(source.getSurname());
		target.setAdmissionDate(source.getAdmissionDate());
		target.setExitDate(source.getExitDate());
		target.setTotDays(source.getTotDays());

	}

}
