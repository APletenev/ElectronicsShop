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

package test.es.data.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import test.es.data.exception.PurchaseTypeNameException;
import test.es.data.model.PurchaseType;
import test.es.data.service.base.PurchaseTypeLocalServiceBaseImpl;

/**
 * @author Andrey Pletenev
 */
@Component(
	property = "model.class.name=test.es.data.model.PurchaseType",
	service = AopService.class
)
public class PurchaseTypeLocalServiceImpl
	extends PurchaseTypeLocalServiceBaseImpl {
	public PurchaseType addPurchaseType(long userId, String purchaseTypeName, ServiceContext serviceContext) throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		validate(purchaseTypeName);

		long id = counterLocalService.increment();

		PurchaseType purchaseType = purchaseTypePersistence.create(id);

		purchaseType.setUuid(serviceContext.getUuid());
		purchaseType.setUserId(userId);
		purchaseType.setGroupId(groupId);
		purchaseType.setCompanyId(user.getCompanyId());
		purchaseType.setUserName(user.getFullName());
		purchaseType.setCreateDate(serviceContext.getCreateDate(now));
		purchaseType.setModifiedDate(serviceContext.getModifiedDate(now));
		
		purchaseType.setExpandoBridgeAttributes(serviceContext);
		
		purchaseType.setPurchaseTypeName(purchaseTypeName);

		purchaseTypePersistence.update(purchaseType);

		return purchaseType;
	}

	
	public PurchaseType updatePurchaseType(long userId, 
			long purchaseTypeID, String purchaseTypeName,	ServiceContext serviceContext)
		throws PortalException, SystemException {

		Date now = new Date();

		validate(purchaseTypeName);

		PurchaseType entry =
			purchaseTypePersistence.findByPrimaryKey(purchaseTypeID);

		User user = userLocalService.getUserById(userId);

		entry.setUserId(userId);
		entry.setUserName(user.getFullName());
		entry.setModifiedDate(serviceContext.getModifiedDate(now));
		entry.setPurchaseTypeName(purchaseTypeName);
		
		entry.setExpandoBridgeAttributes(serviceContext);

		purchaseTypePersistence.update(entry);

		// Integrate with Liferay frameworks here.

		return entry;
	}
	
	public PurchaseType deletePurchaseType(PurchaseType entry)	throws PortalException {

			purchaseTypePersistence.remove(entry);

			return entry;
		}

	public PurchaseType deletePurchaseType(long purchaseTypeID) throws PortalException {

			PurchaseType entry =
				purchaseTypePersistence.findByPrimaryKey(purchaseTypeID);

			return deletePurchaseType(entry);
	}
	
	public List<PurchaseType> getPurchaseTypes(long groupId) {

		return purchaseTypePersistence.findByGroupId(groupId);
	}

	public List<PurchaseType> getPurchaseTypes(long groupId, int start, int end, OrderByComparator<PurchaseType> obc) {

		return purchaseTypePersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<PurchaseType> getPurchaseTypes(long groupId, int start, int end) {

		return purchaseTypePersistence.findByGroupId(groupId, start, end);
	}

	public int getPurchaseTypeCount(long groupId) {

		return purchaseTypePersistence.countByGroupId(groupId);
	}

	protected void validate(String purchaseTypeName) throws PortalException {
		if (Validator.isNull(purchaseTypeName)) {
			throw new PurchaseTypeNameException();
		}
	}
	
		
}