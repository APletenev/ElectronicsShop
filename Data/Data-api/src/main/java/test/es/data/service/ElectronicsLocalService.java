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

package test.es.data.service;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

import test.es.data.model.Electronics;

/**
 * Provides the local service interface for Electronics. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Andrey Pletenev
 * @see ElectronicsLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ElectronicsLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>test.es.data.service.impl.ElectronicsLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the electronics local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link ElectronicsLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the electronics to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectronicsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param electronics the electronics
	 * @return the electronics that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Electronics addElectronics(Electronics electronics);

	public Electronics addElectronics(
			long userId, String electronicsName, long electroTypeId,
			long electronicsPrice, int electronicsCount,
			boolean electronicsInStock, boolean electronicsArchive,
			String electronicsDescription, ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Creates a new electronics with the primary key. Does not add the electronics to the database.
	 *
	 * @param electronicsId the primary key for the new electronics
	 * @return the new electronics
	 */
	@Transactional(enabled = false)
	public Electronics createElectronics(long electronicsId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the electronics from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectronicsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param electronics the electronics
	 * @return the electronics that was removed
	 * @throws PortalException
	 */
	@Indexable(type = IndexableType.DELETE)
	public Electronics deleteElectronics(Electronics electronics)
		throws PortalException;

	/**
	 * Deletes the electronics with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectronicsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param electronicsId the primary key of the electronics
	 * @return the electronics that was removed
	 * @throws PortalException if a electronics with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Electronics deleteElectronics(long electronicsId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.es.data.model.impl.ElectronicsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.es.data.model.impl.ElectronicsModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Electronics fetchElectronics(long electronicsId);

	/**
	 * Returns the electronics matching the UUID and group.
	 *
	 * @param uuid the electronics's UUID
	 * @param groupId the primary key of the group
	 * @return the matching electronics, or <code>null</code> if a matching electronics could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Electronics fetchElectronicsByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the electronics with the primary key.
	 *
	 * @param electronicsId the primary key of the electronics
	 * @return the electronics
	 * @throws PortalException if a electronics with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Electronics getElectronics(long electronicsId)
		throws PortalException;

	/**
	 * Returns the electronics matching the UUID and group.
	 *
	 * @param uuid the electronics's UUID
	 * @param groupId the primary key of the group
	 * @return the matching electronics
	 * @throws PortalException if a matching electronics could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Electronics getElectronicsByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getElectronicsCount(long groupId);

	/**
	 * Returns a range of all the electronicses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.es.data.model.impl.ElectronicsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of electronicses
	 * @param end the upper bound of the range of electronicses (not inclusive)
	 * @return the range of electronicses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Electronics> getElectronicses(int start, int end);

	/**
	 * Returns all the electronicses matching the UUID and company.
	 *
	 * @param uuid the UUID of the electronicses
	 * @param companyId the primary key of the company
	 * @return the matching electronicses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Electronics> getElectronicsesByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of electronicses matching the UUID and company.
	 *
	 * @param uuid the UUID of the electronicses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of electronicses
	 * @param end the upper bound of the range of electronicses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching electronicses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Electronics> getElectronicsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Electronics> orderByComparator);

	/**
	 * Returns the number of electronicses.
	 *
	 * @return the number of electronicses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getElectronicsesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Electronics> getElectronicss(long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Electronics> getElectronicss(
		long groupId, int start, int end, OrderByComparator<Electronics> obc);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Electronics> getElectronicss(long groupId, long electroTypeId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the electronics in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectronicsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param electronics the electronics
	 * @return the electronics that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Electronics updateElectronics(Electronics electronics);

	public Electronics updateElectronics(
			long userId, long electronicsId, String electronicsName,
			long electroTypeId, long electronicsPrice, int electronicsCount,
			boolean electronicsInStock, boolean electronicsArchive,
			String electronicsDescription, ServiceContext serviceContext)
		throws PortalException, SystemException;

}