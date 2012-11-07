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

import com.liferay.portal.service.persistence.BasePersistence;

import org.portlets.tessa.model.Tessa;

/**
 * The persistence interface for the tessa service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link TessaUtil} to access the tessa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TessaPersistenceImpl
 * @see TessaUtil
 * @generated
 */
public interface TessaPersistence extends BasePersistence<Tessa> {
	/**
	* Caches the tessa in the entity cache if it is enabled.
	*
	* @param tessa the tessa to cache
	*/
	public void cacheResult(org.portlets.tessa.model.Tessa tessa);

	/**
	* Caches the tessas in the entity cache if it is enabled.
	*
	* @param tessas the tessas to cache
	*/
	public void cacheResult(
		java.util.List<org.portlets.tessa.model.Tessa> tessas);

	/**
	* Creates a new tessa with the primary key. Does not add the tessa to the database.
	*
	* @param tessaId the primary key for the new tessa
	* @return the new tessa
	*/
	public org.portlets.tessa.model.Tessa create(long tessaId);

	/**
	* Removes the tessa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tessaId the primary key of the tessa to remove
	* @return the tessa that was removed
	* @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.tessa.model.Tessa remove(long tessaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

	public org.portlets.tessa.model.Tessa updateImpl(
		org.portlets.tessa.model.Tessa tessa, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the tessa with the primary key or throws a {@link org.portlets.tessa.NoSuchTessaException} if it could not be found.
	*
	* @param tessaId the primary key of the tessa to find
	* @return the tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.tessa.model.Tessa findByPrimaryKey(long tessaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

	/**
	* Finds the tessa with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tessaId the primary key of the tessa to find
	* @return the tessa, or <code>null</code> if a tessa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.tessa.model.Tessa fetchByPrimaryKey(long tessaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the tessas where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.tessa.model.Tessa> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.portlets.tessa.model.Tessa> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.portlets.tessa.model.Tessa> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.portlets.tessa.model.Tessa findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

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
	public org.portlets.tessa.model.Tessa findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

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
	public org.portlets.tessa.model.Tessa[] findByUuid_PrevAndNext(
		long tessaId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

	/**
	* Finds the tessa where uuid = &#63; and groupId = &#63; or throws a {@link org.portlets.tessa.NoSuchTessaException} if it could not be found.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the matching tessa
	* @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.tessa.model.Tessa findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

	/**
	* Finds the tessa where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the matching tessa, or <code>null</code> if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.tessa.model.Tessa fetchByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the tessa where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the matching tessa, or <code>null</code> if a matching tessa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.tessa.model.Tessa fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the tessas where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.tessa.model.Tessa> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.portlets.tessa.model.Tessa> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.portlets.tessa.model.Tessa> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.portlets.tessa.model.Tessa findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

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
	public org.portlets.tessa.model.Tessa findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

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
	public org.portlets.tessa.model.Tessa[] findByGroupId_PrevAndNext(
		long tessaId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

	/**
	* Finds all the tessas where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.tessa.model.Tessa> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.portlets.tessa.model.Tessa> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.portlets.tessa.model.Tessa> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.portlets.tessa.model.Tessa findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

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
	public org.portlets.tessa.model.Tessa findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

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
	public org.portlets.tessa.model.Tessa[] findByCompanyId_PrevAndNext(
		long tessaId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

	/**
	* Finds all the tessas where tessaText = &#63;.
	*
	* @param tessaText the tessa text to search with
	* @return the matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.tessa.model.Tessa> findBytessaText(
		java.lang.String tessaText)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.portlets.tessa.model.Tessa> findBytessaText(
		java.lang.String tessaText, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.portlets.tessa.model.Tessa> findBytessaText(
		java.lang.String tessaText, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.portlets.tessa.model.Tessa findBytessaText_First(
		java.lang.String tessaText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

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
	public org.portlets.tessa.model.Tessa findBytessaText_Last(
		java.lang.String tessaText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

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
	public org.portlets.tessa.model.Tessa[] findBytessaText_PrevAndNext(
		long tessaId, java.lang.String tessaText,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

	/**
	* Finds all the tessas.
	*
	* @return the tessas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.tessa.model.Tessa> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.portlets.tessa.model.Tessa> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.portlets.tessa.model.Tessa> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tessas where uuid = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tessa where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.tessa.NoSuchTessaException;

	/**
	* Removes all the tessas where groupId = &#63; from the database.
	*
	* @param groupId the group id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tessas where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tessas where tessaText = &#63; from the database.
	*
	* @param tessaText the tessa text to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeBytessaText(java.lang.String tessaText)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tessas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the tessas where uuid = &#63;.
	*
	* @param uuid the uuid to search with
	* @return the number of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the tessas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid to search with
	* @param groupId the group id to search with
	* @return the number of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the tessas where groupId = &#63;.
	*
	* @param groupId the group id to search with
	* @return the number of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the tessas where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the tessas where tessaText = &#63;.
	*
	* @param tessaText the tessa text to search with
	* @return the number of matching tessas
	* @throws SystemException if a system exception occurred
	*/
	public int countBytessaText(java.lang.String tessaText)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the tessas.
	*
	* @return the number of tessas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}