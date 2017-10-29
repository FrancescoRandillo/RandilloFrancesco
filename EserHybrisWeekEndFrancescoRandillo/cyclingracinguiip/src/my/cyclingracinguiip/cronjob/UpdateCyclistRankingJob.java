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
package my.cyclingracinguiip.cronjob;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.event.EventService;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cyclingracinguiip.cyclist.service.CyclistService;
import my.cyclingracinguiip.cyclistranking.service.CyclistRankingService;
import my.cyclingracinguiip.enums.OnTrialEnum;
import my.cyclingracinguiip.model.CyclistModel;
import my.cyclingracinguiip.model.CyclistRankingModel;
import my.cyclingracinguiip.model.StageModel;
import my.cyclingracinguiip.model.StageRankingModel;
import my.cyclingracinguiip.stage.service.StageService;
import my.cyclingracinguiip.stageranking.service.StageRankingService;


/**
 *
 */
public class UpdateCyclistRankingJob extends AbstractJobPerformable<CronJobModel>
{

	StageService stageService;
	StageRankingService stageRankingService;
	CyclistRankingService cyclistRankingService;
	CyclistService cyclistService;
	EventService eventService;

	/**
	 * @param cyclistService
	 *           the cyclistService to set
	 */
	@Required
	public void setCyclistService(final CyclistService cyclistService)
	{
		this.cyclistService = cyclistService;
	}

	/**
	 * @param cyclistRankingService
	 *           the cyclistRankingService to set
	 */
	@Required
	public void setCyclistRankingService(final CyclistRankingService cyclistRankingService)
	{
		this.cyclistRankingService = cyclistRankingService;
	}

	/**
	 * @param stageService
	 *           the stageService to set
	 */
	@Required
	public void setStageService(final StageService stageService)
	{
		this.stageService = stageService;
	}

	/**
	 * @param stageRankingService
	 *           the stageRankingService to set
	 */
	@Required
	public void setStageRankingService(final StageRankingService stageRankingService)
	{
		this.stageRankingService = stageRankingService;
	}


	@Override
	public PerformResult perform(final CronJobModel cronJob)
	{
		final List<StageModel> stageList = stageService.getStage();
		final List<CyclistModel> cyclistList = cyclistService.getAllCyclist();
		final Date endTime = cronJob.getEndTime();
		//scorro i stage e controllo quelli non processati
		for (final StageModel sm : stageList)
		{
			final Date tmp = sm.getCreationtime();
			//se non è processato
			if (tmp.getTime() > endTime.getTime() & sm.getOnTrial().getCode().equals("NO"))
			{
				//per ogni ciclista sommo i tempi dei stage model non processati
				for (final CyclistModel cm : cyclistList)
				{
					final List<StageRankingModel> stageRankingList = stageRankingService.getStageRankingTotTimeForCyclist(sm, cm);
					int tot = 0;
					//sommo i tempi
					for (final StageRankingModel srm : stageRankingList)
					{
						tot += srm.getTime().intValue();
					}
					//setto il tempo totale del cyclist ranking
					final CyclistRankingModel myCyclistRanking = cyclistRankingService.getCyclistRankingForCyclistID(cm);
					final int firstTime = myCyclistRanking.getTotTime().intValue();
					final Integer t = new Integer(firstTime + tot);
					myCyclistRanking.setTotTime(t);

				}
				//modifico l'attributo Ontrial a yes
				sm.setOnTrial(OnTrialEnum.YES);
			}
		}
		//event
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

	}

}
