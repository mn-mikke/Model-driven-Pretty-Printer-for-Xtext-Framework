
package gpp.tests.operators;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OperatorsTestStandaloneSetup extends OperatorsTestStandaloneSetupGenerated{

	public static void doSetup() {
		new OperatorsTestStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

