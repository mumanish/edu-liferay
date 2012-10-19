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
 * The interface for the i r issue local service.
 *
 * <p>
 * Never modify or reference this interface directly. Always use {@link IRIssueLocalServiceUtil} to access the i r issue local service. Add custom service methods to {@link org.portlets.lia.mine.service.impl.IRIssueLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Vladimir Frolov
 * @see IRIssueLocalServiceUtil
 * @see org.portlets.lia.mine.service.base.IRIssueLocalServiceBaseImpl
 * @see org.portlets.lia.mine.service.impl.IRIssueLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface IRIssueLocalService {
	/**
	* Adds the i r issue to the database. Also notifies the appropriate model listeners.
	*
	* @param irIssue the i r issue to add
	* @return the i r issue that was added
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.IRIssue addIRIssue(
		org.portlets.lia.mine.model.IRIssue irIssue)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new i r issue with the primary key. Does not add the i r issue to the database.
	*
	* @param issueId the primary key for the new i r issue
	* @return the new i r issue
	*/
	public org.portlets.lia.mine.model.IRIssue createIRIssue(long issueId);

	/**
	* Deletes the i r issue with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param issueId the primary key of the i r issue to delete
	* @throws PortalException if a i r issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteIRIssue(long issueId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the i r issue from the database. Also notifies the appropriate model listeners.
	*
	* @param irIssue the i r issue to delete
	* @throws SystemException if a system exception occurred
	*/
	public void deleteIRIssue(org.portlets.lia.mine.model.IRIssue irIssue)
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
	* Gets the i r issue with the primary key.
	*
	* @param issueId the primary key of the i r issue to get
	* @return the i r issue
	* @throws PortalException if a i r issue with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public org.portlets.lia.mine.model.IRIssue getIRIssue(long issueId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets a range of all the i r issues.
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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<org.portlets.lia.mine.model.IRIssue> getIRIssues(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Gets the number of i r issues.
	*
	* @return the number of i r issues
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getIRIssuesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the i r issue in the database. Also notifies the appropriate model listeners.
	*
	* @param irIssue the i r issue to update
	* @return the i r issue that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.IRIssue updateIRIssue(
		org.portlets.lia.mine.model.IRIssue irIssue)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the i r issue in the database. Also notifies the appropriate model listeners.
	*
	* @param irIssue the i r issue to update
	* @param merge whether to merge the i r issue with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the i r issue that was updated
	* @throws SystemException if a system exception occurred
	*/
	public org.portlets.lia.mine.model.IRIssue updateIRIssue(
		org.portlets.lia.mine.model.IRIssue irIssue, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;
}