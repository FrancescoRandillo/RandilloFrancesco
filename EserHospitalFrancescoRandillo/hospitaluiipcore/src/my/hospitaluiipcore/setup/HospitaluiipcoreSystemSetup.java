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
package my.hospitaluiipcore.setup;

import static my.hospitaluiipcore.constants.HospitaluiipcoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.hospitaluiipcore.constants.HospitaluiipcoreConstants;
import my.hospitaluiipcore.service.HospitaluiipcoreService;


@SystemSetup(extension = HospitaluiipcoreConstants.EXTENSIONNAME)
public class HospitaluiipcoreSystemSetup
{
	private final HospitaluiipcoreService hospitaluiipcoreService;

	public HospitaluiipcoreSystemSetup(final HospitaluiipcoreService hospitaluiipcoreService)
	{
		this.hospitaluiipcoreService = hospitaluiipcoreService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		hospitaluiipcoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return HospitaluiipcoreSystemSetup.class.getResourceAsStream("/hospitaluiipcore/sap-hybris-platform.png");
	}
}
