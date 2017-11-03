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
package my.cyclistracingfrontend.controller;

import static my.cyclistracingfrontend.constants.CyclistracingfrontendConstants.PLATFORM_LOGO_CODE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.cyclistracingfrontend.service.CyclistracingfrontendService;


@Controller
public class CyclistracingfrontendHelloController
{
	@Autowired
	private CyclistracingfrontendService cyclistracingfrontendService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(final ModelMap model)
	{
		model.addAttribute("logoUrl", cyclistracingfrontendService.getHybrisLogoUrl(PLATFORM_LOGO_CODE));
		return "welcome";
	}
}
