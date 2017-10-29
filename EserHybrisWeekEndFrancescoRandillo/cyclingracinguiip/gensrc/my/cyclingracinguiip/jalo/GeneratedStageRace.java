/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 21.00.45                        ---
 * ----------------------------------------------------------------
 */
package my.cyclingracinguiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.cyclingracinguiip.constants.CyclingracinguiipConstants;
import my.cyclingracinguiip.jalo.CyclistRanking;
import my.cyclingracinguiip.jalo.Stage;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem stageRace}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStageRace extends GenericItem
{
	/** Qualifier of the <code>stageRace.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>stageRace.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>stageRace.stages</code> attribute **/
	public static final String STAGES = "stages";
	/** Qualifier of the <code>stageRace.cyclistrankings</code> attribute **/
	public static final String CYCLISTRANKINGS = "cyclistrankings";
	/**
	* {@link OneToManyHandler} for handling 1:n STAGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Stage> STAGESHANDLER = new OneToManyHandler<Stage>(
	CyclingracinguiipConstants.TC.STAGE,
	false,
	"stagerace",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CYCLISTRANKINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CyclistRanking> CYCLISTRANKINGSHANDLER = new OneToManyHandler<CyclistRanking>(
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
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRace.cyclistrankings</code> attribute.
	 * @return the cyclistrankings
	 */
	public Collection<CyclistRanking> getCyclistrankings(final SessionContext ctx)
	{
		return CYCLISTRANKINGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRace.cyclistrankings</code> attribute.
	 * @return the cyclistrankings
	 */
	public Collection<CyclistRanking> getCyclistrankings()
	{
		return getCyclistrankings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRace.cyclistrankings</code> attribute. 
	 * @param value the cyclistrankings
	 */
	public void setCyclistrankings(final SessionContext ctx, final Collection<CyclistRanking> value)
	{
		CYCLISTRANKINGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRace.cyclistrankings</code> attribute. 
	 * @param value the cyclistrankings
	 */
	public void setCyclistrankings(final Collection<CyclistRanking> value)
	{
		setCyclistrankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclistrankings. 
	 * @param value the item to add to cyclistrankings
	 */
	public void addToCyclistrankings(final SessionContext ctx, final CyclistRanking value)
	{
		CYCLISTRANKINGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclistrankings. 
	 * @param value the item to add to cyclistrankings
	 */
	public void addToCyclistrankings(final CyclistRanking value)
	{
		addToCyclistrankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclistrankings. 
	 * @param value the item to remove from cyclistrankings
	 */
	public void removeFromCyclistrankings(final SessionContext ctx, final CyclistRanking value)
	{
		CYCLISTRANKINGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclistrankings. 
	 * @param value the item to remove from cyclistrankings
	 */
	public void removeFromCyclistrankings(final CyclistRanking value)
	{
		removeFromCyclistrankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRace.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRace.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRace.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRace.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRace.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRace.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRace.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRace.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRace.stages</code> attribute.
	 * @return the stages
	 */
	public Collection<Stage> getStages(final SessionContext ctx)
	{
		return STAGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>stageRace.stages</code> attribute.
	 * @return the stages
	 */
	public Collection<Stage> getStages()
	{
		return getStages( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRace.stages</code> attribute. 
	 * @param value the stages
	 */
	public void setStages(final SessionContext ctx, final Collection<Stage> value)
	{
		STAGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>stageRace.stages</code> attribute. 
	 * @param value the stages
	 */
	public void setStages(final Collection<Stage> value)
	{
		setStages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stages. 
	 * @param value the item to add to stages
	 */
	public void addToStages(final SessionContext ctx, final Stage value)
	{
		STAGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stages. 
	 * @param value the item to add to stages
	 */
	public void addToStages(final Stage value)
	{
		addToStages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stages. 
	 * @param value the item to remove from stages
	 */
	public void removeFromStages(final SessionContext ctx, final Stage value)
	{
		STAGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stages. 
	 * @param value the item to remove from stages
	 */
	public void removeFromStages(final Stage value)
	{
		removeFromStages( getSession().getSessionContext(), value );
	}
	
}
