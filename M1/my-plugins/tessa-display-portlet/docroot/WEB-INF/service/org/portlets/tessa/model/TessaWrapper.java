/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.portlets.tessa.model;

/**
 * <p>
 * This class is a wrapper for {@link Tessa}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       Tessa
 * @generated
 */
public class TessaWrapper implements Tessa {
	public TessaWrapper(Tessa tessa) {
		_tessa = tessa;
	}

	public long getPrimaryKey() {
		return _tessa.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_tessa.setPrimaryKey(pk);
	}

	public java.lang.String getUuid() {
		return _tessa.getUuid();
	}

	public void setUuid(java.lang.String uuid) {
		_tessa.setUuid(uuid);
	}

	public long getTessaId() {
		return _tessa.getTessaId();
	}

	public void setTessaId(long tessaId) {
		_tessa.setTessaId(tessaId);
	}

	public java.lang.String getTessaText() {
		return _tessa.getTessaText();
	}

	public void setTessaText(java.lang.String tessaText) {
		_tessa.setTessaText(tessaText);
	}

	public long getCompanyId() {
		return _tessa.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_tessa.setCompanyId(companyId);
	}

	public long getGroupId() {
		return _tessa.getGroupId();
	}

	public void setGroupId(long groupId) {
		_tessa.setGroupId(groupId);
	}

	public long getUserId() {
		return _tessa.getUserId();
	}

	public void setUserId(long userId) {
		_tessa.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tessa.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_tessa.setUserUuid(userUuid);
	}

	public org.portlets.tessa.model.Tessa toEscapedModel() {
		return _tessa.toEscapedModel();
	}

	public boolean isNew() {
		return _tessa.isNew();
	}

	public void setNew(boolean n) {
		_tessa.setNew(n);
	}

	public boolean isCachedModel() {
		return _tessa.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tessa.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tessa.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tessa.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tessa.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tessa.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tessa.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _tessa.clone();
	}

	public int compareTo(org.portlets.tessa.model.Tessa tessa) {
		return _tessa.compareTo(tessa);
	}

	public int hashCode() {
		return _tessa.hashCode();
	}

	public java.lang.String toString() {
		return _tessa.toString();
	}

	public java.lang.String toXmlString() {
		return _tessa.toXmlString();
	}

	public Tessa getWrappedTessa() {
		return _tessa;
	}

	private Tessa _tessa;
}