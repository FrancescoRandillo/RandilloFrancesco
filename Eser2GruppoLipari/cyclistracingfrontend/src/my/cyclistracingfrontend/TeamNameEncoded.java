
package my.cyclistracingfrontend;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.log4j.Logger;


public class TeamNameEncoded
{
	private final static Logger LOG = Logger.getLogger(TeamNameEncoded.class);

	public static String getNameEncoded(final String name)
	{
		try
		{
			return URLEncoder.encode(name, "UTF-8");
		}
		catch (final UnsupportedEncodingException e)
		{
			LOG.error("Problems while encoding", e);
			return "";
		}
	}
}
