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

package org.portlets.lia.mine.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.portlets.lia.mine.model.IRIssue;

/**
 * The persistence interface for the i r issue service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link IRIssueUtil} to access the i r issue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vladimir Frolov
 * @see IRIssuePersistenceImpl
 * @see IRIssueUtil
 * @generated
 */
public interface IRIssuePersistence extends BasePersistence<IRIssue> {
	/**
	* Caches the i r issue in the entity cache if it is enabled.
	*
	* @param irIssue the i r issue to cache
	*/
	public void cacheResult(org.portlets.lia.mine.model.IRIssue irIssue);

	/**
	* Caches the i r issues in the entity cache if it is enabled.
	*
	* @param irIssues the i r issues to cache
	*/
	public void cacheResult(
		java.util.List<org.portlets.lia.mine.model.IRIssue> irIssues);

	/**
	* Creates a new i r issue with the primary key. Does not add the i r issue to the database.
	*
	* @param issueId the primary key for the new i r issue
	* @return the new i r issue
	*/
	public org.portlets.lia.mine.model.IRIssue create(long issueId);

	/**
	* Removes the i r issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param issueId the primary key of the i r issue to remove
	* @return the i r issue that was removed
	* @throws org.portlets.lia.mine.NoSuchIssueException if a i r issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.IRIssue remove(long issueId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	public org.portlets.lia.mine.model.IRIssue updateImpl(
		org.portlets.lia.mine.model.IRIssue irIssue, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the i r issue with the primary key or throws a {@link org.portlets.lia.mine.NoSuchIssueException} if it could not be found.
	*
	* @param issueId the primary key of the i r issue to find
	* @return the i r issue
	* @throws org.portlets.lia.mine.NoSuchIssueException if a i r issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.IRIssue findByPrimaryKey(long issueId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	/**
	* Finds the i r issue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param issueId the primary key of the i r issue to find
	* @return the i r issue, or <code>null</code> if a i r issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.IRIssue fetchByPrimaryKey(long issueId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the i r issues where summary = &#63; and requester = &#63;.
	*
	* @param summary the summary to search with
	* @param requester the requester to search with
	* @return the matching i r issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.IRIssue> findByS_R(
		java.lang.String summary, java.lang.String requester)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the i r issues where summary = &#63; and requester = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param summary the summary to search with
	* @param requester the requester to search with
	* @param start the lower bound of the range of i r issues to return
	* @param end the upper bound of the range of i r issues to return (not inclusive)
	* @return the range of matching i r issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.IRIssue> findByS_R(
		java.lang.String summary, java.lang.String requester, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the i r issues where summary = &#63; and requester = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param summary the summary to search with
	* @param requester the requester to search with
	* @param start the lower bound of the range of i r issues to return
	* @param end the upper bound of the range of i r issues to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching i r issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.IRIssue> findByS_R(
		java.lang.String summary, java.lang.String requester, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first i r issue in the ordered set where summary = &#63; and requester = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param summary the summary to search with
	* @param requester the requester to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching i r issue
	* @throws org.portlets.lia.mine.NoSuchIssueException if a matching i r issue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.IRIssue findByS_R_First(
		java.lang.String summary, java.lang.String requester,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	/**
	* Finds the last i r issue in the ordered set where summary = &#63; and requester = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param summary the summary to search with
	* @param requester the requester to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching i r issue
	* @throws org.portlets.lia.mine.NoSuchIssueException if a matching i r issue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.IRIssue findByS_R_Last(
		java.lang.String summary, java.lang.String requester,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	/**
	* Finds the i r issues before and after the current i r issue in the ordered set where summary = &#63; and requester = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param issueId the primary key of the current i r issue
	* @param summary the summary to search with
	* @param requester the requester to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next i r issue
	* @throws org.portlets.lia.mine.NoSuchIssueException if a i r issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.IRIssue[] findByS_R_PrevAndNext(
		long issueId, java.lang.String summary, java.lang.String requester,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	/**
	* Finds all the i r issues.
	*
	* @return the i r issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.IRIssue> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the i r issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of i r issues to return
	* @param end the upper bound of the range of i r issues to return (not inclusive)
	* @return the range of i r issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.IRIssue> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the i r issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of i r issues to return
	* @param end the upper bound of the range of i r issues to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of i r issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.IRIssue> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the i r issues where summary = &#63; and requester = &#63; from the database.
	*
	* @param summary the summary to search with
	* @param requester the requester to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByS_R(java.lang.String summary, java.lang.String requester)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the i r issues from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the i r issues where summary = &#63; and requester = &#63;.
	*
	* @param summary the summary to search with
	* @param requester the requester to search with
	* @return the number of matching i r issues
	* @throws SystemException if a system exception occurred
	*/
	public int countByS_R(java.lang.String summary, java.lang.String requester)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the i r issues.
	*
	* @return the number of i r issues
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}