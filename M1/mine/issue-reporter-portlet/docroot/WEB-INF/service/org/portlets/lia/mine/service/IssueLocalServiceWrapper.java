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

/**
 * <p>
 * This class is a wrapper for {@link IssueLocalService}.
 * </p>
 *
 * @author    Vladimir Frolov
 * @see       IssueLocalService
 * @generated
 */
public class IssueLocalServiceWrapper implements IssueLocalService {
	public IssueLocalServiceWrapper(IssueLocalService issueLocalService) {
		_issueLocalService = issueLocalService;
	}

	/**
	* Adds the issue to the database. Also notifies the appropriate model listeners.
	*
	* @param issue the issue to add
	* @return the issue that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue addIssue(
		org.portlets.lia.mine.model.Issue issue)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueLocalService.addIssue(issue);
	}

	/**
	* Creates a new issue with the primary key. Does not add the issue to the database.
	*
	* @param issueId the primary key for the new issue
	* @return the new issue
	*/
	public org.portlets.lia.mine.model.Issue createIssue(long issueId) {
		return _issueLocalService.createIssue(issueId);
	}

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
			org.portlets.lia.mine.NoSuchIssueException {
		_issueLocalService.deleteIssue(issueId);
	}

	/**
	* Deletes the issue from the database. Also notifies the appropriate model listeners.
	*
	* @param issue the issue to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteIssue(org.portlets.lia.mine.model.Issue issue)
		throws com.liferay.portal.kernel.exception.SystemException {
		_issueLocalService.deleteIssue(issue);
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
		return _issueLocalService.dynamicQuery(dynamicQuery);
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
		return _issueLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _issueLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _issueLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the issue with the primary key.
	*
	* @param issueId the primary key of the issue to get
	* @return the issue
	* @throws PortalException if a issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue getIssue(long issueId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issueLocalService.getIssue(issueId);
	}

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
	public java.util.List<org.portlets.lia.mine.model.Issue> getIssues(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueLocalService.getIssues(start, end);
	}

	/**
	* Gets the number of issues.
	*
	* @return the number of issues
	* @throws SystemException if a system exception occurred
	*/
	public int getIssuesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueLocalService.getIssuesCount();
	}

	/**
	* Updates the issue in the database. Also notifies the appropriate model listeners.
	*
	* @param issue the issue to update
	* @return the issue that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.Issue updateIssue(
		org.portlets.lia.mine.model.Issue issue)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueLocalService.updateIssue(issue);
	}

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
		throws com.liferay.portal.kernel.exception.SystemException {
		return _issueLocalService.updateIssue(issue, merge);
	}

	public org.portlets.lia.mine.model.Issue addIssue(long userId,
		long issueId, java.lang.String summary, java.lang.String description,
		java.lang.String requester, java.lang.String assignee,
		java.lang.String priority, java.lang.String status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _issueLocalService.addIssue(userId, issueId, summary,
			description, requester, assignee, priority, status);
	}

	public java.util.List<org.portlets.lia.mine.model.Issue> retrieveIssues(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return _issueLocalService.retrieveIssues(userId);
	}

	public IssueLocalService getWrappedIssueLocalService() {
		return _issueLocalService;
	}

	private IssueLocalService _issueLocalService;
}