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
package my.hospitaluiipfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import my.hospitaluiipfacade.data.VisitData;
import my.hospitaluiipfacade.visit.facade.VisitFacade;


@Controller
public class VisitController
{
	VisitFacade visitFacade;

	public VisitFacade getVisitFacade()
	{
		return visitFacade;
	}

	@Required
	public void setVisitFacade(final VisitFacade visitFacade)
	{
		this.visitFacade = visitFacade;
	}

	@RequestMapping(value = "/visits")
	public String showVisits(final Model model)
	{
		final List<VisitData> visits = visitFacade.getVisitofTomorrow();
		model.addAttribute("visits", visits);
		return "VisitListing";
	}


}
