
package my.hospitaluiipcore.event;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.util.Config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import my.hospitaluiipcore.model.VisitModel;
import my.hospitaluiipcore.visit.service.VisitService;


public class VisitEventListener extends AbstractEventListener<VisitEvent>
{
	VisitService visitService;
	private static final Logger LOG = Logger.getLogger(VisitEventListener.class);

	public VisitService getVisitService()
	{
		return visitService;
	}

	@Required
	public void setVisitService(final VisitService visitService)
	{
		this.visitService = visitService;
	}

	@Override
	protected void onEvent(final VisitEvent event)
	{
		final String path = Config.getParameter("visitecsv").toString();
		final List<VisitModel> listVisit = visitService.getVisitForPatient(event.getPatient());
		PrintWriter pw;
		try
		{
			LOG.info("Scrivo nel File");
			pw = new PrintWriter(new File(path));
			final StringBuilder sb = new StringBuilder();
			sb.append(listVisit.get(0).getPatient().getName());
			sb.append(',');
			for (final VisitModel vm : listVisit)
			{
				sb.append(vm.getName());
				sb.append(',');
				sb.append(vm.getDoctor().getName());
				sb.append(',');
				sb.append(vm.getDepartment().getName());
				sb.append(',');
				sb.append(vm.getResult());
				sb.append(',');
				sb.append(vm.getDate());
				sb.append('\n');
			}
			pw.write(sb.toString());
			pw.close();
		}
		catch (final FileNotFoundException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
