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
package org.obeonetwork.dsl.database.compare.extensions.match;

import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.obeonetwork.dsl.is.compare.IEObjectMatcherProvider;

public class DatabaseEObjectMatcherProvider implements IEObjectMatcherProvider {

	@Override
	public IEObjectMatcher getMatcher() {
		return DatabaseMatchEngineFactory.getDatabaseEObjectMatcher();
	}

}
