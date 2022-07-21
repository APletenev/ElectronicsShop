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

import test.es.data.model.Electronics;

/**
 * Provides the local service utility for Electronics. This utility wraps
 * <code>test.es.data.service.impl.ElectronicsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Andrey Pletenev
 * @see ElectronicsLocalService
 * @generated
 */
public class ElectronicsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>test.es.data.service.impl.ElectronicsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
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
	public static Electronics addElectronics(Electronics electronics) {
		return getService().addElectronics(electronics);
	}

	public static Electronics addElectronics(
			long userId, String electronicsName, long electronicsPrice,
			int electronicsCount, boolean electronicsInStock,
			boolean electronicsArchive, String electronicsDescription,
			long electroTypeId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addElectronics(
			userId, electronicsName, electronicsPrice, electronicsCount,
			electronicsInStock, electronicsArchive, electronicsDescription,
			electroTypeId, serviceContext);
	}

	/**
	 * Creates a new electronics with the primary key. Does not add the electronics to the database.
	 *
	 * @param electronicsId the primary key for the new electronics
	 * @return the new electronics
	 */
	public static Electronics createElectronics(long electronicsId) {
		return getService().createElectronics(electronicsId);
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
	public static Electronics deleteElectronics(Electronics electronics)
		throws PortalException {

		return getService().deleteElectronics(electronics);
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
	public static Electronics deleteElectronics(long electronicsId)
		throws PortalException {

		return getService().deleteElectronics(electronicsId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.es.data.model.impl.ElectronicsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>test.es.data.model.impl.ElectronicsModelImpl</code>.
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

	public static Electronics fetchElectronics(long electronicsId) {
		return getService().fetchElectronics(electronicsId);
	}

	/**
	 * Returns the electronics matching the UUID and group.
	 *
	 * @param uuid the electronics's UUID
	 * @param groupId the primary key of the group
	 * @return the matching electronics, or <code>null</code> if a matching electronics could not be found
	 */
	public static Electronics fetchElectronicsByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchElectronicsByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the electronics with the primary key.
	 *
	 * @param electronicsId the primary key of the electronics
	 * @return the electronics
	 * @throws PortalException if a electronics with the primary key could not be found
	 */
	public static Electronics getElectronics(long electronicsId)
		throws PortalException {

		return getService().getElectronics(electronicsId);
	}

	/**
	 * Returns the electronics matching the UUID and group.
	 *
	 * @param uuid the electronics's UUID
	 * @param groupId the primary key of the group
	 * @return the matching electronics
	 * @throws PortalException if a matching electronics could not be found
	 */
	public static Electronics getElectronicsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getElectronicsByUuidAndGroupId(uuid, groupId);
	}

	public static int getElectronicsCount(long groupId) {
		return getService().getElectronicsCount(groupId);
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
	public static List<Electronics> getElectronicses(int start, int end) {
		return getService().getElectronicses(start, end);
	}

	/**
	 * Returns all the electronicses matching the UUID and company.
	 *
	 * @param uuid the UUID of the electronicses
	 * @param companyId the primary key of the company
	 * @return the matching electronicses, or an empty list if no matches were found
	 */
	public static List<Electronics> getElectronicsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getElectronicsesByUuidAndCompanyId(uuid, companyId);
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
	public static List<Electronics> getElectronicsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Electronics> orderByComparator) {

		return getService().getElectronicsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of electronicses.
	 *
	 * @return the number of electronicses
	 */
	public static int getElectronicsesCount() {
		return getService().getElectronicsesCount();
	}

	public static List<Electronics> getElectronicss(long groupId) {
		return getService().getElectronicss(groupId);
	}

	public static List<Electronics> getElectronicss(
		long groupId, int start, int end) {

		return getService().getElectronicss(groupId, start, end);
	}

	public static List<Electronics> getElectronicss(
		long groupId, int start, int end, OrderByComparator<Electronics> obc) {

		return getService().getElectronicss(groupId, start, end, obc);
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
	 * Updates the electronics in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ElectronicsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param electronics the electronics
	 * @return the electronics that was updated
	 */
	public static Electronics updateElectronics(Electronics electronics) {
		return getService().updateElectronics(electronics);
	}

	public static Electronics updateElectronics(
			long userId, long electronicsID, String electronicsName,
			long electronicsPrice, int electronicsCount,
			boolean electronicsInStock, boolean electronicsArchive,
			String electronicsDescription, long electroTypeId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException, SystemException {

		return getService().updateElectronics(
			userId, electronicsID, electronicsName, electronicsPrice,
			electronicsCount, electronicsInStock, electronicsArchive,
			electronicsDescription, electroTypeId, serviceContext);
	}

	public static ElectronicsLocalService getService() {
		return _service;
	}

	private static volatile ElectronicsLocalService _service;

}