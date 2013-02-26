/**
 * 
 */
package it.xtypes.util;

import it.xtypes.typesystem.BasicType;
import it.xtypes.typesystem.CollectionType;
import it.xtypes.typesystem.EClassifierType;
import it.xtypes.typesystem.ExpressionType;
import it.xtypes.typesystem.util.TypesystemSwitch;

import org.eclipse.emf.ecore.EObject;

/**
 * @author Lorenzo Bettini
 * 
 */
public class TypeToString extends TypesystemSwitch<String> {

	public String stringRep(ExpressionType expressionType) {
		if (expressionType == null)
			return "null";

		return doSwitch(expressionType);
	}

	@Override
	public String caseCollectionType(CollectionType object) {
		return object.getCollection() + "[" + doSwitch(object.getType()) + "]";
	}

	@Override
	public String caseEClassifierType(EClassifierType object) {
		return object.getEclassifier().getName();
	}

	@Override
	public String caseBasicType(BasicType object) {
		return object.getBasic();
	}

	@Override
	public String defaultCase(EObject object) {
		return object.getClass().getSimpleName();
	}

}
