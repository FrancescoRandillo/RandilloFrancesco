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
package my.cyclingracinguiip.setup;

import static my.cyclingracinguiip.constants.CyclingracinguiipConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.cyclingracinguiip.constants.CyclingracinguiipConstants;
import my.cyclingracinguiip.service.CyclingracinguiipService;


@SystemSetup(extension = CyclingracinguiipConstants.EXTENSIONNAME)
public class CyclingracinguiipSystemSetup
{
	private final CyclingracinguiipService cyclingracinguiipService;

	public CyclingracinguiipSystemSetup(final CyclingracinguiipService cyclingracinguiipService)
	{
		this.cyclingracinguiipService = cyclingracinguiipService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cyclingracinguiipService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CyclingracinguiipSystemSetup.class.getResourceAsStream("/cyclingracinguiip/sap-hybris-platform.png");
	}
}
