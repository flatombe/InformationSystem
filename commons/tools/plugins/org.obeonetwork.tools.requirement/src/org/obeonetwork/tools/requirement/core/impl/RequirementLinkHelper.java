/*******************************************************************************
 * Copyright (c) 2008, 2023 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.obeonetwork.tools.requirement.core.impl;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.tools.linker.EObjectLinker;

/**
 * @author <a href="goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class RequirementLinkHelper {

	/**
	 * @param source
	 * @return
	 */
	public static final EObjectLinker getRequirementLinker(EObject source) {
		EObjectLinker linker = EObjectLinker.getLinker(source);
		if (linker != null) {
			linker.registerType(new RequirementLinkType());
		}
		return linker;
	}

}
