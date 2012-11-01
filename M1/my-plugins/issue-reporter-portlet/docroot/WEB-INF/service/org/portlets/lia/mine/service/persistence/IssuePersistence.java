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

import org.portlets.lia.mine.model.Issue;

/**
 * The persistence interface for the issue service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link IssueUtil} to access the issue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vladimir Frolov
 * @see IssuePersistenceImpl
 * @see IssueUtil
 * @generated
 */
public interface IssuePersistence extends BasePersistence<Issue> {
	/**
	* Caches the issue in the entity cache if it is enabled.
	*
	* @param issue the issue to cache
	*/
	public void cacheResult(org.portlets.lia.mine.model.Issue issue);

	/**
	* Caches the issues in the entity cache if it is enabled.
	*
	* @param issues the issues to cache
	*/
	public void cacheResult(
		java.util.List<org.portlets.lia.mine.model.Issue> issues);

	/**
	* Creates a new issue with the primary key. Does not add the issue to the database.
	*
	* @param issueId the primary key for the new issue
	* @return the new issue
	*/
	public org.portlets.lia.mine.model.Issue create(long issueId);

	/**
	* Removes the issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param issueId the primary key of the issue to remove
	* @return the issue that was removed
	* @throws org.portlets.lia.mine.NoSuchIssueException if a issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue remove(long issueId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	public org.portlets.lia.mine.model.Issue updateImpl(
		org.portlets.lia.mine.model.Issue issue, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the issue with the primary key or throws a {@link org.portlets.lia.mine.NoSuchIssueException} if it could not be found.
	*
	* @param issueId the primary key of the issue to find
	* @return the issue
	* @throws org.portlets.lia.mine.NoSuchIssueException if a issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue findByPrimaryKey(long issueId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	/**
	* Finds the issue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param issueId the primary key of the issue to find
	* @return the issue, or <code>null</code> if a issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue fetchByPrimaryKey(long issueId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the issues where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the matching issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.Issue> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the issues where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param start the lower bound of the range of issues to return
	* @param end the upper bound of the range of issues to return (not inclusive)
	* @return the range of matching issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.Issue> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the issues where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param start the lower bound of the range of issues to return
	* @param end the upper bound of the range of issues to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.Issue> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first issue in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching issue
	* @throws org.portlets.lia.mine.NoSuchIssueException if a matching issue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	/**
	* Finds the last issue in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching issue
	* @throws org.portlets.lia.mine.NoSuchIssueException if a matching issue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	/**
	* Finds the issues before and after the current issue in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param issueId the primary key of the current issue
	* @param userId the user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next issue
	* @throws org.portlets.lia.mine.NoSuchIssueException if a issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue[] findByUserId_PrevAndNext(
		long issueId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	/**
	* Finds all the issues where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.Issue> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the issues where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of issues to return
	* @param end the upper bound of the range of issues to return (not inclusive)
	* @return the range of matching issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.Issue> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the issues where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of issues to return
	* @param end the upper bound of the range of issues to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.Issue> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the first issue in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching issue
	* @throws org.portlets.lia.mine.NoSuchIssueException if a matching issue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	/**
	* Finds the last issue in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching issue
	* @throws org.portlets.lia.mine.NoSuchIssueException if a matching issue could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	/**
	* Finds the issues before and after the current issue in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param issueId the primary key of the current issue
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next issue
	* @throws org.portlets.lia.mine.NoSuchIssueException if a issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue[] findByCompanyId_PrevAndNext(
		long issueId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	/**
	* Finds all the issues.
	*
	* @return the issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.Issue> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of issues to return
	* @param end the upper bound of the range of issues to return (not inclusive)
	* @return the range of issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.Issue> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the issues.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of issues to return
	* @param end the upper bound of the range of issues to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of issues
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.portlets.lia.mine.model.Issue> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the issues where userId = &#63; from the database.
	*
	* @param userId the user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the issues where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the issues from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the issues where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the number of matching issues
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the issues where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching issues
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the issues.
	*
	* @return the number of issues
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}