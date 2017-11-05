/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 15.39.47                         ---
 * ----------------------------------------------------------------
 */
package my.hospitaluiipcore.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.hospitaluiipcore.constants.HospitaluiipcoreConstants;
import my.hospitaluiipcore.jalo.Department;
import my.hospitaluiipcore.jalo.Doctor;
import my.hospitaluiipcore.jalo.Patient;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Visit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVisit extends GenericItem
{
	/** Qualifier of the <code>Visit.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Visit.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Visit.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Visit.result</code> attribute **/
	public static final String RESULT = "result";
	/** Qualifier of the <code>Visit.doctor</code> attribute **/
	public static final String DOCTOR = "doctor";
	/** Qualifier of the <code>Visit.department</code> attribute **/
	public static final String DEPARTMENT = "department";
	/** Qualifier of the <code>Visit.patient</code> attribute **/
	public static final String PATIENT = "patient";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DEPARTMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedVisit> DEPARTMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedVisit>(
	HospitaluiipcoreConstants.TC.VISIT,
	false,
	"department",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PATIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedVisit> PATIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedVisit>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(RESULT, AttributeMode.INITIAL);
		tmp.put(DOCTOR, AttributeMode.INITIAL);
		tmp.put(DEPARTMENT, AttributeMode.INITIAL);
		tmp.put(PATIENT, AttributeMode.INITIAL);
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
		DEPARTMENTHANDLER.newInstance(ctx, allAttributes);
		PATIENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment(final SessionContext ctx)
	{
		return (Department)getProperty( ctx, DEPARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment()
	{
		return getDepartment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final SessionContext ctx, final Department value)
	{
		DEPARTMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final Department value)
	{
		setDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.doctor</code> attribute.
	 * @return the doctor
	 */
	public Doctor getDoctor(final SessionContext ctx)
	{
		return (Doctor)getProperty( ctx, DOCTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.doctor</code> attribute.
	 * @return the doctor
	 */
	public Doctor getDoctor()
	{
		return getDoctor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.doctor</code> attribute. 
	 * @param value the doctor
	 */
	public void setDoctor(final SessionContext ctx, final Doctor value)
	{
		setProperty(ctx, DOCTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.doctor</code> attribute. 
	 * @param value the doctor
	 */
	public void setDoctor(final Doctor value)
	{
		setDoctor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.patient</code> attribute.
	 * @return the patient
	 */
	public Patient getPatient(final SessionContext ctx)
	{
		return (Patient)getProperty( ctx, PATIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.patient</code> attribute.
	 * @return the patient
	 */
	public Patient getPatient()
	{
		return getPatient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.patient</code> attribute. 
	 * @param value the patient
	 */
	public void setPatient(final SessionContext ctx, final Patient value)
	{
		PATIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.patient</code> attribute. 
	 * @param value the patient
	 */
	public void setPatient(final Patient value)
	{
		setPatient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.result</code> attribute.
	 * @return the result
	 */
	public EnumerationValue getResult(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RESULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.result</code> attribute.
	 * @return the result
	 */
	public EnumerationValue getResult()
	{
		return getResult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RESULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final EnumerationValue value)
	{
		setResult( getSession().getSessionContext(), value );
	}
	
}
