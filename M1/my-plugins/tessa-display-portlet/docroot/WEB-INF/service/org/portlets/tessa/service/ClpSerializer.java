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

package org.portlets.tessa.service;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.BaseModel;

import org.portlets.tessa.model.TessaClp;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static final String SERVLET_CONTEXT_NAME = "tessa-display-portlet";

	public static void setClassLoader(ClassLoader classLoader) {
		_classLoader = classLoader;
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(TessaClp.class.getName())) {
			TessaClp oldCplModel = (TessaClp)oldModel;

			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					Class<?> newModelClass = Class.forName("org.portlets.tessa.model.impl.TessaImpl",
							true, _classLoader);

					Object newModel = newModelClass.newInstance();

					Method method0 = newModelClass.getMethod("setUuid",
							new Class[] { String.class });

					String value0 = oldCplModel.getUuid();

					method0.invoke(newModel, value0);

					Method method1 = newModelClass.getMethod("setTessaId",
							new Class[] { Long.TYPE });

					Long value1 = new Long(oldCplModel.getTessaId());

					method1.invoke(newModel, value1);

					Method method2 = newModelClass.getMethod("setTessaText",
							new Class[] { String.class });

					String value2 = oldCplModel.getTessaText();

					method2.invoke(newModel, value2);

					Method method3 = newModelClass.getMethod("setCompanyId",
							new Class[] { Long.TYPE });

					Long value3 = new Long(oldCplModel.getCompanyId());

					method3.invoke(newModel, value3);

					Method method4 = newModelClass.getMethod("setGroupId",
							new Class[] { Long.TYPE });

					Long value4 = new Long(oldCplModel.getGroupId());

					method4.invoke(newModel, value4);

					Method method5 = newModelClass.getMethod("setUserId",
							new Class[] { Long.TYPE });

					Long value5 = new Long(oldCplModel.getUserId());

					method5.invoke(newModel, value5);

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

		if (oldModelClassName.equals("org.portlets.tessa.model.impl.TessaImpl")) {
			ClassLoader contextClassLoader = Thread.currentThread()
												   .getContextClassLoader();

			try {
				Thread.currentThread().setContextClassLoader(_classLoader);

				try {
					TessaClp newModel = new TessaClp();

					Method method0 = oldModelClass.getMethod("getUuid");

					String value0 = (String)method0.invoke(oldModel,
							(Object[])null);

					newModel.setUuid(value0);

					Method method1 = oldModelClass.getMethod("getTessaId");

					Long value1 = (Long)method1.invoke(oldModel, (Object[])null);

					newModel.setTessaId(value1);

					Method method2 = oldModelClass.getMethod("getTessaText");

					String value2 = (String)method2.invoke(oldModel,
							(Object[])null);

					newModel.setTessaText(value2);

					Method method3 = oldModelClass.getMethod("getCompanyId");

					Long value3 = (Long)method3.invoke(oldModel, (Object[])null);

					newModel.setCompanyId(value3);

					Method method4 = oldModelClass.getMethod("getGroupId");

					Long value4 = (Long)method4.invoke(oldModel, (Object[])null);

					newModel.setGroupId(value4);

					Method method5 = oldModelClass.getMethod("getUserId");

					Long value5 = (Long)method5.invoke(oldModel, (Object[])null);

					newModel.setUserId(value5);

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