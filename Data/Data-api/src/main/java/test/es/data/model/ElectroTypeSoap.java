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
 * This class is used by SOAP remote services, specifically {@link test.es.data.service.http.ElectroTypeServiceSoap}.
 *
 * @author Andrey Pletenev
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ElectroTypeSoap implements Serializable {

	public static ElectroTypeSoap toSoapModel(ElectroType model) {
		ElectroTypeSoap soapModel = new ElectroTypeSoap();

		soapModel.setMvccVersion(model.getMvccVersion());
		soapModel.setUuid(model.getUuid());
		soapModel.setElectroTypeId(model.getElectroTypeId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setElectroTypeName(model.getElectroTypeName());

		return soapModel;
	}

	public static ElectroTypeSoap[] toSoapModels(ElectroType[] models) {
		ElectroTypeSoap[] soapModels = new ElectroTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ElectroTypeSoap[][] toSoapModels(ElectroType[][] models) {
		ElectroTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ElectroTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ElectroTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ElectroTypeSoap[] toSoapModels(List<ElectroType> models) {
		List<ElectroTypeSoap> soapModels = new ArrayList<ElectroTypeSoap>(
			models.size());

		for (ElectroType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ElectroTypeSoap[soapModels.size()]);
	}

	public ElectroTypeSoap() {
	}

	public long getPrimaryKey() {
		return _electroTypeId;
	}

	public void setPrimaryKey(long pk) {
		setElectroTypeId(pk);
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

	public long getElectroTypeId() {
		return _electroTypeId;
	}

	public void setElectroTypeId(long electroTypeId) {
		_electroTypeId = electroTypeId;
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

	public String getElectroTypeName() {
		return _electroTypeName;
	}

	public void setElectroTypeName(String electroTypeName) {
		_electroTypeName = electroTypeName;
	}

	private long _mvccVersion;
	private String _uuid;
	private long _electroTypeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _electroTypeName;

}