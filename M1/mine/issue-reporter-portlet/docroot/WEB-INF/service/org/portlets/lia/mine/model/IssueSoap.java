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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * This class is used by
 * {@link org.portlets.lia.mine.service.http.IssueServiceSoap}.
 * </p>
 *
 * @author    Vladimir Frolov
 * @see       org.portlets.lia.mine.service.http.IssueServiceSoap
 * @generated
 */
public class IssueSoap implements Serializable {
	public static IssueSoap toSoapModel(Issue model) {
		IssueSoap soapModel = new IssueSoap();

		soapModel.setIssueId(model.getIssueId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSummary(model.getSummary());
		soapModel.setRequester(model.getRequester());
		soapModel.setPriority(model.getPriority());

		return soapModel;
	}

	public static IssueSoap[] toSoapModels(Issue[] models) {
		IssueSoap[] soapModels = new IssueSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static IssueSoap[][] toSoapModels(Issue[][] models) {
		IssueSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new IssueSoap[models.length][models[0].length];
		}
		else {
			soapModels = new IssueSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static IssueSoap[] toSoapModels(List<Issue> models) {
		List<IssueSoap> soapModels = new ArrayList<IssueSoap>(models.size());

		for (Issue model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new IssueSoap[soapModels.size()]);
	}

	public IssueSoap() {
	}

	public long getPrimaryKey() {
		return _issueId;
	}

	public void setPrimaryKey(long pk) {
		setIssueId(pk);
	}

	public long getIssueId() {
		return _issueId;
	}

	public void setIssueId(long issueId) {
		_issueId = issueId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getSummary() {
		return _summary;
	}

	public void setSummary(String summary) {
		_summary = summary;
	}

	public String getRequester() {
		return _requester;
	}

	public void setRequester(String requester) {
		_requester = requester;
	}

	public String getPriority() {
		return _priority;
	}

	public void setPriority(String priority) {
		_priority = priority;
	}

	private long _issueId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _summary;
	private String _requester;
	private String _priority;
}