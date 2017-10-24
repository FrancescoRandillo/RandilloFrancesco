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
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.recipesuiip.constants.RecipesuiipConstants;
import my.recipesuiip.jalo.Autore;
import my.recipesuiip.jalo.RecipeEntry;
import my.recipesuiip.jalo.Tool;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Ricetta}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRicetta extends GenericItem
{
	/** Qualifier of the <code>Ricetta.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Ricetta.nome</code> attribute **/
	public static final String NOME = "nome";
	/** Qualifier of the <code>Ricetta.descrizione</code> attribute **/
	public static final String DESCRIZIONE = "descrizione";
	/** Qualifier of the <code>Ricetta.procedimento</code> attribute **/
	public static final String PROCEDIMENTO = "procedimento";
	/** Qualifier of the <code>Ricetta.kcal</code> attribute **/
	public static final String KCAL = "kcal";
	/** Qualifier of the <code>Ricetta.tempTot</code> attribute **/
	public static final String TEMPTOT = "tempTot";
	/** Qualifier of the <code>Ricetta.autore</code> attribute **/
	public static final String AUTORE = "autore";
	/** Qualifier of the <code>Ricetta.tools</code> attribute **/
	public static final String TOOLS = "tools";
	/** Relation ordering override parameter constants for Ricetta2ToolRelation from ((recipesuiip))*/
	protected static String RICETTA2TOOLRELATION_SRC_ORDERED = "relation.Ricetta2ToolRelation.source.ordered";
	protected static String RICETTA2TOOLRELATION_TGT_ORDERED = "relation.Ricetta2ToolRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Ricetta2ToolRelation from ((recipesuiip))*/
	protected static String RICETTA2TOOLRELATION_MARKMODIFIED = "relation.Ricetta2ToolRelation.markmodified";
	/** Qualifier of the <code>Ricetta.recipeEntrys</code> attribute **/
	public static final String RECIPEENTRYS = "recipeEntrys";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AUTORE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRicetta> AUTOREHANDLER = new BidirectionalOneToManyHandler<GeneratedRicetta>(
	RecipesuiipConstants.TC.RICETTA,
	false,
	"autore",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n RECIPEENTRYS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RecipeEntry> RECIPEENTRYSHANDLER = new OneToManyHandler<RecipeEntry>(
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
		tmp.put(NOME, AttributeMode.INITIAL);
		tmp.put(DESCRIZIONE, AttributeMode.INITIAL);
		tmp.put(PROCEDIMENTO, AttributeMode.INITIAL);
		tmp.put(KCAL, AttributeMode.INITIAL);
		tmp.put(TEMPTOT, AttributeMode.INITIAL);
		tmp.put(AUTORE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.autore</code> attribute.
	 * @return the autore
	 */
	public Autore getAutore(final SessionContext ctx)
	{
		return (Autore)getProperty( ctx, AUTORE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.autore</code> attribute.
	 * @return the autore
	 */
	public Autore getAutore()
	{
		return getAutore( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.autore</code> attribute. 
	 * @param value the autore
	 */
	public void setAutore(final SessionContext ctx, final Autore value)
	{
		AUTOREHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.autore</code> attribute. 
	 * @param value the autore
	 */
	public void setAutore(final Autore value)
	{
		setAutore( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AUTOREHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.descrizione</code> attribute.
	 * @return the descrizione - descrizione di una ricetta
	 */
	public String getDescrizione(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIZIONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.descrizione</code> attribute.
	 * @return the descrizione - descrizione di una ricetta
	 */
	public String getDescrizione()
	{
		return getDescrizione( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.descrizione</code> attribute. 
	 * @param value the descrizione - descrizione di una ricetta
	 */
	public void setDescrizione(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIZIONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.descrizione</code> attribute. 
	 * @param value the descrizione - descrizione di una ricetta
	 */
	public void setDescrizione(final String value)
	{
		setDescrizione( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.id</code> attribute.
	 * @return the id - Id di una ricetta
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.id</code> attribute.
	 * @return the id - Id di una ricetta
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.id</code> attribute. 
	 * @return the id - Id di una ricetta
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.id</code> attribute. 
	 * @return the id - Id di una ricetta
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.id</code> attribute. 
	 * @param value the id - Id di una ricetta
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.id</code> attribute. 
	 * @param value the id - Id di una ricetta
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.id</code> attribute. 
	 * @param value the id - Id di una ricetta
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.id</code> attribute. 
	 * @param value the id - Id di una ricetta
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.kcal</code> attribute.
	 * @return the kcal - kcal di una ricetta
	 */
	public Integer getKcal(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, KCAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.kcal</code> attribute.
	 * @return the kcal - kcal di una ricetta
	 */
	public Integer getKcal()
	{
		return getKcal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.kcal</code> attribute. 
	 * @return the kcal - kcal di una ricetta
	 */
	public int getKcalAsPrimitive(final SessionContext ctx)
	{
		Integer value = getKcal( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.kcal</code> attribute. 
	 * @return the kcal - kcal di una ricetta
	 */
	public int getKcalAsPrimitive()
	{
		return getKcalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.kcal</code> attribute. 
	 * @param value the kcal - kcal di una ricetta
	 */
	public void setKcal(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, KCAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.kcal</code> attribute. 
	 * @param value the kcal - kcal di una ricetta
	 */
	public void setKcal(final Integer value)
	{
		setKcal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.kcal</code> attribute. 
	 * @param value the kcal - kcal di una ricetta
	 */
	public void setKcal(final SessionContext ctx, final int value)
	{
		setKcal( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.kcal</code> attribute. 
	 * @param value the kcal - kcal di una ricetta
	 */
	public void setKcal(final int value)
	{
		setKcal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.nome</code> attribute.
	 * @return the nome - Nome della ricetta
	 */
	public String getNome(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRicetta.getNome requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NOME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.nome</code> attribute.
	 * @return the nome - Nome della ricetta
	 */
	public String getNome()
	{
		return getNome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.nome</code> attribute. 
	 * @return the localized nome - Nome della ricetta
	 */
	public Map<Language,String> getAllNome(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NOME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.nome</code> attribute. 
	 * @return the localized nome - Nome della ricetta
	 */
	public Map<Language,String> getAllNome()
	{
		return getAllNome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.nome</code> attribute. 
	 * @param value the nome - Nome della ricetta
	 */
	public void setNome(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRicetta.setNome requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.nome</code> attribute. 
	 * @param value the nome - Nome della ricetta
	 */
	public void setNome(final String value)
	{
		setNome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.nome</code> attribute. 
	 * @param value the nome - Nome della ricetta
	 */
	public void setAllNome(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.nome</code> attribute. 
	 * @param value the nome - Nome della ricetta
	 */
	public void setAllNome(final Map<Language,String> value)
	{
		setAllNome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.procedimento</code> attribute.
	 * @return the procedimento - procedimento di una ricetta
	 */
	public String getProcedimento(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRicetta.getProcedimento requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PROCEDIMENTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.procedimento</code> attribute.
	 * @return the procedimento - procedimento di una ricetta
	 */
	public String getProcedimento()
	{
		return getProcedimento( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.procedimento</code> attribute. 
	 * @return the localized procedimento - procedimento di una ricetta
	 */
	public Map<Language,String> getAllProcedimento(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PROCEDIMENTO,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.procedimento</code> attribute. 
	 * @return the localized procedimento - procedimento di una ricetta
	 */
	public Map<Language,String> getAllProcedimento()
	{
		return getAllProcedimento( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.procedimento</code> attribute. 
	 * @param value the procedimento - procedimento di una ricetta
	 */
	public void setProcedimento(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRicetta.setProcedimento requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PROCEDIMENTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.procedimento</code> attribute. 
	 * @param value the procedimento - procedimento di una ricetta
	 */
	public void setProcedimento(final String value)
	{
		setProcedimento( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.procedimento</code> attribute. 
	 * @param value the procedimento - procedimento di una ricetta
	 */
	public void setAllProcedimento(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PROCEDIMENTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.procedimento</code> attribute. 
	 * @param value the procedimento - procedimento di una ricetta
	 */
	public void setAllProcedimento(final Map<Language,String> value)
	{
		setAllProcedimento( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.recipeEntrys</code> attribute.
	 * @return the recipeEntrys
	 */
	public Collection<RecipeEntry> getRecipeEntrys(final SessionContext ctx)
	{
		return RECIPEENTRYSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.recipeEntrys</code> attribute.
	 * @return the recipeEntrys
	 */
	public Collection<RecipeEntry> getRecipeEntrys()
	{
		return getRecipeEntrys( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.recipeEntrys</code> attribute. 
	 * @param value the recipeEntrys
	 */
	public void setRecipeEntrys(final SessionContext ctx, final Collection<RecipeEntry> value)
	{
		RECIPEENTRYSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.recipeEntrys</code> attribute. 
	 * @param value the recipeEntrys
	 */
	public void setRecipeEntrys(final Collection<RecipeEntry> value)
	{
		setRecipeEntrys( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recipeEntrys. 
	 * @param value the item to add to recipeEntrys
	 */
	public void addToRecipeEntrys(final SessionContext ctx, final RecipeEntry value)
	{
		RECIPEENTRYSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recipeEntrys. 
	 * @param value the item to add to recipeEntrys
	 */
	public void addToRecipeEntrys(final RecipeEntry value)
	{
		addToRecipeEntrys( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recipeEntrys. 
	 * @param value the item to remove from recipeEntrys
	 */
	public void removeFromRecipeEntrys(final SessionContext ctx, final RecipeEntry value)
	{
		RECIPEENTRYSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recipeEntrys. 
	 * @param value the item to remove from recipeEntrys
	 */
	public void removeFromRecipeEntrys(final RecipeEntry value)
	{
		removeFromRecipeEntrys( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.tempTot</code> attribute.
	 * @return the tempTot - tempo totale per la preparazione
	 */
	public String getTempTot(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEMPTOT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.tempTot</code> attribute.
	 * @return the tempTot - tempo totale per la preparazione
	 */
	public String getTempTot()
	{
		return getTempTot( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.tempTot</code> attribute. 
	 * @param value the tempTot - tempo totale per la preparazione
	 */
	public void setTempTot(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEMPTOT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.tempTot</code> attribute. 
	 * @param value the tempTot - tempo totale per la preparazione
	 */
	public void setTempTot(final String value)
	{
		setTempTot( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.tools</code> attribute.
	 * @return the tools
	 */
	public Collection<Tool> getTools(final SessionContext ctx)
	{
		final List<Tool> items = getLinkedItems( 
			ctx,
			false,
			RecipesuiipConstants.Relations.RICETTA2TOOLRELATION,
			"Tool",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ricetta.tools</code> attribute.
	 * @return the tools
	 */
	public Collection<Tool> getTools()
	{
		return getTools( getSession().getSessionContext() );
	}
	
	public long getToolsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			RecipesuiipConstants.Relations.RICETTA2TOOLRELATION,
			"Tool",
			null
		);
	}
	
	public long getToolsCount()
	{
		return getToolsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.tools</code> attribute. 
	 * @param value the tools
	 */
	public void setTools(final SessionContext ctx, final Collection<Tool> value)
	{
		setLinkedItems( 
			ctx,
			false,
			RecipesuiipConstants.Relations.RICETTA2TOOLRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(RICETTA2TOOLRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ricetta.tools</code> attribute. 
	 * @param value the tools
	 */
	public void setTools(final Collection<Tool> value)
	{
		setTools( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tools. 
	 * @param value the item to add to tools
	 */
	public void addToTools(final SessionContext ctx, final Tool value)
	{
		addLinkedItems( 
			ctx,
			false,
			RecipesuiipConstants.Relations.RICETTA2TOOLRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RICETTA2TOOLRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tools. 
	 * @param value the item to add to tools
	 */
	public void addToTools(final Tool value)
	{
		addToTools( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tools. 
	 * @param value the item to remove from tools
	 */
	public void removeFromTools(final SessionContext ctx, final Tool value)
	{
		removeLinkedItems( 
			ctx,
			false,
			RecipesuiipConstants.Relations.RICETTA2TOOLRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(RICETTA2TOOLRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tools. 
	 * @param value the item to remove from tools
	 */
	public void removeFromTools(final Tool value)
	{
		removeFromTools( getSession().getSessionContext(), value );
	}
	
}
