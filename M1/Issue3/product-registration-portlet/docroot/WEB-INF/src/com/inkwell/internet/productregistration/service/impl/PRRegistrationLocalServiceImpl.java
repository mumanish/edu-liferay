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

package com.inkwell.internet.productregistration.service.impl;

import com.inkwell.internet.productregistration.service.base.PRRegistrationLocalServiceBaseImpl;

import com.inkwell.internet.productregistration.model.PRRegistration;
import java.util.Collections;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.inkwell.internet.productregistration.NoSuchProductException;

/**
 * The implementation of the p r registration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.inkwell.internet.productregistration.service.PRRegistrationLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.inkwell.internet.productregistration.service.PRRegistrationLocalServiceUtil} to access the p r registration local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Vladimir Frolov
 * @see com.inkwell.internet.productregistration.service.base.PRRegistrationLocalServiceBaseImpl
 * @see com.inkwell.internet.productregistration.service.PRRegistrationLocalServiceUtil
 */
public class PRRegistrationLocalServiceImpl
	extends PRRegistrationLocalServiceBaseImpl {


	public PRRegistration addRegistration(PRRegistration reg) 
		throws SystemException, PortalException {

			PRRegistration registration =
				prRegistrationPersistance.create(
					counterLocalService.increment(
						PRRegistration.class.getName()));

			resourceLocalService.addResources(
				registration.getCompanyId(), 
				registration.getGroupId(),
				PRRegistration.class.getName(), false);

			registration.setCompanyId(reg.getCompanyId());
			registration.setDatePurchased(reg.getDatePurchased());
			registration.setGroupId(reg.getGroupId());
			registration.setHowHear(reg.getHowHear());
			registration.setProductId(reg.getProductId());
			registration.setPrUserId(reg.getPrUserId());
			registration.setSerialNumber(reg.getSerialNumber());
			registration.setWherePurchased(reg.getWherePurchased());

			return prRegistrationPersistence.update(registration, false);
		}


	public List<PRRegistration> getAllRegistrations(long groupId)
		throws SystemException {

			//get all registrarions by groupID
			List<PRRegistration> registrations =
				prRegistrationPersistence.findByGroupId(groupid);

			return registrations;
		}
}