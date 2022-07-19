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
 * Provides a wrapper for {@link ElectroTypeLocalService}.
 *
 * @author Andrey Pletenev
 * @see ElectroTypeLocalService
 * @generated
 */
public class ElectroTypeLocalServiceWrapper
	implements ElectroTypeLocalService,
			   ServiceWrapper<ElectroTypeLocalService> {

	public ElectroTypeLocalServiceWrapper(
		ElectroTypeLocalService electroTypeLocalService) {

		_electroTypeLocalService = electroTypeLocalService;
	}

	/**
	 * Adds the electro type to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectroTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param electroType the electro type
	 * @return the electro type that was added
	 */
	@Override
	public test.es.data.model.ElectroType addElectroType(
		test.es.data.model.ElectroType electroType) {

		return _electroTypeLocalService.addElectroType(electroType);
	}

	@Override
	public test.es.data.model.ElectroType addElectroType(
			long userId, String electroTypeName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electroTypeLocalService.addElectroType(
			userId, electroTypeName, serviceContext);
	}

	/**
	 * Creates a new electro type with the primary key. Does not add the electro type to the database.
	 *
	 * @param electroTypeId the primary key for the new electro type
	 * @return the new electro type
	 */
	@Override
	public test.es.data.model.ElectroType createElectroType(
		long electroTypeId) {

		return _electroTypeLocalService.createElectroType(electroTypeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electroTypeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the electro type from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectroTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param electroType the electro type
	 * @return the electro type that was removed
	 * @throws PortalException
	 */
	@Override
	public test.es.data.model.ElectroType deleteElectroType(
			test.es.data.model.ElectroType electroType)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electroTypeLocalService.deleteElectroType(electroType);
	}

	/**
	 * Deletes the electro type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectroTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param electroTypeId the primary key of the electro type
	 * @return the electro type that was removed
	 * @throws PortalException if a electro type with the primary key could not be found
	 */
	@Override
	public test.es.data.model.ElectroType deleteElectroType(long electroTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electroTypeLocalService.deleteElectroType(electroTypeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electroTypeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _electroTypeLocalService.dynamicQuery();
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

		return _electroTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.es.data.model.impl.ElectroTypeModelImpl</code>.
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

		return _electroTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.es.data.model.impl.ElectroTypeModelImpl</code>.
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

		return _electroTypeLocalService.dynamicQuery(
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

		return _electroTypeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _electroTypeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public test.es.data.model.ElectroType fetchElectroType(long electroTypeId) {
		return _electroTypeLocalService.fetchElectroType(electroTypeId);
	}

	/**
	 * Returns the electro type matching the UUID and group.
	 *
	 * @param uuid the electro type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching electro type, or <code>null</code> if a matching electro type could not be found
	 */
	@Override
	public test.es.data.model.ElectroType fetchElectroTypeByUuidAndGroupId(
		String uuid, long groupId) {

		return _electroTypeLocalService.fetchElectroTypeByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _electroTypeLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the electro type with the primary key.
	 *
	 * @param electroTypeId the primary key of the electro type
	 * @return the electro type
	 * @throws PortalException if a electro type with the primary key could not be found
	 */
	@Override
	public test.es.data.model.ElectroType getElectroType(long electroTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electroTypeLocalService.getElectroType(electroTypeId);
	}

	/**
	 * Returns the electro type matching the UUID and group.
	 *
	 * @param uuid the electro type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching electro type
	 * @throws PortalException if a matching electro type could not be found
	 */
	@Override
	public test.es.data.model.ElectroType getElectroTypeByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electroTypeLocalService.getElectroTypeByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public int getElectroTypeCount(long groupId) {
		return _electroTypeLocalService.getElectroTypeCount(groupId);
	}

	/**
	 * Returns a range of all the electro types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.es.data.model.impl.ElectroTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of electro types
	 * @param end the upper bound of the range of electro types (not inclusive)
	 * @return the range of electro types
	 */
	@Override
	public java.util.List<test.es.data.model.ElectroType> getElectroTypes(
		int start, int end) {

		return _electroTypeLocalService.getElectroTypes(start, end);
	}

	@Override
	public java.util.List<test.es.data.model.ElectroType> getElectroTypes(
		long groupId) {

		return _electroTypeLocalService.getElectroTypes(groupId);
	}

	@Override
	public java.util.List<test.es.data.model.ElectroType> getElectroTypes(
		long groupId, int start, int end) {

		return _electroTypeLocalService.getElectroTypes(groupId, start, end);
	}

	@Override
	public java.util.List<test.es.data.model.ElectroType> getElectroTypes(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<test.es.data.model.ElectroType> obc) {

		return _electroTypeLocalService.getElectroTypes(
			groupId, start, end, obc);
	}

	/**
	 * Returns all the electro types matching the UUID and company.
	 *
	 * @param uuid the UUID of the electro types
	 * @param companyId the primary key of the company
	 * @return the matching electro types, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<test.es.data.model.ElectroType>
		getElectroTypesByUuidAndCompanyId(String uuid, long companyId) {

		return _electroTypeLocalService.getElectroTypesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of electro types matching the UUID and company.
	 *
	 * @param uuid the UUID of the electro types
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of electro types
	 * @param end the upper bound of the range of electro types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching electro types, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<test.es.data.model.ElectroType>
		getElectroTypesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<test.es.data.model.ElectroType> orderByComparator) {

		return _electroTypeLocalService.getElectroTypesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of electro types.
	 *
	 * @return the number of electro types
	 */
	@Override
	public int getElectroTypesCount() {
		return _electroTypeLocalService.getElectroTypesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _electroTypeLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _electroTypeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _electroTypeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _electroTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the electro type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectroTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param electroType the electro type
	 * @return the electro type that was updated
	 */
	@Override
	public test.es.data.model.ElectroType updateElectroType(
		test.es.data.model.ElectroType electroType) {

		return _electroTypeLocalService.updateElectroType(electroType);
	}

	@Override
	public test.es.data.model.ElectroType updateElectroType(
			long userId, long electroTypeID, String electroTypeName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _electroTypeLocalService.updateElectroType(
			userId, electroTypeID, electroTypeName, serviceContext);
	}

	@Override
	public ElectroTypeLocalService getWrappedService() {
		return _electroTypeLocalService;
	}

	@Override
	public void setWrappedService(
		ElectroTypeLocalService electroTypeLocalService) {

		_electroTypeLocalService = electroTypeLocalService;
	}

	private ElectroTypeLocalService _electroTypeLocalService;

}