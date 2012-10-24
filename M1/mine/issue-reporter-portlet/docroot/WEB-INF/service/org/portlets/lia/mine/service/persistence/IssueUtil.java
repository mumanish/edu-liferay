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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import org.portlets.lia.mine.model.Issue;

import java.util.List;

/**
 * The persistence utility for the issue service. This utility wraps {@link IssuePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vladimir Frolov
 * @see IssuePersistence
 * @see IssuePersistenceImpl
 * @generated
 */
public class IssueUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Issue issue) {
		getPersistence().clearCache(issue);
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
	public static List<Issue> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Issue> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Issue> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static Issue remove(Issue issue) throws SystemException {
		return getPersistence().remove(issue);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Issue update(Issue issue, boolean merge)
		throws SystemException {
		return getPersistence().update(issue, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Issue update(Issue issue, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(issue, merge, serviceContext);
	}

	/**
	* Caches the issue in the entity cache if it is enabled.
	*
	* @param issue the issue to cache
	*/
	public static void cacheResult(org.portlets.lia.mine.model.Issue issue) {
		getPersistence().cacheResult(issue);
	}

	/**
	* Caches the issues in the entity cache if it is enabled.
	*
	* @param issues the issues to cache
	*/
	public static void cacheResult(
		java.util.List<org.portlets.lia.mine.model.Issue> issues) {
		getPersistence().cacheResult(issues);
	}

	/**
	* Creates a new issue with the primary key. Does not add the issue to the database.
	*
	* @param issueId the primary key for the new issue
	* @return the new issue
	*/
	public static org.portlets.lia.mine.model.Issue create(long issueId) {
		return getPersistence().create(issueId);
	}

	/**
	* Removes the issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param issueId the primary key of the issue to remove
	* @return the issue that was removed
	* @throws org.portlets.lia.mine.NoSuchIssueException if a issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.lia.mine.model.Issue remove(long issueId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException {
		return getPersistence().remove(issueId);
	}

	public static org.portlets.lia.mine.model.Issue updateImpl(
		org.portlets.lia.mine.model.Issue issue, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(issue, merge);
	}

	/**
	* Finds the issue with the primary key or throws a {@link org.portlets.lia.mine.NoSuchIssueException} if it could not be found.
	*
	* @param issueId the primary key of the issue to find
	* @return the issue
	* @throws org.portlets.lia.mine.NoSuchIssueException if a issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.lia.mine.model.Issue findByPrimaryKey(
		long issueId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException {
		return getPersistence().findByPrimaryKey(issueId);
	}

	/**
	* Finds the issue with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param issueId the primary key of the issue to find
	* @return the issue, or <code>null</code> if a issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.portlets.lia.mine.model.Issue fetchByPrimaryKey(
		long issueId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(issueId);
	}

	/**
	* Finds all the issues where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the matching issues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.lia.mine.model.Issue> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

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
	public static java.util.List<org.portlets.lia.mine.model.Issue> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

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
	public static java.util.List<org.portlets.lia.mine.model.Issue> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

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
	public static org.portlets.lia.mine.model.Issue findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

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
	public static org.portlets.lia.mine.model.Issue findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

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
	public static org.portlets.lia.mine.model.Issue[] findByUserId_PrevAndNext(
		long issueId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException {
		return getPersistence()
				   .findByUserId_PrevAndNext(issueId, userId, orderByComparator);
	}

	/**
	* Finds all the issues where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching issues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.lia.mine.model.Issue> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

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
	public static java.util.List<org.portlets.lia.mine.model.Issue> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

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
	public static java.util.List<org.portlets.lia.mine.model.Issue> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

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
	public static org.portlets.lia.mine.model.Issue findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

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
	public static org.portlets.lia.mine.model.Issue findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

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
	public static org.portlets.lia.mine.model.Issue[] findByCompanyId_PrevAndNext(
		long issueId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(issueId, companyId,
			orderByComparator);
	}

	/**
	* Finds all the issues.
	*
	* @return the issues
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.portlets.lia.mine.model.Issue> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.portlets.lia.mine.model.Issue> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.portlets.lia.mine.model.Issue> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the issues where userId = &#63; from the database.
	*
	* @param userId the user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Removes all the issues where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Removes all the issues from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the issues where userId = &#63;.
	*
	* @param userId the user id to search with
	* @return the number of matching issues
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Counts all the issues where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching issues
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Counts all the issues.
	*
	* @return the number of issues
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static IssuePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (IssuePersistence)PortletBeanLocatorUtil.locate(org.portlets.lia.mine.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					IssuePersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(IssuePersistence persistence) {
		_persistence = persistence;
	}

	private static IssuePersistence _persistence;
}