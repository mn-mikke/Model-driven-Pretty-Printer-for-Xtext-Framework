package gpp.boxmodel.scoping;

import gpp.boxmodel.naming.GppXtextQualifiedNameProvider;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.linking.lazy.LazyURIEncoder;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.impl.DefaultReferenceDescription;
import org.eclipse.xtext.util.IAcceptor;

import com.google.inject.Inject;

public class GppXtextResourceDescriptionStrategy implements IDefaultResourceDescriptionStrategy {

	private final static Logger LOG = Logger.getLogger(GppXtextResourceDescriptionStrategy.class);

	
	private IQualifiedNameProvider qualifiedNameProvider = new GppXtextQualifiedNameProvider();

	@Inject
	private LazyURIEncoder uriEncoder;

	public void setQualifiedNameProvider(IQualifiedNameProvider qualifiedNameProvider) {
		this.qualifiedNameProvider = qualifiedNameProvider;
	}

	public IQualifiedNameProvider getQualifiedNameProvider() {
		return qualifiedNameProvider;
	}

	/** @since 2.0 */
	public void setLazyURIEncoder(LazyURIEncoder uriEncoder) {
		this.uriEncoder = uriEncoder;
	}

	/** @since 2.0 */
	public LazyURIEncoder getLazyURIEncoder() {
		return uriEncoder;
	}

	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (getQualifiedNameProvider() == null)
			return false;
		try {
			QualifiedName qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(eObject);
			if (qualifiedName != null) {
				acceptor.accept(EObjectDescription.create(qualifiedName, eObject));
			}
		} catch (Exception exc) {
			LOG.error(exc.getMessage());
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public boolean createReferenceDescriptions(EObject from, URI exportedContainerURI,
			IAcceptor<IReferenceDescription> acceptor) {
		EList<EReference> references = from.eClass().getEAllReferences();
		for (EReference eReference : references) {
			if (isIndexable(eReference) && from.eIsSet(eReference)) {
				Object val = from.eGet(eReference, false);
				if (val != null) {
					if (eReference.isMany()) {
						InternalEList<EObject> list = (InternalEList<EObject>) val;
						for (int i = 0; i < list.size(); i++) {
							EObject to = list.basicGet(i);
							if (isResolvedAndExternal(from, to)) {
								acceptor.accept(createReferenceDescription(from, exportedContainerURI, eReference, i,
										to));
							}
						}
					} else {
						EObject to = (EObject) val;
						if (isResolvedAndExternal(from, to)) {
							acceptor.accept(createReferenceDescription(from, exportedContainerURI, eReference, -1, to));
						}
					}
				}
			}
		}
		return true;
	}

	/** @since 2.0 */
	protected IReferenceDescription createReferenceDescription(EObject owner, URI exportedContainerURI,
			EReference eReference, int indexInList, EObject target) {
		return new DefaultReferenceDescription(owner, target, eReference, indexInList, exportedContainerURI);
	}

	protected boolean isIndexable(EReference eReference) {
		return !eReference.isContainment() && !eReference.isDerived() && !eReference.isVolatile()
				&& !eReference.isTransient();
	}

	protected boolean isResolvedAndExternal(EObject from, EObject to) {
		if (to == null)
			return false;
		if (!to.eIsProxy())
			return from.eResource() != to.eResource();

		return !getLazyURIEncoder()
				.isCrossLinkFragment(from.eResource(), ((InternalEObject) to).eProxyURI().fragment());
	}

}
