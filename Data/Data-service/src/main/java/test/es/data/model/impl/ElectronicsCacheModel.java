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

package test.es.data.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import test.es.data.model.Electronics;

/**
 * The cache model class for representing Electronics in entity cache.
 *
 * @author Andrey Pletenev
 * @generated
 */
public class ElectronicsCacheModel
	implements CacheModel<Electronics>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ElectronicsCacheModel)) {
			return false;
		}

		ElectronicsCacheModel electronicsCacheModel =
			(ElectronicsCacheModel)object;

		if ((electronicsId == electronicsCacheModel.electronicsId) &&
			(mvccVersion == electronicsCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, electronicsId);

		return HashUtil.hash(hashCode, mvccVersion);
	}

	@Override
	public long getMvccVersion() {
		return mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		this.mvccVersion = mvccVersion;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", electronicsId=");
		sb.append(electronicsId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", electronicsName=");
		sb.append(electronicsName);
		sb.append(", electronicsPrice=");
		sb.append(electronicsPrice);
		sb.append(", electronicsCount=");
		sb.append(electronicsCount);
		sb.append(", electronicsInStock=");
		sb.append(electronicsInStock);
		sb.append(", electronicsArchive=");
		sb.append(electronicsArchive);
		sb.append(", electronicsDescription=");
		sb.append(electronicsDescription);
		sb.append(", electroTypeId=");
		sb.append(electroTypeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Electronics toEntityModel() {
		ElectronicsImpl electronicsImpl = new ElectronicsImpl();

		electronicsImpl.setMvccVersion(mvccVersion);
		electronicsImpl.setElectronicsId(electronicsId);
		electronicsImpl.setGroupId(groupId);
		electronicsImpl.setCompanyId(companyId);
		electronicsImpl.setUserId(userId);

		if (userName == null) {
			electronicsImpl.setUserName("");
		}
		else {
			electronicsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			electronicsImpl.setCreateDate(null);
		}
		else {
			electronicsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			electronicsImpl.setModifiedDate(null);
		}
		else {
			electronicsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (electronicsName == null) {
			electronicsImpl.setElectronicsName("");
		}
		else {
			electronicsImpl.setElectronicsName(electronicsName);
		}

		electronicsImpl.setElectronicsPrice(electronicsPrice);
		electronicsImpl.setElectronicsCount(electronicsCount);
		electronicsImpl.setElectronicsInStock(electronicsInStock);
		electronicsImpl.setElectronicsArchive(electronicsArchive);

		if (electronicsDescription == null) {
			electronicsImpl.setElectronicsDescription("");
		}
		else {
			electronicsImpl.setElectronicsDescription(electronicsDescription);
		}

		electronicsImpl.setElectroTypeId(electroTypeId);

		electronicsImpl.resetOriginalValues();

		return electronicsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();

		electronicsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		electronicsName = objectInput.readUTF();

		electronicsPrice = objectInput.readLong();

		electronicsCount = objectInput.readInt();

		electronicsInStock = objectInput.readBoolean();

		electronicsArchive = objectInput.readBoolean();
		electronicsDescription = objectInput.readUTF();

		electroTypeId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(mvccVersion);

		objectOutput.writeLong(electronicsId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (electronicsName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(electronicsName);
		}

		objectOutput.writeLong(electronicsPrice);

		objectOutput.writeInt(electronicsCount);

		objectOutput.writeBoolean(electronicsInStock);

		objectOutput.writeBoolean(electronicsArchive);

		if (electronicsDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(electronicsDescription);
		}

		objectOutput.writeLong(electroTypeId);
	}

	public long mvccVersion;
	public long electronicsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String electronicsName;
	public long electronicsPrice;
	public int electronicsCount;
	public boolean electronicsInStock;
	public boolean electronicsArchive;
	public String electronicsDescription;
	public long electroTypeId;

}