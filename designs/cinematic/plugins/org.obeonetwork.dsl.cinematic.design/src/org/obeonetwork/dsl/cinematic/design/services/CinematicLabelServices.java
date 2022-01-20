/*******************************************************************************
 * Copyright (c) 2008, 2022 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.cinematic.design.services;

import org.eclipse.emf.ecore.EObject;
import org.obeonetwork.dsl.cinematic.design.services.label.CinematicEditLabelSwitch;
import org.obeonetwork.dsl.cinematic.design.services.label.CinematicLabelSwitch;
import org.obeonetwork.dsl.cinematic.design.services.label.FlowEditLabelSwitch;
import org.obeonetwork.dsl.cinematic.design.services.label.FlowLabelSwitch;
import org.obeonetwork.dsl.cinematic.design.services.label.ViewEditLabelSwitch;
import org.obeonetwork.dsl.cinematic.design.services.label.ViewLabelSwitch;
import org.obeonetwork.dsl.cinematic.design.services.label.ViewLongLabelSwitch;
import org.obeonetwork.dsl.cinematic.flow.Transition;

/**
 * This class is used to compute the label of a cinematic element
 * It dispatches the process to the right switch
 * @author sthibaudeau
 *
 */
public class CinematicLabelServices {
	
	private static CinematicLabelSwitch cinematicLabelSwitch = new CinematicLabelSwitch();
	private static FlowLabelSwitch flowLabelSwitch = new FlowLabelSwitch();
	private static ViewLabelSwitch viewLabelSwitch = new ViewLabelSwitch();
	
	private static ViewLongLabelSwitch viewLongLabelSwitch = new ViewLongLabelSwitch();
	
	private static CinematicEditLabelSwitch cinematicEditSwitch = new CinematicEditLabelSwitch();
	private static FlowEditLabelSwitch flowEditSwitch = new FlowEditLabelSwitch();
	private static ViewEditLabelSwitch viewEditSwitch = new ViewEditLabelSwitch();

	public String getCinematicLabel(EObject eObject) {
		String packagePrefix = eObject.eClass().getEPackage().getNsPrefix();
		if ("cinematic".equals(packagePrefix)) {
			return cinematicLabelSwitch.doSwitch(eObject);
		} else if ("cinematic-flow".equals(packagePrefix)) {
			return flowLabelSwitch.doSwitch(eObject);
		} else if ("cinematic-view".equals(packagePrefix)) {
			return viewLabelSwitch.doSwitch(eObject);
		}
		return "";
	}
	
	public static EObject editCinematicLabel(EObject eObject, String newLabel) {
		String packagePrefix = eObject.eClass().getEPackage().getNsPrefix();
		if ("cinematic".equals(packagePrefix)) {
			return cinematicEditSwitch.editLabel(eObject, newLabel);
		} else if ("cinematic-flow".equals(packagePrefix)) {
			return flowEditSwitch.editLabel(eObject, newLabel);
		} else if ("cinematic-view".equals(packagePrefix)) {
			return viewEditSwitch.editLabel(eObject, newLabel);
		}
		return eObject;
	}
	
	/**
	 * Returns the guard label of a {@link Transition}
	 * @param transition a {@link Transition}
	 * @return a {@link String} such as "[ the_guard_name ]"
	 */
	public static String getGuardLabel(Transition transition) {
		StringBuilder builder = new StringBuilder();
		
		if (transition.getGuard() != null && transition.getGuard().trim() != "") {
			builder.append('[')
				.append(transition.getGuard().trim())
				.append(']');
		}
		
		return builder.toString();
	}
	
	public String getCinematicLongLabel(EObject eObject) {
		String packagePrefix = eObject.eClass().getEPackage().getNsPrefix();
		if ("cinematic".equals(packagePrefix)) {
			return cinematicLabelSwitch.doSwitch(eObject);
		} else if ("cinematic-flow".equals(packagePrefix)) {
			return flowLabelSwitch.doSwitch(eObject);
		} else if ("cinematic-view".equals(packagePrefix)) {
			return viewLongLabelSwitch.doSwitch(eObject);
		}
		return "";
	}
	
}
