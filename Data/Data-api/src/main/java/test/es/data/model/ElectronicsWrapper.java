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

package test.es.data.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Electronics}.
 * </p>
 *
 * @author Andrey Pletenev
 * @see Electronics
 * @generated
 */
public class ElectronicsWrapper
	extends BaseModelWrapper<Electronics>
	implements Electronics, ModelWrapper<Electronics> {

	public ElectronicsWrapper(Electronics electronics) {
		super(electronics);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("uuid", getUuid());
		attributes.put("electronicsId", getElectronicsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("electronicsName", getElectronicsName());
		attributes.put("electroTypeId", getElectroTypeId());
		attributes.put("electronicsPrice", getElectronicsPrice());
		attributes.put("electronicsCount", getElectronicsCount());
		attributes.put("electronicsInStock", isElectronicsInStock());
		attributes.put("electronicsArchive", isElectronicsArchive());
		attributes.put("electronicsDescription", getElectronicsDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long electronicsId = (Long)attributes.get("electronicsId");

		if (electronicsId != null) {
			setElectronicsId(electronicsId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String electronicsName = (String)attributes.get("electronicsName");

		if (electronicsName != null) {
			setElectronicsName(electronicsName);
		}

		Long electroTypeId = (Long)attributes.get("electroTypeId");

		if (electroTypeId != null) {
			setElectroTypeId(electroTypeId);
		}

		Long electronicsPrice = (Long)attributes.get("electronicsPrice");

		if (electronicsPrice != null) {
			setElectronicsPrice(electronicsPrice);
		}

		Integer electronicsCount = (Integer)attributes.get("electronicsCount");

		if (electronicsCount != null) {
			setElectronicsCount(electronicsCount);
		}

		Boolean electronicsInStock = (Boolean)attributes.get(
			"electronicsInStock");

		if (electronicsInStock != null) {
			setElectronicsInStock(electronicsInStock);
		}

		Boolean electronicsArchive = (Boolean)attributes.get(
			"electronicsArchive");

		if (electronicsArchive != null) {
			setElectronicsArchive(electronicsArchive);
		}

		String electronicsDescription = (String)attributes.get(
			"electronicsDescription");

		if (electronicsDescription != null) {
			setElectronicsDescription(electronicsDescription);
		}
	}

	/**
	 * Returns the company ID of this electronics.
	 *
	 * @return the company ID of this electronics
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this electronics.
	 *
	 * @return the create date of this electronics
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the electronics archive of this electronics.
	 *
	 * @return the electronics archive of this electronics
	 */
	@Override
	public boolean getElectronicsArchive() {
		return model.getElectronicsArchive();
	}

	/**
	 * Returns the electronics count of this electronics.
	 *
	 * @return the electronics count of this electronics
	 */
	@Override
	public int getElectronicsCount() {
		return model.getElectronicsCount();
	}

	/**
	 * Returns the electronics description of this electronics.
	 *
	 * @return the electronics description of this electronics
	 */
	@Override
	public String getElectronicsDescription() {
		return model.getElectronicsDescription();
	}

	/**
	 * Returns the electronics ID of this electronics.
	 *
	 * @return the electronics ID of this electronics
	 */
	@Override
	public long getElectronicsId() {
		return model.getElectronicsId();
	}

	/**
	 * Returns the electronics in stock of this electronics.
	 *
	 * @return the electronics in stock of this electronics
	 */
	@Override
	public boolean getElectronicsInStock() {
		return model.getElectronicsInStock();
	}

	/**
	 * Returns the electronics name of this electronics.
	 *
	 * @return the electronics name of this electronics
	 */
	@Override
	public String getElectronicsName() {
		return model.getElectronicsName();
	}

	/**
	 * Returns the electronics price of this electronics.
	 *
	 * @return the electronics price of this electronics
	 */
	@Override
	public long getElectronicsPrice() {
		return model.getElectronicsPrice();
	}

	/**
	 * Returns the electro type ID of this electronics.
	 *
	 * @return the electro type ID of this electronics
	 */
	@Override
	public long getElectroTypeId() {
		return model.getElectroTypeId();
	}

	/**
	 * Returns the group ID of this electronics.
	 *
	 * @return the group ID of this electronics
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this electronics.
	 *
	 * @return the modified date of this electronics
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mvcc version of this electronics.
	 *
	 * @return the mvcc version of this electronics
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the primary key of this electronics.
	 *
	 * @return the primary key of this electronics
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this electronics.
	 *
	 * @return the user ID of this electronics
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this electronics.
	 *
	 * @return the user name of this electronics
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this electronics.
	 *
	 * @return the user uuid of this electronics
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this electronics.
	 *
	 * @return the uuid of this electronics
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this electronics is electronics archive.
	 *
	 * @return <code>true</code> if this electronics is electronics archive; <code>false</code> otherwise
	 */
	@Override
	public boolean isElectronicsArchive() {
		return model.isElectronicsArchive();
	}

	/**
	 * Returns <code>true</code> if this electronics is electronics in stock.
	 *
	 * @return <code>true</code> if this electronics is electronics in stock; <code>false</code> otherwise
	 */
	@Override
	public boolean isElectronicsInStock() {
		return model.isElectronicsInStock();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this electronics.
	 *
	 * @param companyId the company ID of this electronics
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this electronics.
	 *
	 * @param createDate the create date of this electronics
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets whether this electronics is electronics archive.
	 *
	 * @param electronicsArchive the electronics archive of this electronics
	 */
	@Override
	public void setElectronicsArchive(boolean electronicsArchive) {
		model.setElectronicsArchive(electronicsArchive);
	}

	/**
	 * Sets the electronics count of this electronics.
	 *
	 * @param electronicsCount the electronics count of this electronics
	 */
	@Override
	public void setElectronicsCount(int electronicsCount) {
		model.setElectronicsCount(electronicsCount);
	}

	/**
	 * Sets the electronics description of this electronics.
	 *
	 * @param electronicsDescription the electronics description of this electronics
	 */
	@Override
	public void setElectronicsDescription(String electronicsDescription) {
		model.setElectronicsDescription(electronicsDescription);
	}

	/**
	 * Sets the electronics ID of this electronics.
	 *
	 * @param electronicsId the electronics ID of this electronics
	 */
	@Override
	public void setElectronicsId(long electronicsId) {
		model.setElectronicsId(electronicsId);
	}

	/**
	 * Sets whether this electronics is electronics in stock.
	 *
	 * @param electronicsInStock the electronics in stock of this electronics
	 */
	@Override
	public void setElectronicsInStock(boolean electronicsInStock) {
		model.setElectronicsInStock(electronicsInStock);
	}

	/**
	 * Sets the electronics name of this electronics.
	 *
	 * @param electronicsName the electronics name of this electronics
	 */
	@Override
	public void setElectronicsName(String electronicsName) {
		model.setElectronicsName(electronicsName);
	}

	/**
	 * Sets the electronics price of this electronics.
	 *
	 * @param electronicsPrice the electronics price of this electronics
	 */
	@Override
	public void setElectronicsPrice(long electronicsPrice) {
		model.setElectronicsPrice(electronicsPrice);
	}

	/**
	 * Sets the electro type ID of this electronics.
	 *
	 * @param electroTypeId the electro type ID of this electronics
	 */
	@Override
	public void setElectroTypeId(long electroTypeId) {
		model.setElectroTypeId(electroTypeId);
	}

	/**
	 * Sets the group ID of this electronics.
	 *
	 * @param groupId the group ID of this electronics
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this electronics.
	 *
	 * @param modifiedDate the modified date of this electronics
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mvcc version of this electronics.
	 *
	 * @param mvccVersion the mvcc version of this electronics
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the primary key of this electronics.
	 *
	 * @param primaryKey the primary key of this electronics
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this electronics.
	 *
	 * @param userId the user ID of this electronics
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this electronics.
	 *
	 * @param userName the user name of this electronics
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this electronics.
	 *
	 * @param userUuid the user uuid of this electronics
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this electronics.
	 *
	 * @param uuid the uuid of this electronics
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected ElectronicsWrapper wrap(Electronics electronics) {
		return new ElectronicsWrapper(electronics);
	}

}