/*
 * generated by Xtext
 */
package expr.scoping;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;


import expr.exprDemo.FunctionDeclaration;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class ExprDemoScopeProvider extends AbstractDeclarativeScopeProvider {

	public IScope scope_Symbol( FunctionDeclaration f, EReference ref ) {
		return Scopes.scopeFor(f.getParams());
	}
	
	
}
