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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the PurchaseType service. Represents a row in the &quot;ES_PurchaseType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>test.es.data.model.impl.PurchaseTypeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>test.es.data.model.impl.PurchaseTypeImpl</code>.
 * </p>
 *
 * @author Andrey Pletenev
 * @see PurchaseType
 * @generated
 */
@ProviderType
public interface PurchaseTypeModel
	extends BaseModel<PurchaseType>, GroupedModel, MVCCModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a purchase type model instance should use the {@link PurchaseType} interface instead.
	 */

	/**
	 * Returns the primary key of this purchase type.
	 *
	 * @return the primary key of this purchase type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this purchase type.
	 *
	 * @param primaryKey the primary key of this purchase type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this purchase type.
	 *
	 * @return the mvcc version of this purchase type
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this purchase type.
	 *
	 * @param mvccVersion the mvcc version of this purchase type
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the uuid of this purchase type.
	 *
	 * @return the uuid of this purchase type
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this purchase type.
	 *
	 * @param uuid the uuid of this purchase type
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the purchase type ID of this purchase type.
	 *
	 * @return the purchase type ID of this purchase type
	 */
	public long getPurchaseTypeId();

	/**
	 * Sets the purchase type ID of this purchase type.
	 *
	 * @param purchaseTypeId the purchase type ID of this purchase type
	 */
	public void setPurchaseTypeId(long purchaseTypeId);

	/**
	 * Returns the group ID of this purchase type.
	 *
	 * @return the group ID of this purchase type
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this purchase type.
	 *
	 * @param groupId the group ID of this purchase type
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this purchase type.
	 *
	 * @return the company ID of this purchase type
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this purchase type.
	 *
	 * @param companyId the company ID of this purchase type
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this purchase type.
	 *
	 * @return the user ID of this purchase type
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this purchase type.
	 *
	 * @param userId the user ID of this purchase type
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this purchase type.
	 *
	 * @return the user uuid of this purchase type
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this purchase type.
	 *
	 * @param userUuid the user uuid of this purchase type
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this purchase type.
	 *
	 * @return the user name of this purchase type
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this purchase type.
	 *
	 * @param userName the user name of this purchase type
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this purchase type.
	 *
	 * @return the create date of this purchase type
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this purchase type.
	 *
	 * @param createDate the create date of this purchase type
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this purchase type.
	 *
	 * @return the modified date of this purchase type
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this purchase type.
	 *
	 * @param modifiedDate the modified date of this purchase type
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the purchase type name of this purchase type.
	 *
	 * @return the purchase type name of this purchase type
	 */
	@AutoEscape
	public String getPurchaseTypeName();

	/**
	 * Sets the purchase type name of this purchase type.
	 *
	 * @param purchaseTypeName the purchase type name of this purchase type
	 */
	public void setPurchaseTypeName(String purchaseTypeName);

}