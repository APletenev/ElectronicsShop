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
 * This class is a wrapper for {@link PositionType}.
 * </p>
 *
 * @author Andrey Pletenev
 * @see PositionType
 * @generated
 */
public class PositionTypeWrapper
	extends BaseModelWrapper<PositionType>
	implements ModelWrapper<PositionType>, PositionType {

	public PositionTypeWrapper(PositionType positionType) {
		super(positionType);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("uuid", getUuid());
		attributes.put("positionId", getPositionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("positionTypeName", getPositionTypeName());

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

		Long positionId = (Long)attributes.get("positionId");

		if (positionId != null) {
			setPositionId(positionId);
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

		String positionTypeName = (String)attributes.get("positionTypeName");

		if (positionTypeName != null) {
			setPositionTypeName(positionTypeName);
		}
	}

	/**
	 * Returns the company ID of this position type.
	 *
	 * @return the company ID of this position type
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this position type.
	 *
	 * @return the create date of this position type
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this position type.
	 *
	 * @return the group ID of this position type
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this position type.
	 *
	 * @return the modified date of this position type
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mvcc version of this position type.
	 *
	 * @return the mvcc version of this position type
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the position ID of this position type.
	 *
	 * @return the position ID of this position type
	 */
	@Override
	public long getPositionId() {
		return model.getPositionId();
	}

	/**
	 * Returns the position type name of this position type.
	 *
	 * @return the position type name of this position type
	 */
	@Override
	public String getPositionTypeName() {
		return model.getPositionTypeName();
	}

	/**
	 * Returns the primary key of this position type.
	 *
	 * @return the primary key of this position type
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this position type.
	 *
	 * @return the user ID of this position type
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this position type.
	 *
	 * @return the user name of this position type
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this position type.
	 *
	 * @return the user uuid of this position type
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this position type.
	 *
	 * @return the uuid of this position type
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this position type.
	 *
	 * @param companyId the company ID of this position type
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this position type.
	 *
	 * @param createDate the create date of this position type
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this position type.
	 *
	 * @param groupId the group ID of this position type
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this position type.
	 *
	 * @param modifiedDate the modified date of this position type
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mvcc version of this position type.
	 *
	 * @param mvccVersion the mvcc version of this position type
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the position ID of this position type.
	 *
	 * @param positionId the position ID of this position type
	 */
	@Override
	public void setPositionId(long positionId) {
		model.setPositionId(positionId);
	}

	/**
	 * Sets the position type name of this position type.
	 *
	 * @param positionTypeName the position type name of this position type
	 */
	@Override
	public void setPositionTypeName(String positionTypeName) {
		model.setPositionTypeName(positionTypeName);
	}

	/**
	 * Sets the primary key of this position type.
	 *
	 * @param primaryKey the primary key of this position type
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this position type.
	 *
	 * @param userId the user ID of this position type
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this position type.
	 *
	 * @param userName the user name of this position type
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this position type.
	 *
	 * @param userUuid the user uuid of this position type
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this position type.
	 *
	 * @param uuid the uuid of this position type
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
	protected PositionTypeWrapper wrap(PositionType positionType) {
		return new PositionTypeWrapper(positionType);
	}

}