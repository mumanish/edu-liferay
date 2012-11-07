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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;

/**
 * The utility for the tessa local service. This utility wraps {@link org.portlets.tessa.service.impl.TessaLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * Never modify this class directly. Add custom service methods to {@link org.portlets.tessa.service.impl.TessaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TessaLocalService
 * @see org.portlets.tessa.service.base.TessaLocalServiceBaseImpl
 * @see org.portlets.tessa.service.impl.TessaLocalServiceImpl
 * @generated
 */
public class TessaLocalServiceUtil {
	/**
	* Adds the tessa to the database. Also notifies the appropriate model listeners.
	*
	* @param tessa the tessa to add
	* @return the tessa that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa addTessa(
		org.portlets.tessa.model.Tessa tessa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTessa(tessa);
	}

	/**
	* Creates a new tessa with the primary key. Does not add the tessa to the database.
	*
	* @param tessaId the primary key for the new tessa
	* @return the new tessa
	*/
	public static org.portlets.tessa.model.Tessa createTessa(long tessaId) {
		return getService().createTessa(tessaId);
	}

	/**
	* Deletes the tessa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tessaId the primary key of the tessa to delete
	* @throws PortalException if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTessa(long tessaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTessa(tessaId);
	}

	/**
	* Deletes the tessa from the database. Also notifies the appropriate model listeners.
	*
	* @param tessa the tessa to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteTessa(org.portlets.tessa.model.Tessa tessa)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteTessa(tessa);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the tessa with the primary key.
	*
	* @param tessaId the primary key of the tessa to get
	* @return the tessa
	* @throws PortalException if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa getTessa(long tessaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTessa(tessaId);
	}

	/**
	* Gets the tessa with the UUID and group id.
	*
	* @param uuid the UUID of tessa to get
	* @param groupId the group id of the tessa to get
	* @return the tessa
	* @throws PortalException if a tessa with the UUID and group id could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa getTessaByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTessaByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Gets a range of all the tessas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tessas to return
	* @param end the upper bound of the range of tessas to return (not inclusive)
	* @return the range of tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> getTessas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTessas(start, end);
	}

	/**
	* Gets the number of tessas.
	*
	* @return the number of tessas
	* @throws SystemException if a system exception occurred
	*/
	public static int getTessasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTessasCount();
	}

	/**
	* Updates the tessa in the database. Also notifies the appropriate model listeners.
	*
	* @param tessa the tessa to update
	* @return the tessa that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa updateTessa(
		org.portlets.tessa.model.Tessa tessa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTessa(tessa);
	}

	/**
	* Updates the tessa in the database. Also notifies the appropriate model listeners.
	*
	* @param tessa the tessa to update
	* @param merge whether to merge the tessa with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the tessa that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa updateTessa(
		org.portlets.tessa.model.Tessa tessa, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTessa(tessa, merge);
	}

	public static org.portlets.tessa.model.Tessa addTessa(long userId,
		long tessaId, java.lang.String tessaText,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addTessa(userId, tessaId, tessaText, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static TessaLocalService getService() {
		if (_service == null) {
			Object obj = PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					TessaLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.SERVLET_CONTEXT_NAME,
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(obj,
					portletClassLoader);

			_service = new TessaLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);
		}

		return _service;
	}

	public void setService(TessaLocalService service) {
		_service = service;
	}

	private static TessaLocalService _service;
}