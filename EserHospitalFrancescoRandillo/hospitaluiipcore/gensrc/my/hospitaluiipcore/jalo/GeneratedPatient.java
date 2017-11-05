/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 15.39.47                         ---
 * ----------------------------------------------------------------
 */
package my.hospitaluiipcore.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.hospitaluiipcore.constants.HospitaluiipcoreConstants;
import my.hospitaluiipcore.jalo.HPerson;
import my.hospitaluiipcore.jalo.Visit;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Patient}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPatient extends HPerson
{
	/** Qualifier of the <code>Patient.admissionDate</code> attribute **/
	public static final String ADMISSIONDATE = "admissionDate";
	/** Qualifier of the <code>Patient.exitDate</code> attribute **/
	public static final String EXITDATE = "exitDate";
	/** Qualifier of the <code>Patient.visits</code> attribute **/
	public static final String VISITS = "visits";
	/**
	* {@link OneToManyHandler} for handling 1:n VISITS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Visit> VISITSHANDLER = new OneToManyHandler<Visit>(
	HospitaluiipcoreConstants.TC.VISIT,
	false,
	"patient",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(HPerson.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ADMISSIONDATE, AttributeMode.INITIAL);
		tmp.put(EXITDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.admissionDate</code> attribute.
	 * @return the admissionDate
	 */
	public Date getAdmissionDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ADMISSIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.admissionDate</code> attribute.
	 * @return the admissionDate
	 */
	public Date getAdmissionDate()
	{
		return getAdmissionDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.admissionDate</code> attribute. 
	 * @param value the admissionDate
	 */
	public void setAdmissionDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ADMISSIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.admissionDate</code> attribute. 
	 * @param value the admissionDate
	 */
	public void setAdmissionDate(final Date value)
	{
		setAdmissionDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.exitDate</code> attribute.
	 * @return the exitDate
	 */
	public Date getExitDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXITDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.exitDate</code> attribute.
	 * @return the exitDate
	 */
	public Date getExitDate()
	{
		return getExitDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.exitDate</code> attribute. 
	 * @param value the exitDate
	 */
	public void setExitDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXITDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.exitDate</code> attribute. 
	 * @param value the exitDate
	 */
	public void setExitDate(final Date value)
	{
		setExitDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.visits</code> attribute.
	 * @return the visits
	 */
	public Collection<Visit> getVisits(final SessionContext ctx)
	{
		return VISITSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.visits</code> attribute.
	 * @return the visits
	 */
	public Collection<Visit> getVisits()
	{
		return getVisits( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.visits</code> attribute. 
	 * @param value the visits
	 */
	public void setVisits(final SessionContext ctx, final Collection<Visit> value)
	{
		VISITSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.visits</code> attribute. 
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
