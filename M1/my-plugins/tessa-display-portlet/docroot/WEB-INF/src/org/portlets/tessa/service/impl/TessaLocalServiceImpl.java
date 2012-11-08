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

package org.portlets.tessa.service.impl;

import org.portlets.tessa.service.base.TessaLocalServiceBaseImpl;

import org.portlets.tessa.model.Tessa;
import com.liferay.portal.model.User;
import java.io.*;
import java.util.*;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.UserUtil;
import java.util.Date;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;


import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;


/**
 * The implementation of the tessa local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.portlets.tessa.service.TessaLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link org.portlets.tessa.service.TessaLocalServiceUtil} to access the tessa local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see org.portlets.tessa.service.base.TessaLocalServiceBaseImpl
 * @see org.portlets.tessa.service.TessaLocalServiceUtil
 */
public class TessaLocalServiceImpl extends TessaLocalServiceBaseImpl {

	public Tessa addTessa(long userId, long tessaId, String tessaText,
			ServiceContext serviceContext) throws PortalException, SystemException {

    User user = UserUtil.findByPrimaryKey(userId);

   Tessa tessa = tessaPersistence.create(counterLocalService.increment(Tessa.class.getName()));


    tessa.setTessaText(tessaText);

    tessa.setCompanyId(user.getCompanyId());
    tessa.setUserId(user.getUserId());
    

    tessaPersistence.update(tessa, false);

    assetEntryLocalService.updateEntry(
		userId, tessa.getGroupId(), Tessa.class.getName(),
		tessa.getTessaId(), serviceContext.getAssetCategoryIds(),
		serviceContext.getAssetTagNames());

	    return tessa;
	}

   public Tessa getTessa(long tessaId)
        throws SystemException {

        Tessa tessa = tessaPersistence.fetchByPrimaryKey(tessaId);

        return tessa;

    }


}