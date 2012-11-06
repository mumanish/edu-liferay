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

package com.inkwell.internet.slogan.service.impl;

import com.inkwell.internet.slogan.model.Slogan;
import com.inkwell.internet.slogan.service.base.SloganLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
/**
 * The implementation of the slogan local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.inkwell.internet.slogan.service.SloganLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.inkwell.internet.slogan.service.SloganLocalServiceUtil} to access the slogan local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Rich Sezov
 * @see com.inkwell.internet.slogan.service.base.SloganLocalServiceBaseImpl
 * @see com.inkwell.internet.slogan.service.SloganLocalServiceUtil
 */
public class SloganLocalServiceImpl extends SloganLocalServiceBaseImpl {

	public Slogan addSlogan(Slogan newSlogan, long userId,
		ServiceContext serviceContext) throws SystemException, PortalException {

			Slogan slogan = sloganPersistence.create(counterLocalService.increment(
				Slogan.class.getName()));

			slogan.setCompanyId(newSlogan.getCompanyId());
			slogan.setGroupId(newSlogan.getGroupId());
			slogan.setUserId(serviceContext.getUserId());
			slogan.setSloganDate(newSlogan.getSloganDate());
			slogan.setSloganText(newSlogan.getSloganText());
			slogan.setStatus(WorkflowConstants.STATUS_DRAFT);

			sloganPersistence.update(slogan, false);

			resourceLocalService.addResources(
				newSlogan.getCompanyId(), newSlogan.getGroupId(), userId,
				Slogan.class.getName(), slogan.getPrimaryKey(), false,
				true, true);

			assetEntryLocalService.updateEntry(
				userId, slogan.getGroupId(), Slogan.class.getName(),
				slogan.getSloganId(), serviceContext.getAssetCategoryIds(),
				serviceContext.getAssetTagNames());

			WorkflowHandlerRegistryUtil.startWorkflowInstance(
				slogan.getCompanyId(), slogan.getGroupId(), userId,
				Slogan.class.getName(), slogan.getPrimaryKey(), slogan,
				serviceContext);

			return slogan;


		}

	public void deleteSlogan (Slogan slogan)
		throws SystemException, PortalException {

			long companyId = slogan.getCompanyId();

			resourceLocalService.deleteResource(companyId, Slogan.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, slogan.getPrimaryKey());
			
			assetEntryLocalService.deleteEntry(Slogan.class.getName(), slogan.getSloganId());
			
			sloganPersistence.remove(slogan);

		}

	public Slogan updateStatus(
		long userId, long resourcePrimKey, int status,
		ServiceContext serviceContext)
			throws PortalException, SystemException {

				User user = userLocalService.getUser(userId);
				Slogan slogan = getSlogan(resourcePrimKey);
				slogan.setStatus(status);
				slogan.setStatusByUserId(userId);
				slogan.setStatusByUserName(user.getFullName());
				slogan.setStatusDate(serviceContext.getModifiedDate());

				sloganPersistence.update(slogan, false);

				if (status == WorkflowConstants.STATUS_APPROVED) {
					
					assetEntryLocalService.updateVisible(
						Slogan.class.getName(), resourcePrimKey, true);
				} else {

					assetEntryLocalService.updateVisible(
						Slogan.class.getName(), resourcePrimKey, false);
				}
					return slogan;
			}

}