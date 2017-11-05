/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 15.39.47                         ---
 * ----------------------------------------------------------------
 */
package my.hospitaluiipcore.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.hospitaluiipcore.constants.HospitaluiipcoreConstants;
import my.hospitaluiipcore.jalo.Doctor;
import my.hospitaluiipcore.jalo.Visit;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Department}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDepartment extends GenericItem
{
	/** Qualifier of the <code>Department.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Department.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Department.doctors</code> attribute **/
	public static final String DOCTORS = "doctors";
	/** Qualifier of the <code>Department.visits</code> attribute **/
	public static final String VISITS = "visits";
	/**
	* {@link OneToManyHandler} for handling 1:n DOCTORS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Doctor> DOCTORSHANDLER = new OneToManyHandler<Doctor>(
	HospitaluiipcoreConstants.TC.DOCTOR,
	false,
	"department",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n VISITS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Visit> VISITSHANDLER = new OneToManyHandler<Visit>(
	HospitaluiipcoreConstants.TC.VISIT,
	false,
	"department",
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
	 * <i>Generated method</i> - Getter of the <code>Department.doctors</code> attribute.
	 * @return the doctors
	 */
	public Collection<Doctor> getDoctors(final SessionContext ctx)
	{
		return DOCTORSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.doctors</code> attribute.
	 * @return the doctors
	 */
	public Collection<Doctor> getDoctors()
	{
		return getDoctors( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.doctors</code> attribute. 
	 * @param value the doctors
	 */
	public void setDoctors(final SessionContext ctx, final Collection<Doctor> value)
	{
		DOCTORSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.doctors</code> attribute. 
	 * @param value the doctors
	 */
	public void setDoctors(final Collection<Doctor> value)
	{
		setDoctors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to doctors. 
	 * @param value the item to add to doctors
	 */
	public void addToDoctors(final SessionContext ctx, final Doctor value)
	{
		DOCTORSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to doctors. 
	 * @param value the item to add to doctors
	 */
	public void addToDoctors(final Doctor value)
	{
		addToDoctors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from doctors. 
	 * @param value the item to remove from doctors
	 */
	public void removeFromDoctors(final SessionContext ctx, final Doctor value)
	{
		DOCTORSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from doctors. 
	 * @param value the item to remove from doctors
	 */
	public void removeFromDoctors(final Doctor value)
	{
		removeFromDoctors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.visits</code> attribute.
	 * @return the visits
	 */
	public Collection<Visit> getVisits(final SessionContext ctx)
	{
		return VISITSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.visits</code> attribute.
	 * @return the visits
	 */
	public Collection<Visit> getVisits()
	{
		return getVisits( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.visits</code> attribute. 
	 * @param value the visits
	 */
	public void setVisits(final SessionContext ctx, final Collection<Visit> value)
	{
		VISITSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.visits</code> attribute. 
	 * @param value the visits
	 */
	public void setVisits(final Collection<Visit> value)
	{
		setVisits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to visits. 
	 * @param value the item to add to visits
	 */
	public void addToVisits(final SessionContext ctx, final Visit value)
	{
		VISITSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to visits. 
	 * @param value the item to add to visits
	 */
	public void addToVisits(final Visit value)
	{
		addToVisits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from visits. 
	 * @param value the item to remove from visits
	 */
	public void removeFromVisits(final SessionContext ctx, final Visit value)
	{
		VISITSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from visits. 
	 * @param value the item to remove from visits
	 */
	public void removeFromVisits(final Visit value)
	{
		removeFromVisits( getSession().getSessionContext(), value );
	}
	
}
