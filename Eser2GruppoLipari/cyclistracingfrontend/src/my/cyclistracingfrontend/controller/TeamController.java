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
package my.cyclistracingfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import my.cyclingracingfacadeuiip.cyclistteam.facade.CyclistTeamFacade;
import my.cyclingracingfacadeuiip.data.CyclistData;
import my.cyclingracingfacadeuiip.data.CyclistTeamData;
import my.cyclingracingfacadeuiip.data.ManagerData;


@Controller
public class TeamController
{
	CyclistTeamFacade cyclistTeamFacade;

	@Autowired
	public void setCyclistTeamFacade(final CyclistTeamFacade cyclistTeamFacade)
	{
		this.cyclistTeamFacade = cyclistTeamFacade;
	}

	@RequestMapping(value = "/teams")
	public String showTeams(final Model model)
	{
		final List<CyclistTeamData> teams = cyclistTeamFacade.getAllTeam();
		model.addAttribute("teams", teams);
		int count = 0;
		for (final CyclistTeamData t : teams)
		{
			final List<CyclistData> cyclists = cyclistTeamFacade.getCyclistForTeam(t);
			model.addAttribute("cyclists" + count, cyclists);
			final ManagerData manager = cyclistTeamFacade.getManagerForTeam(t);
			model.addAttribute("manager" + count, manager);
			count++;
		}
		return "TeamListing";
	}



}
