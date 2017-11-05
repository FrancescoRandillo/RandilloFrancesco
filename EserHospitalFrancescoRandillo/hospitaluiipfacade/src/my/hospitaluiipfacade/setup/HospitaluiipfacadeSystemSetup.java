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
package my.hospitaluiipfacade.setup;

import static my.hospitaluiipfacade.constants.HospitaluiipfacadeConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.hospitaluiipfacade.constants.HospitaluiipfacadeConstants;
import my.hospitaluiipfacade.service.HospitaluiipfacadeService;


@SystemSetup(extension = HospitaluiipfacadeConstants.EXTENSIONNAME)
public class HospitaluiipfacadeSystemSetup
{
	private final HospitaluiipfacadeService hospitaluiipfacadeService;

	public HospitaluiipfacadeSystemSetup(final HospitaluiipfacadeService hospitaluiipfacadeService)
	{
		this.hospitaluiipfacadeService = hospitaluiipfacadeService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		hospitaluiipfacadeService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return HospitaluiipfacadeSystemSetup.class.getResourceAsStream("/hospitaluiipfacade/sap-hybris-platform.png");
	}
}
