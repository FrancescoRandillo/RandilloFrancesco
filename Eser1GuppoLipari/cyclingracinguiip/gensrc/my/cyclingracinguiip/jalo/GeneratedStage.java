/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-ott-2017 1.35.09                         ---
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
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.cyclingracinguiip.constants.CyclingracinguiipConstants;
import my.cyclingracinguiip.jalo.StageRace;
import my.cyclingracinguiip.jalo.StageRanking;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Stage}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStage extends GenericItem
{
	/** Qualifier of the <code>Stage.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Stage.nameStage</code> attribute **/
	public static final String NAMESTAGE = "nameStage";
	/** Qualifier of the <code>Stage.startDateStage</code> attribute **/
	public static final String STARTDATESTAGE = "startDateStage";
	/** Qualifier of the <code>Stage.endDateStage</code> attribute **/
	public static final String ENDDATESTAGE = "endDateStage";
	/** Qualifier of the <code>Stage.days</code> attribute **/
	public static final String DAYS = "days";
	/** Qualifier of the <code>Stage.stageRankings</code> attribute **/
	public static final String STAGERANKINGS = "stageRankings";
	/** Qualifier of the <code>Stage.stagerace</code> attribute **/
	public static final String STAGERACE = "stagerace";
	/**
	* {@link OneToManyHandler} for handling 1:n STAGERANKINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StageRanking> STAGERANKINGSHANDLER = new OneToManyHandler<StageRanking>(
	CyclingracinguiipConstants.TC.STAGERANKING,
	false,
	"stage",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STAGERACE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedStage> STAGERACEHANDLER = new BidirectionalOneToManyHandler<GeneratedStage>(
	CyclingracinguiipConstants.TC.STAGE,
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
		tmp.put(NAMESTAGE, AttributeMode.INITIAL);
		tmp.put(STARTDATESTAGE, AttributeMode.INITIAL);
		tmp.put(ENDDATESTAGE, AttributeMode.INITIAL);
		tmp.put(DAYS, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>Stage.days</code> attribute.
	 * @return the days
	 */
	public Integer getDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.days</code> attribute.
	 * @return the days
	 */
	public Integer getDays()
	{
		return getDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.days</code> attribute. 
	 * @return the days
	 */
	public int getDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.days</code> attribute. 
	 * @return the days
	 */
	public int getDaysAsPrimitive()
	{
		return getDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final Integer value)
	{
		setDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final SessionContext ctx, final int value)
	{
		setDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final int value)
	{
		setDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.endDateStage</code> attribute.
	 * @return the endDateStage
	 */
	public Date getEndDateStage(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATESTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.endDateStage</code> attribute.
	 * @return the endDateStage
	 */
	public Date getEndDateStage()
	{
		return getEndDateStage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.endDateStage</code> attribute. 
	 * @param value the endDateStage
	 */
	public void setEndDateStage(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATESTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.endDateStage</code> attribute. 
	 * @param value the endDateStage
	 */
	public void setEndDateStage(final Date value)
	{
		setEndDateStage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.nameStage</code> attribute.
	 * @return the nameStage
	 */
	public String getNameStage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAMESTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.nameStage</code> attribute.
	 * @return the nameStage
	 */
	public String getNameStage()
	{
		return getNameStage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.nameStage</code> attribute. 
	 * @param value the nameStage
	 */
	public void setNameStage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAMESTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.nameStage</code> attribute. 
	 * @param value the nameStage
	 */
	public void setNameStage(final String value)
	{
		setNameStage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stagerace</code> attribute.
	 * @return the stagerace
	 */
	public StageRace getStagerace(final SessionContext ctx)
	{
		return (StageRace)getProperty( ctx, STAGERACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stagerace</code> attribute.
	 * @return the stagerace
	 */
	public StageRace getStagerace()
	{
		return getStagerace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stagerace</code> attribute. 
	 * @param value the stagerace
	 */
	public void setStagerace(final SessionContext ctx, final StageRace value)
	{
		STAGERACEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stagerace</code> attribute. 
	 * @param value the stagerace
	 */
	public void setStagerace(final StageRace value)
	{
		setStagerace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageRankings</code> attribute.
	 * @return the stageRankings
	 */
	public Collection<StageRanking> getStageRankings(final SessionContext ctx)
	{
		return STAGERANKINGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageRankings</code> attribute.
	 * @return the stageRankings
	 */
	public Collection<StageRanking> getStageRankings()
	{
		return getStageRankings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageRankings</code> attribute. 
	 * @param value the stageRankings
	 */
	public void setStageRankings(final SessionContext ctx, final Collection<StageRanking> value)
	{
		STAGERANKINGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageRankings</code> attribute. 
	 * @param value the stageRankings
	 */
	public void setStageRankings(final Collection<StageRanking> value)
	{
		setStageRankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stageRankings. 
	 * @param value the item to add to stageRankings
	 */
	public void addToStageRankings(final SessionContext ctx, final StageRanking value)
	{
		STAGERANKINGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stageRankings. 
	 * @param value the item to add to stageRankings
	 */
	public void addToStageRankings(final StageRanking value)
	{
		addToStageRankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stageRankings. 
	 * @param value the item to remove from stageRankings
	 */
	public void removeFromStageRankings(final SessionContext ctx, final StageRanking value)
	{
		STAGERANKINGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stageRankings. 
	 * @param value the item to remove from stageRankings
	 */
	public void removeFromStageRankings(final StageRanking value)
	{
		removeFromStageRankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.startDateStage</code> attribute.
	 * @return the startDateStage
	 */
	public Date getStartDateStage(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTDATESTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.startDateStage</code> attribute.
	 * @return the startDateStage
	 */
	public Date getStartDateStage()
	{
		return getStartDateStage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.startDateStage</code> attribute. 
	 * @param value the startDateStage
	 */
	public void setStartDateStage(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTDATESTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.startDateStage</code> attribute. 
	 * @param value the startDateStage
	 */
	public void setStartDateStage(final Date value)
	{
		setStartDateStage( getSession().getSessionContext(), value );
	}
	
}
