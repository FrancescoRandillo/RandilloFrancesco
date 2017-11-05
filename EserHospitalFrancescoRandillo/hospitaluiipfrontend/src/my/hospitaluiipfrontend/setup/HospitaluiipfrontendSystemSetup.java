/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.hospitaluiipfrontend.setup;

import static my.hospitaluiipfrontend.constants.HospitaluiipfrontendConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.hospitaluiipfrontend.constants.HospitaluiipfrontendConstants;
import my.hospitaluiipfrontend.service.HospitaluiipfrontendService;


@SystemSetup(extension = HospitaluiipfrontendConstants.EXTENSIONNAME)
public class HospitaluiipfrontendSystemSetup
{
	private final HospitaluiipfrontendService hospitaluiipfrontendService;

	public HospitaluiipfrontendSystemSetup(final HospitaluiipfrontendService hospitaluiipfrontendService)
	{
		this.hospitaluiipfrontendService = hospitaluiipfrontendService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		hospitaluiipfrontendService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return HospitaluiipfrontendSystemSetup.class.getResourceAsStream("/hospitaluiipfrontend/sap-hybris-platform.png");
	}
}
