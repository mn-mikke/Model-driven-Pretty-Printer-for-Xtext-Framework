
package biz.vidal.protobuf4e;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ProtobufStandaloneSetup extends ProtobufStandaloneSetupGenerated{

	public static void doSetup() {
		new ProtobufStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

