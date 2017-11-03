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
package my.cyclistracingfrontend.setup;

import static my.cyclistracingfrontend.constants.CyclistracingfrontendConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.cyclistracingfrontend.constants.CyclistracingfrontendConstants;
import my.cyclistracingfrontend.service.CyclistracingfrontendService;


@SystemSetup(extension = CyclistracingfrontendConstants.EXTENSIONNAME)
public class CyclistracingfrontendSystemSetup
{
	private final CyclistracingfrontendService cyclistracingfrontendService;

	public CyclistracingfrontendSystemSetup(final CyclistracingfrontendService cyclistracingfrontendService)
	{
		this.cyclistracingfrontendService = cyclistracingfrontendService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cyclistracingfrontendService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CyclistracingfrontendSystemSetup.class.getResourceAsStream("/cyclistracingfrontend/sap-hybris-platform.png");
	}
}
