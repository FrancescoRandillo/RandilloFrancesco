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
package my.cyclingracingfacadeuiip.cyclistteam.facade.impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingracingfacadeuiip.cyclistteam.facade.CyclistTeamFacade;
import my.cyclingracingfacadeuiip.data.CyclistData;
import my.cyclingracingfacadeuiip.data.CyclistTeamData;
import my.cyclingracingfacadeuiip.data.ManagerData;
import my.cyclingracinguiip.cyclistteam.service.CyclistTeamService;
import my.cyclingracinguiip.model.CyclistModel;
import my.cyclingracinguiip.model.CyclistTeamModel;
import my.cyclingracinguiip.model.ManagerModel;


/**
 *
 */
public class DefaultCyclistTeamFacade implements CyclistTeamFacade
{

	private AbstractPopulatingConverter<CyclistTeamModel, CyclistTeamData> cyclistTeamConverter;
	private AbstractPopulatingConverter<CyclistModel, CyclistData> cyclistConverter;
	private AbstractPopulatingConverter<ManagerModel, ManagerData> managerConverter;

	private CyclistTeamService cyclistTeamService;



	public CyclistTeamService getCyclistTeamService()
	{
		return cyclistTeamService;
	}

	@Required
	public void setCyclistTeamService(final CyclistTeamService cyclistTeamService)
	{
		this.cyclistTeamService = cyclistTeamService;
	}

	public AbstractPopulatingConverter<CyclistTeamModel, CyclistTeamData> getCyclistTeamConverter()
	{
		return cyclistTeamConverter;
	}

	@Required
	public void setCyclistTeamConverter(final AbstractPopulatingConverter<CyclistTeamModel, CyclistTeamData> cyclistTeamConverter)
	{
		this.cyclistTeamConverter = cyclistTeamConverter;
	}


	public AbstractPopulatingConverter<CyclistModel, CyclistData> getCyclistConverter()
	{
		return cyclistConverter;
	}

	@Required
	public void setCyclistConverter(final AbstractPopulatingConverter<CyclistModel, CyclistData> cyclistConverter)
	{
		this.cyclistConverter = cyclistConverter;
	}


	public AbstractPopulatingConverter<ManagerModel, ManagerData> getManagerConverter()
	{
		return managerConverter;
	}

	@Required
	public void setManagerConverter(final AbstractPopulatingConverter<ManagerModel, ManagerData> managerConverter)
	{
		this.managerConverter = managerConverter;
	}



	//METODI
	@Override
	public List<CyclistTeamData> getAllTeam()
	{
		final List<CyclistTeamModel> listTeamModel = cyclistTeamService.getAllTeam();
		final List<CyclistTeamData> teamData = new ArrayList<CyclistTeamData>();
		for (final CyclistTeamModel t : listTeamModel)
		{
			teamData.add(cyclistTeamConverter.convert(t));
		}
		return teamData;
	}

	@Override
	public List<CyclistData> getCyclistForTeam(final CyclistTeamData team)
	{
		final List<CyclistModel> listCyclistModel = cyclistTeamService.getCyclistForTeam(team);
		final List<CyclistData> cyclistData = new ArrayList<CyclistData>();
		for (final CyclistModel c : listCyclistModel)
		{
			cyclistData.add(cyclistConverter.convert(c));
		}
		return cyclistData;
	}

	@Override
	public ManagerData getManagerForTeam(final CyclistTeamData team)
	{
		final ManagerModel listManagerModel = cyclistTeamService.getManagerForTeam(team);
		final ManagerData managerData = managerConverter.convert(listManagerModel);

		return managerData;
	}

}
