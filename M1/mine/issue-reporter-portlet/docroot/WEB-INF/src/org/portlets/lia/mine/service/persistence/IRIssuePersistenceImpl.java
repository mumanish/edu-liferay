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

package org.portlets.lia.mine.service.persistence;

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
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.portlets.lia.mine.NoSuchIssueException;
import org.portlets.lia.mine.model.IRIssue;
import org.portlets.lia.mine.model.impl.IRIssueImpl;
import org.portlets.lia.mine.model.impl.IRIssueModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the i r issue service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link IRIssueUtil} to access the i r issue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vladimir Frolov
 * @see IRIssuePersistence
 * @see IRIssueUtil
 * @generated
 */
public class IRIssuePersistenceImpl extends BasePersistenceImpl<IRIssue>
	implements IRIssuePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = IRIssueImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_S_R = new FinderPath(IRIssueModelImpl.ENTITY_CACHE_ENABLED,
			IRIssueModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByS_R",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_S_R = new FinderPath(IRIssueModelImpl.ENTITY_CACHE_ENABLED,
			IRIssueModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByS_R",
			new String[] { String.class.getName(), String.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(IRIssueModelImpl.ENTITY_CACHE_ENABLED,
			IRIssueModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IRIssueModelImpl.ENTITY_CACHE_ENABLED,
			IRIssueModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the i r issue in the entity cache if it is enabled.
	 *
	 * @param irIssue the i r issue to cache
	 */
	public void cacheResult(IRIssue irIssue) {
		EntityCacheUtil.putResult(IRIssueModelImpl.ENTITY_CACHE_ENABLED,
			IRIssueImpl.class, irIssue.getPrimaryKey(), irIssue);
	}

	/**
	 * Caches the i r issues in the entity cache if it is enabled.
	 *
	 * @param irIssues the i r issues to cache
	 */
	public void cacheResult(List<IRIssue> irIssues) {
		for (IRIssue irIssue : irIssues) {
			if (EntityCacheUtil.getResult(
						IRIssueModelImpl.ENTITY_CACHE_ENABLED,
						IRIssueImpl.class, irIssue.getPrimaryKey(), this) == null) {
				cacheResult(irIssue);
			}
		}
	}

	/**
	 * Clears the cache for all i r issues.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(IRIssueImpl.class.getName());
		EntityCacheUtil.clearCache(IRIssueImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the i r issue.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(IRIssue irIssue) {
		EntityCacheUtil.removeResult(IRIssueModelImpl.ENTITY_CACHE_ENABLED,
			IRIssueImpl.class, irIssue.getPrimaryKey());
	}

	/**
	 * Creates a new i r issue with the primary key. Does not add the i r issue to the database.
	 *
	 * @param issueId the primary key for the new i r issue
	 * @return the new i r issue
	 */
	public IRIssue create(long issueId) {
		IRIssue irIssue = new IRIssueImpl();

		irIssue.setNew(true);
		irIssue.setPrimaryKey(issueId);

		return irIssue;
	}

	/**
	 * Removes the i r issue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the i r issue to remove
	 * @return the i r issue that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a i r issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IRIssue remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the i r issue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param issueId the primary key of the i r issue to remove
	 * @return the i r issue that was removed
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a i r issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IRIssue remove(long issueId)
		throws NoSuchIssueException, SystemException {
		Session session = null;

		try {
			session = openSession();

			IRIssue irIssue = (IRIssue)session.get(IRIssueImpl.class,
					new Long(issueId));

			if (irIssue == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + issueId);
				}

				throw new NoSuchIssueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					issueId);
			}

			return remove(irIssue);
		}
		catch (NoSuchIssueException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IRIssue removeImpl(IRIssue irIssue) throws SystemException {
		irIssue = toUnwrappedModel(irIssue);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, irIssue);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(IRIssueModelImpl.ENTITY_CACHE_ENABLED,
			IRIssueImpl.class, irIssue.getPrimaryKey());

		return irIssue;
	}

	public IRIssue updateImpl(org.portlets.lia.mine.model.IRIssue irIssue,
		boolean merge) throws SystemException {
		irIssue = toUnwrappedModel(irIssue);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, irIssue, merge);

			irIssue.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(IRIssueModelImpl.ENTITY_CACHE_ENABLED,
			IRIssueImpl.class, irIssue.getPrimaryKey(), irIssue);

		return irIssue;
	}

	protected IRIssue toUnwrappedModel(IRIssue irIssue) {
		if (irIssue instanceof IRIssueImpl) {
			return irIssue;
		}

		IRIssueImpl irIssueImpl = new IRIssueImpl();

		irIssueImpl.setNew(irIssue.isNew());
		irIssueImpl.setPrimaryKey(irIssue.getPrimaryKey());

		irIssueImpl.setIssueId(irIssue.getIssueId());
		irIssueImpl.setSummary(irIssue.getSummary());
		irIssueImpl.setRequester(irIssue.getRequester());
		irIssueImpl.setPriority(irIssue.getPriority());

		return irIssueImpl;
	}

	/**
	 * Finds the i r issue with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the i r issue to find
	 * @return the i r issue
	 * @throws com.liferay.portal.NoSuchModelException if a i r issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IRIssue findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the i r issue with the primary key or throws a {@link org.portlets.lia.mine.NoSuchIssueException} if it could not be found.
	 *
	 * @param issueId the primary key of the i r issue to find
	 * @return the i r issue
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a i r issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IRIssue findByPrimaryKey(long issueId)
		throws NoSuchIssueException, SystemException {
		IRIssue irIssue = fetchByPrimaryKey(issueId);

		if (irIssue == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + issueId);
			}

			throw new NoSuchIssueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				issueId);
		}

		return irIssue;
	}

	/**
	 * Finds the i r issue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the i r issue to find
	 * @return the i r issue, or <code>null</code> if a i r issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IRIssue fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the i r issue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param issueId the primary key of the i r issue to find
	 * @return the i r issue, or <code>null</code> if a i r issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IRIssue fetchByPrimaryKey(long issueId) throws SystemException {
		IRIssue irIssue = (IRIssue)EntityCacheUtil.getResult(IRIssueModelImpl.ENTITY_CACHE_ENABLED,
				IRIssueImpl.class, issueId, this);

		if (irIssue == null) {
			Session session = null;

			try {
				session = openSession();

				irIssue = (IRIssue)session.get(IRIssueImpl.class,
						new Long(issueId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (irIssue != null) {
					cacheResult(irIssue);
				}

				closeSession(session);
			}
		}

		return irIssue;
	}

	/**
	 * Finds all the i r issues where summary = &#63; and requester = &#63;.
	 *
	 * @param summary the summary to search with
	 * @param requester the requester to search with
	 * @return the matching i r issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<IRIssue> findByS_R(String summary, String requester)
		throws SystemException {
		return findByS_R(summary, requester, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the i r issues where summary = &#63; and requester = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param summary the summary to search with
	 * @param requester the requester to search with
	 * @param start the lower bound of the range of i r issues to return
	 * @param end the upper bound of the range of i r issues to return (not inclusive)
	 * @return the range of matching i r issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<IRIssue> findByS_R(String summary, String requester, int start,
		int end) throws SystemException {
		return findByS_R(summary, requester, start, end, null);
	}

	/**
	 * Finds an ordered range of all the i r issues where summary = &#63; and requester = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param summary the summary to search with
	 * @param requester the requester to search with
	 * @param start the lower bound of the range of i r issues to return
	 * @param end the upper bound of the range of i r issues to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching i r issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<IRIssue> findByS_R(String summary, String requester, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				summary, requester,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<IRIssue> list = (List<IRIssue>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_S_R,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_IRISSUE_WHERE);

			if (summary == null) {
				query.append(_FINDER_COLUMN_S_R_SUMMARY_1);
			}
			else {
				if (summary.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_S_R_SUMMARY_3);
				}
				else {
					query.append(_FINDER_COLUMN_S_R_SUMMARY_2);
				}
			}

			if (requester == null) {
				query.append(_FINDER_COLUMN_S_R_REQUESTER_1);
			}
			else {
				if (requester.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_S_R_REQUESTER_3);
				}
				else {
					query.append(_FINDER_COLUMN_S_R_REQUESTER_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(IRIssueModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (summary != null) {
					qPos.add(summary);
				}

				if (requester != null) {
					qPos.add(requester);
				}

				list = (List<IRIssue>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_S_R,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_S_R,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first i r issue in the ordered set where summary = &#63; and requester = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param summary the summary to search with
	 * @param requester the requester to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching i r issue
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a matching i r issue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IRIssue findByS_R_First(String summary, String requester,
		OrderByComparator orderByComparator)
		throws NoSuchIssueException, SystemException {
		List<IRIssue> list = findByS_R(summary, requester, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("summary=");
			msg.append(summary);

			msg.append(", requester=");
			msg.append(requester);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssueException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last i r issue in the ordered set where summary = &#63; and requester = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param summary the summary to search with
	 * @param requester the requester to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching i r issue
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a matching i r issue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IRIssue findByS_R_Last(String summary, String requester,
		OrderByComparator orderByComparator)
		throws NoSuchIssueException, SystemException {
		int count = countByS_R(summary, requester);

		List<IRIssue> list = findByS_R(summary, requester, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("summary=");
			msg.append(summary);

			msg.append(", requester=");
			msg.append(requester);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssueException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the i r issues before and after the current i r issue in the ordered set where summary = &#63; and requester = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param issueId the primary key of the current i r issue
	 * @param summary the summary to search with
	 * @param requester the requester to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next i r issue
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a i r issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public IRIssue[] findByS_R_PrevAndNext(long issueId, String summary,
		String requester, OrderByComparator orderByComparator)
		throws NoSuchIssueException, SystemException {
		IRIssue irIssue = findByPrimaryKey(issueId);

		Session session = null;

		try {
			session = openSession();

			IRIssue[] array = new IRIssueImpl[3];

			array[0] = getByS_R_PrevAndNext(session, irIssue, summary,
					requester, orderByComparator, true);

			array[1] = irIssue;

			array[2] = getByS_R_PrevAndNext(session, irIssue, summary,
					requester, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IRIssue getByS_R_PrevAndNext(Session session, IRIssue irIssue,
		String summary, String requester, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_IRISSUE_WHERE);

		if (summary == null) {
			query.append(_FINDER_COLUMN_S_R_SUMMARY_1);
		}
		else {
			if (summary.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_S_R_SUMMARY_3);
			}
			else {
				query.append(_FINDER_COLUMN_S_R_SUMMARY_2);
			}
		}

		if (requester == null) {
			query.append(_FINDER_COLUMN_S_R_REQUESTER_1);
		}
		else {
			if (requester.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_S_R_REQUESTER_3);
			}
			else {
				query.append(_FINDER_COLUMN_S_R_REQUESTER_2);
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
			query.append(IRIssueModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (summary != null) {
			qPos.add(summary);
		}

		if (requester != null) {
			qPos.add(requester);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(irIssue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IRIssue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the i r issues.
	 *
	 * @return the i r issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<IRIssue> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the i r issues.
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
	public List<IRIssue> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the i r issues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of i r issues to return
	 * @param end the upper bound of the range of i r issues to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of i r issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<IRIssue> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<IRIssue> list = (List<IRIssue>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_IRISSUE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_IRISSUE.concat(IRIssueModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<IRIssue>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<IRIssue>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the i r issues where summary = &#63; and requester = &#63; from the database.
	 *
	 * @param summary the summary to search with
	 * @param requester the requester to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByS_R(String summary, String requester)
		throws SystemException {
		for (IRIssue irIssue : findByS_R(summary, requester)) {
			remove(irIssue);
		}
	}

	/**
	 * Removes all the i r issues from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (IRIssue irIssue : findAll()) {
			remove(irIssue);
		}
	}

	/**
	 * Counts all the i r issues where summary = &#63; and requester = &#63;.
	 *
	 * @param summary the summary to search with
	 * @param requester the requester to search with
	 * @return the number of matching i r issues
	 * @throws SystemException if a system exception occurred
	 */
	public int countByS_R(String summary, String requester)
		throws SystemException {
		Object[] finderArgs = new Object[] { summary, requester };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_S_R,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_IRISSUE_WHERE);

			if (summary == null) {
				query.append(_FINDER_COLUMN_S_R_SUMMARY_1);
			}
			else {
				if (summary.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_S_R_SUMMARY_3);
				}
				else {
					query.append(_FINDER_COLUMN_S_R_SUMMARY_2);
				}
			}

			if (requester == null) {
				query.append(_FINDER_COLUMN_S_R_REQUESTER_1);
			}
			else {
				if (requester.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_S_R_REQUESTER_3);
				}
				else {
					query.append(_FINDER_COLUMN_S_R_REQUESTER_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (summary != null) {
					qPos.add(summary);
				}

				if (requester != null) {
					qPos.add(requester);
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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_S_R, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the i r issues.
	 *
	 * @return the number of i r issues
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

				Query q = session.createQuery(_SQL_COUNT_IRISSUE);

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
	 * Initializes the i r issue persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.portlets.lia.mine.model.IRIssue")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<IRIssue>> listenersList = new ArrayList<ModelListener<IRIssue>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<IRIssue>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(IRIssueImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = IRIssuePersistence.class)
	protected IRIssuePersistence irIssuePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_IRISSUE = "SELECT irIssue FROM IRIssue irIssue";
	private static final String _SQL_SELECT_IRISSUE_WHERE = "SELECT irIssue FROM IRIssue irIssue WHERE ";
	private static final String _SQL_COUNT_IRISSUE = "SELECT COUNT(irIssue) FROM IRIssue irIssue";
	private static final String _SQL_COUNT_IRISSUE_WHERE = "SELECT COUNT(irIssue) FROM IRIssue irIssue WHERE ";
	private static final String _FINDER_COLUMN_S_R_SUMMARY_1 = "irIssue.summary IS NULL AND ";
	private static final String _FINDER_COLUMN_S_R_SUMMARY_2 = "irIssue.summary = ? AND ";
	private static final String _FINDER_COLUMN_S_R_SUMMARY_3 = "(irIssue.summary IS NULL OR irIssue.summary = ?) AND ";
	private static final String _FINDER_COLUMN_S_R_REQUESTER_1 = "irIssue.requester IS NULL";
	private static final String _FINDER_COLUMN_S_R_REQUESTER_2 = "irIssue.requester = ?";
	private static final String _FINDER_COLUMN_S_R_REQUESTER_3 = "(irIssue.requester IS NULL OR irIssue.requester = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "irIssue.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IRIssue exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No IRIssue exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(IRIssuePersistenceImpl.class);
}