
package expr;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ExprDemoStandaloneSetup extends ExprDemoStandaloneSetupGenerated{

	public static void doSetup() {
		new ExprDemoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

