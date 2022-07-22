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

import test.es.data.exception.ElectronicsCountException;
import test.es.data.exception.ElectronicsDescriptionException;
import test.es.data.exception.ElectronicsNameException;
import test.es.data.exception.ElectronicsPriceException;
import test.es.data.model.Electronics;
import test.es.data.service.base.ElectronicsLocalServiceBaseImpl;
import test.es.data.service.base.ElectroTypeLocalServiceBaseImpl;


/**
 * @author Andrey Pletenev
 */
@Component(
	property = "model.class.name=test.es.data.model.Electronics",
	service = AopService.class
)
public class ElectronicsLocalServiceImpl
	extends ElectronicsLocalServiceBaseImpl {
	
	public Electronics addElectronics(
			long userId, 
			String electronicsName, 
			long electroTypeId, //FK
			long electronicsPrice, 
			int electronicsCount, 
			boolean electronicsInStock, 
			boolean electronicsArchive, 
			String electronicsDescription,
			ServiceContext serviceContext) throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		validate(electronicsName, electronicsPrice, electronicsCount, electronicsDescription);

		long id = counterLocalService.increment();

		Electronics entry = electronicsPersistence.create(id);

		entry.setUuid(serviceContext.getUuid());
		entry.setUserId(userId);
		entry.setGroupId(groupId);
		entry.setCompanyId(user.getCompanyId());
		entry.setUserName(user.getFullName());
		entry.setCreateDate(serviceContext.getCreateDate(now));
		entry.setModifiedDate(serviceContext.getModifiedDate(now));
		
		entry.setExpandoBridgeAttributes(serviceContext);
		
		entry.setElectronicsName(electronicsName);
		entry.setElectroTypeId(electroTypeId); //FK
		entry.setElectronicsPrice(electronicsPrice);
		entry.setElectronicsCount(electronicsCount);
		entry.setElectronicsInStock(electronicsInStock);
		entry.setElectronicsArchive(electronicsArchive);
		entry.setElectronicsDescription(electronicsDescription);
				

		electronicsPersistence.update(entry);

		return entry;
	}

	
	public Electronics updateElectronics(
			long userId, 
			long electronicsId,
			String electronicsName, 
			long electroTypeId, //FK
			long electronicsPrice, 
			int electronicsCount, 
			boolean electronicsInStock, 
			boolean electronicsArchive, 
			String electronicsDescription,
			ServiceContext serviceContext)
		throws PortalException, SystemException {

		Date now = new Date();

		validate(electronicsName, electronicsPrice, electronicsCount, electronicsDescription);

		Electronics entry =
			electronicsPersistence.findByPrimaryKey(electronicsId);

		User user = userLocalService.getUserById(userId);

		entry.setUserId(userId);
		entry.setUserName(user.getFullName());
		entry.setModifiedDate(serviceContext.getModifiedDate(now));
		entry.setElectronicsName(electronicsName);
		entry.setElectroTypeId(electroTypeId); //FK
		entry.setElectronicsPrice(electronicsPrice);
		entry.setElectronicsCount(electronicsCount);
		entry.setElectronicsInStock(electronicsInStock);
		entry.setElectronicsArchive(electronicsArchive);
		entry.setElectronicsDescription(electronicsDescription);
		
		
		
		entry.setExpandoBridgeAttributes(serviceContext);

		electronicsPersistence.update(entry);

		// Integrate with Liferay frameworks here.

		return entry;
	}
	
	public Electronics deleteElectronics(Electronics entry)	throws PortalException {

			electronicsPersistence.remove(entry);

			return entry;
		}

	public Electronics deleteElectronics(long electronicsId) throws PortalException {

			Electronics entry =
				electronicsPersistence.findByPrimaryKey(electronicsId);

			return deleteElectronics(entry);
	}
	
	public List<Electronics> getElectronicss(long groupId, long electroTypeId) {

		return electronicsPersistence.findByGroupId(groupId);
	}

	public List<Electronics> getElectronicss(long groupId, int start, int end, OrderByComparator<Electronics> obc) {

		return electronicsPersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<Electronics> getElectronicss(long groupId, int start, int end) {

		return electronicsPersistence.findByGroupId(groupId, start, end);
	}

	public int getElectronicsCount(long groupId) {

		return electronicsPersistence.countByGroupId(groupId);
	}

	protected void validate(
			String electronicsName,
			long electronicsPrice, 
			int electronicsCount, 
			String electronicsDescription) throws PortalException 
	{
		if (Validator.isNull(electronicsName)) {
			throw new ElectronicsNameException();
		}
		if (electronicsPrice<=0) {
			throw new ElectronicsPriceException();
		}
		if (electronicsCount<0) {
			throw new ElectronicsCountException();
		}
		if (Validator. isNull(electronicsDescription)) {
			throw new ElectronicsDescriptionException();
		}
	
		
	}
	
}