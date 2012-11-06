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

package com.inkwell.internet.slogan.service.base;

import com.inkwell.internet.slogan.model.Slogan;
import com.inkwell.internet.slogan.service.SloganLocalService;
import com.inkwell.internet.slogan.service.persistence.SloganPersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.portlet.asset.service.AssetEntryLocalService;
import com.liferay.portlet.asset.service.AssetEntryService;
import com.liferay.portlet.asset.service.persistence.AssetEntryPersistence;
import com.liferay.portlet.ratings.service.RatingsStatsLocalService;
import com.liferay.portlet.ratings.service.persistence.RatingsStatsPersistence;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the slogan local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.inkwell.internet.slogan.service.impl.SloganLocalServiceImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link com.inkwell.internet.slogan.service.SloganLocalServiceUtil} to access the slogan local service.
 * </p>
 *
 * @author Rich Sezov
 * @see com.inkwell.internet.slogan.service.impl.SloganLocalServiceImpl
 * @see com.inkwell.internet.slogan.service.SloganLocalServiceUtil
 * @generated
 */
public abstract class SloganLocalServiceBaseImpl implements SloganLocalService {
	/**
	 * Adds the slogan to the database. Also notifies the appropriate model listeners.
	 *
	 * @param slogan the slogan to add
	 * @return the slogan that was added
	 * @throws SystemException if a system exception occurred
	 */
	public Slogan addSlogan(Slogan slogan) throws SystemException {
		slogan.setNew(true);

		return sloganPersistence.update(slogan, false);
	}

	/**
	 * Creates a new slogan with the primary key. Does not add the slogan to the database.
	 *
	 * @param sloganId the primary key for the new slogan
	 * @return the new slogan
	 */
	public Slogan createSlogan(long sloganId) {
		return sloganPersistence.create(sloganId);
	}

	/**
	 * Deletes the slogan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sloganId the primary key of the slogan to delete
	 * @throws PortalException if a slogan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteSlogan(long sloganId)
		throws PortalException, SystemException {
		sloganPersistence.remove(sloganId);
	}

	/**
	 * Deletes the slogan from the database. Also notifies the appropriate model listeners.
	 *
	 * @param slogan the slogan to delete
	 * @throws SystemException if a system exception occurred
	 */
	public void deleteSlogan(Slogan slogan)
		throws PortalException, SystemException {
		sloganPersistence.remove(slogan);
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return sloganPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return sloganPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return sloganPersistence.findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * Counts the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query to search with
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return sloganPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Gets the slogan with the primary key.
	 *
	 * @param sloganId the primary key of the slogan to get
	 * @return the slogan
	 * @throws PortalException if a slogan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Slogan getSlogan(long sloganId)
		throws PortalException, SystemException {
		return sloganPersistence.findByPrimaryKey(sloganId);
	}

	/**
	 * Gets the slogan with the UUID and group id.
	 *
	 * @param uuid the UUID of slogan to get
	 * @param groupId the group id of the slogan to get
	 * @return the slogan
	 * @throws PortalException if a slogan with the UUID and group id could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Slogan getSloganByUuidAndGroupId(String uuid, long groupId)
		throws PortalException, SystemException {
		return sloganPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Gets a range of all the slogans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of slogans to return
	 * @param end the upper bound of the range of slogans to return (not inclusive)
	 * @return the range of slogans
	 * @throws SystemException if a system exception occurred
	 */
	public List<Slogan> getSlogans(int start, int end)
		throws SystemException {
		return sloganPersistence.findAll(start, end);
	}

	/**
	 * Gets the number of slogans.
	 *
	 * @return the number of slogans
	 * @throws SystemException if a system exception occurred
	 */
	public int getSlogansCount() throws SystemException {
		return sloganPersistence.countAll();
	}

	/**
	 * Updates the slogan in the database. Also notifies the appropriate model listeners.
	 *
	 * @param slogan the slogan to update
	 * @return the slogan that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public Slogan updateSlogan(Slogan slogan) throws SystemException {
		slogan.setNew(false);

		return sloganPersistence.update(slogan, true);
	}

	/**
	 * Updates the slogan in the database. Also notifies the appropriate model listeners.
	 *
	 * @param slogan the slogan to update
	 * @param merge whether to merge the slogan with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the slogan that was updated
	 * @throws SystemException if a system exception occurred
	 */
	public Slogan updateSlogan(Slogan slogan, boolean merge)
		throws SystemException {
		slogan.setNew(false);

		return sloganPersistence.update(slogan, merge);
	}

	/**
	 * Gets the slogan local service.
	 *
	 * @return the slogan local service
	 */
	public SloganLocalService getSloganLocalService() {
		return sloganLocalService;
	}

	/**
	 * Sets the slogan local service.
	 *
	 * @param sloganLocalService the slogan local service
	 */
	public void setSloganLocalService(SloganLocalService sloganLocalService) {
		this.sloganLocalService = sloganLocalService;
	}

	/**
	 * Gets the slogan persistence.
	 *
	 * @return the slogan persistence
	 */
	public SloganPersistence getSloganPersistence() {
		return sloganPersistence;
	}

	/**
	 * Sets the slogan persistence.
	 *
	 * @param sloganPersistence the slogan persistence
	 */
	public void setSloganPersistence(SloganPersistence sloganPersistence) {
		this.sloganPersistence = sloganPersistence;
	}

	/**
	 * Gets the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Gets the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Gets the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Gets the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Gets the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Gets the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Gets the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Gets the asset entry local service.
	 *
	 * @return the asset entry local service
	 */
	public AssetEntryLocalService getAssetEntryLocalService() {
		return assetEntryLocalService;
	}

	/**
	 * Sets the asset entry local service.
	 *
	 * @param assetEntryLocalService the asset entry local service
	 */
	public void setAssetEntryLocalService(
		AssetEntryLocalService assetEntryLocalService) {
		this.assetEntryLocalService = assetEntryLocalService;
	}

	/**
	 * Gets the asset entry remote service.
	 *
	 * @return the asset entry remote service
	 */
	public AssetEntryService getAssetEntryService() {
		return assetEntryService;
	}

	/**
	 * Sets the asset entry remote service.
	 *
	 * @param assetEntryService the asset entry remote service
	 */
	public void setAssetEntryService(AssetEntryService assetEntryService) {
		this.assetEntryService = assetEntryService;
	}

	/**
	 * Gets the asset entry persistence.
	 *
	 * @return the asset entry persistence
	 */
	public AssetEntryPersistence getAssetEntryPersistence() {
		return assetEntryPersistence;
	}

	/**
	 * Sets the asset entry persistence.
	 *
	 * @param assetEntryPersistence the asset entry persistence
	 */
	public void setAssetEntryPersistence(
		AssetEntryPersistence assetEntryPersistence) {
		this.assetEntryPersistence = assetEntryPersistence;
	}

	/**
	 * Gets the ratings stats local service.
	 *
	 * @return the ratings stats local service
	 */
	public RatingsStatsLocalService getRatingsStatsLocalService() {
		return ratingsStatsLocalService;
	}

	/**
	 * Sets the ratings stats local service.
	 *
	 * @param ratingsStatsLocalService the ratings stats local service
	 */
	public void setRatingsStatsLocalService(
		RatingsStatsLocalService ratingsStatsLocalService) {
		this.ratingsStatsLocalService = ratingsStatsLocalService;
	}

	/**
	 * Gets the ratings stats persistence.
	 *
	 * @return the ratings stats persistence
	 */
	public RatingsStatsPersistence getRatingsStatsPersistence() {
		return ratingsStatsPersistence;
	}

	/**
	 * Sets the ratings stats persistence.
	 *
	 * @param ratingsStatsPersistence the ratings stats persistence
	 */
	public void setRatingsStatsPersistence(
		RatingsStatsPersistence ratingsStatsPersistence) {
		this.ratingsStatsPersistence = ratingsStatsPersistence;
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query to perform
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = sloganPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = SloganLocalService.class)
	protected SloganLocalService sloganLocalService;
	@BeanReference(type = SloganPersistence.class)
	protected SloganPersistence sloganPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@BeanReference(type = AssetEntryLocalService.class)
	protected AssetEntryLocalService assetEntryLocalService;
	@BeanReference(type = AssetEntryService.class)
	protected AssetEntryService assetEntryService;
	@BeanReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;
	@BeanReference(type = RatingsStatsLocalService.class)
	protected RatingsStatsLocalService ratingsStatsLocalService;
	@BeanReference(type = RatingsStatsPersistence.class)
	protected RatingsStatsPersistence ratingsStatsPersistence;
}