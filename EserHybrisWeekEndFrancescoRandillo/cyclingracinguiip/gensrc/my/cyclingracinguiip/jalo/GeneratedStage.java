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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.cyclingracinguiip.constants.CyclingracinguiipConstants;
import my.cyclingracinguiip.jalo.StageRace;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem stage}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStage extends GenericItem
{
	/** Qualifier of the <code>stage.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>stage.nameStage</code> attribute **/
	public static final String NAMESTAGE = "nameStage";
	/** Qualifier of the <code>stage.dateStage</code> attribute **/
	public static final String DATESTAGE = "dateStage";
	/** Qualifier of the <code>stage.onTrial</code> attribute **/
	public static final String ONTRIAL = "onTrial";
	/** Qualifier of the <code>stage.stagerace</code> attribute **/
	public static final String STAGERACE = "stagerace";
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
		tmp.put(DATESTAGE, AttributeMode.INITIAL);
		tmp.put(ONTRIAL, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>stage.dateStage</code> attribute.
	 * @return the dateStage
	 */
	public Date getDateStage(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATESTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stage.dateStage</code> attribute.
	 * @return the dateStage
	 */
	public Date getDateStage()
	{
		return getDateStage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stage.dateStage</code> attribute. 
	 * @param value the dateStage
	 */
	public void setDateStage(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATESTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stage.dateStage</code> attribute. 
	 * @param value the dateStage
	 */
	public void setDateStage(final Date value)
	{
		setDateStage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stage.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stage.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stage.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stage.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stage.nameStage</code> attribute.
	 * @return the nameStage
	 */
	public String getNameStage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAMESTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stage.nameStage</code> attribute.
	 * @return the nameStage
	 */
	public String getNameStage()
	{
		return getNameStage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stage.nameStage</code> attribute. 
	 * @param value the nameStage
	 */
	public void setNameStage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAMESTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stage.nameStage</code> attribute. 
	 * @param value the nameStage
	 */
	public void setNameStage(final String value)
	{
		setNameStage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stage.onTrial</code> attribute.
	 * @return the onTrial - If the stage is on trial or not
	 */
	public EnumerationValue getOnTrial(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ONTRIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stage.onTrial</code> attribute.
	 * @return the onTrial - If the stage is on trial or not
	 */
	public EnumerationValue getOnTrial()
	{
		return getOnTrial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stage.onTrial</code> attribute. 
	 * @param value the onTrial - If the stage is on trial or not
	 */
	public void setOnTrial(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ONTRIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stage.onTrial</code> attribute. 
	 * @param value the onTrial - If the stage is on trial or not
	 */
	public void setOnTrial(final EnumerationValue value)
	{
		setOnTrial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stage.stagerace</code> attribute.
	 * @return the stagerace
	 */
	public StageRace getStagerace(final SessionContext ctx)
	{
		return (StageRace)getProperty( ctx, STAGERACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stage.stagerace</code> attribute.
	 * @return the stagerace
	 */
	public StageRace getStagerace()
	{
		return getStagerace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stage.stagerace</code> attribute. 
	 * @param value the stagerace
	 */
	public void setStagerace(final SessionContext ctx, final StageRace value)
	{
		STAGERACEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stage.stagerace</code> attribute. 
	 * @param value the stagerace
	 */
	public void setStagerace(final StageRace value)
	{
		setStagerace( getSession().getSessionContext(), value );
	}
	
}
