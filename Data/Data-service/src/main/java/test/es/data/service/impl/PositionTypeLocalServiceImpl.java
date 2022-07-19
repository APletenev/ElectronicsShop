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

import test.es.data.exception.PositionTypeNameException;
import test.es.data.model.PositionType;
import test.es.data.service.base.PositionTypeLocalServiceBaseImpl;

/**
 * @author Andrey Pletenev
 */
@Component(
	property = "model.class.name=test.es.data.model.PositionType",
	service = AopService.class
)
public class PositionTypeLocalServiceImpl
	extends PositionTypeLocalServiceBaseImpl {
	public PositionType addPositionType(long userId, String positionTypeName, ServiceContext serviceContext) throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		validate(positionTypeName);

		long id = counterLocalService.increment();

		PositionType positionType = positionTypePersistence.create(id);

		positionType.setUuid(serviceContext.getUuid());
		positionType.setUserId(userId);
		positionType.setGroupId(groupId);
		positionType.setCompanyId(user.getCompanyId());
		positionType.setUserName(user.getFullName());
		positionType.setCreateDate(serviceContext.getCreateDate(now));
		positionType.setModifiedDate(serviceContext.getModifiedDate(now));
		
		positionType.setExpandoBridgeAttributes(serviceContext);
		
		positionType.setPositionTypeName(positionTypeName);

		positionTypePersistence.update(positionType);

		return positionType;
	}

	
	public PositionType updatePositionType(long userId, 
			long positionTypeID, String positionTypeName,	ServiceContext serviceContext)
		throws PortalException, SystemException {

		Date now = new Date();

		validate(positionTypeName);

		PositionType entry =
			positionTypePersistence.findByPrimaryKey(positionTypeID);

		User user = userLocalService.getUserById(userId);

		entry.setUserId(userId);
		entry.setUserName(user.getFullName());
		entry.setModifiedDate(serviceContext.getModifiedDate(now));
		entry.setPositionTypeName(positionTypeName);
		
		entry.setExpandoBridgeAttributes(serviceContext);

		positionTypePersistence.update(entry);

		// Integrate with Liferay frameworks here.

		return entry;
	}
	
	public PositionType deletePositionType(PositionType entry)	throws PortalException {

			positionTypePersistence.remove(entry);

			return entry;
		}

	public PositionType deletePositionType(long positionTypeID) throws PortalException {

			PositionType entry =
				positionTypePersistence.findByPrimaryKey(positionTypeID);

			return deletePositionType(entry);
	}
	
	public List<PositionType> getPositionTypes(long groupId) {

		return positionTypePersistence.findByGroupId(groupId);
	}

	public List<PositionType> getPositionTypes(long groupId, int start, int end, OrderByComparator<PositionType> obc) {

		return positionTypePersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<PositionType> getPositionTypes(long groupId, int start, int end) {

		return positionTypePersistence.findByGroupId(groupId, start, end);
	}

	public int getPositionTypeCount(long groupId) {

		return positionTypePersistence.countByGroupId(groupId);
	}

	protected void validate(String positionTypeName) throws PortalException {
		if (Validator.isNull(positionTypeName)) {
			throw new PositionTypeNameException();
		}
	}
	
			
}