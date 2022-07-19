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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link test.es.data.service.http.PositionTypeServiceSoap}.
 *
 * @author Andrey Pletenev
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class PositionTypeSoap implements Serializable {

	public static PositionTypeSoap toSoapModel(PositionType model) {
		PositionTypeSoap soapModel = new PositionTypeSoap();

		soapModel.setMvccVersion(model.getMvccVersion());
		soapModel.setUuid(model.getUuid());
		soapModel.setPositionId(model.getPositionId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPositionTypeName(model.getPositionTypeName());

		return soapModel;
	}

	public static PositionTypeSoap[] toSoapModels(PositionType[] models) {
		PositionTypeSoap[] soapModels = new PositionTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PositionTypeSoap[][] toSoapModels(PositionType[][] models) {
		PositionTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PositionTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PositionTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PositionTypeSoap[] toSoapModels(List<PositionType> models) {
		List<PositionTypeSoap> soapModels = new ArrayList<PositionTypeSoap>(
			models.size());

		for (PositionType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PositionTypeSoap[soapModels.size()]);
	}

	public PositionTypeSoap() {
	}

	public long getPrimaryKey() {
		return _positionId;
	}

	public void setPrimaryKey(long pk) {
		setPositionId(pk);
	}

	public long getMvccVersion() {
		return _mvccVersion;
	}

	public void setMvccVersion(long mvccVersion) {
		_mvccVersion = mvccVersion;
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPositionId() {
		return _positionId;
	}

	public void setPositionId(long positionId) {
		_positionId = positionId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getPositionTypeName() {
		return _positionTypeName;
	}

	public void setPositionTypeName(String positionTypeName) {
		_positionTypeName = positionTypeName;
	}

	private long _mvccVersion;
	private String _uuid;
	private long _positionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _positionTypeName;

}