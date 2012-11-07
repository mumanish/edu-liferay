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

/**
 * <p>
 * This class is a wrapper for {@link TessaLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       TessaLocalService
 * @generated
 */
public class TessaLocalServiceWrapper implements TessaLocalService {
	public TessaLocalServiceWrapper(TessaLocalService tessaLocalService) {
		_tessaLocalService = tessaLocalService;
	}

	/**
	* Adds the tessa to the database. Also notifies the appropriate model listeners.
	*
	* @param tessa the tessa to add
	* @return the tessa that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.tessa.model.Tessa addTessa(
		org.portlets.tessa.model.Tessa tessa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tessaLocalService.addTessa(tessa);
	}

	/**
	* Creates a new tessa with the primary key. Does not add the tessa to the database.
	*
	* @param tessaId the primary key for the new tessa
	* @return the new tessa
	*/
	public org.portlets.tessa.model.Tessa createTessa(long tessaId) {
		return _tessaLocalService.createTessa(tessaId);
	}

	/**
	* Deletes the tessa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tessaId the primary key of the tessa to delete
	* @throws PortalException if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTessa(long tessaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_tessaLocalService.deleteTessa(tessaId);
	}

	/**
	* Deletes the tessa from the database. Also notifies the appropriate model listeners.
	*
	* @param tessa the tessa to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteTessa(org.portlets.tessa.model.Tessa tessa)
		throws com.liferay.portal.kernel.exception.SystemException {
		_tessaLocalService.deleteTessa(tessa);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tessaLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _tessaLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tessaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tessaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the tessa with the primary key.
	*
	* @param tessaId the primary key of the tessa to get
	* @return the tessa
	* @throws PortalException if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.tessa.model.Tessa getTessa(long tessaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tessaLocalService.getTessa(tessaId);
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
	public org.portlets.tessa.model.Tessa getTessaByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tessaLocalService.getTessaByUuidAndGroupId(uuid, groupId);
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
	public java.util.List<org.portlets.tessa.model.Tessa> getTessas(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _tessaLocalService.getTessas(start, end);
	}

	/**
	* Gets the number of tessas.
	*
	* @return the number of tessas
	* @throws SystemException if a system exception occurred
	*/
	public int getTessasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tessaLocalService.getTessasCount();
	}

	/**
	* Updates the tessa in the database. Also notifies the appropriate model listeners.
	*
	* @param tessa the tessa to update
	* @return the tessa that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.tessa.model.Tessa updateTessa(
		org.portlets.tessa.model.Tessa tessa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tessaLocalService.updateTessa(tessa);
	}

	/**
	* Updates the tessa in the database. Also notifies the appropriate model listeners.
	*
	* @param tessa the tessa to update
	* @param merge whether to merge the tessa with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the tessa that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.tessa.model.Tessa updateTessa(
		org.portlets.tessa.model.Tessa tessa, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tessaLocalService.updateTessa(tessa, merge);
	}

	public org.portlets.tessa.model.Tessa addTessa(long userId, long tessaId,
		java.lang.String tessaText,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tessaLocalService.addTessa(userId, tessaId, tessaText,
			serviceContext);
	}

	public TessaLocalService getWrappedTessaLocalService() {
		return _tessaLocalService;
	}

	private TessaLocalService _tessaLocalService;
}