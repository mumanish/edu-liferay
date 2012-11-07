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

package org.portlets.tessa.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import org.portlets.tessa.model.Tessa;

import java.util.List;

/**
 * The persistence utility for the tessa service. This utility wraps {@link TessaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TessaPersistence
 * @see TessaPersistenceImpl
 * @generated
 */
public class TessaUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Tessa tessa) {
		getPersistence().clearCache(tessa);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Tessa> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Tessa> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Tessa> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static Tessa remove(Tessa tessa) throws SystemException {
		return getPersistence().remove(tessa);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Tessa update(Tessa tessa, boolean merge)
		throws SystemException {
		return getPersistence().update(tessa, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Tessa update(Tessa tessa, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tessa, merge, serviceContext);
	}

	/**
	* Caches the tessa in the entity cache if it is enabled.
	*
	* @param tessa the tessa to cache
	*/
	public static void cacheResult(org.portlets.tessa.model.Tessa tessa) {
		getPersistence().cacheResult(tessa);
	}

	/**
	* Caches the tessas in the entity cache if it is enabled.
	*
	* @param tessas the tessas to cache
	*/
	public static void cacheResult(
		java.util.List<org.portlets.tessa.model.Tessa> tessas) {
		getPersistence().cacheResult(tessas);
	}

	/**
	* Creates a new tessa with the primary key. Does not add the tessa to the database.
	*
	* @param tessaId the primary key for the new tessa
	* @return the new tessa
	*/
	public static org.portlets.tessa.model.Tessa create(long tessaId) {
		return getPersistence().create(tessaId);
	}

	/**
	* Removes the tessa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tessaId the primary key of the tessa to remove
	* @return the tessa that was removed
	* @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa remove(long tessaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence().remove(tessaId);
	}

	public static org.portlets.tessa.model.Tessa updateImpl(
		org.portlets.tessa.model.Tessa tessa, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tessa, merge);
	}

	/**
	* Finds the tessa with the primary key or throws a {@link org.portlets.tessa.NoSuchTessaException} if it could not be found.
	*
	* @param tessaId the primary key of the tessa to find
	* @return the tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa findByPrimaryKey(long tessaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence().findByPrimaryKey(tessaId);
	}

	/**
	* Finds the tessa with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tessaId the primary key of the tessa to find
	* @return the tessa, or <code>null</code> if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa fetchByPrimaryKey(long tessaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tessaId);
	}

	/**
	* Finds all the tessas where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Finds a range of all the tessas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of tessas to return
	* @param end the upper bound of the range of tessas to return (not inclusive)
	* @return the range of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Finds an ordered range of all the tessas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param start the lower bound of the range of tessas to return
	* @param end the upper bound of the range of tessas to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Finds the first tessa in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Finds the last tessa in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Finds the tessas before and after the current tessa in the ordered set where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tessaId the primary key of the current tessa
	* @param uuid the uuid to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa[] findByUuid_PrevAndNext(
		long tessaId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence()
				   .findByUuid_PrevAndNext(tessaId, uuid, orderByComparator);
	}

	/**
	* Finds the tessa where uuid = &#63; and groupId = &#63; or throws a {@link org.portlets.tessa.NoSuchTessaException} if it could not be found.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the matching tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Finds the tessa where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the matching tessa, or <code>null</code> if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Finds the tessa where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the matching tessa, or <code>null</code> if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Finds all the tessas where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the tessas where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of tessas to return
	* @param end the upper bound of the range of tessas to return (not inclusive)
	* @return the range of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the tessas where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param start the lower bound of the range of tessas to return
	* @param end the upper bound of the range of tessas to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first tessa in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last tessa in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the tessas before and after the current tessa in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tessaId the primary key of the current tessa
	* @param groupId the group id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa[] findByGroupId_PrevAndNext(
		long tessaId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(tessaId, groupId,
			orderByComparator);
	}

	/**
	* Finds all the tessas where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Finds a range of all the tessas where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of tessas to return
	* @param end the upper bound of the range of tessas to return (not inclusive)
	* @return the range of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Finds an ordered range of all the tessas where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of tessas to return
	* @param end the upper bound of the range of tessas to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Finds the first tessa in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Finds the last tessa in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Finds the tessas before and after the current tessa in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tessaId the primary key of the current tessa
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa[] findByCompanyId_PrevAndNext(
		long tessaId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(tessaId, companyId,
			orderByComparator);
	}

	/**
	* Finds all the tessas where tessaText = &#63;.
	*
	* @param tessaText the tessa text to search with
	* @return the matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findBytessaText(
		java.lang.String tessaText)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBytessaText(tessaText);
	}

	/**
	* Finds a range of all the tessas where tessaText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tessaText the tessa text to search with
	* @param start the lower bound of the range of tessas to return
	* @param end the upper bound of the range of tessas to return (not inclusive)
	* @return the range of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findBytessaText(
		java.lang.String tessaText, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBytessaText(tessaText, start, end);
	}

	/**
	* Finds an ordered range of all the tessas where tessaText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tessaText the tessa text to search with
	* @param start the lower bound of the range of tessas to return
	* @param end the upper bound of the range of tessas to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findBytessaText(
		java.lang.String tessaText, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBytessaText(tessaText, start, end, orderByComparator);
	}

	/**
	* Finds the first tessa in the ordered set where tessaText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tessaText the tessa text to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa findBytessaText_First(
		java.lang.String tessaText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence()
				   .findBytessaText_First(tessaText, orderByComparator);
	}

	/**
	* Finds the last tessa in the ordered set where tessaText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tessaText the tessa text to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa findBytessaText_Last(
		java.lang.String tessaText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence()
				   .findBytessaText_Last(tessaText, orderByComparator);
	}

	/**
	* Finds the tessas before and after the current tessa in the ordered set where tessaText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tessaId the primary key of the current tessa
	* @param tessaText the tessa text to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.tessa.model.Tessa[] findBytessaText_PrevAndNext(
		long tessaId, java.lang.String tessaText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		return getPersistence()
				   .findBytessaText_PrevAndNext(tessaId, tessaText,
			orderByComparator);
	}

	/**
	* Finds all the tessas.
	*
	* @return the tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the tessas.
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
	public static java.util.List<org.portlets.tessa.model.Tessa> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the tessas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tessas to return
	* @param end the upper bound of the range of tessas to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of tessas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.tessa.model.Tessa> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tessas where uuid = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Removes the tessa where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException {
		getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Removes all the tessas where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the tessas where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Removes all the tessas where tessaText = &#63; from the database.
	*
	* @param tessaText the tessa text to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBytessaText(java.lang.String tessaText)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBytessaText(tessaText);
	}

	/**
	* Removes all the tessas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the tessas where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the number of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Counts all the tessas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the number of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Counts all the tessas where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the tessas where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Counts all the tessas where tessaText = &#63;.
	*
	* @param tessaText the tessa text to search with
	* @return the number of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public static int countBytessaText(java.lang.String tessaText)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBytessaText(tessaText);
	}

	/**
	* Counts all the tessas.
	*
	* @return the number of tessas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TessaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TessaPersistence)PortletBeanLocatorUtil.locate(org.portlets.tessa.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					TessaPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(TessaPersistence persistence) {
		_persistence = persistence;
	}

	private static TessaPersistence _persistence;
}