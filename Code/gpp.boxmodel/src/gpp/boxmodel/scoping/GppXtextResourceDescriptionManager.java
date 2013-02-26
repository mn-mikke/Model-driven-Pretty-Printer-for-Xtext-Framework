package gpp.boxmodel.scoping;

import gpp.boxmodel.resource.GppXtextResourceDescription;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.DescriptionUtils;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionDelta;
import org.eclipse.xtext.util.IResourceScopeCache;

import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class GppXtextResourceDescriptionManager implements IResourceDescription.Manager {

	@Inject
	private GppXtextResourceDescriptionStrategy strategy;
	
	@Inject
	private IContainer.Manager containerManager;
	
	@Inject
	private IResourceScopeCache cache = IResourceScopeCache.NullImpl.INSTANCE;
	
	@Inject
	private DescriptionUtils descriptionUtils;
	
//	private static final String CACHE_KEY = GppXtextResourceDescriptionManager.class.getName() + "#getResourceDescription";
	
	public IResourceDescription getResourceDescription(final Resource resource) {
	//	return cache.get(CACHE_KEY, resource, new Provider<IResourceDescription>() {
	//		public IResourceDescription get() {
				return internalGetResourceDescription(resource, strategy);
	//		}
	//	});
	}
	
	public Delta createDelta(IResourceDescription oldDescription, IResourceDescription newDescription) {
		return new DefaultResourceDescriptionDelta(oldDescription, newDescription);
	}

	protected IResourceDescription internalGetResourceDescription(Resource resource, IDefaultResourceDescriptionStrategy strategy) {
		return new GppXtextResourceDescription(resource, strategy, cache);
	}
	
	public IContainer.Manager getContainerManager() {
		return containerManager;
	}
	
	public void setContainerManager(IContainer.Manager containerManager) {
		this.containerManager = containerManager;
	}
	
	public void setCache(IResourceScopeCache cache) {
		this.cache = cache;
	}
	
	public IResourceScopeCache getCache() {
		return cache;
	}
	
	public boolean isAffected(Delta delta, IResourceDescription candidate) throws IllegalArgumentException {
		if (!delta.haveEObjectDescriptionsChanged())
			return false;
		Set<QualifiedName> names = Sets.newHashSet();
		addExportedNames(names,delta.getOld());
		addExportedNames(names,delta.getNew());
		return !Collections.disjoint(names, getImportedNames(candidate));
	}

	protected Collection<QualifiedName> getImportedNames(IResourceDescription candidate) {
		return Sets.newHashSet(candidate.getImportedNames());
	}

	protected void addExportedNames(Set<QualifiedName> names, IResourceDescription resourceDescriptor) {
		if (resourceDescriptor==null)
			return;
		Iterable<IEObjectDescription> iterable = resourceDescriptor.getExportedObjects();
		for (IEObjectDescription ieObjectDescription : iterable) {
			names.add(ieObjectDescription.getName().toLowerCase());
		}
	}
	
    public boolean isAffected(Collection<Delta> deltas, IResourceDescription candidate, IResourceDescriptions context) {
        Set<URI> outgoingReferences = descriptionUtils.collectOutgoingReferences(candidate);
        if (!outgoingReferences.isEmpty()) {
	        for (IResourceDescription.Delta delta : deltas)
	            if (delta.haveEObjectDescriptionsChanged() && outgoingReferences.contains(delta.getUri()))
	                return true;
        }
        // this is a tradeoff - we could either check whether a given delta uri is contained
        // in a reachable container and check for intersecting names afterwards, or we can do
        // the other way round
        // unfortunately there is no way to decide reliably which algorithm scales better
        // note that this method is called for each description so we have something like a 
        // number of deltas x number of resources which is not really nice
        List<IContainer> containers = null;
        Collection<QualifiedName> importedNames = getImportedNames(candidate);
        for (IResourceDescription.Delta delta : deltas) {
			if (delta.haveEObjectDescriptionsChanged()) {
				// not a java resource - delta's resource should be contained in a visible container
				// as long as we did not delete the resource
				URI uri = delta.getUri();
				if ((uri.isPlatform() || uri.isArchive()) && delta.getNew() != null) { 
					if (containers == null)
						containers = containerManager.getVisibleContainers(candidate, context);
					boolean descriptionIsContained = false;
					for(int i = 0; i < containers.size() && !descriptionIsContained; i++) {
						descriptionIsContained = containers.get(i).hasResourceDescription(uri);
					}
					if (!descriptionIsContained)
						return false;
				}
				if (isAffected(importedNames, delta.getNew()) || isAffected(importedNames, delta.getOld())) {
					return true;
				}
			}
        }
        return false;
    }

	protected boolean isAffected(Collection<QualifiedName> importedNames, IResourceDescription description) {
		if (description != null) {
		    for (IEObjectDescription desc : description.getExportedObjects())
		        if (importedNames.contains(desc.getName().toLowerCase()))
		            return true;
		}
		return false;
	}
	
	public DescriptionUtils getDescriptionUtils() {
		return descriptionUtils;
	}
	
	public void setDescriptionUtils(DescriptionUtils descriptionUtils) {
		this.descriptionUtils = descriptionUtils;
	}
	
	public void setStrategy(GppXtextResourceDescriptionStrategy strategy) {
		this.strategy = strategy;
	}
}