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

package org.portlets.tessa.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.portlet.asset.service.persistence.AssetEntryPersistence;
import com.liferay.portlet.ratings.service.persistence.RatingsStatsPersistence;

import org.portlets.tessa.NoSuchTessaException;
import org.portlets.tessa.model.Tessa;
import org.portlets.tessa.model.impl.TessaImpl;
import org.portlets.tessa.model.impl.TessaModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the tessa service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link TessaUtil} to access the tessa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TessaPersistence
 * @see TessaUtil
 * @generated
 */
public class TessaPersistenceImpl extends BasePersistenceImpl<Tessa>
	implements TessaPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = TessaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_UUID = new FinderPath(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByUuid",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByUuid", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_GROUPID = new FinderPath(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByGroupId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByGroupId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_COMPANYID = new FinderPath(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByCompanyId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_TESSATEXT = new FinderPath(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findBytessaText",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_TESSATEXT = new FinderPath(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countBytessaText", new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the tessa in the entity cache if it is enabled.
	 *
	 * @param tessa the tessa to cache
	 */
	public void cacheResult(Tessa tessa) {
		EntityCacheUtil.putResult(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaImpl.class, tessa.getPrimaryKey(), tessa);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { tessa.getUuid(), new Long(tessa.getGroupId()) },
			tessa);
	}

	/**
	 * Caches the tessas in the entity cache if it is enabled.
	 *
	 * @param tessas the tessas to cache
	 */
	public void cacheResult(List<Tessa> tessas) {
		for (Tessa tessa : tessas) {
			if (EntityCacheUtil.getResult(TessaModelImpl.ENTITY_CACHE_ENABLED,
						TessaImpl.class, tessa.getPrimaryKey(), this) == null) {
				cacheResult(tessa);
			}
		}
	}

	/**
	 * Clears the cache for all tessas.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(TessaImpl.class.getName());
		EntityCacheUtil.clearCache(TessaImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the tessa.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(Tessa tessa) {
		EntityCacheUtil.removeResult(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaImpl.class, tessa.getPrimaryKey());

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { tessa.getUuid(), new Long(tessa.getGroupId()) });
	}

	/**
	 * Creates a new tessa with the primary key. Does not add the tessa to the database.
	 *
	 * @param tessaId the primary key for the new tessa
	 * @return the new tessa
	 */
	public Tessa create(long tessaId) {
		Tessa tessa = new TessaImpl();

		tessa.setNew(true);
		tessa.setPrimaryKey(tessaId);

		String uuid = PortalUUIDUtil.generate();

		tessa.setUuid(uuid);

		return tessa;
	}

	/**
	 * Removes the tessa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tessa to remove
	 * @return the tessa that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a tessa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the tessa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tessaId the primary key of the tessa to remove
	 * @return the tessa that was removed
	 * @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa remove(long tessaId)
		throws NoSuchTessaException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Tessa tessa = (Tessa)session.get(TessaImpl.class, new Long(tessaId));

			if (tessa == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + tessaId);
				}

				throw new NoSuchTessaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					tessaId);
			}

			return remove(tessa);
		}
		catch (NoSuchTessaException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tessa removeImpl(Tessa tessa) throws SystemException {
		tessa = toUnwrappedModel(tessa);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, tessa);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		TessaModelImpl tessaModelImpl = (TessaModelImpl)tessa;

		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] {
				tessaModelImpl.getUuid(), new Long(tessaModelImpl.getGroupId())
			});

		EntityCacheUtil.removeResult(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaImpl.class, tessa.getPrimaryKey());

		return tessa;
	}

	public Tessa updateImpl(org.portlets.tessa.model.Tessa tessa, boolean merge)
		throws SystemException {
		tessa = toUnwrappedModel(tessa);

		boolean isNew = tessa.isNew();

		TessaModelImpl tessaModelImpl = (TessaModelImpl)tessa;

		if (Validator.isNull(tessa.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			tessa.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, tessa, merge);

			tessa.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(TessaModelImpl.ENTITY_CACHE_ENABLED,
			TessaImpl.class, tessa.getPrimaryKey(), tessa);

		if (!isNew &&
				(!Validator.equals(tessa.getUuid(),
					tessaModelImpl.getOriginalUuid()) ||
				(tessa.getGroupId() != tessaModelImpl.getOriginalGroupId()))) {
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
				new Object[] {
					tessaModelImpl.getOriginalUuid(),
					new Long(tessaModelImpl.getOriginalGroupId())
				});
		}

		if (isNew ||
				(!Validator.equals(tessa.getUuid(),
					tessaModelImpl.getOriginalUuid()) ||
				(tessa.getGroupId() != tessaModelImpl.getOriginalGroupId()))) {
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
				new Object[] { tessa.getUuid(), new Long(tessa.getGroupId()) },
				tessa);
		}

		return tessa;
	}

	protected Tessa toUnwrappedModel(Tessa tessa) {
		if (tessa instanceof TessaImpl) {
			return tessa;
		}

		TessaImpl tessaImpl = new TessaImpl();

		tessaImpl.setNew(tessa.isNew());
		tessaImpl.setPrimaryKey(tessa.getPrimaryKey());

		tessaImpl.setUuid(tessa.getUuid());
		tessaImpl.setTessaId(tessa.getTessaId());
		tessaImpl.setTessaText(tessa.getTessaText());
		tessaImpl.setCompanyId(tessa.getCompanyId());
		tessaImpl.setGroupId(tessa.getGroupId());
		tessaImpl.setUserId(tessa.getUserId());

		return tessaImpl;
	}

	/**
	 * Finds the tessa with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the tessa to find
	 * @return the tessa
	 * @throws com.liferay.portal.NoSuchModelException if a tessa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the tessa with the primary key or throws a {@link org.portlets.tessa.NoSuchTessaException} if it could not be found.
	 *
	 * @param tessaId the primary key of the tessa to find
	 * @return the tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa findByPrimaryKey(long tessaId)
		throws NoSuchTessaException, SystemException {
		Tessa tessa = fetchByPrimaryKey(tessaId);

		if (tessa == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + tessaId);
			}

			throw new NoSuchTessaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				tessaId);
		}

		return tessa;
	}

	/**
	 * Finds the tessa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tessa to find
	 * @return the tessa, or <code>null</code> if a tessa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the tessa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tessaId the primary key of the tessa to find
	 * @return the tessa, or <code>null</code> if a tessa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa fetchByPrimaryKey(long tessaId) throws SystemException {
		Tessa tessa = (Tessa)EntityCacheUtil.getResult(TessaModelImpl.ENTITY_CACHE_ENABLED,
				TessaImpl.class, tessaId, this);

		if (tessa == null) {
			Session session = null;

			try {
				session = openSession();

				tessa = (Tessa)session.get(TessaImpl.class, new Long(tessaId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (tessa != null) {
					cacheResult(tessa);
				}

				closeSession(session);
			}
		}

		return tessa;
	}

	/**
	 * Finds all the tessas where uuid = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @return the matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the tessas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param start the lower bound of the range of tessas to return
	 * @param end the upper bound of the range of tessas to return (not inclusive)
	 * @return the range of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Finds an ordered range of all the tessas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param start the lower bound of the range of tessas to return
	 * @param end the upper bound of the range of tessas to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				uuid,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Tessa> list = (List<Tessa>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_UUID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TESSA_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_UUID_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TessaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				list = (List<Tessa>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_UUID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_UUID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first tessa in the ordered set where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchTessaException, SystemException {
		List<Tessa> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTessaException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last tessa in the ordered set where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param uuid the uuid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchTessaException, SystemException {
		int count = countByUuid(uuid);

		List<Tessa> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTessaException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the tessas before and after the current tessa in the ordered set where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tessaId the primary key of the current tessa
	 * @param uuid the uuid to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa[] findByUuid_PrevAndNext(long tessaId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchTessaException, SystemException {
		Tessa tessa = findByPrimaryKey(tessaId);

		Session session = null;

		try {
			session = openSession();

			Tessa[] array = new TessaImpl[3];

			array[0] = getByUuid_PrevAndNext(session, tessa, uuid,
					orderByComparator, true);

			array[1] = tessa;

			array[2] = getByUuid_PrevAndNext(session, tessa, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tessa getByUuid_PrevAndNext(Session session, Tessa tessa,
		String uuid, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESSA_WHERE);

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else {
			if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(TessaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (uuid != null) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tessa);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Tessa> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds the tessa where uuid = &#63; and groupId = &#63; or throws a {@link org.portlets.tessa.NoSuchTessaException} if it could not be found.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @return the matching tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa findByUUID_G(String uuid, long groupId)
		throws NoSuchTessaException, SystemException {
		Tessa tessa = fetchByUUID_G(uuid, groupId);

		if (tessa == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchTessaException(msg.toString());
		}

		return tessa;
	}

	/**
	 * Finds the tessa where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @return the matching tessa, or <code>null</code> if a matching tessa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Finds the tessa where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @return the matching tessa, or <code>null</code> if a matching tessa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TESSA_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_G_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_G_UUID_2);
				}
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			query.append(TessaModelImpl.ORDER_BY_JPQL);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Tessa> list = q.list();

				result = list;

				Tessa tessa = null;

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					tessa = list.get(0);

					cacheResult(tessa);

					if ((tessa.getUuid() == null) ||
							!tessa.getUuid().equals(uuid) ||
							(tessa.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, tessa);
					}
				}

				return tessa;
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (result == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs);
				}

				closeSession(session);
			}
		}
		else {
			if (result instanceof List<?>) {
				return null;
			}
			else {
				return (Tessa)result;
			}
		}
	}

	/**
	 * Finds all the tessas where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findByGroupId(long groupId) throws SystemException {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the tessas where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of tessas to return
	 * @param end the upper bound of the range of tessas to return (not inclusive)
	 * @return the range of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findByGroupId(long groupId, int start, int end)
		throws SystemException {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the tessas where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param start the lower bound of the range of tessas to return
	 * @param end the upper bound of the range of tessas to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findByGroupId(long groupId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				groupId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Tessa> list = (List<Tessa>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_GROUPID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TESSA_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TessaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				list = (List<Tessa>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_GROUPID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first tessa in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa findByGroupId_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTessaException, SystemException {
		List<Tessa> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTessaException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last tessa in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa findByGroupId_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTessaException, SystemException {
		int count = countByGroupId(groupId);

		List<Tessa> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTessaException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the tessas before and after the current tessa in the ordered set where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tessaId the primary key of the current tessa
	 * @param groupId the group id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa[] findByGroupId_PrevAndNext(long tessaId, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchTessaException, SystemException {
		Tessa tessa = findByPrimaryKey(tessaId);

		Session session = null;

		try {
			session = openSession();

			Tessa[] array = new TessaImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, tessa, groupId,
					orderByComparator, true);

			array[1] = tessa;

			array[2] = getByGroupId_PrevAndNext(session, tessa, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tessa getByGroupId_PrevAndNext(Session session, Tessa tessa,
		long groupId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESSA_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(TessaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tessa);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Tessa> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the tessas where companyId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @return the matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the tessas where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param start the lower bound of the range of tessas to return
	 * @param end the upper bound of the range of tessas to return (not inclusive)
	 * @return the range of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the tessas where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param start the lower bound of the range of tessas to return
	 * @param end the upper bound of the range of tessas to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findByCompanyId(long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Tessa> list = (List<Tessa>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_COMPANYID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TESSA_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TessaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				list = (List<Tessa>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_COMPANYID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_COMPANYID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first tessa in the ordered set where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchTessaException, SystemException {
		List<Tessa> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTessaException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last tessa in the ordered set where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchTessaException, SystemException {
		int count = countByCompanyId(companyId);

		List<Tessa> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTessaException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the tessas before and after the current tessa in the ordered set where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tessaId the primary key of the current tessa
	 * @param companyId the company id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa[] findByCompanyId_PrevAndNext(long tessaId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchTessaException, SystemException {
		Tessa tessa = findByPrimaryKey(tessaId);

		Session session = null;

		try {
			session = openSession();

			Tessa[] array = new TessaImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, tessa, companyId,
					orderByComparator, true);

			array[1] = tessa;

			array[2] = getByCompanyId_PrevAndNext(session, tessa, companyId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tessa getByCompanyId_PrevAndNext(Session session, Tessa tessa,
		long companyId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESSA_WHERE);

		query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(TessaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tessa);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Tessa> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the tessas where tessaText = &#63;.
	 *
	 * @param tessaText the tessa text to search with
	 * @return the matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findBytessaText(String tessaText)
		throws SystemException {
		return findBytessaText(tessaText, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the tessas where tessaText = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tessaText the tessa text to search with
	 * @param start the lower bound of the range of tessas to return
	 * @param end the upper bound of the range of tessas to return (not inclusive)
	 * @return the range of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findBytessaText(String tessaText, int start, int end)
		throws SystemException {
		return findBytessaText(tessaText, start, end, null);
	}

	/**
	 * Finds an ordered range of all the tessas where tessaText = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tessaText the tessa text to search with
	 * @param start the lower bound of the range of tessas to return
	 * @param end the upper bound of the range of tessas to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findBytessaText(String tessaText, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				tessaText,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Tessa> list = (List<Tessa>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_TESSATEXT,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TESSA_WHERE);

			if (tessaText == null) {
				query.append(_FINDER_COLUMN_TESSATEXT_TESSATEXT_1);
			}
			else {
				if (tessaText.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TESSATEXT_TESSATEXT_3);
				}
				else {
					query.append(_FINDER_COLUMN_TESSATEXT_TESSATEXT_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(TessaModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (tessaText != null) {
					qPos.add(tessaText);
				}

				list = (List<Tessa>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_TESSATEXT,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_TESSATEXT,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first tessa in the ordered set where tessaText = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tessaText the tessa text to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa findBytessaText_First(String tessaText,
		OrderByComparator orderByComparator)
		throws NoSuchTessaException, SystemException {
		List<Tessa> list = findBytessaText(tessaText, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("tessaText=");
			msg.append(tessaText);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTessaException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last tessa in the ordered set where tessaText = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tessaText the tessa text to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a matching tessa could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa findBytessaText_Last(String tessaText,
		OrderByComparator orderByComparator)
		throws NoSuchTessaException, SystemException {
		int count = countBytessaText(tessaText);

		List<Tessa> list = findBytessaText(tessaText, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("tessaText=");
			msg.append(tessaText);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchTessaException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the tessas before and after the current tessa in the ordered set where tessaText = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tessaId the primary key of the current tessa
	 * @param tessaText the tessa text to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next tessa
	 * @throws org.portlets.tessa.NoSuchTessaException if a tessa with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Tessa[] findBytessaText_PrevAndNext(long tessaId, String tessaText,
		OrderByComparator orderByComparator)
		throws NoSuchTessaException, SystemException {
		Tessa tessa = findByPrimaryKey(tessaId);

		Session session = null;

		try {
			session = openSession();

			Tessa[] array = new TessaImpl[3];

			array[0] = getBytessaText_PrevAndNext(session, tessa, tessaText,
					orderByComparator, true);

			array[1] = tessa;

			array[2] = getBytessaText_PrevAndNext(session, tessa, tessaText,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Tessa getBytessaText_PrevAndNext(Session session, Tessa tessa,
		String tessaText, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TESSA_WHERE);

		if (tessaText == null) {
			query.append(_FINDER_COLUMN_TESSATEXT_TESSATEXT_1);
		}
		else {
			if (tessaText.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TESSATEXT_TESSATEXT_3);
			}
			else {
				query.append(_FINDER_COLUMN_TESSATEXT_TESSATEXT_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByFields = orderByComparator.getOrderByFields();

			if (orderByFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(TessaModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (tessaText != null) {
			qPos.add(tessaText);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(tessa);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Tessa> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the tessas.
	 *
	 * @return the tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the tessas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of tessas to return
	 * @param end the upper bound of the range of tessas to return (not inclusive)
	 * @return the range of tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the tessas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of tessas to return
	 * @param end the upper bound of the range of tessas to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of tessas
	 * @throws SystemException if a system exception occurred
	 */
	public List<Tessa> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Tessa> list = (List<Tessa>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TESSA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TESSA.concat(TessaModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Tessa>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Tessa>)QueryUtil.list(q, getDialect(), start,
							end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_ALL,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_ALL, finderArgs,
						list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the tessas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUuid(String uuid) throws SystemException {
		for (Tessa tessa : findByUuid(uuid)) {
			remove(tessa);
		}
	}

	/**
	 * Removes the tessa where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUUID_G(String uuid, long groupId)
		throws NoSuchTessaException, SystemException {
		Tessa tessa = findByUUID_G(uuid, groupId);

		remove(tessa);
	}

	/**
	 * Removes all the tessas where groupId = &#63; from the database.
	 *
	 * @param groupId the group id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByGroupId(long groupId) throws SystemException {
		for (Tessa tessa : findByGroupId(groupId)) {
			remove(tessa);
		}
	}

	/**
	 * Removes all the tessas where companyId = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCompanyId(long companyId) throws SystemException {
		for (Tessa tessa : findByCompanyId(companyId)) {
			remove(tessa);
		}
	}

	/**
	 * Removes all the tessas where tessaText = &#63; from the database.
	 *
	 * @param tessaText the tessa text to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBytessaText(String tessaText) throws SystemException {
		for (Tessa tessa : findBytessaText(tessaText)) {
			remove(tessa);
		}
	}

	/**
	 * Removes all the tessas from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Tessa tessa : findAll()) {
			remove(tessa);
		}
	}

	/**
	 * Counts all the tessas where uuid = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @return the number of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUuid(String uuid) throws SystemException {
		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_UUID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESSA_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_UUID_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the tessas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid to search with
	 * @param groupId the group id to search with
	 * @return the number of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_UUID_G,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TESSA_WHERE);

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else {
				if (uuid.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_UUID_G_UUID_3);
				}
				else {
					query.append(_FINDER_COLUMN_UUID_G_UUID_2);
				}
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (uuid != null) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the tessas where groupId = &#63;.
	 *
	 * @param groupId the group id to search with
	 * @return the number of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByGroupId(long groupId) throws SystemException {
		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESSA_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the tessas where companyId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @return the number of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCompanyId(long companyId) throws SystemException {
		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COMPANYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESSA_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COMPANYID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the tessas where tessaText = &#63;.
	 *
	 * @param tessaText the tessa text to search with
	 * @return the number of matching tessas
	 * @throws SystemException if a system exception occurred
	 */
	public int countBytessaText(String tessaText) throws SystemException {
		Object[] finderArgs = new Object[] { tessaText };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TESSATEXT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TESSA_WHERE);

			if (tessaText == null) {
				query.append(_FINDER_COLUMN_TESSATEXT_TESSATEXT_1);
			}
			else {
				if (tessaText.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_TESSATEXT_TESSATEXT_3);
				}
				else {
					query.append(_FINDER_COLUMN_TESSATEXT_TESSATEXT_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (tessaText != null) {
					qPos.add(tessaText);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TESSATEXT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the tessas.
	 *
	 * @return the number of tessas
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Object[] finderArgs = new Object[0];

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TESSA);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the tessa persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.portlets.tessa.model.Tessa")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Tessa>> listenersList = new ArrayList<ModelListener<Tessa>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Tessa>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(TessaImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = TessaPersistence.class)
	protected TessaPersistence tessaPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@BeanReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;
	@BeanReference(type = RatingsStatsPersistence.class)
	protected RatingsStatsPersistence ratingsStatsPersistence;
	private static final String _SQL_SELECT_TESSA = "SELECT tessa FROM Tessa tessa";
	private static final String _SQL_SELECT_TESSA_WHERE = "SELECT tessa FROM Tessa tessa WHERE ";
	private static final String _SQL_COUNT_TESSA = "SELECT COUNT(tessa) FROM Tessa tessa";
	private static final String _SQL_COUNT_TESSA_WHERE = "SELECT COUNT(tessa) FROM Tessa tessa WHERE ";
	private static final String _FINDER_COLUMN_UUID_UUID_1 = "tessa.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "tessa.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(tessa.uuid IS NULL OR tessa.uuid = ?)";
	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "tessa.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "tessa.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(tessa.uuid IS NULL OR tessa.uuid = ?) AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "tessa.groupId = ?";
	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "tessa.groupId = ?";
	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "tessa.companyId = ?";
	private static final String _FINDER_COLUMN_TESSATEXT_TESSATEXT_1 = "tessa.tessaText IS NULL";
	private static final String _FINDER_COLUMN_TESSATEXT_TESSATEXT_2 = "tessa.tessaText = ?";
	private static final String _FINDER_COLUMN_TESSATEXT_TESSATEXT_3 = "(tessa.tessaText IS NULL OR tessa.tessaText = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "tessa.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Tessa exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Tessa exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(TessaPersistenceImpl.class);
}