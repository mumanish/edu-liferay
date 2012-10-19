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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Vladimir Frolov
 */
public class IRIssueClp extends BaseModelImpl<IRIssue> implements IRIssue {
	public IRIssueClp() {
	}

	public long getPrimaryKey() {
		return _issueId;
	}

	public void setPrimaryKey(long pk) {
		setIssueId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_issueId);
	}

	public long getIssueId() {
		return _issueId;
	}

	public void setIssueId(long issueId) {
		_issueId = issueId;
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

	public IRIssue toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (IRIssue)Proxy.newProxyInstance(IRIssue.class.getClassLoader(),
				new Class[] { IRIssue.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		IRIssueClp clone = new IRIssueClp();

		clone.setIssueId(getIssueId());
		clone.setSummary(getSummary());
		clone.setRequester(getRequester());
		clone.setPriority(getPriority());

		return clone;
	}

	public int compareTo(IRIssue irIssue) {
		int value = 0;

		value = getRequester().compareTo(irIssue.getRequester());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		IRIssueClp irIssue = null;

		try {
			irIssue = (IRIssueClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = irIssue.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{issueId=");
		sb.append(getIssueId());
		sb.append(", summary=");
		sb.append(getSummary());
		sb.append(", requester=");
		sb.append(getRequester());
		sb.append(", priority=");
		sb.append(getPriority());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.portlets.lia.mine.model.IRIssue");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>issueId</column-name><column-value><![CDATA[");
		sb.append(getIssueId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>summary</column-name><column-value><![CDATA[");
		sb.append(getSummary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requester</column-name><column-value><![CDATA[");
		sb.append(getRequester());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>priority</column-name><column-value><![CDATA[");
		sb.append(getPriority());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _issueId;
	private String _summary;
	private String _requester;
	private String _priority;
}