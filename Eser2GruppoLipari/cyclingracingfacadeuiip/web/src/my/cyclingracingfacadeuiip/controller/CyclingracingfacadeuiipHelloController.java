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
package my.cyclingracingfacadeuiip.controller;

import static my.cyclingracingfacadeuiip.constants.CyclingracingfacadeuiipConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.cyclingracingfacadeuiip.service.CyclingracingfacadeuiipService;


@Controller
public class CyclingracingfacadeuiipHelloController
{
	@Autowired
	private CyclingracingfacadeuiipService cyclingracingfacadeuiipService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", cyclingracingfacadeuiipService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
