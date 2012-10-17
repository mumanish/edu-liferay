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

import com.inkwell.internet.productregistration.service.base.PRProductLocalServiceBaseImpl;

/**
 * The implementation of the p r product local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, 
 * rerun ServiceBuilder to copy their definitions into the {@link com.inkwell.internet.productregistration.service.PRProductLocalService} interface.
 * </p>
 *
 * <p>
 * Never reference this interface directly. Always use {@link com.inkwell.internet.productregistration.service.PRProductLocalServiceUtil} to access the p r product local service.
 * </p>
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Vladimir Frolov
 * @see com.inkwell.internet.productregistration.service.base.PRProductLocalServiceBaseImpl
 * @see com.inkwell.internet.productregistration.service.PRProductLocalServiceUtil
 */
public class PRProductLocalServiceImpl extends PRProductLocalServiceBaseImpl {

	public PRProduct addProduct(PRProduct newProduct, long userId)
		throws SystemException, PortalException {

			//create empty object
			PRProduct product = prProductPersistence.create(
				counterLocalService.increment(
					PRProduct.class.getName()));

			// make a call to resourceLocalService to persist resources. 
			// Resources are used in Liferay to define permissions on the objects 
			// that are persisted.
			resourceLocalService.addResources(
				newProduct.getCompanyId(), 
				newProduct.getGroupId(), userId,
				PRProduct.class.getName(), 
				product.getPrimaryKey(), false,
				true, true);

			product.setProductName(newProduct.getProductName());
			product.setSerialNumber(newProduct.getSerialNumber());
			product.setCompanyId(newProduct.getCompanyId());
			product.setGroupId(newProduct.getGroupId());

			return prProductPersistence.update(product, false);
		}


	public void deleteProduct(long productId)
		throws NoSuchProductException, SystemException, PortalException {

			PRProduct product = prProductPersistence.findByPrimaryKey(productId);
			deleteProduct(product);

		}


	public deleteProduct(PRProduct product)
		throws PortalException, SystemException {

			resourceLocalService.deleteResource(
				product.getCompanyId(), PRProduct.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, product.getPrimaryKey());

			prProductPersistence.remove(product);
		}


	public List<PRProduct> getAllProducts(long groupId)
		throws SystemException {

			List<PRProduct> products = 
				prProductPersistence.findByGroupId(groupId);

			return products;
		}

}