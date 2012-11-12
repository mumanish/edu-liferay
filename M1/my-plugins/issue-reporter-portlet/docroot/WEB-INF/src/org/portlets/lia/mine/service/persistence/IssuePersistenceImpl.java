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
import org.portlets.lia.mine.model.Issue;
import org.portlets.lia.mine.model.impl.IssueImpl;
import org.portlets.lia.mine.model.impl.IssueModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the issue service.
 *
 * <p>
 * Never modify or reference this class directly. Always use {@link IssueUtil} to access the issue persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vladimir Frolov
 * @see IssuePersistence
 * @see IssueUtil
 * @generated
 */
public class IssuePersistenceImpl extends BasePersistenceImpl<Issue>
	implements IssuePersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = IssueImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_BY_USERID = new FinderPath(IssueModelImpl.ENTITY_CACHE_ENABLED,
			IssueModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByUserId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(IssueModelImpl.ENTITY_CACHE_ENABLED,
			IssueModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByUserId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_BY_COMPANYID = new FinderPath(IssueModelImpl.ENTITY_CACHE_ENABLED,
			IssueModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findByCompanyId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(IssueModelImpl.ENTITY_CACHE_ENABLED,
			IssueModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countByCompanyId", new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(IssueModelImpl.ENTITY_CACHE_ENABLED,
			IssueModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IssueModelImpl.ENTITY_CACHE_ENABLED,
			IssueModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	/**
	 * Caches the issue in the entity cache if it is enabled.
	 *
	 * @param issue the issue to cache
	 */
	public void cacheResult(Issue issue) {
		EntityCacheUtil.putResult(IssueModelImpl.ENTITY_CACHE_ENABLED,
			IssueImpl.class, issue.getPrimaryKey(), issue);
	}

	/**
	 * Caches the issues in the entity cache if it is enabled.
	 *
	 * @param issues the issues to cache
	 */
	public void cacheResult(List<Issue> issues) {
		for (Issue issue : issues) {
			if (EntityCacheUtil.getResult(IssueModelImpl.ENTITY_CACHE_ENABLED,
						IssueImpl.class, issue.getPrimaryKey(), this) == null) {
				cacheResult(issue);
			}
		}
	}

	/**
	 * Clears the cache for all issues.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache() {
		CacheRegistryUtil.clear(IssueImpl.class.getName());
		EntityCacheUtil.clearCache(IssueImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	/**
	 * Clears the cache for the issue.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	public void clearCache(Issue issue) {
		EntityCacheUtil.removeResult(IssueModelImpl.ENTITY_CACHE_ENABLED,
			IssueImpl.class, issue.getPrimaryKey());
	}

	/**
	 * Creates a new issue with the primary key. Does not add the issue to the database.
	 *
	 * @param issueId the primary key for the new issue
	 * @return the new issue
	 */
	public Issue create(long issueId) {
		Issue issue = new IssueImpl();

		issue.setNew(true);
		issue.setPrimaryKey(issueId);

		return issue;
	}

	/**
	 * Removes the issue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the issue to remove
	 * @return the issue that was removed
	 * @throws com.liferay.portal.NoSuchModelException if a issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Issue remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	/**
	 * Removes the issue with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param issueId the primary key of the issue to remove
	 * @return the issue that was removed
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Issue remove(long issueId)
		throws NoSuchIssueException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Issue issue = (Issue)session.get(IssueImpl.class, new Long(issueId));

			if (issue == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + issueId);
				}

				throw new NoSuchIssueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					issueId);
			}

			return remove(issue);
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

	protected Issue removeImpl(Issue issue) throws SystemException {
		issue = toUnwrappedModel(issue);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, issue);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(IssueModelImpl.ENTITY_CACHE_ENABLED,
			IssueImpl.class, issue.getPrimaryKey());

		return issue;
	}

	public Issue updateImpl(org.portlets.lia.mine.model.Issue issue,
		boolean merge) throws SystemException {
		issue = toUnwrappedModel(issue);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, issue, merge);

			issue.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(IssueModelImpl.ENTITY_CACHE_ENABLED,
			IssueImpl.class, issue.getPrimaryKey(), issue);

		return issue;
	}

	protected Issue toUnwrappedModel(Issue issue) {
		if (issue instanceof IssueImpl) {
			return issue;
		}

		IssueImpl issueImpl = new IssueImpl();

		issueImpl.setNew(issue.isNew());
		issueImpl.setPrimaryKey(issue.getPrimaryKey());

		issueImpl.setIssueId(issue.getIssueId());
		issueImpl.setGroupId(issue.getGroupId());
		issueImpl.setCompanyId(issue.getCompanyId());
		issueImpl.setUserId(issue.getUserId());
		issueImpl.setUserName(issue.getUserName());
		issueImpl.setCreateDate(issue.getCreateDate());
		issueImpl.setModifiedDate(issue.getModifiedDate());
		issueImpl.setSummary(issue.getSummary());
		issueImpl.setRequester(issue.getRequester());
		issueImpl.setPriority(issue.getPriority());
		issueImpl.setDescription(issue.getDescription());
		issueImpl.setAssignee(issue.getAssignee());
		issueImpl.setStatusx(issue.getStatusx());
		issueImpl.setStatus(issue.getStatus());
		issueImpl.setStatusByUserId(issue.getStatusByUserId());
		issueImpl.setStatusByUserName(issue.getStatusByUserName());
		issueImpl.setStatusDate(issue.getStatusDate());

		return issueImpl;
	}

	/**
	 * Finds the issue with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue to find
	 * @return the issue
	 * @throws com.liferay.portal.NoSuchModelException if a issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Issue findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the issue with the primary key or throws a {@link org.portlets.lia.mine.NoSuchIssueException} if it could not be found.
	 *
	 * @param issueId the primary key of the issue to find
	 * @return the issue
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Issue findByPrimaryKey(long issueId)
		throws NoSuchIssueException, SystemException {
		Issue issue = fetchByPrimaryKey(issueId);

		if (issue == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + issueId);
			}

			throw new NoSuchIssueException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				issueId);
		}

		return issue;
	}

	/**
	 * Finds the issue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue to find
	 * @return the issue, or <code>null</code> if a issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Issue fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Finds the issue with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param issueId the primary key of the issue to find
	 * @return the issue, or <code>null</code> if a issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Issue fetchByPrimaryKey(long issueId) throws SystemException {
		Issue issue = (Issue)EntityCacheUtil.getResult(IssueModelImpl.ENTITY_CACHE_ENABLED,
				IssueImpl.class, issueId, this);

		if (issue == null) {
			Session session = null;

			try {
				session = openSession();

				issue = (Issue)session.get(IssueImpl.class, new Long(issueId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (issue != null) {
					cacheResult(issue);
				}

				closeSession(session);
			}
		}

		return issue;
	}

	/**
	 * Finds all the issues where userId = &#63;.
	 *
	 * @param userId the user id to search with
	 * @return the matching issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<Issue> findByUserId(long userId) throws SystemException {
		return findByUserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the issues where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param start the lower bound of the range of issues to return
	 * @param end the upper bound of the range of issues to return (not inclusive)
	 * @return the range of matching issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<Issue> findByUserId(long userId, int start, int end)
		throws SystemException {
		return findByUserId(userId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the issues where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param start the lower bound of the range of issues to return
	 * @param end the upper bound of the range of issues to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<Issue> findByUserId(long userId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				userId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Issue> list = (List<Issue>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_USERID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_ISSUE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				list = (List<Issue>)QueryUtil.list(q, getDialect(), start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(FINDER_PATH_FIND_BY_USERID,
						finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(FINDER_PATH_FIND_BY_USERID,
						finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Finds the first issue in the ordered set where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching issue
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a matching issue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Issue findByUserId_First(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchIssueException, SystemException {
		List<Issue> list = findByUserId(userId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssueException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last issue in the ordered set where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param userId the user id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching issue
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a matching issue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Issue findByUserId_Last(long userId,
		OrderByComparator orderByComparator)
		throws NoSuchIssueException, SystemException {
		int count = countByUserId(userId);

		List<Issue> list = findByUserId(userId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("userId=");
			msg.append(userId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssueException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the issues before and after the current issue in the ordered set where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param issueId the primary key of the current issue
	 * @param userId the user id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next issue
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Issue[] findByUserId_PrevAndNext(long issueId, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchIssueException, SystemException {
		Issue issue = findByPrimaryKey(issueId);

		Session session = null;

		try {
			session = openSession();

			Issue[] array = new IssueImpl[3];

			array[0] = getByUserId_PrevAndNext(session, issue, userId,
					orderByComparator, true);

			array[1] = issue;

			array[2] = getByUserId_PrevAndNext(session, issue, userId,
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

	protected Issue getByUserId_PrevAndNext(Session session, Issue issue,
		long userId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUE_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

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

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(issue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Issue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the issues where companyId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @return the matching issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<Issue> findByCompanyId(long companyId)
		throws SystemException {
		return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Finds a range of all the issues where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param start the lower bound of the range of issues to return
	 * @param end the upper bound of the range of issues to return (not inclusive)
	 * @return the range of matching issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<Issue> findByCompanyId(long companyId, int start, int end)
		throws SystemException {
		return findByCompanyId(companyId, start, end, null);
	}

	/**
	 * Finds an ordered range of all the issues where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param start the lower bound of the range of issues to return
	 * @param end the upper bound of the range of issues to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of matching issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<Issue> findByCompanyId(long companyId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				companyId,
				
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Issue> list = (List<Issue>)FinderCacheUtil.getResult(FINDER_PATH_FIND_BY_COMPANYID,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_ISSUE_WHERE);

			query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				list = (List<Issue>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Finds the first issue in the ordered set where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the first matching issue
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a matching issue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Issue findByCompanyId_First(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchIssueException, SystemException {
		List<Issue> list = findByCompanyId(companyId, 0, 1, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssueException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the last issue in the ordered set where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param companyId the company id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the last matching issue
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a matching issue could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Issue findByCompanyId_Last(long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchIssueException, SystemException {
		int count = countByCompanyId(companyId);

		List<Issue> list = findByCompanyId(companyId, count - 1, count,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("companyId=");
			msg.append(companyId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchIssueException(msg.toString());
		}
		else {
			return list.get(0);
		}
	}

	/**
	 * Finds the issues before and after the current issue in the ordered set where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param issueId the primary key of the current issue
	 * @param companyId the company id to search with
	 * @param orderByComparator the comparator to order the set by
	 * @return the previous, current, and next issue
	 * @throws org.portlets.lia.mine.NoSuchIssueException if a issue with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Issue[] findByCompanyId_PrevAndNext(long issueId, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchIssueException, SystemException {
		Issue issue = findByPrimaryKey(issueId);

		Session session = null;

		try {
			session = openSession();

			Issue[] array = new IssueImpl[3];

			array[0] = getByCompanyId_PrevAndNext(session, issue, companyId,
					orderByComparator, true);

			array[1] = issue;

			array[2] = getByCompanyId_PrevAndNext(session, issue, companyId,
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

	protected Issue getByCompanyId_PrevAndNext(Session session, Issue issue,
		long companyId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUE_WHERE);

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

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByValues(issue);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Issue> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Finds all the issues.
	 *
	 * @return the issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<Issue> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Finds a range of all the issues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of issues to return
	 * @param end the upper bound of the range of issues to return (not inclusive)
	 * @return the range of issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<Issue> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Finds an ordered range of all the issues.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of issues to return
	 * @param end the upper bound of the range of issues to return (not inclusive)
	 * @param orderByComparator the comparator to order the results by
	 * @return the ordered range of issues
	 * @throws SystemException if a system exception occurred
	 */
	public List<Issue> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Issue> list = (List<Issue>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ISSUE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISSUE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Issue>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Issue>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the issues where userId = &#63; from the database.
	 *
	 * @param userId the user id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByUserId(long userId) throws SystemException {
		for (Issue issue : findByUserId(userId)) {
			remove(issue);
		}
	}

	/**
	 * Removes all the issues where companyId = &#63; from the database.
	 *
	 * @param companyId the company id to search with
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCompanyId(long companyId) throws SystemException {
		for (Issue issue : findByCompanyId(companyId)) {
			remove(issue);
		}
	}

	/**
	 * Removes all the issues from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Issue issue : findAll()) {
			remove(issue);
		}
	}

	/**
	 * Counts all the issues where userId = &#63;.
	 *
	 * @param userId the user id to search with
	 * @return the number of matching issues
	 * @throws SystemException if a system exception occurred
	 */
	public int countByUserId(long userId) throws SystemException {
		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_USERID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISSUE_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_USERID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Counts all the issues where companyId = &#63;.
	 *
	 * @param companyId the company id to search with
	 * @return the number of matching issues
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCompanyId(long companyId) throws SystemException {
		Object[] finderArgs = new Object[] { companyId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COMPANYID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISSUE_WHERE);

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
	 * Counts all the issues.
	 *
	 * @return the number of issues
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

				Query q = session.createQuery(_SQL_COUNT_ISSUE);

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
	 * Initializes the issue persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.portlets.lia.mine.model.Issue")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Issue>> listenersList = new ArrayList<ModelListener<Issue>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Issue>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(IssueImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST);
	}

	@BeanReference(type = IssuePersistence.class)
	protected IssuePersistence issuePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_ISSUE = "SELECT issue FROM Issue issue";
	private static final String _SQL_SELECT_ISSUE_WHERE = "SELECT issue FROM Issue issue WHERE ";
	private static final String _SQL_COUNT_ISSUE = "SELECT COUNT(issue) FROM Issue issue";
	private static final String _SQL_COUNT_ISSUE_WHERE = "SELECT COUNT(issue) FROM Issue issue WHERE ";
	private static final String _FINDER_COLUMN_USERID_USERID_2 = "issue.userId = ?";
	private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "issue.companyId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "issue.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Issue exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Issue exists with the key {";
	private static Log _log = LogFactoryUtil.getLog(IssuePersistenceImpl.class);
}