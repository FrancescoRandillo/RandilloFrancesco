/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-ott-2017 0.26.30                         ---
 * ----------------------------------------------------------------
 */
package my.recipesuiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.recipesuiip.constants.RecipesuiipConstants;
import my.recipesuiip.jalo.Ricetta;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Autore}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAutore extends GenericItem
{
	/** Qualifier of the <code>Autore.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Autore.riferimento</code> attribute **/
	public static final String RIFERIMENTO = "riferimento";
	/** Qualifier of the <code>Autore.ricette</code> attribute **/
	public static final String RICETTE = "ricette";
	/**
	* {@link OneToManyHandler} for handling 1:n RICETTE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Ricetta> RICETTEHANDLER = new OneToManyHandler<Ricetta>(
	RecipesuiipConstants.TC.RICETTA,
	false,
	"autore",
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
		tmp.put(RIFERIMENTO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Autore.id</code> attribute.
	 * @return the id - Id di un autore
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Autore.id</code> attribute.
	 * @return the id - Id di un autore
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Autore.id</code> attribute. 
	 * @return the id - Id di un autore
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Autore.id</code> attribute. 
	 * @return the id - Id di un autore
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Autore.id</code> attribute. 
	 * @param value the id - Id di un autore
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Autore.id</code> attribute. 
	 * @param value the id - Id di un autore
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Autore.id</code> attribute. 
	 * @param value the id - Id di un autore
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Autore.id</code> attribute. 
	 * @param value the id - Id di un autore
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Autore.ricette</code> attribute.
	 * @return the ricette
	 */
	public Collection<Ricetta> getRicette(final SessionContext ctx)
	{
		return RICETTEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Autore.ricette</code> attribute.
	 * @return the ricette
	 */
	public Collection<Ricetta> getRicette()
	{
		return getRicette( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Autore.ricette</code> attribute. 
	 * @param value the ricette
	 */
	public void setRicette(final SessionContext ctx, final Collection<Ricetta> value)
	{
		RICETTEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Autore.ricette</code> attribute. 
	 * @param value the ricette
	 */
	public void setRicette(final Collection<Ricetta> value)
	{
		setRicette( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ricette. 
	 * @param value the item to add to ricette
	 */
	public void addToRicette(final SessionContext ctx, final Ricetta value)
	{
		RICETTEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ricette. 
	 * @param value the item to add to ricette
	 */
	public void addToRicette(final Ricetta value)
	{
		addToRicette( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ricette. 
	 * @param value the item to remove from ricette
	 */
	public void removeFromRicette(final SessionContext ctx, final Ricetta value)
	{
		RICETTEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ricette. 
	 * @param value the item to remove from ricette
	 */
	public void removeFromRicette(final Ricetta value)
	{
		removeFromRicette( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Autore.riferimento</code> attribute.
	 * @return the riferimento - Riferimento dell'autore( schef, sito, paese,libro...)
	 */
	public String getRiferimento(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RIFERIMENTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Autore.riferimento</code> attribute.
	 * @return the riferimento - Riferimento dell'autore( schef, sito, paese,libro...)
	 */
	public String getRiferimento()
	{
		return getRiferimento( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Autore.riferimento</code> attribute. 
	 * @param value the riferimento - Riferimento dell'autore( schef, sito, paese,libro...)
	 */
	public void setRiferimento(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RIFERIMENTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Autore.riferimento</code> attribute. 
	 * @param value the riferimento - Riferimento dell'autore( schef, sito, paese,libro...)
	 */
	public void setRiferimento(final String value)
	{
		setRiferimento( getSession().getSessionContext(), value );
	}
	
}
