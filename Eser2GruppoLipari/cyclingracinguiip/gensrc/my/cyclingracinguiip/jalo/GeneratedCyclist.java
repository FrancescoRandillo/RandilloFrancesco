/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2-nov-2017 22.29.21                         ---
 * ----------------------------------------------------------------
 */
package my.cyclingracinguiip.jalo;

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
import my.cyclingracinguiip.jalo.CyclistTeam;
import my.cyclingracinguiip.jalo.Person;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Cyclist}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclist extends Person
{
	/** Qualifier of the <code>Cyclist.weight</code> attribute **/
	public static final String WEIGHT = "weight";
	/** Qualifier of the <code>Cyclist.height</code> attribute **/
	public static final String HEIGHT = "height";
	/** Qualifier of the <code>Cyclist.cyclistTeam</code> attribute **/
	public static final String CYCLISTTEAM = "cyclistTeam";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CYCLISTTEAM's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCyclist> CYCLISTTEAMHANDLER = new BidirectionalOneToManyHandler<GeneratedCyclist>(
	CyclingracinguiipConstants.TC.CYCLIST,
	false,
	"cyclistTeam",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Person.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(WEIGHT, AttributeMode.INITIAL);
		tmp.put(HEIGHT, AttributeMode.INITIAL);
		tmp.put(CYCLISTTEAM, AttributeMode.INITIAL);
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
		CYCLISTTEAMHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.cyclistTeam</code> attribute.
	 * @return the cyclistTeam
	 */
	public CyclistTeam getCyclistTeam(final SessionContext ctx)
	{
		return (CyclistTeam)getProperty( ctx, CYCLISTTEAM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.cyclistTeam</code> attribute.
	 * @return the cyclistTeam
	 */
	public CyclistTeam getCyclistTeam()
	{
		return getCyclistTeam( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.cyclistTeam</code> attribute. 
	 * @param value the cyclistTeam
	 */
	public void setCyclistTeam(final SessionContext ctx, final CyclistTeam value)
	{
		CYCLISTTEAMHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.cyclistTeam</code> attribute. 
	 * @param value the cyclistTeam
	 */
	public void setCyclistTeam(final CyclistTeam value)
	{
		setCyclistTeam( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.height</code> attribute.
	 * @return the height
	 */
	public Integer getHeight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, HEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.height</code> attribute.
	 * @return the height
	 */
	public Integer getHeight()
	{
		return getHeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.height</code> attribute. 
	 * @return the height
	 */
	public int getHeightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getHeight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.height</code> attribute. 
	 * @return the height
	 */
	public int getHeightAsPrimitive()
	{
		return getHeightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, HEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final Integer value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final SessionContext ctx, final int value)
	{
		setHeight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.height</code> attribute. 
	 * @param value the height
	 */
	public void setHeight(final int value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.weight</code> attribute.
	 * @return the weight
	 */
	public Integer getWeight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, WEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.weight</code> attribute.
	 * @return the weight
	 */
	public Integer getWeight()
	{
		return getWeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.weight</code> attribute. 
	 * @return the weight
	 */
	public int getWeightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getWeight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.weight</code> attribute. 
	 * @return the weight
	 */
	public int getWeightAsPrimitive()
	{
		return getWeightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, WEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final Integer value)
	{
		setWeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final SessionContext ctx, final int value)
	{
		setWeight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final int value)
	{
		setWeight( getSession().getSessionContext(), value );
	}
	
}
