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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

/**
 * @author Brian Wing Shun Chan
 */
public class TessaClp extends BaseModelImpl<Tessa> implements Tessa {
	public TessaClp() {
	}

	public long getPrimaryKey() {
		return _tessaId;
	}

	public void setPrimaryKey(long pk) {
		setTessaId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_tessaId);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTessaId() {
		return _tessaId;
	}

	public void setTessaId(long tessaId) {
		_tessaId = tessaId;
	}

	public String getTessaText() {
		return _tessaText;
	}

	public void setTessaText(String tessaText) {
		_tessaText = tessaText;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public Tessa toEscapedModel() {
		if (isEscapedModel()) {
			return this;
		}
		else {
			return (Tessa)Proxy.newProxyInstance(Tessa.class.getClassLoader(),
				new Class[] { Tessa.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TessaClp clone = new TessaClp();

		clone.setUuid(getUuid());
		clone.setTessaId(getTessaId());
		clone.setTessaText(getTessaText());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());

		return clone;
	}

	public int compareTo(Tessa tessa) {
		int value = 0;

		if (getTessaId() < tessa.getTessaId()) {
			value = -1;
		}
		else if (getTessaId() > tessa.getTessaId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TessaClp tessa = null;

		try {
			tessa = (TessaClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = tessa.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", tessaId=");
		sb.append(getTessaId());
		sb.append(", tessaText=");
		sb.append(getTessaText());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("org.portlets.tessa.model.Tessa");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tessaId</column-name><column-value><![CDATA[");
		sb.append(getTessaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tessaText</column-name><column-value><![CDATA[");
		sb.append(getTessaText());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _tessaId;
	private String _tessaText;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
}