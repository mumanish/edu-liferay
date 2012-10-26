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

package org.portlets.lia.mine.service.http;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;

import org.portlets.lia.mine.model.Issue;

import java.util.Date;
import java.util.List;

/**
 * @author    Vladimir Frolov
 * @generated
 */
public class IssueJSONSerializer {
	public static JSONObject toJSONObject(Issue model) {
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();

		jsonObj.put("issueId", model.getIssueId());
		jsonObj.put("groupId", model.getGroupId());
		jsonObj.put("companyId", model.getCompanyId());
		jsonObj.put("userId", model.getUserId());
		jsonObj.put("userName", model.getUserName());

		Date createDate = model.getCreateDate();

		String createDateJSON = StringPool.BLANK;

		if (createDate != null) {
			createDateJSON = String.valueOf(createDate.getTime());
		}

		jsonObj.put("createDate", createDateJSON);

		Date modifiedDate = model.getModifiedDate();

		String modifiedDateJSON = StringPool.BLANK;

		if (modifiedDate != null) {
			modifiedDateJSON = String.valueOf(modifiedDate.getTime());
		}

		jsonObj.put("modifiedDate", modifiedDateJSON);
		jsonObj.put("summary", model.getSummary());
		jsonObj.put("requester", model.getRequester());
		jsonObj.put("priority", model.getPriority());
		jsonObj.put("description", model.getDescription());
		jsonObj.put("assignee", model.getAssignee());
		jsonObj.put("status", model.getStatus());

		return jsonObj;
	}

	public static JSONArray toJSONArray(
		org.portlets.lia.mine.model.Issue[] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Issue model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		org.portlets.lia.mine.model.Issue[][] models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Issue[] model : models) {
			jsonArray.put(toJSONArray(model));
		}

		return jsonArray;
	}

	public static JSONArray toJSONArray(
		List<org.portlets.lia.mine.model.Issue> models) {
		JSONArray jsonArray = JSONFactoryUtil.createJSONArray();

		for (Issue model : models) {
			jsonArray.put(toJSONObject(model));
		}

		return jsonArray;
	}
}