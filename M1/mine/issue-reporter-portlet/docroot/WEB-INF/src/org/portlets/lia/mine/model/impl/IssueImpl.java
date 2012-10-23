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

package org.portlets.lia.mine.model.impl;

import org.portlets.lia.mine.model.Issue;

/**
 * The model implementation for the Issue service. Represents a row in the &quot;Reporter_Issue&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.portlets.lia.mine.model.Issue} interface.
 * </p>
 *
 * <p>
 * Never reference this class directly. All methods that expect a issue model instance should use the {@link Issue} interface instead.
 * </p>
 */
public class IssueImpl extends IssueModelImpl implements Issue {
	public IssueImpl() {
	}
}