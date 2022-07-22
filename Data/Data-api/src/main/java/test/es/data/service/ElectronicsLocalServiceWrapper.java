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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ElectronicsLocalService}.
 *
 * @author Andrey Pletenev
 * @see ElectronicsLocalService
 * @generated
 */
public class ElectronicsLocalServiceWrapper
	implements ElectronicsLocalService,
			   ServiceWrapper<ElectronicsLocalService> {

	public ElectronicsLocalServiceWrapper(
		ElectronicsLocalService electronicsLocalService) {

		_electronicsLocalService = electronicsLocalService;
	}

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
	@Override
	public test.es.data.model.Electronics addElectronics(
		test.es.data.model.Electronics electronics) {

		return _electronicsLocalService.addElectronics(electronics);
	}

	@Override
	public test.es.data.model.Electronics addElectronics(
			long userId, String electronicsName, long electroTypeId,
			long electronicsPrice, int electronicsCount,
			boolean electronicsInStock, boolean electronicsArchive,
			String electronicsDescription,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electronicsLocalService.addElectronics(
			userId, electronicsName, electroTypeId, electronicsPrice,
			electronicsCount, electronicsInStock, electronicsArchive,
			electronicsDescription, serviceContext);
	}

	/**
	 * Creates a new electronics with the primary key. Does not add the electronics to the database.
	 *
	 * @param electronicsId the primary key for the new electronics
	 * @return the new electronics
	 */
	@Override
	public test.es.data.model.Electronics createElectronics(
		long electronicsId) {

		return _electronicsLocalService.createElectronics(electronicsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electronicsLocalService.createPersistedModel(primaryKeyObj);
	}

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
	@Override
	public test.es.data.model.Electronics deleteElectronics(
			test.es.data.model.Electronics electronics)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electronicsLocalService.deleteElectronics(electronics);
	}

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
	@Override
	public test.es.data.model.Electronics deleteElectronics(long electronicsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electronicsLocalService.deleteElectronics(electronicsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electronicsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _electronicsLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _electronicsLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _electronicsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _electronicsLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _electronicsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _electronicsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public test.es.data.model.Electronics fetchElectronics(long electronicsId) {
		return _electronicsLocalService.fetchElectronics(electronicsId);
	}

	/**
	 * Returns the electronics matching the UUID and group.
	 *
	 * @param uuid the electronics's UUID
	 * @param groupId the primary key of the group
	 * @return the matching electronics, or <code>null</code> if a matching electronics could not be found
	 */
	@Override
	public test.es.data.model.Electronics fetchElectronicsByUuidAndGroupId(
		String uuid, long groupId) {

		return _electronicsLocalService.fetchElectronicsByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _electronicsLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the electronics with the primary key.
	 *
	 * @param electronicsId the primary key of the electronics
	 * @return the electronics
	 * @throws PortalException if a electronics with the primary key could not be found
	 */
	@Override
	public test.es.data.model.Electronics getElectronics(long electronicsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electronicsLocalService.getElectronics(electronicsId);
	}

	/**
	 * Returns the electronics matching the UUID and group.
	 *
	 * @param uuid the electronics's UUID
	 * @param groupId the primary key of the group
	 * @return the matching electronics
	 * @throws PortalException if a matching electronics could not be found
	 */
	@Override
	public test.es.data.model.Electronics getElectronicsByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electronicsLocalService.getElectronicsByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public int getElectronicsCount(long groupId) {
		return _electronicsLocalService.getElectronicsCount(groupId);
	}

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
	@Override
	public java.util.List<test.es.data.model.Electronics> getElectronicses(
		int start, int end) {

		return _electronicsLocalService.getElectronicses(start, end);
	}

	/**
	 * Returns all the electronicses matching the UUID and company.
	 *
	 * @param uuid the UUID of the electronicses
	 * @param companyId the primary key of the company
	 * @return the matching electronicses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<test.es.data.model.Electronics>
		getElectronicsesByUuidAndCompanyId(String uuid, long companyId) {

		return _electronicsLocalService.getElectronicsesByUuidAndCompanyId(
			uuid, companyId);
	}

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
	@Override
	public java.util.List<test.es.data.model.Electronics>
		getElectronicsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<test.es.data.model.Electronics> orderByComparator) {

		return _electronicsLocalService.getElectronicsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of electronicses.
	 *
	 * @return the number of electronicses
	 */
	@Override
	public int getElectronicsesCount() {
		return _electronicsLocalService.getElectronicsesCount();
	}

	@Override
	public java.util.List<test.es.data.model.Electronics> getElectronicss(
		long groupId, int start, int end) {

		return _electronicsLocalService.getElectronicss(groupId, start, end);
	}

	@Override
	public java.util.List<test.es.data.model.Electronics> getElectronicss(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<test.es.data.model.Electronics> obc) {

		return _electronicsLocalService.getElectronicss(
			groupId, start, end, obc);
	}

	@Override
	public java.util.List<test.es.data.model.Electronics> getElectronicss(
		long groupId, long electroTypeId) {

		return _electronicsLocalService.getElectronicss(groupId, electroTypeId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _electronicsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _electronicsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _electronicsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electronicsLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public test.es.data.model.Electronics updateElectronics(
		test.es.data.model.Electronics electronics) {

		return _electronicsLocalService.updateElectronics(electronics);
	}

	@Override
	public test.es.data.model.Electronics updateElectronics(
			long userId, long electronicsId, String electronicsName,
			long electroTypeId, long electronicsPrice, int electronicsCount,
			boolean electronicsInStock, boolean electronicsArchive,
			String electronicsDescription,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _electronicsLocalService.updateElectronics(
			userId, electronicsId, electronicsName, electroTypeId,
			electronicsPrice, electronicsCount, electronicsInStock,
			electronicsArchive, electronicsDescription, serviceContext);
	}

	@Override
	public ElectronicsLocalService getWrappedService() {
		return _electronicsLocalService;
	}

	@Override
	public void setWrappedService(
		ElectronicsLocalService electronicsLocalService) {

		_electronicsLocalService = electronicsLocalService;
	}

	private ElectronicsLocalService _electronicsLocalService;

}