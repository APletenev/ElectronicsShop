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
 * Provides a wrapper for {@link PositionTypeLocalService}.
 *
 * @author Andrey Pletenev
 * @see PositionTypeLocalService
 * @generated
 */
public class PositionTypeLocalServiceWrapper
	implements PositionTypeLocalService,
			   ServiceWrapper<PositionTypeLocalService> {

	public PositionTypeLocalServiceWrapper(
		PositionTypeLocalService positionTypeLocalService) {

		_positionTypeLocalService = positionTypeLocalService;
	}

	@Override
	public test.es.data.model.PositionType addPositionType(
			long userId, String positionTypeName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionTypeLocalService.addPositionType(
			userId, positionTypeName, serviceContext);
	}

	/**
	 * Adds the position type to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PositionTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param positionType the position type
	 * @return the position type that was added
	 */
	@Override
	public test.es.data.model.PositionType addPositionType(
		test.es.data.model.PositionType positionType) {

		return _positionTypeLocalService.addPositionType(positionType);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionTypeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new position type with the primary key. Does not add the position type to the database.
	 *
	 * @param positionTypeId the primary key for the new position type
	 * @return the new position type
	 */
	@Override
	public test.es.data.model.PositionType createPositionType(
		long positionTypeId) {

		return _positionTypeLocalService.createPositionType(positionTypeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionTypeLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the position type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PositionTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param positionTypeId the primary key of the position type
	 * @return the position type that was removed
	 * @throws PortalException if a position type with the primary key could not be found
	 */
	@Override
	public test.es.data.model.PositionType deletePositionType(
			long positionTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionTypeLocalService.deletePositionType(positionTypeId);
	}

	/**
	 * Deletes the position type from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PositionTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param positionType the position type
	 * @return the position type that was removed
	 * @throws PortalException
	 */
	@Override
	public test.es.data.model.PositionType deletePositionType(
			test.es.data.model.PositionType positionType)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionTypeLocalService.deletePositionType(positionType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _positionTypeLocalService.dynamicQuery();
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

		return _positionTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.es.data.model.impl.PositionTypeModelImpl</code>.
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

		return _positionTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.es.data.model.impl.PositionTypeModelImpl</code>.
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

		return _positionTypeLocalService.dynamicQuery(
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

		return _positionTypeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _positionTypeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public test.es.data.model.PositionType fetchPositionType(
		long positionTypeId) {

		return _positionTypeLocalService.fetchPositionType(positionTypeId);
	}

	/**
	 * Returns the position type matching the UUID and group.
	 *
	 * @param uuid the position type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching position type, or <code>null</code> if a matching position type could not be found
	 */
	@Override
	public test.es.data.model.PositionType fetchPositionTypeByUuidAndGroupId(
		String uuid, long groupId) {

		return _positionTypeLocalService.fetchPositionTypeByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _positionTypeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _positionTypeLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _positionTypeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _positionTypeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the position type with the primary key.
	 *
	 * @param positionTypeId the primary key of the position type
	 * @return the position type
	 * @throws PortalException if a position type with the primary key could not be found
	 */
	@Override
	public test.es.data.model.PositionType getPositionType(long positionTypeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionTypeLocalService.getPositionType(positionTypeId);
	}

	/**
	 * Returns the position type matching the UUID and group.
	 *
	 * @param uuid the position type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching position type
	 * @throws PortalException if a matching position type could not be found
	 */
	@Override
	public test.es.data.model.PositionType getPositionTypeByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _positionTypeLocalService.getPositionTypeByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public int getPositionTypeCount(long groupId) {
		return _positionTypeLocalService.getPositionTypeCount(groupId);
	}

	/**
	 * Returns a range of all the position types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.es.data.model.impl.PositionTypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of position types
	 * @param end the upper bound of the range of position types (not inclusive)
	 * @return the range of position types
	 */
	@Override
	public java.util.List<test.es.data.model.PositionType> getPositionTypes(
		int start, int end) {

		return _positionTypeLocalService.getPositionTypes(start, end);
	}

	@Override
	public java.util.List<test.es.data.model.PositionType> getPositionTypes(
		long groupId) {

		return _positionTypeLocalService.getPositionTypes(groupId);
	}

	@Override
	public java.util.List<test.es.data.model.PositionType> getPositionTypes(
		long groupId, int start, int end) {

		return _positionTypeLocalService.getPositionTypes(groupId, start, end);
	}

	@Override
	public java.util.List<test.es.data.model.PositionType> getPositionTypes(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<test.es.data.model.PositionType> obc) {

		return _positionTypeLocalService.getPositionTypes(
			groupId, start, end, obc);
	}

	/**
	 * Returns all the position types matching the UUID and company.
	 *
	 * @param uuid the UUID of the position types
	 * @param companyId the primary key of the company
	 * @return the matching position types, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<test.es.data.model.PositionType>
		getPositionTypesByUuidAndCompanyId(String uuid, long companyId) {

		return _positionTypeLocalService.getPositionTypesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of position types matching the UUID and company.
	 *
	 * @param uuid the UUID of the position types
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of position types
	 * @param end the upper bound of the range of position types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching position types, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<test.es.data.model.PositionType>
		getPositionTypesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<test.es.data.model.PositionType> orderByComparator) {

		return _positionTypeLocalService.getPositionTypesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of position types.
	 *
	 * @return the number of position types
	 */
	@Override
	public int getPositionTypesCount() {
		return _positionTypeLocalService.getPositionTypesCount();
	}

	@Override
	public test.es.data.model.PositionType updatePositionType(
			long userId, long positionTypeID, String positionTypeName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _positionTypeLocalService.updatePositionType(
			userId, positionTypeID, positionTypeName, serviceContext);
	}

	/**
	 * Updates the position type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PositionTypeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param positionType the position type
	 * @return the position type that was updated
	 */
	@Override
	public test.es.data.model.PositionType updatePositionType(
		test.es.data.model.PositionType positionType) {

		return _positionTypeLocalService.updatePositionType(positionType);
	}

	@Override
	public PositionTypeLocalService getWrappedService() {
		return _positionTypeLocalService;
	}

	@Override
	public void setWrappedService(
		PositionTypeLocalService positionTypeLocalService) {

		_positionTypeLocalService = positionTypeLocalService;
	}

	private PositionTypeLocalService _positionTypeLocalService;

}