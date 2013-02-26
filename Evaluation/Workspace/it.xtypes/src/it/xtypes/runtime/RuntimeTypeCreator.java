/**
 * 
 */
package it.xtypes.runtime;

import it.xtypes.typesystem.ExpressionType;
import it.xtypes.util.AuxiliaryFunctions;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.PolymorphicDispatcher;

/**
 * Creates Types from objects
 * 
 * @author Lorenzo Bettini
 * 
 */
public class RuntimeTypeCreator {

	private PolymorphicDispatcher<ExpressionType> typeCreatorDispatcher = PolymorphicDispatcher
			.createForSingleTarget("create", 1, 1, this);

	public ExpressionType createExpressionType(Object object) {
		if (object == null)
			return null;

		return typeCreatorDispatcher.invoke(object);
	}

	protected ExpressionType create(Object object) {
		return AuxiliaryFunctions.createBasicType(object.getClass()
				.getSimpleName());
	}

	protected ExpressionType create(EObject eObject) {
		return AuxiliaryFunctions.createEClassifierType(eObject.eClass());
	}

	@SuppressWarnings("rawtypes")
	protected ExpressionType create(List list) {
		if (list.size() > 0) {
			return AuxiliaryFunctions
					.createCollectionType(createExpressionType(list.get(0)));
		} else {
			return AuxiliaryFunctions
					.createCollectionType(createExpressionType(new Object()));
		}
	}
}
