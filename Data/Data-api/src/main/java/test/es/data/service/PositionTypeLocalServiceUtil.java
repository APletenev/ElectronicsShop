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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import test.es.data.model.PositionType;

/**
 * Provides the local service utility for PositionType. This utility wraps
 * <code>test.es.data.service.impl.PositionTypeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Andrey Pletenev
 * @see PositionTypeLocalService
 * @generated
 */
public class PositionTypeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>test.es.data.service.impl.PositionTypeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static PositionType addPositionType(
			long userId, String positionTypeName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addPositionType(
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
	public static PositionType addPositionType(PositionType positionType) {
		return getService().addPositionType(positionType);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new position type with the primary key. Does not add the position type to the database.
	 *
	 * @param positionTypeId the primary key for the new position type
	 * @return the new position type
	 */
	public static PositionType createPositionType(long positionTypeId) {
		return getService().createPositionType(positionTypeId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static PositionType deletePositionType(long positionTypeId)
		throws PortalException {

		return getService().deletePositionType(positionTypeId);
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
	public static PositionType deletePositionType(PositionType positionType)
		throws PortalException {

		return getService().deletePositionType(positionType);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static PositionType fetchPositionType(long positionTypeId) {
		return getService().fetchPositionType(positionTypeId);
	}

	/**
	 * Returns the position type matching the UUID and group.
	 *
	 * @param uuid the position type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching position type, or <code>null</code> if a matching position type could not be found
	 */
	public static PositionType fetchPositionTypeByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchPositionTypeByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the position type with the primary key.
	 *
	 * @param positionTypeId the primary key of the position type
	 * @return the position type
	 * @throws PortalException if a position type with the primary key could not be found
	 */
	public static PositionType getPositionType(long positionTypeId)
		throws PortalException {

		return getService().getPositionType(positionTypeId);
	}

	/**
	 * Returns the position type matching the UUID and group.
	 *
	 * @param uuid the position type's UUID
	 * @param groupId the primary key of the group
	 * @return the matching position type
	 * @throws PortalException if a matching position type could not be found
	 */
	public static PositionType getPositionTypeByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getPositionTypeByUuidAndGroupId(uuid, groupId);
	}

	public static int getPositionTypeCount(long groupId) {
		return getService().getPositionTypeCount(groupId);
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
	public static List<PositionType> getPositionTypes(int start, int end) {
		return getService().getPositionTypes(start, end);
	}

	public static List<PositionType> getPositionTypes(long groupId) {
		return getService().getPositionTypes(groupId);
	}

	public static List<PositionType> getPositionTypes(
		long groupId, int start, int end) {

		return getService().getPositionTypes(groupId, start, end);
	}

	public static List<PositionType> getPositionTypes(
		long groupId, int start, int end, OrderByComparator<PositionType> obc) {

		return getService().getPositionTypes(groupId, start, end, obc);
	}

	/**
	 * Returns all the position types matching the UUID and company.
	 *
	 * @param uuid the UUID of the position types
	 * @param companyId the primary key of the company
	 * @return the matching position types, or an empty list if no matches were found
	 */
	public static List<PositionType> getPositionTypesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getPositionTypesByUuidAndCompanyId(uuid, companyId);
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
	public static List<PositionType> getPositionTypesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PositionType> orderByComparator) {

		return getService().getPositionTypesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of position types.
	 *
	 * @return the number of position types
	 */
	public static int getPositionTypesCount() {
		return getService().getPositionTypesCount();
	}

	public static PositionType updatePositionType(
			long userId, long positionTypeID, String positionTypeName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException, SystemException {

		return getService().updatePositionType(
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
	public static PositionType updatePositionType(PositionType positionType) {
		return getService().updatePositionType(positionType);
	}

	public static PositionTypeLocalService getService() {
		return _service;
	}

	private static volatile PositionTypeLocalService _service;

}