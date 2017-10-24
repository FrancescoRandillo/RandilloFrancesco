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
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.recipesuiip.constants.RecipesuiipConstants;
import my.recipesuiip.jalo.Ricetta;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Tool}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTool extends GenericItem
{
	/** Qualifier of the <code>Tool.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Tool.nome</code> attribute **/
	public static final String NOME = "nome";
	/** Qualifier of the <code>Tool.ricette</code> attribute **/
	public static final String RICETTE = "ricette";
	/** Relation ordering override parameter constants for Ricetta2ToolRelation from ((recipesuiip))*/
	protected static String RICETTA2TOOLRELATION_SRC_ORDERED = "relation.Ricetta2ToolRelation.source.ordered";
	protected static String RICETTA2TOOLRELATION_TGT_ORDERED = "relation.Ricetta2ToolRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Ricetta2ToolRelation from ((recipesuiip))*/
	protected static String RICETTA2TOOLRELATION_MARKMODIFIED = "relation.Ricetta2ToolRelation.markmodified";
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
	 * <i>Generated method</i> - Getter of the <code>Tool.id</code> attribute.
	 * @return the id - Id di un tool
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tool.id</code> attribute.
	 * @return the id - Id di un tool
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tool.id</code> attribute. 
	 * @return the id - Id di un tool
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tool.id</code> attribute. 
	 * @return the id - Id di un tool
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tool.id</code> attribute. 
	 * @param value the id - Id di un tool
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tool.id</code> attribute. 
	 * @param value the id - Id di un tool
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tool.id</code> attribute. 
	 * @param value the id - Id di un tool
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tool.id</code> attribute. 
	 * @param value the id - Id di un tool
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tool.nome</code> attribute.
	 * @return the nome - Nome dell tool
	 */
	public String getNome(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTool.getNome requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NOME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tool.nome</code> attribute.
	 * @return the nome - Nome dell tool
	 */
	public String getNome()
	{
		return getNome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tool.nome</code> attribute. 
	 * @return the localized nome - Nome dell tool
	 */
	public Map<Language,String> getAllNome(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NOME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tool.nome</code> attribute. 
	 * @return the localized nome - Nome dell tool
	 */
	public Map<Language,String> getAllNome()
	{
		return getAllNome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tool.nome</code> attribute. 
	 * @param value the nome - Nome dell tool
	 */
	public void setNome(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTool.setNome requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tool.nome</code> attribute. 
	 * @param value the nome - Nome dell tool
	 */
	public void setNome(final String value)
	{
		setNome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tool.nome</code> attribute. 
	 * @param value the nome - Nome dell tool
	 */
	public void setAllNome(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tool.nome</code> attribute. 
	 * @param value the nome - Nome dell tool
	 */
	public void setAllNome(final Map<Language,String> value)
	{
		setAllNome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tool.ricette</code> attribute.
	 * @return the ricette
	 */
	public Collection<Ricetta> getRicette(final SessionContext ctx)
	{
		final List<Ricetta> items = getLinkedItems( 
			ctx,
			true,
			RecipesuiipConstants.Relations.RICETTA2TOOLRELATION,
			"Ricetta",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tool.ricette</code> attribute.
	 * @return the ricette
	 */
	public Collection<Ricetta> getRicette()
	{
		return getRicette( getSession().getSessionContext() );
	}
	
	public long getRicetteCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			RecipesuiipConstants.Relations.RICETTA2TOOLRELATION,
			"Ricetta",
			null
		);
	}
	
	public long getRicetteCount()
	{
		return getRicetteCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tool.ricette</code> attribute. 
	 * @param value the ricette
	 */
	public void setRicette(final SessionContext ctx, final Collection<Ricetta> value)
	{
		setLinkedItems( 
			ctx,
			true,
			RecipesuiipConstants.Relations.RICETTA2TOOLRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(RICETTA2TOOLRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tool.ricette</code> attribute. 
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
		addLinkedItems( 
			ctx,
			true,
			RecipesuiipConstants.Relations.RICETTA2TOOLRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RICETTA2TOOLRELATION_MARKMODIFIED)
		);
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
		removeLinkedItems( 
			ctx,
			true,
			RecipesuiipConstants.Relations.RICETTA2TOOLRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RICETTA2TOOLRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ricette. 
	 * @param value the item to remove from ricette
	 */
	public void removeFromRicette(final Ricetta value)
	{
		removeFromRicette( getSession().getSessionContext(), value );
	}
	
}
