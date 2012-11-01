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
 * This class is a wrapper for {@link IssueService}.
 * </p>
 *
 * @author    Vladimir Frolov
 * @see       IssueService
 * @generated
 */
public class IssueServiceWrapper implements IssueService {
	public IssueServiceWrapper(IssueService issueService) {
		_issueService = issueService;
	}

	public IssueService getWrappedIssueService() {
		return _issueService;
	}

	private IssueService _issueService;
}