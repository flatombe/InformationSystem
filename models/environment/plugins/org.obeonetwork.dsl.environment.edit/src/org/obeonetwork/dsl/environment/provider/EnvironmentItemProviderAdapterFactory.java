/*******************************************************************************
 * Copyright (c) 2008, 2023 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.environment.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.obeonetwork.dsl.environment.EnvironmentPackage;
import org.obeonetwork.dsl.environment.util.EnvironmentAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvironmentItemProviderAdapterFactory extends EnvironmentAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2008, 2023 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
			EnvironmentEditPlugin.INSTANCE, EnvironmentPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.Environment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentItemProvider environmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvironmentAdapter() {
		if (environmentItemProvider == null) {
			environmentItemProvider = new EnvironmentItemProvider(this);
		}

		return environmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.PrimitiveType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeItemProvider primitiveTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveTypeAdapter() {
		if (primitiveTypeItemProvider == null) {
			primitiveTypeItemProvider = new PrimitiveTypeItemProvider(this);
		}

		return primitiveTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.Enumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemProvider enumerationItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationAdapter() {
		if (enumerationItemProvider == null) {
			enumerationItemProvider = new EnumerationItemProvider(this);
		}

		return enumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.Literal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralItemProvider literalItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.Literal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiteralAdapter() {
		if (literalItemProvider == null) {
			literalItemProvider = new LiteralItemProvider(this);
		}

		return literalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.InterDSMLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterDSMLinkItemProvider interDSMLinkItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.InterDSMLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterDSMLinkAdapter() {
		if (interDSMLinkItemProvider == null) {
			interDSMLinkItemProvider = new InterDSMLinkItemProvider(this);
		}

		return interDSMLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.MetaDataContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaDataContainerItemProvider metaDataContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.MetaDataContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetaDataContainerAdapter() {
		if (metaDataContainerItemProvider == null) {
			metaDataContainerItemProvider = new MetaDataContainerItemProvider(this);
		}

		return metaDataContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.Annotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationItemProvider annotationItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationAdapter() {
		if (annotationItemProvider == null) {
			annotationItemProvider = new AnnotationItemProvider(this);
		}

		return annotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.PriorityDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorityDefinitionItemProvider priorityDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.PriorityDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPriorityDefinitionAdapter() {
		if (priorityDefinitionItemProvider == null) {
			priorityDefinitionItemProvider = new PriorityDefinitionItemProvider(this);
		}

		return priorityDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.Priority} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorityItemProvider priorityItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.Priority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPriorityAdapter() {
		if (priorityItemProvider == null) {
			priorityItemProvider = new PriorityItemProvider(this);
		}

		return priorityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.TypesDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesDefinitionItemProvider typesDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.TypesDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypesDefinitionAdapter() {
		if (typesDefinitionItemProvider == null) {
			typesDefinitionItemProvider = new TypesDefinitionItemProvider(this);
		}

		return typesDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.DTO} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTOItemProvider dtoItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.DTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDTOAdapter() {
		if (dtoItemProvider == null) {
			dtoItemProvider = new DTOItemProvider(this);
		}

		return dtoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.FilterContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterContainerItemProvider filterContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.FilterContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilterContainerAdapter() {
		if (filterContainerItemProvider == null) {
			filterContainerItemProvider = new FilterContainerItemProvider(this);
		}

		return filterContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.Namespace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceItemProvider namespaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.Namespace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamespaceAdapter() {
		if (namespaceItemProvider == null) {
			namespaceItemProvider = new NamespaceItemProvider(this);
		}

		return namespaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.Reference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceItemProvider referenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferenceAdapter() {
		if (referenceItemProvider == null) {
			referenceItemProvider = new ReferenceItemProvider(this);
		}

		return referenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.BindingInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingInfoItemProvider bindingInfoItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.BindingInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingInfoAdapter() {
		if (bindingInfoItemProvider == null) {
			bindingInfoItemProvider = new BindingInfoItemProvider(this);
		}

		return bindingInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.BindingReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingReferenceItemProvider bindingReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.BindingReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingReferenceAdapter() {
		if (bindingReferenceItemProvider == null) {
			bindingReferenceItemProvider = new BindingReferenceItemProvider(this);
		}

		return bindingReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.BindingElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingElementItemProvider bindingElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.BindingElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingElementAdapter() {
		if (bindingElementItemProvider == null) {
			bindingElementItemProvider = new BindingElementItemProvider(this);
		}

		return bindingElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.obeonetwork.dsl.environment.BindingRegistry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingRegistryItemProvider bindingRegistryItemProvider;

	/**
	 * This creates an adapter for a {@link org.obeonetwork.dsl.environment.BindingRegistry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingRegistryAdapter() {
		if (bindingRegistryItemProvider == null) {
			bindingRegistryItemProvider = new BindingRegistryItemProvider(this);
		}

		return bindingRegistryItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (environmentItemProvider != null)
			environmentItemProvider.dispose();
		if (primitiveTypeItemProvider != null)
			primitiveTypeItemProvider.dispose();
		if (enumerationItemProvider != null)
			enumerationItemProvider.dispose();
		if (literalItemProvider != null)
			literalItemProvider.dispose();
		if (interDSMLinkItemProvider != null)
			interDSMLinkItemProvider.dispose();
		if (metaDataContainerItemProvider != null)
			metaDataContainerItemProvider.dispose();
		if (annotationItemProvider != null)
			annotationItemProvider.dispose();
		if (priorityDefinitionItemProvider != null)
			priorityDefinitionItemProvider.dispose();
		if (priorityItemProvider != null)
			priorityItemProvider.dispose();
		if (typesDefinitionItemProvider != null)
			typesDefinitionItemProvider.dispose();
		if (dtoItemProvider != null)
			dtoItemProvider.dispose();
		if (filterContainerItemProvider != null)
			filterContainerItemProvider.dispose();
		if (namespaceItemProvider != null)
			namespaceItemProvider.dispose();
		if (attributeItemProvider != null)
			attributeItemProvider.dispose();
		if (referenceItemProvider != null)
			referenceItemProvider.dispose();
		if (bindingInfoItemProvider != null)
			bindingInfoItemProvider.dispose();
		if (bindingReferenceItemProvider != null)
			bindingReferenceItemProvider.dispose();
		if (bindingElementItemProvider != null)
			bindingElementItemProvider.dispose();
		if (bindingRegistryItemProvider != null)
			bindingRegistryItemProvider.dispose();
	}

}
