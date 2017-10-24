/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-ott-2017 0.26.30                         ---
 * ----------------------------------------------------------------
 */
package my.recipesuiip.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import my.recipesuiip.constants.RecipesuiipConstants;
import my.recipesuiip.jalo.Autore;
import my.recipesuiip.jalo.Ingrediente;
import my.recipesuiip.jalo.RecipeEntry;
import my.recipesuiip.jalo.Ricetta;
import my.recipesuiip.jalo.Tool;

/**
 * Generated class for type <code>RecipesuiipManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRecipesuiipManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Autore createAutore(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( RecipesuiipConstants.TC.AUTORE );
			return (Autore)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Autore : "+e.getMessage(), 0 );
		}
	}
	
	public Autore createAutore(final Map attributeValues)
	{
		return createAutore( getSession().getSessionContext(), attributeValues );
	}
	
	public Ingrediente createIngrediente(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( RecipesuiipConstants.TC.INGREDIENTE );
			return (Ingrediente)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Ingrediente : "+e.getMessage(), 0 );
		}
	}
	
	public Ingrediente createIngrediente(final Map attributeValues)
	{
		return createIngrediente( getSession().getSessionContext(), attributeValues );
	}
	
	public RecipeEntry createRecipeEntry(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( RecipesuiipConstants.TC.RECIPEENTRY );
			return (RecipeEntry)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating RecipeEntry : "+e.getMessage(), 0 );
		}
	}
	
	public RecipeEntry createRecipeEntry(final Map attributeValues)
	{
		return createRecipeEntry( getSession().getSessionContext(), attributeValues );
	}
	
	public Ricetta createRicetta(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( RecipesuiipConstants.TC.RICETTA );
			return (Ricetta)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Ricetta : "+e.getMessage(), 0 );
		}
	}
	
	public Ricetta createRicetta(final Map attributeValues)
	{
		return createRicetta( getSession().getSessionContext(), attributeValues );
	}
	
	public Tool createTool(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( RecipesuiipConstants.TC.TOOL );
			return (Tool)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Tool : "+e.getMessage(), 0 );
		}
	}
	
	public Tool createTool(final Map attributeValues)
	{
		return createTool( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return RecipesuiipConstants.EXTENSIONNAME;
	}
	
}
