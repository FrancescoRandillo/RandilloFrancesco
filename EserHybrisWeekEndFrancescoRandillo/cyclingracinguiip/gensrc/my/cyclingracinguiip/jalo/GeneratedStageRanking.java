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
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.cyclingracinguiip.constants.CyclingracinguiipConstants;
import my.cyclingracinguiip.jalo.Cyclist;
import my.cyclingracinguiip.jalo.Stage;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem stageRanking}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStageRanking extends GenericItem
{
	/** Qualifier of the <code>stageRanking.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>stageRanking.racing</code> attribute **/
	public static final String RACING = "racing";
	/** Qualifier of the <code>stageRanking.time</code> attribute **/
	public static final String TIME = "time";
	/** Qualifier of the <code>stageRanking.state</code> attribute **/
	public static final String STATE = "state";
	/** Qualifier of the <code>stageRanking.stage</code> attribute **/
	public static final String STAGE = "stage";
	/** Qualifier of the <code>stageRanking.cyclist</code> attribute **/
	public static final String CYCLIST = "cyclist";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CYCLIST's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedStageRanking> CYCLISTHANDLER = new BidirectionalOneToManyHandler<GeneratedStageRanking>(
	CyclingracinguiipConstants.TC.STAGERANKING,
	false,
	"cyclist",
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
		tmp.put(RACING, AttributeMode.INITIAL);
		tmp.put(TIME, AttributeMode.INITIAL);
		tmp.put(STATE, AttributeMode.INITIAL);
		tmp.put(STAGE, AttributeMode.INITIAL);
		tmp.put(CYCLIST, AttributeMode.INITIAL);
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
		CYCLISTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Cyclist getCyclist(final SessionContext ctx)
	{
		return (Cyclist)getProperty( ctx, CYCLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Cyclist getCyclist()
	{
		return getCyclist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final SessionContext ctx, final Cyclist value)
	{
		CYCLISTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final Cyclist value)
	{
		setCyclist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.racing</code> attribute.
	 * @return the racing - cyclist position
	 */
	public String getRacing(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RACING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.racing</code> attribute.
	 * @return the racing - cyclist position
	 */
	public String getRacing()
	{
		return getRacing( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.racing</code> attribute. 
	 * @param value the racing - cyclist position
	 */
	public void setRacing(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RACING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.racing</code> attribute. 
	 * @param value the racing - cyclist position
	 */
	public void setRacing(final String value)
	{
		setRacing( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.stage</code> attribute.
	 * @return the stage
	 */
	public Stage getStage(final SessionContext ctx)
	{
		return (Stage)getProperty( ctx, STAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.stage</code> attribute.
	 * @return the stage
	 */
	public Stage getStage()
	{
		return getStage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.stage</code> attribute. 
	 * @param value the stage
	 */
	public void setStage(final SessionContext ctx, final Stage value)
	{
		setProperty(ctx, STAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.stage</code> attribute. 
	 * @param value the stage
	 */
	public void setStage(final Stage value)
	{
		setStage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.state</code> attribute.
	 * @return the state
	 */
	public EnumerationValue getState(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.state</code> attribute.
	 * @return the state
	 */
	public EnumerationValue getState()
	{
		return getState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final EnumerationValue value)
	{
		setState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.time</code> attribute.
	 * @return the time
	 */
	public Integer getTime(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.time</code> attribute.
	 * @return the time
	 */
	public Integer getTime()
	{
		return getTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.time</code> attribute. 
	 * @return the time
	 */
	public int getTimeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTime( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRanking.time</code> attribute. 
	 * @return the time
	 */
	public int getTimeAsPrimitive()
	{
		return getTimeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final Integer value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final SessionContext ctx, final int value)
	{
		setTime( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRanking.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final int value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
}
