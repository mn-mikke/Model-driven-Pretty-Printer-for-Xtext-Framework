package gpp.boxmodel.scoping;



import gpp.boxmodel.boxModel.AssignmentBox;
import gpp.boxmodel.boxModel.Reference;
import gpp.boxmodel.naming.GppQualifiedNameProvider;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.LinkingScopeProviderBinding;
import org.eclipse.xtext.linking.impl.AbstractLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.linking.impl.ImportedNamesAdapter;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractGlobalScopeDelegatingScopeProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class GppLinkingService extends AbstractLinkingService {
	
	@Inject
	@LinkingScopeProviderBinding
	private IScopeProvider scopeProvider;

	@Inject
	private Provider<ImportedNamesAdapter> importedNamesAdapterProvider;
	
	@Inject 
	private LinkingHelper linkingHelper;
	
	private IQualifiedNameProvider qualifiedNameProvider = new GppQualifiedNameProvider();
	
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	@Inject
	private ICrossReferenceStringCleaner crossReferenceStringCleaner;

	protected IScope getScope(EObject context, EReference reference) {
		if (getScopeProvider() == null)
			throw new IllegalStateException("scopeProvider must not be null.");
		try {
			registerImportedNamesAdapter(context);
			return getScopeProvider().getScope(context, reference);
		} finally {
			unRegisterImportedNamesAdapter();
		}
	}

	protected void unRegisterImportedNamesAdapter() {
		unRegisterImportedNamesAdapter(getScopeProvider());
	}
	
	protected void unRegisterImportedNamesAdapter(IScopeProvider scopeProvider) {
		if (scopeProvider instanceof AbstractGlobalScopeDelegatingScopeProvider) {
			AbstractGlobalScopeDelegatingScopeProvider provider = (AbstractGlobalScopeDelegatingScopeProvider) scopeProvider;
			provider.setWrapper(null);
		} else if (scopeProvider instanceof AbstractDeclarativeScopeProvider) {
			AbstractDeclarativeScopeProvider declarativeScopeProvider = (AbstractDeclarativeScopeProvider) scopeProvider;
			unRegisterImportedNamesAdapter(declarativeScopeProvider.getDelegate());
		}
	}

	protected void registerImportedNamesAdapter(EObject context) {
		registerImportedNamesAdapter(getScopeProvider(), context);
	}
	
	protected void registerImportedNamesAdapter(IScopeProvider scopeProvider, EObject context) {
		if (scopeProvider instanceof AbstractGlobalScopeDelegatingScopeProvider) {
			AbstractGlobalScopeDelegatingScopeProvider provider = (AbstractGlobalScopeDelegatingScopeProvider) scopeProvider;
			ImportedNamesAdapter adapter = getImportedNamesAdapter(context);
			provider.setWrapper(adapter);
		} else if (scopeProvider instanceof AbstractDeclarativeScopeProvider) {
			AbstractDeclarativeScopeProvider declarativeScopeProvider = (AbstractDeclarativeScopeProvider) scopeProvider;
			registerImportedNamesAdapter(declarativeScopeProvider.getDelegate(), context);
		}
	}

	protected ImportedNamesAdapter getImportedNamesAdapter(EObject context) {
		ImportedNamesAdapter adapter = ImportedNamesAdapter.find(context.eResource());
		if (adapter!=null)
			return adapter;
		ImportedNamesAdapter importedNamesAdapter = importedNamesAdapterProvider.get();
		context.eResource().eAdapters().add(importedNamesAdapter);
		return importedNamesAdapter;
	}
	
	@Inject
	 IContainer.Manager manager;


	/**
	 * @return the first element returned from the injected {@link IScopeProvider} which matches the text of the passed
	 *         {@link LeafNode}
	 */
	public List<EObject> getLinkedObjects(EObject context, EReference ref, INode node)
			throws IllegalNodeException {
		final EClass requiredType = ref.getEReferenceType();
		if (requiredType == null)
			return Collections.<EObject> emptyList();
		String crossRefString = getCrossRefNodeAsString(node);
		if (crossRefString != null && !crossRefString.equals("")) {
			final IScope scope = getScope(context, ref);
			QualifiedName qualifiedLinkName;
			if(context instanceof Reference || context instanceof AssignmentBox)
			{
				qualifiedLinkName = qualifiedNameProvider.getFullyQualifiedName(context);
				qualifiedLinkName = qualifiedLinkName.append(crossRefString);
			}
			else
			{
				qualifiedLinkName =  qualifiedNameConverter.toQualifiedName(crossRefString);
			}
			IEObjectDescription eObjectDescription = scope.getSingleElement(qualifiedLinkName);
			if (eObjectDescription != null) 
				return Collections.singletonList(eObjectDescription.getEObjectOrProxy());
		}
		return Collections.emptyList();
	}
		
	public String getCrossRefNodeAsString(INode node) throws IllegalNodeException {
		String crossReferenceString = linkingHelper.getCrossRefNodeAsString(node, true);
		String cleanedCrossReferenceString = crossReferenceStringCleaner.clean(crossReferenceString);
		return cleanedCrossReferenceString;
	}

	public void setScopeProvider(IScopeProvider scopeProvider) {
		this.scopeProvider = scopeProvider;
	}

	public IScopeProvider getScopeProvider() {
		return scopeProvider;
	}

	protected LinkingHelper getLinkingHelper() {
		return linkingHelper;
	}

}
