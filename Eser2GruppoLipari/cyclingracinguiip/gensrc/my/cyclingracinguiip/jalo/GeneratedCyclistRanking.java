/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2-nov-2017 22.29.21                         ---
 * ----------------------------------------------------------------
 */
package my.cyclingracinguiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.cyclingracinguiip.constants.CyclingracinguiipConstants;
import my.cyclingracinguiip.jalo.Cyclist;
import my.cyclingracinguiip.jalo.StageRace;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CyclistRanking}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclistRanking extends GenericItem
{
	/** Qualifier of the <code>CyclistRanking.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>CyclistRanking.totRanking</code> attribute **/
	public static final String TOTRANKING = "totRanking";
	/** Qualifier of the <code>CyclistRanking.totTime</code> attribute **/
	public static final String TOTTIME = "totTime";
	/** Qualifier of the <code>CyclistRanking.cyclist</code> attribute **/
	public static final String CYCLIST = "cyclist";
	/** Qualifier of the <code>CyclistRanking.stageRace</code> attribute **/
	public static final String STAGERACE = "stageRace";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(TOTRANKING, AttributeMode.INITIAL);
		tmp.put(TOTTIME, AttributeMode.INITIAL);
		tmp.put(CYCLIST, AttributeMode.INITIAL);
		tmp.put(STAGERACE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Cyclist getCyclist(final SessionContext ctx)
	{
		return (Cyclist)getProperty( ctx, CYCLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Cyclist getCyclist()
	{
		return getCyclist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final SessionContext ctx, final Cyclist value)
	{
		setProperty(ctx, CYCLIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final Cyclist value)
	{
		setCyclist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.stageRace</code> attribute.
	 * @return the stageRace
	 */
	public StageRace getStageRace(final SessionContext ctx)
	{
		return (StageRace)getProperty( ctx, STAGERACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.stageRace</code> attribute.
	 * @return the stageRace
	 */
	public StageRace getStageRace()
	{
		return getStageRace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.stageRace</code> attribute. 
	 * @param value the stageRace
	 */
	public void setStageRace(final SessionContext ctx, final StageRace value)
	{
		setProperty(ctx, STAGERACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.stageRace</code> attribute. 
	 * @param value the stageRace
	 */
	public void setStageRace(final StageRace value)
	{
		setStageRace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.totRanking</code> attribute.
	 * @return the totRanking
	 */
	public String getTotRanking(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOTRANKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.totRanking</code> attribute.
	 * @return the totRanking
	 */
	public String getTotRanking()
	{
		return getTotRanking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.totRanking</code> attribute. 
	 * @param value the totRanking
	 */
	public void setTotRanking(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOTRANKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.totRanking</code> attribute. 
	 * @param value the totRanking
	 */
	public void setTotRanking(final String value)
	{
		setTotRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.totTime</code> attribute.
	 * @return the totTime
	 */
	public Integer getTotTime(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.totTime</code> attribute.
	 * @return the totTime
	 */
	public Integer getTotTime()
	{
		return getTotTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.totTime</code> attribute. 
	 * @return the totTime
	 */
	public int getTotTimeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTotTime( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.totTime</code> attribute. 
	 * @return the totTime
	 */
	public int getTotTimeAsPrimitive()
	{
		return getTotTimeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.totTime</code> attribute. 
	 * @param value the totTime
	 */
	public void setTotTime(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.totTime</code> attribute. 
	 * @param value the totTime
	 */
	public void setTotTime(final Integer value)
	{
		setTotTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.totTime</code> attribute. 
	 * @param value the totTime
	 */
	public void setTotTime(final SessionContext ctx, final int value)
	{
		setTotTime( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.totTime</code> attribute. 
	 * @param value the totTime
	 */
	public void setTotTime(final int value)
	{
		setTotTime( getSession().getSessionContext(), value );
	}
	
}
