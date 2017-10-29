/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 21.00.45                        ---
 * ----------------------------------------------------------------
 */
package my.cyclingracinguiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.cyclingracinguiip.constants.CyclingracinguiipConstants;
import my.cyclingracinguiip.jalo.Cyclist;
import my.cyclingracinguiip.jalo.StageRace;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem cyclistRanking}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclistRanking extends GenericItem
{
	/** Qualifier of the <code>cyclistRanking.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>cyclistRanking.totRacing</code> attribute **/
	public static final String TOTRACING = "totRacing";
	/** Qualifier of the <code>cyclistRanking.totTime</code> attribute **/
	public static final String TOTTIME = "totTime";
	/** Qualifier of the <code>cyclistRanking.cyclist</code> attribute **/
	public static final String CYCLIST = "cyclist";
	/** Qualifier of the <code>cyclistRanking.stagerace</code> attribute **/
	public static final String STAGERACE = "stagerace";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STAGERACE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCyclistRanking> STAGERACEHANDLER = new BidirectionalOneToManyHandler<GeneratedCyclistRanking>(
	CyclingracinguiipConstants.TC.CYCLISTRANKING,
	false,
	"stagerace",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(TOTRACING, AttributeMode.INITIAL);
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
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		STAGERACEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>cyclistRanking.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Cyclist getCyclist(final SessionContext ctx)
	{
		return (Cyclist)getProperty( ctx, CYCLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>cyclistRanking.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Cyclist getCyclist()
	{
		return getCyclist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>cyclistRanking.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final SessionContext ctx, final Cyclist value)
	{
		setProperty(ctx, CYCLIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>cyclistRanking.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final Cyclist value)
	{
		setCyclist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>cyclistRanking.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>cyclistRanking.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>cyclistRanking.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>cyclistRanking.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>cyclistRanking.stagerace</code> attribute.
	 * @return the stagerace
	 */
	public StageRace getStagerace(final SessionContext ctx)
	{
		return (StageRace)getProperty( ctx, STAGERACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>cyclistRanking.stagerace</code> attribute.
	 * @return the stagerace
	 */
	public StageRace getStagerace()
	{
		return getStagerace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>cyclistRanking.stagerace</code> attribute. 
	 * @param value the stagerace
	 */
	public void setStagerace(final SessionContext ctx, final StageRace value)
	{
		STAGERACEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>cyclistRanking.stagerace</code> attribute. 
	 * @param value the stagerace
	 */
	public void setStagerace(final StageRace value)
	{
		setStagerace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>cyclistRanking.totRacing</code> attribute.
	 * @return the totRacing
	 */
	public String getTotRacing(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOTRACING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>cyclistRanking.totRacing</code> attribute.
	 * @return the totRacing
	 */
	public String getTotRacing()
	{
		return getTotRacing( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>cyclistRanking.totRacing</code> attribute. 
	 * @param value the totRacing
	 */
	public void setTotRacing(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOTRACING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>cyclistRanking.totRacing</code> attribute. 
	 * @param value the totRacing
	 */
	public void setTotRacing(final String value)
	{
		setTotRacing( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>cyclistRanking.totTime</code> attribute.
	 * @return the totTime
	 */
	public Integer getTotTime(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>cyclistRanking.totTime</code> attribute.
	 * @return the totTime
	 */
	public Integer getTotTime()
	{
		return getTotTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>cyclistRanking.totTime</code> attribute. 
	 * @return the totTime
	 */
	public int getTotTimeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTotTime( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>cyclistRanking.totTime</code> attribute. 
	 * @return the totTime
	 */
	public int getTotTimeAsPrimitive()
	{
		return getTotTimeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>cyclistRanking.totTime</code> attribute. 
	 * @param value the totTime
	 */
	public void setTotTime(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>cyclistRanking.totTime</code> attribute. 
	 * @param value the totTime
	 */
	public void setTotTime(final Integer value)
	{
		setTotTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>cyclistRanking.totTime</code> attribute. 
	 * @param value the totTime
	 */
	public void setTotTime(final SessionContext ctx, final int value)
	{
		setTotTime( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>cyclistRanking.totTime</code> attribute. 
	 * @param value the totTime
	 */
	public void setTotTime(final int value)
	{
		setTotTime( getSession().getSessionContext(), value );
	}
	
}
