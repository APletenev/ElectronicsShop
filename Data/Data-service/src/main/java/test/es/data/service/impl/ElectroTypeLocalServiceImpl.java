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

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import test.es.data.exception.ElectroTypeNameException;
import test.es.data.model.ElectroType;
import test.es.data.service.base.ElectroTypeLocalServiceBaseImpl;

/**
 * @author Andrey Pletenev
 */
@Component(property = "model.class.electroTypeName=test.es.data.model.ElectroType", service = AopService.class)
public class ElectroTypeLocalServiceImpl extends ElectroTypeLocalServiceBaseImpl {

	public ElectroType addElectroType(long userId, String electroTypeName, ServiceContext serviceContext) throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		validate(electroTypeName);

		long id = counterLocalService.increment();

		ElectroType electroType = electroTypePersistence.create(id);

		electroType.setUuid(serviceContext.getUuid());
		electroType.setUserId(userId);
		electroType.setGroupId(groupId);
		electroType.setCompanyId(user.getCompanyId());
		electroType.setUserName(user.getFullName());
		electroType.setCreateDate(serviceContext.getCreateDate(now));
		electroType.setModifiedDate(serviceContext.getModifiedDate(now));
		
		electroType.setExpandoBridgeAttributes(serviceContext);
		
		electroType.setElectroTypeName(electroTypeName);

		electroTypePersistence.update(electroType);

		return electroType;
	}

	
	public ElectroType updateElectroType(long userId, 
			long electroTypeID, String electroTypeName,	ServiceContext serviceContext)
		throws PortalException, SystemException {

		Date now = new Date();

		validate(electroTypeName);

		ElectroType entry =
			electroTypePersistence.findByPrimaryKey(electroTypeID);

		User user = userLocalService.getUserById(userId);

		entry.setUserId(userId);
		entry.setUserName(user.getFullName());
		entry.setModifiedDate(serviceContext.getModifiedDate(now));
		entry.setElectroTypeName(electroTypeName);
		
		entry.setExpandoBridgeAttributes(serviceContext);

		electroTypePersistence.update(entry);

		// Integrate with Liferay frameworks here.

		return entry;
	}
	
	public ElectroType deleteElectroType(ElectroType entry)	throws PortalException {

			electroTypePersistence.remove(entry);

			return entry;
		}

	public ElectroType deleteElectroType(long electroTypeID) throws PortalException {

			ElectroType entry =
				electroTypePersistence.findByPrimaryKey(electroTypeID);

			return deleteElectroType(entry);
	}
	
	public List<ElectroType> getElectroTypes(long groupId) {

		return electroTypePersistence.findByGroupId(groupId);
	}

	public List<ElectroType> getElectroTypes(long groupId, int start, int end, OrderByComparator<ElectroType> obc) {

		return electroTypePersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<ElectroType> getElectroTypes(long groupId, int start, int end) {

		return electroTypePersistence.findByGroupId(groupId, start, end);
	}

	public int getElectroTypeCount(long groupId) {

		return electroTypePersistence.countByGroupId(groupId);
	}

	protected void validate(String electroTypeName) throws PortalException {
		if (Validator.isNull(electroTypeName)) {
			throw new ElectroTypeNameException();
		}
	}
	
		
}