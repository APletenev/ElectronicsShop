/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package test.es.data.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import test.es.data.exception.NoSuchElectronicsException;
import test.es.data.model.Electronics;
import test.es.data.model.impl.ElectronicsImpl;
import test.es.data.model.impl.ElectronicsModelImpl;
import test.es.data.service.persistence.ElectronicsPersistence;
import test.es.data.service.persistence.ElectronicsUtil;
import test.es.data.service.persistence.impl.constants.ESPersistenceConstants;

/**
 * The persistence implementation for the electronics service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Andrey Pletenev
 * @generated
 */
@Component(service = ElectronicsPersistence.class)
public class ElectronicsPersistenceImpl
	extends BasePersistenceImpl<Electronics> implements ElectronicsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ElectronicsUtil</code> to access the electronics persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ElectronicsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByGroupId;
	private FinderPath _finderPathWithoutPaginationFindByGroupId;
	private FinderPath _finderPathCountByGroupId;

	/**
	 * Returns all the electronicses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching electronicses
	 */
	@Override
	public List<Electronics> findByGroupId(long groupId) {
		return findByGroupId(
			groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the electronicses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ElectronicsModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of electronicses
	 * @param end the upper bound of the range of electronicses (not inclusive)
	 * @return the range of matching electronicses
	 */
	@Override
	public List<Electronics> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the electronicses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ElectronicsModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of electronicses
	 * @param end the upper bound of the range of electronicses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching electronicses
	 */
	@Override
	public List<Electronics> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Electronics> orderByComparator) {

		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the electronicses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ElectronicsModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of electronicses
	 * @param end the upper bound of the range of electronicses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching electronicses
	 */
	@Override
	public List<Electronics> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Electronics> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByGroupId;
				finderArgs = new Object[] {groupId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByGroupId;
			finderArgs = new Object[] {groupId, start, end, orderByComparator};
		}

		List<Electronics> list = null;

		if (useFinderCache) {
			list = (List<Electronics>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Electronics electronics : list) {
					if (groupId != electronics.getGroupId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_ELECTRONICS_WHERE);

			sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ElectronicsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				list = (List<Electronics>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first electronics in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching electronics
	 * @throws NoSuchElectronicsException if a matching electronics could not be found
	 */
	@Override
	public Electronics findByGroupId_First(
			long groupId, OrderByComparator<Electronics> orderByComparator)
		throws NoSuchElectronicsException {

		Electronics electronics = fetchByGroupId_First(
			groupId, orderByComparator);

		if (electronics != null) {
			return electronics;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append("}");

		throw new NoSuchElectronicsException(sb.toString());
	}

	/**
	 * Returns the first electronics in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching electronics, or <code>null</code> if a matching electronics could not be found
	 */
	@Override
	public Electronics fetchByGroupId_First(
		long groupId, OrderByComparator<Electronics> orderByComparator) {

		List<Electronics> list = findByGroupId(
			groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last electronics in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching electronics
	 * @throws NoSuchElectronicsException if a matching electronics could not be found
	 */
	@Override
	public Electronics findByGroupId_Last(
			long groupId, OrderByComparator<Electronics> orderByComparator)
		throws NoSuchElectronicsException {

		Electronics electronics = fetchByGroupId_Last(
			groupId, orderByComparator);

		if (electronics != null) {
			return electronics;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("groupId=");
		sb.append(groupId);

		sb.append("}");

		throw new NoSuchElectronicsException(sb.toString());
	}

	/**
	 * Returns the last electronics in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching electronics, or <code>null</code> if a matching electronics could not be found
	 */
	@Override
	public Electronics fetchByGroupId_Last(
		long groupId, OrderByComparator<Electronics> orderByComparator) {

		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<Electronics> list = findByGroupId(
			groupId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the electronicses before and after the current electronics in the ordered set where groupId = &#63;.
	 *
	 * @param electronicsId the primary key of the current electronics
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next electronics
	 * @throws NoSuchElectronicsException if a electronics with the primary key could not be found
	 */
	@Override
	public Electronics[] findByGroupId_PrevAndNext(
			long electronicsId, long groupId,
			OrderByComparator<Electronics> orderByComparator)
		throws NoSuchElectronicsException {

		Electronics electronics = findByPrimaryKey(electronicsId);

		Session session = null;

		try {
			session = openSession();

			Electronics[] array = new ElectronicsImpl[3];

			array[0] = getByGroupId_PrevAndNext(
				session, electronics, groupId, orderByComparator, true);

			array[1] = electronics;

			array[2] = getByGroupId_PrevAndNext(
				session, electronics, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Electronics getByGroupId_PrevAndNext(
		Session session, Electronics electronics, long groupId,
		OrderByComparator<Electronics> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ELECTRONICS_WHERE);

		sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ElectronicsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(groupId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(electronics)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Electronics> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the electronicses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (Electronics electronics :
				findByGroupId(
					groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(electronics);
		}
	}

	/**
	 * Returns the number of electronicses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching electronicses
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = _finderPathCountByGroupId;

		Object[] finderArgs = new Object[] {groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ELECTRONICS_WHERE);

			sb.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 =
		"electronics.groupId = ?";

	public ElectronicsPersistenceImpl() {
		setModelClass(Electronics.class);

		setModelImplClass(ElectronicsImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the electronics in the entity cache if it is enabled.
	 *
	 * @param electronics the electronics
	 */
	@Override
	public void cacheResult(Electronics electronics) {
		entityCache.putResult(
			ElectronicsImpl.class, electronics.getPrimaryKey(), electronics);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the electronicses in the entity cache if it is enabled.
	 *
	 * @param electronicses the electronicses
	 */
	@Override
	public void cacheResult(List<Electronics> electronicses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (electronicses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Electronics electronics : electronicses) {
			if (entityCache.getResult(
					ElectronicsImpl.class, electronics.getPrimaryKey()) ==
						null) {

				cacheResult(electronics);
			}
		}
	}

	/**
	 * Clears the cache for all electronicses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ElectronicsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the electronics.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Electronics electronics) {
		entityCache.removeResult(ElectronicsImpl.class, electronics);
	}

	@Override
	public void clearCache(List<Electronics> electronicses) {
		for (Electronics electronics : electronicses) {
			entityCache.removeResult(ElectronicsImpl.class, electronics);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ElectronicsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new electronics with the primary key. Does not add the electronics to the database.
	 *
	 * @param electronicsId the primary key for the new electronics
	 * @return the new electronics
	 */
	@Override
	public Electronics create(long electronicsId) {
		Electronics electronics = new ElectronicsImpl();

		electronics.setNew(true);
		electronics.setPrimaryKey(electronicsId);

		electronics.setCompanyId(CompanyThreadLocal.getCompanyId());

		return electronics;
	}

	/**
	 * Removes the electronics with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param electronicsId the primary key of the electronics
	 * @return the electronics that was removed
	 * @throws NoSuchElectronicsException if a electronics with the primary key could not be found
	 */
	@Override
	public Electronics remove(long electronicsId)
		throws NoSuchElectronicsException {

		return remove((Serializable)electronicsId);
	}

	/**
	 * Removes the electronics with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the electronics
	 * @return the electronics that was removed
	 * @throws NoSuchElectronicsException if a electronics with the primary key could not be found
	 */
	@Override
	public Electronics remove(Serializable primaryKey)
		throws NoSuchElectronicsException {

		Session session = null;

		try {
			session = openSession();

			Electronics electronics = (Electronics)session.get(
				ElectronicsImpl.class, primaryKey);

			if (electronics == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchElectronicsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(electronics);
		}
		catch (NoSuchElectronicsException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Electronics removeImpl(Electronics electronics) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(electronics)) {
				electronics = (Electronics)session.get(
					ElectronicsImpl.class, electronics.getPrimaryKeyObj());
			}

			if (electronics != null) {
				session.delete(electronics);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (electronics != null) {
			clearCache(electronics);
		}

		return electronics;
	}

	@Override
	public Electronics updateImpl(Electronics electronics) {
		boolean isNew = electronics.isNew();

		if (!(electronics instanceof ElectronicsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(electronics.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(electronics);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in electronics proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Electronics implementation " +
					electronics.getClass());
		}

		ElectronicsModelImpl electronicsModelImpl =
			(ElectronicsModelImpl)electronics;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (electronics.getCreateDate() == null)) {
			if (serviceContext == null) {
				electronics.setCreateDate(date);
			}
			else {
				electronics.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!electronicsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				electronics.setModifiedDate(date);
			}
			else {
				electronics.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(electronics);
			}
			else {
				electronics = (Electronics)session.merge(electronics);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ElectronicsImpl.class, electronicsModelImpl, false, true);

		if (isNew) {
			electronics.setNew(false);
		}

		electronics.resetOriginalValues();

		return electronics;
	}

	/**
	 * Returns the electronics with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the electronics
	 * @return the electronics
	 * @throws NoSuchElectronicsException if a electronics with the primary key could not be found
	 */
	@Override
	public Electronics findByPrimaryKey(Serializable primaryKey)
		throws NoSuchElectronicsException {

		Electronics electronics = fetchByPrimaryKey(primaryKey);

		if (electronics == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchElectronicsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return electronics;
	}

	/**
	 * Returns the electronics with the primary key or throws a <code>NoSuchElectronicsException</code> if it could not be found.
	 *
	 * @param electronicsId the primary key of the electronics
	 * @return the electronics
	 * @throws NoSuchElectronicsException if a electronics with the primary key could not be found
	 */
	@Override
	public Electronics findByPrimaryKey(long electronicsId)
		throws NoSuchElectronicsException {

		return findByPrimaryKey((Serializable)electronicsId);
	}

	/**
	 * Returns the electronics with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param electronicsId the primary key of the electronics
	 * @return the electronics, or <code>null</code> if a electronics with the primary key could not be found
	 */
	@Override
	public Electronics fetchByPrimaryKey(long electronicsId) {
		return fetchByPrimaryKey((Serializable)electronicsId);
	}

	/**
	 * Returns all the electronicses.
	 *
	 * @return the electronicses
	 */
	@Override
	public List<Electronics> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the electronicses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ElectronicsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of electronicses
	 * @param end the upper bound of the range of electronicses (not inclusive)
	 * @return the range of electronicses
	 */
	@Override
	public List<Electronics> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the electronicses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ElectronicsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of electronicses
	 * @param end the upper bound of the range of electronicses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of electronicses
	 */
	@Override
	public List<Electronics> findAll(
		int start, int end, OrderByComparator<Electronics> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the electronicses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ElectronicsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of electronicses
	 * @param end the upper bound of the range of electronicses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of electronicses
	 */
	@Override
	public List<Electronics> findAll(
		int start, int end, OrderByComparator<Electronics> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Electronics> list = null;

		if (useFinderCache) {
			list = (List<Electronics>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ELECTRONICS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ELECTRONICS;

				sql = sql.concat(ElectronicsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Electronics>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the electronicses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Electronics electronics : findAll()) {
			remove(electronics);
		}
	}

	/**
	 * Returns the number of electronicses.
	 *
	 * @return the number of electronicses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ELECTRONICS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "electronicsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ELECTRONICS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ElectronicsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the electronics persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new ElectronicsModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Electronics.class.getName()));

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByGroupId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"groupId"}, true);

		_finderPathWithoutPaginationFindByGroupId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] {Long.class.getName()}, new String[] {"groupId"},
			true);

		_finderPathCountByGroupId = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] {Long.class.getName()}, new String[] {"groupId"},
			false);

		_setElectronicsUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setElectronicsUtilPersistence(null);

		entityCache.removeCache(ElectronicsImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	private void _setElectronicsUtilPersistence(
		ElectronicsPersistence electronicsPersistence) {

		try {
			Field field = ElectronicsUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, electronicsPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = ESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = ESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ELECTRONICS =
		"SELECT electronics FROM Electronics electronics";

	private static final String _SQL_SELECT_ELECTRONICS_WHERE =
		"SELECT electronics FROM Electronics electronics WHERE ";

	private static final String _SQL_COUNT_ELECTRONICS =
		"SELECT COUNT(electronics) FROM Electronics electronics";

	private static final String _SQL_COUNT_ELECTRONICS_WHERE =
		"SELECT COUNT(electronics) FROM Electronics electronics WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "electronics.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Electronics exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Electronics exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ElectronicsPersistenceImpl.class);

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class ElectronicsModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return new Object[0];
				}

				return null;
			}

			ElectronicsModelImpl electronicsModelImpl =
				(ElectronicsModelImpl)baseModel;

			long columnBitmask = electronicsModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(electronicsModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						electronicsModelImpl.getColumnBitmask(columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(ElectronicsPersistenceImpl.
						FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
							finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(electronicsModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			ElectronicsModelImpl electronicsModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = electronicsModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = electronicsModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

		private static final long _ORDER_BY_COLUMNS_BITMASK;

		static {
			long orderByColumnsBitmask = 0;

			orderByColumnsBitmask |= ElectronicsModelImpl.getColumnBitmask(
				"electronicsName");

			_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
		}

	}

}