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

import test.es.data.model.PositionType;

/**
 * The cache model class for representing PositionType in entity cache.
 *
 * @author Andrey Pletenev
 * @generated
 */
public class PositionTypeCacheModel
	implements CacheModel<PositionType>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PositionTypeCacheModel)) {
			return false;
		}

		PositionTypeCacheModel positionTypeCacheModel =
			(PositionTypeCacheModel)object;

		if ((positionId == positionTypeCacheModel.positionId) &&
			(mvccVersion == positionTypeCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, positionId);

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
		sb.append(", positionId=");
		sb.append(positionId);
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
		sb.append(", positionTypeName=");
		sb.append(positionTypeName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PositionType toEntityModel() {
		PositionTypeImpl positionTypeImpl = new PositionTypeImpl();

		positionTypeImpl.setMvccVersion(mvccVersion);

		if (uuid == null) {
			positionTypeImpl.setUuid("");
		}
		else {
			positionTypeImpl.setUuid(uuid);
		}

		positionTypeImpl.setPositionId(positionId);
		positionTypeImpl.setGroupId(groupId);
		positionTypeImpl.setCompanyId(companyId);
		positionTypeImpl.setUserId(userId);

		if (userName == null) {
			positionTypeImpl.setUserName("");
		}
		else {
			positionTypeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			positionTypeImpl.setCreateDate(null);
		}
		else {
			positionTypeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			positionTypeImpl.setModifiedDate(null);
		}
		else {
			positionTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (positionTypeName == null) {
			positionTypeImpl.setPositionTypeName("");
		}
		else {
			positionTypeImpl.setPositionTypeName(positionTypeName);
		}

		positionTypeImpl.resetOriginalValues();

		return positionTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();
		uuid = objectInput.readUTF();

		positionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		positionTypeName = objectInput.readUTF();
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

		objectOutput.writeLong(positionId);

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

		if (positionTypeName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(positionTypeName);
		}
	}

	public long mvccVersion;
	public String uuid;
	public long positionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String positionTypeName;

}