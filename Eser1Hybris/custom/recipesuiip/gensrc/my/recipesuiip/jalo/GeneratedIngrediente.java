/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-ott-2017 0.26.30                         ---
 * ----------------------------------------------------------------
 */
package my.recipesuiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.recipesuiip.constants.RecipesuiipConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Ingrediente}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedIngrediente extends GenericItem
{
	/** Qualifier of the <code>Ingrediente.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Ingrediente.nome</code> attribute **/
	public static final String NOME = "nome";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NOME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingrediente.id</code> attribute.
	 * @return the id - Id di un ingrediente
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingrediente.id</code> attribute.
	 * @return the id - Id di un ingrediente
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingrediente.id</code> attribute. 
	 * @return the id - Id di un ingrediente
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingrediente.id</code> attribute. 
	 * @return the id - Id di un ingrediente
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingrediente.id</code> attribute. 
	 * @param value the id - Id di un ingrediente
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingrediente.id</code> attribute. 
	 * @param value the id - Id di un ingrediente
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingrediente.id</code> attribute. 
	 * @param value the id - Id di un ingrediente
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingrediente.id</code> attribute. 
	 * @param value the id - Id di un ingrediente
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingrediente.nome</code> attribute.
	 * @return the nome - Nome dell ingrediente
	 */
	public String getNome(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedIngrediente.getNome requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NOME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingrediente.nome</code> attribute.
	 * @return the nome - Nome dell ingrediente
	 */
	public String getNome()
	{
		return getNome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingrediente.nome</code> attribute. 
	 * @return the localized nome - Nome dell ingrediente
	 */
	public Map<Language,String> getAllNome(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NOME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ingrediente.nome</code> attribute. 
	 * @return the localized nome - Nome dell ingrediente
	 */
	public Map<Language,String> getAllNome()
	{
		return getAllNome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingrediente.nome</code> attribute. 
	 * @param value the nome - Nome dell ingrediente
	 */
	public void setNome(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedIngrediente.setNome requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingrediente.nome</code> attribute. 
	 * @param value the nome - Nome dell ingrediente
	 */
	public void setNome(final String value)
	{
		setNome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingrediente.nome</code> attribute. 
	 * @param value the nome - Nome dell ingrediente
	 */
	public void setAllNome(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ingrediente.nome</code> attribute. 
	 * @param value the nome - Nome dell ingrediente
	 */
	public void setAllNome(final Map<Language,String> value)
	{
		setAllNome( getSession().getSessionContext(), value );
	}
	
}
