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
package my.hospitaluiipfacade.visit.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import my.hospitaluiipcore.model.DepartmentModel;
import my.hospitaluiipcore.model.DoctorModel;
import my.hospitaluiipcore.model.PatientModel;
import my.hospitaluiipcore.model.VisitModel;
import my.hospitaluiipfacade.data.DepartmentData;
import my.hospitaluiipfacade.data.DoctorData;
import my.hospitaluiipfacade.data.PatientData;
import my.hospitaluiipfacade.data.VisitData;


/**
 *
 */
public class VisitPopulator implements Populator<VisitModel, VisitData>
{
	AbstractPopulatingConverter<DoctorModel, DoctorData> doctorConverter;
	AbstractPopulatingConverter<PatientModel, PatientData> patientConverter;
	AbstractPopulatingConverter<DepartmentModel, DepartmentData> departmentConverter;

	@Required
	public void setDoctorConverter(final AbstractPopulatingConverter<DoctorModel, DoctorData> doctorConverter)
	{
		this.doctorConverter = doctorConverter;
	}

	@Required
	public void setPatientConverter(final AbstractPopulatingConverter<PatientModel, PatientData> patientConverter)
	{
		this.patientConverter = patientConverter;
	}

	@Required
	public void setDepartmentConverter(final AbstractPopulatingConverter<DepartmentModel, DepartmentData> departmentConverter)
	{
		this.departmentConverter = departmentConverter;
	}

	@Override
	public void populate(final VisitModel source, final VisitData target) throws ConversionException
	{
		final PatientData patient = patientConverter.convert(source.getPatient());
		final DoctorData doctor = doctorConverter.convert(source.getDoctor());
		final DepartmentData department = departmentConverter.convert(source.getDepartment());
		target.setPatient(patient);
		target.setDoctor(doctor);
		target.setDepartment(department);
		target.setDate(source.getDate());
		target.setId(source.getId());
		target.setName(source.getName());
		target.setResult(source.getResult().getCode());
	}

}
