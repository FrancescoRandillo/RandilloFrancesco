/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 21.00.45                        ---
 * ----------------------------------------------------------------
 */
package my.cyclingracinguiip.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import my.cyclingracinguiip.constants.CyclingracinguiipConstants;
import my.cyclingracinguiip.jalo.Cyclist;
import my.cyclingracinguiip.jalo.CyclistRanking;
import my.cyclingracinguiip.jalo.Stage;
import my.cyclingracinguiip.jalo.StageRace;
import my.cyclingracinguiip.jalo.StageRanking;

/**
 * Generated class for type <code>CyclingracinguiipManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclingracinguiipManager extends Extension
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
	
	public Cyclist createCyclist(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CyclingracinguiipConstants.TC.CYCLIST );
			return (Cyclist)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating cyclist : "+e.getMessage(), 0 );
		}
	}
	
	public Cyclist createCyclist(final Map attributeValues)
	{
		return createCyclist( getSession().getSessionContext(), attributeValues );
	}
	
	public CyclistRanking createCyclistRanking(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CyclingracinguiipConstants.TC.CYCLISTRANKING );
			return (CyclistRanking)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating cyclistRanking : "+e.getMessage(), 0 );
		}
	}
	
	public CyclistRanking createCyclistRanking(final Map attributeValues)
	{
		return createCyclistRanking( getSession().getSessionContext(), attributeValues );
	}
	
	public Stage createStage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CyclingracinguiipConstants.TC.STAGE );
			return (Stage)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating stage : "+e.getMessage(), 0 );
		}
	}
	
	public Stage createStage(final Map attributeValues)
	{
		return createStage( getSession().getSessionContext(), attributeValues );
	}
	
	public StageRace createStageRace(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CyclingracinguiipConstants.TC.STAGERACE );
			return (StageRace)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating stageRace : "+e.getMessage(), 0 );
		}
	}
	
	public StageRace createStageRace(final Map attributeValues)
	{
		return createStageRace( getSession().getSessionContext(), attributeValues );
	}
	
	public StageRanking createStageRanking(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CyclingracinguiipConstants.TC.STAGERANKING );
			return (StageRanking)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating stageRanking : "+e.getMessage(), 0 );
		}
	}
	
	public StageRanking createStageRanking(final Map attributeValues)
	{
		return createStageRanking( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return CyclingracinguiipConstants.EXTENSIONNAME;
	}
	
}
