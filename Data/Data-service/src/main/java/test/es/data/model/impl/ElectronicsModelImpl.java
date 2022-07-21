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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

import test.es.data.model.Electronics;
import test.es.data.model.ElectronicsModel;
import test.es.data.model.ElectronicsSoap;

/**
 * The base model implementation for the Electronics service. Represents a row in the &quot;ES_Electronics&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>ElectronicsModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ElectronicsImpl}.
 * </p>
 *
 * @author Andrey Pletenev
 * @see ElectronicsImpl
 * @generated
 */
@JSON(strict = true)
public class ElectronicsModelImpl
	extends BaseModelImpl<Electronics> implements ElectronicsModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a electronics model instance should use the <code>Electronics</code> interface instead.
	 */
	public static final String TABLE_NAME = "ES_Electronics";

	public static final Object[][] TABLE_COLUMNS = {
		{"mvccVersion", Types.BIGINT}, {"uuid_", Types.VARCHAR},
		{"electronicsId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"electronicsName", Types.VARCHAR},
		{"electroTypeId", Types.BIGINT}, {"electronicsPrice", Types.BIGINT},
		{"electronicsCount", Types.INTEGER},
		{"electronicsInStock", Types.BOOLEAN},
		{"electronicsArchive", Types.BOOLEAN},
		{"electronicsDescription", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("mvccVersion", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("electronicsId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("electronicsName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("electroTypeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("electronicsPrice", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("electronicsCount", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("electronicsInStock", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("electronicsArchive", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("electronicsDescription", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ES_Electronics (mvccVersion LONG default 0 not null,uuid_ VARCHAR(75) null,electronicsId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,electronicsName VARCHAR(150) null,electroTypeId LONG,electronicsPrice LONG,electronicsCount INTEGER,electronicsInStock BOOLEAN,electronicsArchive BOOLEAN,electronicsDescription TEXT null)";

	public static final String TABLE_SQL_DROP = "drop table ES_Electronics";

	public static final String ORDER_BY_JPQL =
		" ORDER BY electronics.electronicsName ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ES_Electronics.electronicsName ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ELECTRONICSNAME_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static Electronics toModel(ElectronicsSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Electronics model = new ElectronicsImpl();

		model.setMvccVersion(soapModel.getMvccVersion());
		model.setUuid(soapModel.getUuid());
		model.setElectronicsId(soapModel.getElectronicsId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setElectronicsName(soapModel.getElectronicsName());
		model.setElectroTypeId(soapModel.getElectroTypeId());
		model.setElectronicsPrice(soapModel.getElectronicsPrice());
		model.setElectronicsCount(soapModel.getElectronicsCount());
		model.setElectronicsInStock(soapModel.getElectronicsInStock());
		model.setElectronicsArchive(soapModel.isElectronicsArchive());
		model.setElectronicsDescription(soapModel.getElectronicsDescription());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<Electronics> toModels(ElectronicsSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Electronics> models = new ArrayList<Electronics>(
			soapModels.length);

		for (ElectronicsSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public ElectronicsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _electronicsId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setElectronicsId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _electronicsId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Electronics.class;
	}

	@Override
	public String getModelClassName() {
		return Electronics.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Electronics, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Electronics, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Electronics, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((Electronics)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Electronics, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Electronics, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Electronics)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Electronics, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Electronics, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Electronics>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Electronics.class.getClassLoader(), Electronics.class,
			ModelWrapper.class);

		try {
			Constructor<Electronics> constructor =
				(Constructor<Electronics>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Electronics, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Electronics, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Electronics, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Electronics, Object>>();
		Map<String, BiConsumer<Electronics, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Electronics, ?>>();

		attributeGetterFunctions.put(
			"mvccVersion", Electronics::getMvccVersion);
		attributeSetterBiConsumers.put(
			"mvccVersion",
			(BiConsumer<Electronics, Long>)Electronics::setMvccVersion);
		attributeGetterFunctions.put("uuid", Electronics::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Electronics, String>)Electronics::setUuid);
		attributeGetterFunctions.put(
			"electronicsId", Electronics::getElectronicsId);
		attributeSetterBiConsumers.put(
			"electronicsId",
			(BiConsumer<Electronics, Long>)Electronics::setElectronicsId);
		attributeGetterFunctions.put("groupId", Electronics::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Electronics, Long>)Electronics::setGroupId);
		attributeGetterFunctions.put("companyId", Electronics::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<Electronics, Long>)Electronics::setCompanyId);
		attributeGetterFunctions.put("userId", Electronics::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Electronics, Long>)Electronics::setUserId);
		attributeGetterFunctions.put("userName", Electronics::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<Electronics, String>)Electronics::setUserName);
		attributeGetterFunctions.put("createDate", Electronics::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<Electronics, Date>)Electronics::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", Electronics::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<Electronics, Date>)Electronics::setModifiedDate);
		attributeGetterFunctions.put(
			"electronicsName", Electronics::getElectronicsName);
		attributeSetterBiConsumers.put(
			"electronicsName",
			(BiConsumer<Electronics, String>)Electronics::setElectronicsName);
		attributeGetterFunctions.put(
			"electroTypeId", Electronics::getElectroTypeId);
		attributeSetterBiConsumers.put(
			"electroTypeId",
			(BiConsumer<Electronics, Long>)Electronics::setElectroTypeId);
		attributeGetterFunctions.put(
			"electronicsPrice", Electronics::getElectronicsPrice);
		attributeSetterBiConsumers.put(
			"electronicsPrice",
			(BiConsumer<Electronics, Long>)Electronics::setElectronicsPrice);
		attributeGetterFunctions.put(
			"electronicsCount", Electronics::getElectronicsCount);
		attributeSetterBiConsumers.put(
			"electronicsCount",
			(BiConsumer<Electronics, Integer>)Electronics::setElectronicsCount);
		attributeGetterFunctions.put(
			"electronicsInStock", Electronics::getElectronicsInStock);
		attributeSetterBiConsumers.put(
			"electronicsInStock",
			(BiConsumer<Electronics, Boolean>)
				Electronics::setElectronicsInStock);
		attributeGetterFunctions.put(
			"electronicsArchive", Electronics::getElectronicsArchive);
		attributeSetterBiConsumers.put(
			"electronicsArchive",
			(BiConsumer<Electronics, Boolean>)
				Electronics::setElectronicsArchive);
		attributeGetterFunctions.put(
			"electronicsDescription", Electronics::getElectronicsDescription);
		attributeSetterBiConsumers.put(
			"electronicsDescription",
			(BiConsumer<Electronics, String>)
				Electronics::setElectronicsDescription);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getMvccVersion() {
		return _mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_mvccVersion = mvccVersion;
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getElectronicsId() {
		return _electronicsId;
	}

	@Override
	public void setElectronicsId(long electronicsId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_electronicsId = electronicsId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getElectronicsName() {
		if (_electronicsName == null) {
			return "";
		}
		else {
			return _electronicsName;
		}
	}

	@Override
	public void setElectronicsName(String electronicsName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_electronicsName = electronicsName;
	}

	@JSON
	@Override
	public long getElectroTypeId() {
		return _electroTypeId;
	}

	@Override
	public void setElectroTypeId(long electroTypeId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_electroTypeId = electroTypeId;
	}

	@JSON
	@Override
	public long getElectronicsPrice() {
		return _electronicsPrice;
	}

	@Override
	public void setElectronicsPrice(long electronicsPrice) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_electronicsPrice = electronicsPrice;
	}

	@JSON
	@Override
	public int getElectronicsCount() {
		return _electronicsCount;
	}

	@Override
	public void setElectronicsCount(int electronicsCount) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_electronicsCount = electronicsCount;
	}

	@JSON
	@Override
	public Boolean getElectronicsInStock() {
		return _electronicsInStock;
	}

	@Override
	public void setElectronicsInStock(Boolean electronicsInStock) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_electronicsInStock = electronicsInStock;
	}

	@JSON
	@Override
	public boolean getElectronicsArchive() {
		return _electronicsArchive;
	}

	@JSON
	@Override
	public boolean isElectronicsArchive() {
		return _electronicsArchive;
	}

	@Override
	public void setElectronicsArchive(boolean electronicsArchive) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_electronicsArchive = electronicsArchive;
	}

	@JSON
	@Override
	public String getElectronicsDescription() {
		if (_electronicsDescription == null) {
			return "";
		}
		else {
			return _electronicsDescription;
		}
	}

	@Override
	public void setElectronicsDescription(String electronicsDescription) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_electronicsDescription = electronicsDescription;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Electronics.class.getName()));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Electronics.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Electronics toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Electronics>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ElectronicsImpl electronicsImpl = new ElectronicsImpl();

		electronicsImpl.setMvccVersion(getMvccVersion());
		electronicsImpl.setUuid(getUuid());
		electronicsImpl.setElectronicsId(getElectronicsId());
		electronicsImpl.setGroupId(getGroupId());
		electronicsImpl.setCompanyId(getCompanyId());
		electronicsImpl.setUserId(getUserId());
		electronicsImpl.setUserName(getUserName());
		electronicsImpl.setCreateDate(getCreateDate());
		electronicsImpl.setModifiedDate(getModifiedDate());
		electronicsImpl.setElectronicsName(getElectronicsName());
		electronicsImpl.setElectroTypeId(getElectroTypeId());
		electronicsImpl.setElectronicsPrice(getElectronicsPrice());
		electronicsImpl.setElectronicsCount(getElectronicsCount());
		electronicsImpl.setElectronicsInStock(getElectronicsInStock());
		electronicsImpl.setElectronicsArchive(isElectronicsArchive());
		electronicsImpl.setElectronicsDescription(getElectronicsDescription());

		electronicsImpl.resetOriginalValues();

		return electronicsImpl;
	}

	@Override
	public int compareTo(Electronics electronics) {
		int value = 0;

		value = getElectronicsName().compareTo(
			electronics.getElectronicsName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Electronics)) {
			return false;
		}

		Electronics electronics = (Electronics)object;

		long primaryKey = electronics.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Electronics> toCacheModel() {
		ElectronicsCacheModel electronicsCacheModel =
			new ElectronicsCacheModel();

		electronicsCacheModel.mvccVersion = getMvccVersion();

		electronicsCacheModel.uuid = getUuid();

		String uuid = electronicsCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			electronicsCacheModel.uuid = null;
		}

		electronicsCacheModel.electronicsId = getElectronicsId();

		electronicsCacheModel.groupId = getGroupId();

		electronicsCacheModel.companyId = getCompanyId();

		electronicsCacheModel.userId = getUserId();

		electronicsCacheModel.userName = getUserName();

		String userName = electronicsCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			electronicsCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			electronicsCacheModel.createDate = createDate.getTime();
		}
		else {
			electronicsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			electronicsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			electronicsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		electronicsCacheModel.electronicsName = getElectronicsName();

		String electronicsName = electronicsCacheModel.electronicsName;

		if ((electronicsName != null) && (electronicsName.length() == 0)) {
			electronicsCacheModel.electronicsName = null;
		}

		electronicsCacheModel.electroTypeId = getElectroTypeId();

		electronicsCacheModel.electronicsPrice = getElectronicsPrice();

		electronicsCacheModel.electronicsCount = getElectronicsCount();

		Boolean electronicsInStock = getElectronicsInStock();

		if (electronicsInStock != null) {
			electronicsCacheModel.electronicsInStock = electronicsInStock;
		}

		electronicsCacheModel.electronicsArchive = isElectronicsArchive();

		electronicsCacheModel.electronicsDescription =
			getElectronicsDescription();

		String electronicsDescription =
			electronicsCacheModel.electronicsDescription;

		if ((electronicsDescription != null) &&
			(electronicsDescription.length() == 0)) {

			electronicsCacheModel.electronicsDescription = null;
		}

		return electronicsCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Electronics, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Electronics, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Electronics, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Electronics)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Electronics, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Electronics, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Electronics, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Electronics)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Electronics>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

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
	private boolean _setModifiedDate;
	private String _electronicsName;
	private long _electroTypeId;
	private long _electronicsPrice;
	private int _electronicsCount;
	private Boolean _electronicsInStock;
	private boolean _electronicsArchive;
	private String _electronicsDescription;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Electronics, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Electronics)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("mvccVersion", _mvccVersion);
		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("electronicsId", _electronicsId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("electronicsName", _electronicsName);
		_columnOriginalValues.put("electroTypeId", _electroTypeId);
		_columnOriginalValues.put("electronicsPrice", _electronicsPrice);
		_columnOriginalValues.put("electronicsCount", _electronicsCount);
		_columnOriginalValues.put("electronicsInStock", _electronicsInStock);
		_columnOriginalValues.put("electronicsArchive", _electronicsArchive);
		_columnOriginalValues.put(
			"electronicsDescription", _electronicsDescription);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("mvccVersion", 1L);

		columnBitmasks.put("uuid_", 2L);

		columnBitmasks.put("electronicsId", 4L);

		columnBitmasks.put("groupId", 8L);

		columnBitmasks.put("companyId", 16L);

		columnBitmasks.put("userId", 32L);

		columnBitmasks.put("userName", 64L);

		columnBitmasks.put("createDate", 128L);

		columnBitmasks.put("modifiedDate", 256L);

		columnBitmasks.put("electronicsName", 512L);

		columnBitmasks.put("electroTypeId", 1024L);

		columnBitmasks.put("electronicsPrice", 2048L);

		columnBitmasks.put("electronicsCount", 4096L);

		columnBitmasks.put("electronicsInStock", 8192L);

		columnBitmasks.put("electronicsArchive", 16384L);

		columnBitmasks.put("electronicsDescription", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Electronics _escapedModel;

}