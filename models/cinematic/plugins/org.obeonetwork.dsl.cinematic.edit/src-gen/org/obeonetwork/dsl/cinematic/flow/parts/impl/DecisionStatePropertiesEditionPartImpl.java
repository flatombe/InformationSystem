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
/**
 * Generated with Acceleo
 */
package org.obeonetwork.dsl.cinematic.flow.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.obeonetwork.dsl.cinematic.flow.parts.DecisionStatePropertiesEditionPart;
import org.obeonetwork.dsl.cinematic.flow.parts.FlowViewsRepository;
import org.obeonetwork.dsl.cinematic.flow.providers.FlowMessages;

// End of user code

/**
 * 
 * 
 */
public class DecisionStatePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, DecisionStatePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable actions;
	protected List<ViewerFilter> actionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> actionsFilters = new ArrayList<ViewerFilter>();
	protected Text description;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public DecisionStatePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence decisionStateStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = decisionStateStep.addStep(FlowViewsRepository.DecisionState.Properties.class);
		propertiesStep.addStep(FlowViewsRepository.DecisionState.Properties.name);
		propertiesStep.addStep(FlowViewsRepository.DecisionState.Properties.actions);
		propertiesStep.addStep(FlowViewsRepository.DecisionState.Properties.description);
		
		
		composer = new PartComposer(decisionStateStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FlowViewsRepository.DecisionState.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FlowViewsRepository.DecisionState.Properties.name) {
					return createNameText(parent);
				}
				if (key == FlowViewsRepository.DecisionState.Properties.actions) {
					return createActionsAdvancedTableComposition(parent);
				}
				if (key == FlowViewsRepository.DecisionState.Properties.description) {
					return createDescriptionTextarea(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(FlowMessages.DecisionStatePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, FlowViewsRepository.DecisionState.Properties.name, FlowMessages.DecisionStatePropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionStatePropertiesEditionPartImpl.this, FlowViewsRepository.DecisionState.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionStatePropertiesEditionPartImpl.this, FlowViewsRepository.DecisionState.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, FlowViewsRepository.DecisionState.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FlowViewsRepository.DecisionState.Properties.name, FlowViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createActionsAdvancedTableComposition(Composite parent) {
		this.actions = new ReferencesTable(getDescription(FlowViewsRepository.DecisionState.Properties.actions, FlowMessages.DecisionStatePropertiesEditionPart_ActionsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionStatePropertiesEditionPartImpl.this, FlowViewsRepository.DecisionState.Properties.actions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				actions.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionStatePropertiesEditionPartImpl.this, FlowViewsRepository.DecisionState.Properties.actions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				actions.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionStatePropertiesEditionPartImpl.this, FlowViewsRepository.DecisionState.Properties.actions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				actions.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionStatePropertiesEditionPartImpl.this, FlowViewsRepository.DecisionState.Properties.actions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				actions.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.actionsFilters) {
			this.actions.addFilter(filter);
		}
		this.actions.setHelpText(propertiesEditionComponent.getHelpContent(FlowViewsRepository.DecisionState.Properties.actions, FlowViewsRepository.SWT_KIND));
		this.actions.createControls(parent);
		this.actions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionStatePropertiesEditionPartImpl.this, FlowViewsRepository.DecisionState.Properties.actions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData actionsData = new GridData(GridData.FILL_HORIZONTAL);
		actionsData.horizontalSpan = 3;
		this.actions.setLayoutData(actionsData);
		this.actions.setLowerBound(0);
		this.actions.setUpperBound(-1);
		actions.setID(FlowViewsRepository.DecisionState.Properties.actions);
		actions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createActionsAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createDescriptionTextarea(Composite parent) {
		Label descriptionLabel = createDescription(parent, FlowViewsRepository.DecisionState.Properties.description, FlowMessages.DecisionStatePropertiesEditionPart_DescriptionLabel);
		GridData descriptionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		descriptionLabelData.horizontalSpan = 3;
		descriptionLabel.setLayoutData(descriptionLabelData);
		description = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		descriptionData.horizontalSpan = 2;
		descriptionData.heightHint = 80;
		descriptionData.widthHint = 200;
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(DecisionStatePropertiesEditionPartImpl.this, FlowViewsRepository.DecisionState.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		EditingUtils.setID(description, FlowViewsRepository.DecisionState.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FlowViewsRepository.DecisionState.Properties.description, FlowViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionTextArea

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.cinematic.flow.parts.DecisionStatePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.cinematic.flow.parts.DecisionStatePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FlowViewsRepository.DecisionState.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(FlowMessages.DecisionState_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.cinematic.flow.parts.DecisionStatePropertiesEditionPart#initActions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initActions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		actions.setContentProvider(contentProvider);
		actions.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(FlowViewsRepository.DecisionState.Properties.actions);
		if (eefElementEditorReadOnlyState && actions.isEnabled()) {
			actions.setEnabled(false);
			actions.setToolTipText(FlowMessages.DecisionState_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !actions.isEnabled()) {
			actions.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.cinematic.flow.parts.DecisionStatePropertiesEditionPart#updateActions()
	 * 
	 */
	public void updateActions() {
	actions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.cinematic.flow.parts.DecisionStatePropertiesEditionPart#addFilterActions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToActions(ViewerFilter filter) {
		actionsFilters.add(filter);
		if (this.actions != null) {
			this.actions.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.cinematic.flow.parts.DecisionStatePropertiesEditionPart#addBusinessFilterActions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToActions(ViewerFilter filter) {
		actionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.cinematic.flow.parts.DecisionStatePropertiesEditionPart#isContainedInActionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInActionsTable(EObject element) {
		return ((ReferencesTableSettings)actions.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.cinematic.flow.parts.DecisionStatePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.obeonetwork.dsl.cinematic.flow.parts.DecisionStatePropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(FlowViewsRepository.DecisionState.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setBackground(description.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
			description.setToolTipText(FlowMessages.DecisionState_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FlowMessages.DecisionState_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
