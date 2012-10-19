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

package org.portlets.lia.mine.model;

/**
 * <p>
 * This class is a wrapper for {@link IRIssue}.
 * </p>
 *
 * @author    Vladimir Frolov
 * @see       IRIssue
 * @generated
 */
public class IRIssueWrapper implements IRIssue {
	public IRIssueWrapper(IRIssue irIssue) {
		_irIssue = irIssue;
	}

	public long getPrimaryKey() {
		return _irIssue.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_irIssue.setPrimaryKey(pk);
	}

	public long getIssueId() {
		return _irIssue.getIssueId();
	}

	public void setIssueId(long issueId) {
		_irIssue.setIssueId(issueId);
	}

	public java.lang.String getSummary() {
		return _irIssue.getSummary();
	}

	public void setSummary(java.lang.String summary) {
		_irIssue.setSummary(summary);
	}

	public java.lang.String getRequester() {
		return _irIssue.getRequester();
	}

	public void setRequester(java.lang.String requester) {
		_irIssue.setRequester(requester);
	}

	public java.lang.String getPriority() {
		return _irIssue.getPriority();
	}

	public void setPriority(java.lang.String priority) {
		_irIssue.setPriority(priority);
	}

	public IRIssue toEscapedModel() {
		return _irIssue.toEscapedModel();
	}

	public boolean isNew() {
		return _irIssue.isNew();
	}

	public void setNew(boolean n) {
		_irIssue.setNew(n);
	}

	public boolean isCachedModel() {
		return _irIssue.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_irIssue.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _irIssue.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_irIssue.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _irIssue.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _irIssue.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_irIssue.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _irIssue.clone();
	}

	public int compareTo(IRIssue irIssue) {
		return _irIssue.compareTo(irIssue);
	}

	public int hashCode() {
		return _irIssue.hashCode();
	}

	public java.lang.String toString() {
		return _irIssue.toString();
	}

	public java.lang.String toXmlString() {
		return _irIssue.toXmlString();
	}

	public IRIssue getWrappedIRIssue() {
		return _irIssue;
	}

	private IRIssue _irIssue;
}