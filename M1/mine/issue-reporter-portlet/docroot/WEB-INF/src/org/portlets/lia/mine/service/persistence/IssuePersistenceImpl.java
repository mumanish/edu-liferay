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
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
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
	private static final String _SQL_COUNT_ISSUE = "SELECT COUNT(issue) FROM Issue issue";
	private static final String _ORDER_BY_ENTITY_ALIAS = "issue.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Issue exists with the primary key ";
	private static Log _log = LogFactoryUtil.getLog(IssuePersistenceImpl.class);
}