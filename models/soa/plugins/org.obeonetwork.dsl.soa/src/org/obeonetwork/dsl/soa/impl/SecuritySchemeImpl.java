/**
 * Copyright (c) 2008, 2021 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.obeonetwork.dsl.soa.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.obeonetwork.dsl.environment.impl.ObeoDSMObjectImpl;
import org.obeonetwork.dsl.soa.ApiKeyLocation;
import org.obeonetwork.dsl.soa.SecurityScheme;
import org.obeonetwork.dsl.soa.SecuritySchemeType;
import org.obeonetwork.dsl.soa.SoaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.soa.impl.SecuritySchemeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.soa.impl.SecuritySchemeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.soa.impl.SecuritySchemeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.soa.impl.SecuritySchemeImpl#getApiKeyLocation <em>Api Key Location</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.soa.impl.SecuritySchemeImpl#getConnectURL <em>Connect URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecuritySchemeImpl extends ObeoDSMObjectImpl implements SecurityScheme {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2008, 2021 Obeo.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Obeo - initial API and implementation";

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SecuritySchemeType TYPE_EDEFAULT = SecuritySchemeType.API_KEY;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getApiKeyLocation() <em>Api Key Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiKeyLocation()
	 * @generated
	 * @ordered
	 */
	protected static final ApiKeyLocation API_KEY_LOCATION_EDEFAULT = ApiKeyLocation.QUERY;

	/**
	 * The default value of the '{@link #getConnectURL() <em>Connect URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectURL()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECT_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoaPackage.Literals.SECURITY_SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return (String)eDynamicGet(SoaPackage.SECURITY_SCHEME__KEY, SoaPackage.Literals.SECURITY_SCHEME__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		eDynamicSet(SoaPackage.SECURITY_SCHEME__KEY, SoaPackage.Literals.SECURITY_SCHEME__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySchemeType getType() {
		return (SecuritySchemeType)eDynamicGet(SoaPackage.SECURITY_SCHEME__TYPE, SoaPackage.Literals.SECURITY_SCHEME__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SecuritySchemeType newType) {
		eDynamicSet(SoaPackage.SECURITY_SCHEME__TYPE, SoaPackage.Literals.SECURITY_SCHEME__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(SoaPackage.SECURITY_SCHEME__NAME, SoaPackage.Literals.SECURITY_SCHEME__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(SoaPackage.SECURITY_SCHEME__NAME, SoaPackage.Literals.SECURITY_SCHEME__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiKeyLocation getApiKeyLocation() {
		return (ApiKeyLocation)eDynamicGet(SoaPackage.SECURITY_SCHEME__API_KEY_LOCATION, SoaPackage.Literals.SECURITY_SCHEME__API_KEY_LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApiKeyLocation(ApiKeyLocation newApiKeyLocation) {
		eDynamicSet(SoaPackage.SECURITY_SCHEME__API_KEY_LOCATION, SoaPackage.Literals.SECURITY_SCHEME__API_KEY_LOCATION, newApiKeyLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectURL() {
		return (String)eDynamicGet(SoaPackage.SECURITY_SCHEME__CONNECT_URL, SoaPackage.Literals.SECURITY_SCHEME__CONNECT_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectURL(String newConnectURL) {
		eDynamicSet(SoaPackage.SECURITY_SCHEME__CONNECT_URL, SoaPackage.Literals.SECURITY_SCHEME__CONNECT_URL, newConnectURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoaPackage.SECURITY_SCHEME__KEY:
				return getKey();
			case SoaPackage.SECURITY_SCHEME__TYPE:
				return getType();
			case SoaPackage.SECURITY_SCHEME__NAME:
				return getName();
			case SoaPackage.SECURITY_SCHEME__API_KEY_LOCATION:
				return getApiKeyLocation();
			case SoaPackage.SECURITY_SCHEME__CONNECT_URL:
				return getConnectURL();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoaPackage.SECURITY_SCHEME__KEY:
				setKey((String)newValue);
				return;
			case SoaPackage.SECURITY_SCHEME__TYPE:
				setType((SecuritySchemeType)newValue);
				return;
			case SoaPackage.SECURITY_SCHEME__NAME:
				setName((String)newValue);
				return;
			case SoaPackage.SECURITY_SCHEME__API_KEY_LOCATION:
				setApiKeyLocation((ApiKeyLocation)newValue);
				return;
			case SoaPackage.SECURITY_SCHEME__CONNECT_URL:
				setConnectURL((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SoaPackage.SECURITY_SCHEME__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case SoaPackage.SECURITY_SCHEME__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SoaPackage.SECURITY_SCHEME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoaPackage.SECURITY_SCHEME__API_KEY_LOCATION:
				setApiKeyLocation(API_KEY_LOCATION_EDEFAULT);
				return;
			case SoaPackage.SECURITY_SCHEME__CONNECT_URL:
				setConnectURL(CONNECT_URL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SoaPackage.SECURITY_SCHEME__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
			case SoaPackage.SECURITY_SCHEME__TYPE:
				return getType() != TYPE_EDEFAULT;
			case SoaPackage.SECURITY_SCHEME__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case SoaPackage.SECURITY_SCHEME__API_KEY_LOCATION:
				return getApiKeyLocation() != API_KEY_LOCATION_EDEFAULT;
			case SoaPackage.SECURITY_SCHEME__CONNECT_URL:
				return CONNECT_URL_EDEFAULT == null ? getConnectURL() != null : !CONNECT_URL_EDEFAULT.equals(getConnectURL());
		}
		return super.eIsSet(featureID);
	}

} //SecuritySchemeImpl
