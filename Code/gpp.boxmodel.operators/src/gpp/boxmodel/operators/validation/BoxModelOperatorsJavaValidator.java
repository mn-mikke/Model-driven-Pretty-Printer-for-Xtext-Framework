package gpp.boxmodel.operators.validation;

import java.lang.reflect.Method;

import gpp.boxmodel.operators.boxModelOperators.*;

import org.eclipse.core.runtime.internal.adaptor.ContextFinder;
import org.eclipse.osgi.internal.baseadaptor.DefaultClassLoader;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;
 

public class BoxModelOperatorsJavaValidator extends AbstractBoxModelOperatorsJavaValidator {

	protected static final String IMPORT_URI_PREFIX = "platform:/resource/";
	protected static final String IMPORT_URI_PREFIX_ERROR = String.format("Import URI should start with \"%s\".",IMPORT_URI_PREFIX);
	
	@Check
	public void checkImportUriScheme(Import imp) {
		String importUri = imp.getImportURI();
		if (importUri != null)
		{
			if(!importUri.startsWith(IMPORT_URI_PREFIX)) 
			{
				error(IMPORT_URI_PREFIX_ERROR, BoxModelOperatorsPackage.Literals.IMPORT__IMPORT_URI);
			}
			if(!importUri.endsWith(".ppo"))
			{
				error("Import URI should end with \".ppo\" extension.", BoxModelOperatorsPackage.Literals.IMPORT__IMPORT_URI);
			}
		}
	}
	
	protected boolean classImplentsInterface(Class<?> c, String interfaceName)
	{
		Class<?>[] interfaces = c.getInterfaces();
		boolean contains = false;
		for(int i = 0; i < interfaces.length; i++)
		{
			if(interfaces[i].getName().equals(interfaceName))
			{
				contains = true;
			}
		}
		return contains;
	}
	
	protected boolean classExtendsSuperClass(Class<?> c, String superClassName)
	{
		Class<?> tClass = c;
		while(tClass != null)
		{
			if(tClass.getName().equals(superClassName))
			{
				return true;
			}
			tClass = tClass.getSuperclass();
		}
		return false;
	}
	
	
	@Check
	public void checkOperatorImplementation(BasicOperatorDefinition operatorDefinition)
	{
/*		String implementation = operatorDefinition.getImplementation();
		if(implementation != null)
		{
			Class<?> c = null;
			try {
				ClassLoader c = Class.forName(implementation,true, operatorDefinition.getClass().getClassLoader());
			} catch (ClassNotFoundException e) {
				error("Defined class has not been found.", BoxModelOperatorsPackage.Literals.BASIC_OPERATOR_DEFINITION__IMPLEMENTATION);
				return;
			}
			try {
				c.newInstance();
			} catch (InstantiationException e) {
				error("Defined class can not be instatiated.", BoxModelOperatorsPackage.Literals.BASIC_OPERATOR_DEFINITION__IMPLEMENTATION);
				return;
			} catch (IllegalAccessException e) {
				error(e.getMessage(), BoxModelOperatorsPackage.Literals.BASIC_OPERATOR_DEFINITION__IMPLEMENTATION);
				return;
			}
			if(operatorDefinition instanceof HighlightOperatorDefinition)
			{
				if(!classImplentsInterface(c, "IHighlightOperatorImplementation"))
				{
					error("Defined class should implement \"IHighlightOperatorImplementation\" interface.", BoxModelOperatorsPackage.Literals.BASIC_OPERATOR_DEFINITION__IMPLEMENTATION);
				}
			}
			else if(operatorDefinition instanceof PositionalOperatorDefinition)
			{
				if(!classExtendsSuperClass(c, "AbstractPositionalOperatorImplementation"))
				{
					error("Defined class should extend \"AbstractPositionalOperatorImplementation\" class.", BoxModelOperatorsPackage.Literals.BASIC_OPERATOR_DEFINITION__IMPLEMENTATION);
				}
			}
			else if(operatorDefinition instanceof TransformingOperatorDefinition)
			{
				if(!classExtendsSuperClass(c, "AbstractTransformingOperatorImplementation"))
				{
					error("Defined class should extend \"AbstractTransformingOperatorImplementation\" class.", BoxModelOperatorsPackage.Literals.BASIC_OPERATOR_DEFINITION__IMPLEMENTATION);
				}
			}
			if(!classImplentsInterface(c, "IDeclarativelyDefinedOperatorTreeNode"))
			{
				error("Defined class should implement \"IDeclarativelyDefinedOperatorTreeNode\" interface.", BoxModelOperatorsPackage.Literals.BASIC_OPERATOR_DEFINITION__IMPLEMENTATION);
			}
		}*/
	}
	
	@Check
	public void checkParameterDefinition(ParameterDefinition parameterDefinition)
	{
		BasicOperatorDefinition operatorDefinition = (BasicOperatorDefinition)parameterDefinition.eContainer();
		String implementation = operatorDefinition.getImplementation();
		if(implementation != null)
		{
			Class<?> c = null;
			try {
				c = Class.forName(implementation);
			} catch (ClassNotFoundException e) {
				return;
			}
			Object o = null;
			try {
				o = c.newInstance();
			} catch (Exception e) {
				return;
			}
			if(classImplentsInterface(c, "IDeclarativelyDefinedOperatorTreeNode"))
			{
				try {
					Method method = c.getMethod("checkParameterDefinition", new Class<?>[]{AbstractDeclarativeValidator.class, ParameterDefinition.class});
					method.invoke(o, this, parameterDefinition);
				} catch (Exception e) {
					return;
				}
			}
		}
	}
	
	@Check
	public void checkParameterApplication(ParameterApplication parameterApplication)
	{
		BasicOperatorDefinition operatorDefinition = (BasicOperatorDefinition)parameterApplication.getReferencedParameter().eContainer();
		String implementation = operatorDefinition.getImplementation();
		if(implementation != null)
		{
			Class<?> c = null;
			try {
				c = Class.forName(implementation);
			} catch (ClassNotFoundException e) {
				return;
			}
			Object o = null;
			try {
				o = c.newInstance();
			} catch (Exception e) {
				return;
			}
			if(classImplentsInterface(c, "IDeclarativelyDefinedOperatorTreeNode"))
			{
				try {
					Method method = c.getMethod("checkParameterApplication", new Class<?>[]{AbstractDeclarativeValidator.class, ParameterApplication.class});
					method.invoke(o, this, parameterApplication);
				} catch (Exception e) {
					return;
				}
			}
		}
	}

}
