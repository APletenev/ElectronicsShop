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

import test.es.data.model.ElectroType;

/**
 * The cache model class for representing ElectroType in entity cache.
 *
 * @author Andrey Pletenev
 * @generated
 */
public class ElectroTypeCacheModel
	implements CacheModel<ElectroType>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ElectroTypeCacheModel)) {
			return false;
		}

		ElectroTypeCacheModel electroTypeCacheModel =
			(ElectroTypeCacheModel)object;

		if ((electroTypeId == electroTypeCacheModel.electroTypeId) &&
			(mvccVersion == electroTypeCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, electroTypeId);

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
		StringBundler sb = new StringBundler(21);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", uuid=");
		sb.append(uuid);
		sb.append(", electroTypeId=");
		sb.append(electroTypeId);
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
		sb.append(", electroTypeName=");
		sb.append(electroTypeName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ElectroType toEntityModel() {
		ElectroTypeImpl electroTypeImpl = new ElectroTypeImpl();

		electroTypeImpl.setMvccVersion(mvccVersion);

		if (uuid == null) {
			electroTypeImpl.setUuid("");
		}
		else {
			electroTypeImpl.setUuid(uuid);
		}

		electroTypeImpl.setElectroTypeId(electroTypeId);
		electroTypeImpl.setGroupId(groupId);
		electroTypeImpl.setCompanyId(companyId);
		electroTypeImpl.setUserId(userId);

		if (userName == null) {
			electroTypeImpl.setUserName("");
		}
		else {
			electroTypeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			electroTypeImpl.setCreateDate(null);
		}
		else {
			electroTypeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			electroTypeImpl.setModifiedDate(null);
		}
		else {
			electroTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (electroTypeName == null) {
			electroTypeImpl.setElectroTypeName("");
		}
		else {
			electroTypeImpl.setElectroTypeName(electroTypeName);
		}

		electroTypeImpl.resetOriginalValues();

		return electroTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();
		uuid = objectInput.readUTF();

		electroTypeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		electroTypeName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(mvccVersion);

		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(electroTypeId);

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

		if (electroTypeName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(electroTypeName);
		}
	}

	public long mvccVersion;
	public String uuid;
	public long electroTypeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String electroTypeName;

}