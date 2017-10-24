/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-ott-2017 0.26.30                         ---
 * ----------------------------------------------------------------
 */
package my.recipesuiip.jalo;

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
import my.recipesuiip.constants.RecipesuiipConstants;
import my.recipesuiip.jalo.Ingrediente;
import my.recipesuiip.jalo.Ricetta;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem RecipeEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRecipeEntry extends GenericItem
{
	/** Qualifier of the <code>RecipeEntry.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>RecipeEntry.quantita</code> attribute **/
	public static final String QUANTITA = "quantita";
	/** Qualifier of the <code>RecipeEntry.ingrediente</code> attribute **/
	public static final String INGREDIENTE = "ingrediente";
	/** Qualifier of the <code>RecipeEntry.ricetta</code> attribute **/
	public static final String RICETTA = "ricetta";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RICETTA's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRecipeEntry> RICETTAHANDLER = new BidirectionalOneToManyHandler<GeneratedRecipeEntry>(
	RecipesuiipConstants.TC.RECIPEENTRY,
	false,
	"ricetta",
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
		tmp.put(QUANTITA, AttributeMode.INITIAL);
		tmp.put(INGREDIENTE, AttributeMode.INITIAL);
		tmp.put(RICETTA, AttributeMode.INITIAL);
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
		RICETTAHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.id</code> attribute.
	 * @return the id
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.id</code> attribute.
	 * @return the id
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.ingrediente</code> attribute.
	 * @return the ingrediente
	 */
	public Ingrediente getIngrediente(final SessionContext ctx)
	{
		return (Ingrediente)getProperty( ctx, INGREDIENTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.ingrediente</code> attribute.
	 * @return the ingrediente
	 */
	public Ingrediente getIngrediente()
	{
		return getIngrediente( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.ingrediente</code> attribute. 
	 * @param value the ingrediente
	 */
	public void setIngrediente(final SessionContext ctx, final Ingrediente value)
	{
		setProperty(ctx, INGREDIENTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.ingrediente</code> attribute. 
	 * @param value the ingrediente
	 */
	public void setIngrediente(final Ingrediente value)
	{
		setIngrediente( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.quantita</code> attribute.
	 * @return the quantita
	 */
	public Integer getQuantita(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, QUANTITA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.quantita</code> attribute.
	 * @return the quantita
	 */
	public Integer getQuantita()
	{
		return getQuantita( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.quantita</code> attribute. 
	 * @return the quantita
	 */
	public int getQuantitaAsPrimitive(final SessionContext ctx)
	{
		Integer value = getQuantita( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.quantita</code> attribute. 
	 * @return the quantita
	 */
	public int getQuantitaAsPrimitive()
	{
		return getQuantitaAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.quantita</code> attribute. 
	 * @param value the quantita
	 */
	public void setQuantita(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, QUANTITA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.quantita</code> attribute. 
	 * @param value the quantita
	 */
	public void setQuantita(final Integer value)
	{
		setQuantita( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.quantita</code> attribute. 
	 * @param value the quantita
	 */
	public void setQuantita(final SessionContext ctx, final int value)
	{
		setQuantita( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.quantita</code> attribute. 
	 * @param value the quantita
	 */
	public void setQuantita(final int value)
	{
		setQuantita( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.ricetta</code> attribute.
	 * @return the ricetta
	 */
	public Ricetta getRicetta(final SessionContext ctx)
	{
		return (Ricetta)getProperty( ctx, RICETTA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RecipeEntry.ricetta</code> attribute.
	 * @return the ricetta
	 */
	public Ricetta getRicetta()
	{
		return getRicetta( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.ricetta</code> attribute. 
	 * @param value the ricetta
	 */
	public void setRicetta(final SessionContext ctx, final Ricetta value)
	{
		RICETTAHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RecipeEntry.ricetta</code> attribute. 
	 * @param value the ricetta
	 */
	public void setRicetta(final Ricetta value)
	{
		setRicetta( getSession().getSessionContext(), value );
	}
	
}
