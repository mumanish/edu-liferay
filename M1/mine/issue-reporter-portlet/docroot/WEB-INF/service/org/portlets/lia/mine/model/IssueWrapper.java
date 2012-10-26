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
 * This class is a wrapper for {@link Issue}.
 * </p>
 *
 * @author    Vladimir Frolov
 * @see       Issue
 * @generated
 */
public class IssueWrapper implements Issue {
	public IssueWrapper(Issue issue) {
		_issue = issue;
	}

	public long getPrimaryKey() {
		return _issue.getPrimaryKey();
	}

	public void setPrimaryKey(long pk) {
		_issue.setPrimaryKey(pk);
	}

	public long getIssueId() {
		return _issue.getIssueId();
	}

	public void setIssueId(long issueId) {
		_issue.setIssueId(issueId);
	}

	public long getGroupId() {
		return _issue.getGroupId();
	}

	public void setGroupId(long groupId) {
		_issue.setGroupId(groupId);
	}

	public long getCompanyId() {
		return _issue.getCompanyId();
	}

	public void setCompanyId(long companyId) {
		_issue.setCompanyId(companyId);
	}

	public long getUserId() {
		return _issue.getUserId();
	}

	public void setUserId(long userId) {
		_issue.setUserId(userId);
	}

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issue.getUserUuid();
	}

	public void setUserUuid(java.lang.String userUuid) {
		_issue.setUserUuid(userUuid);
	}

	public java.lang.String getUserName() {
		return _issue.getUserName();
	}

	public void setUserName(java.lang.String userName) {
		_issue.setUserName(userName);
	}

	public java.util.Date getCreateDate() {
		return _issue.getCreateDate();
	}

	public void setCreateDate(java.util.Date createDate) {
		_issue.setCreateDate(createDate);
	}

	public java.util.Date getModifiedDate() {
		return _issue.getModifiedDate();
	}

	public void setModifiedDate(java.util.Date modifiedDate) {
		_issue.setModifiedDate(modifiedDate);
	}

	public java.lang.String getSummary() {
		return _issue.getSummary();
	}

	public void setSummary(java.lang.String summary) {
		_issue.setSummary(summary);
	}

	public java.lang.String getRequester() {
		return _issue.getRequester();
	}

	public void setRequester(java.lang.String requester) {
		_issue.setRequester(requester);
	}

	public java.lang.String getPriority() {
		return _issue.getPriority();
	}

	public void setPriority(java.lang.String priority) {
		_issue.setPriority(priority);
	}

	public java.lang.String getDescription() {
		return _issue.getDescription();
	}

	public void setDescription(java.lang.String description) {
		_issue.setDescription(description);
	}

	public java.lang.String getAssignee() {
		return _issue.getAssignee();
	}

	public void setAssignee(java.lang.String assignee) {
		_issue.setAssignee(assignee);
	}

	public java.lang.String getStatus() {
		return _issue.getStatus();
	}

	public void setStatus(java.lang.String status) {
		_issue.setStatus(status);
	}

	public org.portlets.lia.mine.model.Issue toEscapedModel() {
		return _issue.toEscapedModel();
	}

	public boolean isNew() {
		return _issue.isNew();
	}

	public void setNew(boolean n) {
		_issue.setNew(n);
	}

	public boolean isCachedModel() {
		return _issue.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_issue.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _issue.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_issue.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _issue.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _issue.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_issue.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return _issue.clone();
	}

	public int compareTo(org.portlets.lia.mine.model.Issue issue) {
		return _issue.compareTo(issue);
	}

	public int hashCode() {
		return _issue.hashCode();
	}

	public java.lang.String toString() {
		return _issue.toString();
	}

	public java.lang.String toXmlString() {
		return _issue.toXmlString();
	}

	public Issue getWrappedIssue() {
		return _issue;
	}

	private Issue _issue;
}