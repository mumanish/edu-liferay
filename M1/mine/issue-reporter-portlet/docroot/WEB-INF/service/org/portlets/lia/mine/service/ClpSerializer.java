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

package org.portlets.lia.mine.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import org.portlets.lia.mine.model.IssueClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "issue-reporter-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(IssueClp.class.getName())) {
			IssueClp oldCplModel = (IssueClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.portlets.lia.mine.model.impl.IssueImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setIssueId",
							new Class[] { Long.TYPE });

					Long value0 = new Long(oldCplModel.getIssueId());

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getGroupId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value2 = new Long(oldCplModel.getCompanyId());

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getUserId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setUserName",
							new Class[] { String.class });

					String value4 = oldCplModel.getUserName();

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setCreateDate",
							new Class[] { Date.class });

					Date value5 = oldCplModel.getCreateDate();

					method5.invoke(newModel, value5);

					Method method6 = newModelClass.getMethod("setModifiedDate",
							new Class[] { Date.class });

					Date value6 = oldCplModel.getModifiedDate();

					method6.invoke(newModel, value6);

					Method method7 = newModelClass.getMethod("setSummary",
							new Class[] { String.class });

					String value7 = oldCplModel.getSummary();

					method7.invoke(newModel, value7);

					Method method8 = newModelClass.getMethod("setRequester",
							new Class[] { String.class });

					String value8 = oldCplModel.getRequester();

					method8.invoke(newModel, value8);

					Method method9 = newModelClass.getMethod("setPriority",
							new Class[] { String.class });

					String value9 = oldCplModel.getPriority();

					method9.invoke(newModel, value9);

					Method method10 = newModelClass.getMethod("setDescription",
							new Class[] { String.class });

					String value10 = oldCplModel.getDescription();

					method10.invoke(newModel, value10);

					Method method11 = newModelClass.getMethod("setAssignee",
							new Class[] { String.class });

					String value11 = oldCplModel.getAssignee();

					method11.invoke(newModel, value11);

					Method method12 = newModelClass.getMethod("setStatus",
							new Class[] { String.class });

					String value12 = oldCplModel.getStatus();

					method12.invoke(newModel, value12);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"org.portlets.lia.mine.model.impl.IssueImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					IssueClp newModel = new IssueClp();

					Method method0 = oldModelClass.getMethod("getIssueId");

					Long value0 = (Long)method0.invoke(oldModel, (Object[])null);

					newModel.setIssueId(value0);

					Method method1 = oldModelClass.getMethod("getGroupId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value1);

					Method method2 = oldModelClass.getMethod("getCompanyId");

					Long value2 = (Long)method2.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value2);

					Method method3 = oldModelClass.getMethod("getUserId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setUserId(value3);

					Method method4 = oldModelClass.getMethod("getUserName");

					String value4 = (String)method4.invoke(oldModel,
							(Object[])null);

					newModel.setUserName(value4);

					Method method5 = oldModelClass.getMethod("getCreateDate");

					Date value5 = (Date)method5.invoke(oldModel, (Object[])null);

					newModel.setCreateDate(value5);

					Method method6 = oldModelClass.getMethod("getModifiedDate");

					Date value6 = (Date)method6.invoke(oldModel, (Object[])null);

					newModel.setModifiedDate(value6);

					Method method7 = oldModelClass.getMethod("getSummary");

					String value7 = (String)method7.invoke(oldModel,
							(Object[])null);

					newModel.setSummary(value7);

					Method method8 = oldModelClass.getMethod("getRequester");

					String value8 = (String)method8.invoke(oldModel,
							(Object[])null);

					newModel.setRequester(value8);

					Method method9 = oldModelClass.getMethod("getPriority");

					String value9 = (String)method9.invoke(oldModel,
							(Object[])null);

					newModel.setPriority(value9);

					Method method10 = oldModelClass.getMethod("getDescription");

					String value10 = (String)method10.invoke(oldModel,
							(Object[])null);

					newModel.setDescription(value10);

					Method method11 = oldModelClass.getMethod("getAssignee");

					String value11 = (String)method11.invoke(oldModel,
							(Object[])null);

					newModel.setAssignee(value11);

					Method method12 = oldModelClass.getMethod("getStatus");

					String value12 = (String)method12.invoke(oldModel,
							(Object[])null);

					newModel.setStatus(value12);

					return newModel;
				}
				catch (Exception e) {
					_log.error(e, e);
				}
			}
			finally {
				Thread.currentThread().setContextClassLoader(contextClassLoader);
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static ClassLoader _classLoader;
}