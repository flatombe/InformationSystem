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
package org.obeonetwork.dsl.graal.m2doc.services;

import org.eclipse.acceleo.annotations.api.documentation.Documentation;
import org.eclipse.acceleo.annotations.api.documentation.Example;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.obeonetwork.graal.Transition;
import org.obeonetwork.graal.UserStoryElement;
import org.obeonetwork.graal.provider.GraalItemProviderAdapterFactory;

public class UserStoryElementServices {

	/**
	 * 
	 * @param element
	 * @return the label for {@code element}.
	 */
	// @formatter:off
	@Documentation(
			comment = "{m:myUserStoryElement.getLabel()}",
		    value = "Return the label for the user story element.",
		    examples = {
		    		@Example(
		    				expression = "{m:myUserStoryElement.getLabel()}", 
		    				result = "the label for the user story element.")
		    }
		)
	// @formatter:on	
	public String getLabel(UserStoryElement element) {
		if (element instanceof Transition) {
			return new TransitionServices().getLabel((Transition) element);
		} else {
			AdapterFactoryLabelProvider adapterFactory = new AdapterFactoryLabelProvider(
					new GraalItemProviderAdapterFactory());
			return adapterFactory.getText(element);
		}
	}

}
