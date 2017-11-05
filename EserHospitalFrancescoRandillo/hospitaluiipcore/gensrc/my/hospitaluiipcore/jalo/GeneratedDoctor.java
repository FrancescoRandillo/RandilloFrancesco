/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 15.39.47                         ---
 * ----------------------------------------------------------------
 */
package my.hospitaluiipcore.jalo;

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
import my.hospitaluiipcore.constants.HospitaluiipcoreConstants;
import my.hospitaluiipcore.jalo.Department;
import my.hospitaluiipcore.jalo.HPerson;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Doctor}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDoctor extends HPerson
{
	/** Qualifier of the <code>Doctor.registrationNumber</code> attribute **/
	public static final String REGISTRATIONNUMBER = "registrationNumber";
	/** Qualifier of the <code>Doctor.department</code> attribute **/
	public static final String DEPARTMENT = "department";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DEPARTMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDoctor> DEPARTMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedDoctor>(
	HospitaluiipcoreConstants.TC.DOCTOR,
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(HPerson.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REGISTRATIONNUMBER, AttributeMode.INITIAL);
		tmp.put(DEPARTMENT, AttributeMode.INITIAL);
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
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment(final SessionContext ctx)
	{
		return (Department)getProperty( ctx, DEPARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment()
	{
		return getDepartment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final SessionContext ctx, final Department value)
	{
		DEPARTMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final Department value)
	{
		setDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.registrationNumber</code> attribute.
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGISTRATIONNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.registrationNumber</code> attribute.
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber()
	{
		return getRegistrationNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.registrationNumber</code> attribute. 
	 * @param value the registrationNumber
	 */
	public void setRegistrationNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGISTRATIONNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.registrationNumber</code> attribute. 
	 * @param value the registrationNumber
	 */
	public void setRegistrationNumber(final String value)
	{
		setRegistrationNumber( getSession().getSessionContext(), value );
	}
	
}
