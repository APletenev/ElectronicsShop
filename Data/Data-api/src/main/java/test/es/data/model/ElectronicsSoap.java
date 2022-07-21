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
 * This class is used by SOAP remote services, specifically {@link test.es.data.service.http.ElectronicsServiceSoap}.
 *
 * @author Andrey Pletenev
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ElectronicsSoap implements Serializable {

	public static ElectronicsSoap toSoapModel(Electronics model) {
		ElectronicsSoap soapModel = new ElectronicsSoap();

		soapModel.setMvccVersion(model.getMvccVersion());
		soapModel.setUuid(model.getUuid());
		soapModel.setElectronicsId(model.getElectronicsId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setElectronicsName(model.getElectronicsName());
		soapModel.setElectroTypeId(model.getElectroTypeId());
		soapModel.setElectronicsPrice(model.getElectronicsPrice());
		soapModel.setElectronicsCount(model.getElectronicsCount());
		soapModel.setElectronicsInStock(model.getElectronicsInStock());
		soapModel.setElectronicsArchive(model.isElectronicsArchive());
		soapModel.setElectronicsDescription(model.getElectronicsDescription());

		return soapModel;
	}

	public static ElectronicsSoap[] toSoapModels(Electronics[] models) {
		ElectronicsSoap[] soapModels = new ElectronicsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ElectronicsSoap[][] toSoapModels(Electronics[][] models) {
		ElectronicsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ElectronicsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ElectronicsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ElectronicsSoap[] toSoapModels(List<Electronics> models) {
		List<ElectronicsSoap> soapModels = new ArrayList<ElectronicsSoap>(
			models.size());

		for (Electronics model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ElectronicsSoap[soapModels.size()]);
	}

	public ElectronicsSoap() {
	}

	public long getPrimaryKey() {
		return _electronicsId;
	}

	public void setPrimaryKey(long pk) {
		setElectronicsId(pk);
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

	public long getElectronicsId() {
		return _electronicsId;
	}

	public void setElectronicsId(long electronicsId) {
		_electronicsId = electronicsId;
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

	public String getElectronicsName() {
		return _electronicsName;
	}

	public void setElectronicsName(String electronicsName) {
		_electronicsName = electronicsName;
	}

	public long getElectroTypeId() {
		return _electroTypeId;
	}

	public void setElectroTypeId(long electroTypeId) {
		_electroTypeId = electroTypeId;
	}

	public long getElectronicsPrice() {
		return _electronicsPrice;
	}

	public void setElectronicsPrice(long electronicsPrice) {
		_electronicsPrice = electronicsPrice;
	}

	public int getElectronicsCount() {
		return _electronicsCount;
	}

	public void setElectronicsCount(int electronicsCount) {
		_electronicsCount = electronicsCount;
	}

	public Boolean getElectronicsInStock() {
		return _electronicsInStock;
	}

	public void setElectronicsInStock(Boolean electronicsInStock) {
		_electronicsInStock = electronicsInStock;
	}

	public boolean getElectronicsArchive() {
		return _electronicsArchive;
	}

	public boolean isElectronicsArchive() {
		return _electronicsArchive;
	}

	public void setElectronicsArchive(boolean electronicsArchive) {
		_electronicsArchive = electronicsArchive;
	}

	public String getElectronicsDescription() {
		return _electronicsDescription;
	}

	public void setElectronicsDescription(String electronicsDescription) {
		_electronicsDescription = electronicsDescription;
	}

	private long _mvccVersion;
	private String _uuid;
	private long _electronicsId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _electronicsName;
	private long _electroTypeId;
	private long _electronicsPrice;
	private int _electronicsCount;
	private Boolean _electronicsInStock;
	private boolean _electronicsArchive;
	private String _electronicsDescription;

}