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

package org.portlets.lia.mine.service.impl;

import org.portlets.lia.mine.service.base.IssueLocalServiceBaseImpl;

import org.portlets.lia.mine.model.Issue;
import com.liferay.portal.model.User;
import java.io.*;
import java.util.*;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.UserUtil;
import java.util.Date;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.model.ResourceConstants;
import org.portlets.lia.mine.NoSuchIssueException;


/**
 * The implementation of the issue local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.portlets.lia.mine.service.IssueLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.portlets.lia.mine.service.IssueLocalServiceUtil} to access the issue local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Vladimir Frolov
 * @see org.portlets.lia.mine.service.base.IssueLocalServiceBaseImpl
 * @see org.portlets.lia.mine.service.IssueLocalServiceUtil
 */
public class IssueLocalServiceImpl extends IssueLocalServiceBaseImpl {

	public Issue addIssue(long userId, long issueId, String summary, String description, String requester, String assignee, String priority, String status)
        throws PortalException, SystemException {
    User user = UserUtil.findByPrimaryKey(userId);
    Date now = new Date();

    Issue issue = issuePersistence.create(issueId);


    issue.setSummary(summary);
    issue.setRequester(requester);
    issue.setPriority(priority);
    issue.setAssignee(assignee);
    issue.setDescription(description);
    issue.setStatus(status);

    issue.setCompanyId(user.getCompanyId());
    issue.setUserId(user.getUserId());
    issue.setUserName(user.getFullName());
    issue.setCreateDate(now);
    issue.setModifiedDate(now);

    return issuePersistence.update(issue, true);
	}


public List<Issue> retrieveIssues(long userId)throws SystemException {

        List<Issue> issues = issuePersistence.findByUserId(userId);
        return issues;
    }

public void deleteIssue(long issueId)
    throws NoSuchIssueException, SystemException, PortalException {
        Issue issue = issuePersistence.findByPrimaryKey(issueId);
        deleteIssue(issue);
}

public void deleteIssue(Issue issue)
    throws SystemException {
        try {
        resourceLocalService.deleteResource(
            issue.getCompanyId(), Issue.class.getName(),
            ResourceConstants.SCOPE_INDIVIDUAL, issue.getPrimaryKey());
        issuePersistence.remove(issue);
        }
        catch (PortalException ex) {}
    }
}