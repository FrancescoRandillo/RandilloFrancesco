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
package my.cyclingracingfacadeuiip.setup;

import static my.cyclingracingfacadeuiip.constants.CyclingracingfacadeuiipConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.cyclingracingfacadeuiip.constants.CyclingracingfacadeuiipConstants;
import my.cyclingracingfacadeuiip.service.CyclingracingfacadeuiipService;


@SystemSetup(extension = CyclingracingfacadeuiipConstants.EXTENSIONNAME)
public class CyclingracingfacadeuiipSystemSetup
{
	private final CyclingracingfacadeuiipService cyclingracingfacadeuiipService;

	public CyclingracingfacadeuiipSystemSetup(final CyclingracingfacadeuiipService cyclingracingfacadeuiipService)
	{
		this.cyclingracingfacadeuiipService = cyclingracingfacadeuiipService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cyclingracingfacadeuiipService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CyclingracingfacadeuiipSystemSetup.class.getResourceAsStream("/cyclingracingfacadeuiip/sap-hybris-platform.png");
	}
}
