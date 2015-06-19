/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.idetronic.subur.model.impl;

import com.idetronic.subur.model.SuburItem;
import com.idetronic.subur.model.SuburItemModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the SuburItem service. Represents a row in the &quot;subur_item&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.idetronic.subur.model.SuburItemModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SuburItemImpl}.
 * </p>
 *
 * @author Mazlan Mat
 * @see SuburItemImpl
 * @see com.idetronic.subur.model.SuburItem
 * @see com.idetronic.subur.model.SuburItemModel
 * @generated
 */
public class SuburItemModelImpl extends BaseModelImpl<SuburItem>
	implements SuburItemModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a subur item model instance should use the {@link com.idetronic.subur.model.SuburItem} interface instead.
	 */
	public static final String TABLE_NAME = "subur_item";
	public static final Object[][] TABLE_COLUMNS = {
			{ "itemId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "title", Types.VARCHAR },
			{ "itemAbstract", Types.CLOB },
			{ "status", Types.INTEGER },
			{ "Uuid", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table subur_item (itemId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,title VARCHAR(255) null,itemAbstract TEXT null,status INTEGER,Uuid VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table subur_item";
	public static final String ORDER_BY_JPQL = " ORDER BY suburItem.createDate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY subur_item.createDate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.idetronic.subur.model.SuburItem"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.idetronic.subur.model.SuburItem"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.idetronic.subur.model.SuburItem"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long STATUS_COLUMN_BITMASK = 2L;
	public static long CREATEDATE_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.idetronic.subur.model.SuburItem"));

	public SuburItemModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _itemId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setItemId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _itemId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SuburItem.class;
	}

	@Override
	public String getModelClassName() {
		return SuburItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemId", getItemId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("itemAbstract", getItemAbstract());
		attributes.put("status", getStatus());
		attributes.put("Uuid", getUuid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemId = (Long)attributes.get("itemId");

		if (itemId != null) {
			setItemId(itemId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String itemAbstract = (String)attributes.get("itemAbstract");

		if (itemAbstract != null) {
			setItemAbstract(itemAbstract);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String Uuid = (String)attributes.get("Uuid");

		if (Uuid != null) {
			setUuid(Uuid);
		}
	}

	@Override
	public long getItemId() {
		return _itemId;
	}

	@Override
	public void setItemId(long itemId) {
		_itemId = itemId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@Override
	public String getItemAbstract() {
		if (_itemAbstract == null) {
			return StringPool.BLANK;
		}
		else {
			return _itemAbstract;
		}
	}

	@Override
	public void setItemAbstract(String itemAbstract) {
		_itemAbstract = itemAbstract;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	@Override
	public String getUuid() {
		if (_Uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _Uuid;
		}
	}

	@Override
	public void setUuid(String Uuid) {
		_Uuid = Uuid;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			SuburItem.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SuburItem toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SuburItem)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SuburItemImpl suburItemImpl = new SuburItemImpl();

		suburItemImpl.setItemId(getItemId());
		suburItemImpl.setCompanyId(getCompanyId());
		suburItemImpl.setGroupId(getGroupId());
		suburItemImpl.setUserId(getUserId());
		suburItemImpl.setUserName(getUserName());
		suburItemImpl.setCreateDate(getCreateDate());
		suburItemImpl.setModifiedDate(getModifiedDate());
		suburItemImpl.setTitle(getTitle());
		suburItemImpl.setItemAbstract(getItemAbstract());
		suburItemImpl.setStatus(getStatus());
		suburItemImpl.setUuid(getUuid());

		suburItemImpl.resetOriginalValues();

		return suburItemImpl;
	}

	@Override
	public int compareTo(SuburItem suburItem) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), suburItem.getCreateDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SuburItem)) {
			return false;
		}

		SuburItem suburItem = (SuburItem)obj;

		long primaryKey = suburItem.getPrimaryKey();

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

	@Override
	public void resetOriginalValues() {
		SuburItemModelImpl suburItemModelImpl = this;

		suburItemModelImpl._originalGroupId = suburItemModelImpl._groupId;

		suburItemModelImpl._setOriginalGroupId = false;

		suburItemModelImpl._originalStatus = suburItemModelImpl._status;

		suburItemModelImpl._setOriginalStatus = false;

		suburItemModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SuburItem> toCacheModel() {
		SuburItemCacheModel suburItemCacheModel = new SuburItemCacheModel();

		suburItemCacheModel.itemId = getItemId();

		suburItemCacheModel.companyId = getCompanyId();

		suburItemCacheModel.groupId = getGroupId();

		suburItemCacheModel.userId = getUserId();

		suburItemCacheModel.userName = getUserName();

		String userName = suburItemCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			suburItemCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			suburItemCacheModel.createDate = createDate.getTime();
		}
		else {
			suburItemCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			suburItemCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			suburItemCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		suburItemCacheModel.title = getTitle();

		String title = suburItemCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			suburItemCacheModel.title = null;
		}

		suburItemCacheModel.itemAbstract = getItemAbstract();

		String itemAbstract = suburItemCacheModel.itemAbstract;

		if ((itemAbstract != null) && (itemAbstract.length() == 0)) {
			suburItemCacheModel.itemAbstract = null;
		}

		suburItemCacheModel.status = getStatus();

		suburItemCacheModel.Uuid = getUuid();

		String Uuid = suburItemCacheModel.Uuid;

		if ((Uuid != null) && (Uuid.length() == 0)) {
			suburItemCacheModel.Uuid = null;
		}

		return suburItemCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{itemId=");
		sb.append(getItemId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", itemAbstract=");
		sb.append(getItemAbstract());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", Uuid=");
		sb.append(getUuid());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.idetronic.subur.model.SuburItem");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>itemId</column-name><column-value><![CDATA[");
		sb.append(getItemId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itemAbstract</column-name><column-value><![CDATA[");
		sb.append(getItemAbstract());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SuburItem.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SuburItem.class
		};
	private long _itemId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _title;
	private String _itemAbstract;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private String _Uuid;
	private long _columnBitmask;
	private SuburItem _escapedModel;
}