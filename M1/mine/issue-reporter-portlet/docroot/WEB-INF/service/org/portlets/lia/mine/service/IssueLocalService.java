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

import com.liferay.portal.kernel.annotation.Isolation;
import com.liferay.portal.kernel.annotation.Propagation;
import com.liferay.portal.kernel.annotation.Transactional;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The interface for the issue local service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link IssueLocalServiceUtil} to access the issue local service. Add custom service methods to {@link org.portlets.lia.mine.service.impl.IssueLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Vladimir Frolov
 * @see IssueLocalServiceUtil
 * @see org.portlets.lia.mine.service.base.IssueLocalServiceBaseImpl
 * @see org.portlets.lia.mine.service.impl.IssueLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface IssueLocalService {
	/**
	* Adds the issue to the database. Also notifies the appropriate model listeners.
	*
	* @param issue the issue to add
	* @return the issue that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue addIssue(
		org.portlets.lia.mine.model.Issue issue)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new issue with the primary key. Does not add the issue to the database.
	*
	* @param issueId the primary key for the new issue
	* @return the new issue
	*/
	public org.portlets.lia.mine.model.Issue createIssue(long issueId);

	/**
	* Deletes the issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param issueId the primary key of the issue to delete
	* @throws PortalException if a issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteIssue(long issueId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			org.portlets.lia.mine.NoSuchIssueException;

	/**
	* Deletes the issue from the database. Also notifies the appropriate model listeners.
	*
	* @param issue the issue to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteIssue(org.portlets.lia.mine.model.Issue issue)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the issue with the primary key.
	*
	* @param issueId the primary key of the issue to get
	* @return the issue
	* @throws PortalException if a issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.portlets.lia.mine.model.Issue getIssue(long issueId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the issues.
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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.portlets.lia.mine.model.Issue> getIssues(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of issues.
	*
	* @return the number of issues
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getIssuesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the issue in the database. Also notifies the appropriate model listeners.
	*
	* @param issue the issue to update
	* @return the issue that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue updateIssue(
		org.portlets.lia.mine.model.Issue issue)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the issue in the database. Also notifies the appropriate model listeners.
	*
	* @param issue the issue to update
	* @param merge whether to merge the issue with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the issue that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue updateIssue(
		org.portlets.lia.mine.model.Issue issue, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	public org.portlets.lia.mine.model.Issue addIssue(long userId,
		java.lang.String summary, java.lang.String description,
		java.lang.String requester, java.lang.String assignee,
		java.lang.String priority, java.lang.String status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<org.portlets.lia.mine.model.Issue> retrieveIssues(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;
}