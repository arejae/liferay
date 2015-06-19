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

import com.idetronic.subur.model.ItemDivision;
import com.idetronic.subur.model.ItemDivisionModel;
import com.idetronic.subur.service.persistence.ItemDivisionPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ItemDivision service. Represents a row in the &quot;subur_ItemDivision&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.idetronic.subur.model.ItemDivisionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ItemDivisionImpl}.
 * </p>
 *
 * @author Mazlan Mat
 * @see ItemDivisionImpl
 * @see com.idetronic.subur.model.ItemDivision
 * @see com.idetronic.subur.model.ItemDivisionModel
 * @generated
 */
public class ItemDivisionModelImpl extends BaseModelImpl<ItemDivision>
	implements ItemDivisionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a item division model instance should use the {@link com.idetronic.subur.model.ItemDivision} interface instead.
	 */
	public static final String TABLE_NAME = "subur_ItemDivision";
	public static final Object[][] TABLE_COLUMNS = {
			{ "itemId", Types.BIGINT },
			{ "divisionId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table subur_ItemDivision (itemId LONG not null,divisionId LONG not null,primary key (itemId, divisionId))";
	public static final String TABLE_SQL_DROP = "drop table subur_ItemDivision";
	public static final String ORDER_BY_JPQL = " ORDER BY itemDivision.id.itemId ASC, itemDivision.id.divisionId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY subur_ItemDivision.itemId ASC, subur_ItemDivision.divisionId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.idetronic.subur.model.ItemDivision"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.idetronic.subur.model.ItemDivision"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.idetronic.subur.model.ItemDivision"),
			true);
	public static long DIVISIONID_COLUMN_BITMASK = 1L;
	public static long ITEMID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.idetronic.subur.model.ItemDivision"));

	public ItemDivisionModelImpl() {
	}

	@Override
	public ItemDivisionPK getPrimaryKey() {
		return new ItemDivisionPK(_itemId, _divisionId);
	}

	@Override
	public void setPrimaryKey(ItemDivisionPK primaryKey) {
		setItemId(primaryKey.itemId);
		setDivisionId(primaryKey.divisionId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new ItemDivisionPK(_itemId, _divisionId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((ItemDivisionPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return ItemDivision.class;
	}

	@Override
	public String getModelClassName() {
		return ItemDivision.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemId", getItemId());
		attributes.put("divisionId", getDivisionId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemId = (Long)attributes.get("itemId");

		if (itemId != null) {
			setItemId(itemId);
		}

		Long divisionId = (Long)attributes.get("divisionId");

		if (divisionId != null) {
			setDivisionId(divisionId);
		}
	}

	@Override
	public long getItemId() {
		return _itemId;
	}

	@Override
	public void setItemId(long itemId) {
		_columnBitmask |= ITEMID_COLUMN_BITMASK;

		if (!_setOriginalItemId) {
			_setOriginalItemId = true;

			_originalItemId = _itemId;
		}

		_itemId = itemId;
	}

	public long getOriginalItemId() {
		return _originalItemId;
	}

	@Override
	public long getDivisionId() {
		return _divisionId;
	}

	@Override
	public void setDivisionId(long divisionId) {
		_columnBitmask |= DIVISIONID_COLUMN_BITMASK;

		if (!_setOriginalDivisionId) {
			_setOriginalDivisionId = true;

			_originalDivisionId = _divisionId;
		}

		_divisionId = divisionId;
	}

	public long getOriginalDivisionId() {
		return _originalDivisionId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ItemDivision toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ItemDivision)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ItemDivisionImpl itemDivisionImpl = new ItemDivisionImpl();

		itemDivisionImpl.setItemId(getItemId());
		itemDivisionImpl.setDivisionId(getDivisionId());

		itemDivisionImpl.resetOriginalValues();

		return itemDivisionImpl;
	}

	@Override
	public int compareTo(ItemDivision itemDivision) {
		ItemDivisionPK primaryKey = itemDivision.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ItemDivision)) {
			return false;
		}

		ItemDivision itemDivision = (ItemDivision)obj;

		ItemDivisionPK primaryKey = itemDivision.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
		ItemDivisionModelImpl itemDivisionModelImpl = this;

		itemDivisionModelImpl._originalItemId = itemDivisionModelImpl._itemId;

		itemDivisionModelImpl._setOriginalItemId = false;

		itemDivisionModelImpl._originalDivisionId = itemDivisionModelImpl._divisionId;

		itemDivisionModelImpl._setOriginalDivisionId = false;

		itemDivisionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ItemDivision> toCacheModel() {
		ItemDivisionCacheModel itemDivisionCacheModel = new ItemDivisionCacheModel();

		itemDivisionCacheModel.itemId = getItemId();

		itemDivisionCacheModel.divisionId = getDivisionId();

		return itemDivisionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{itemId=");
		sb.append(getItemId());
		sb.append(", divisionId=");
		sb.append(getDivisionId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.idetronic.subur.model.ItemDivision");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>itemId</column-name><column-value><![CDATA[");
		sb.append(getItemId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>divisionId</column-name><column-value><![CDATA[");
		sb.append(getDivisionId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ItemDivision.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ItemDivision.class
		};
	private long _itemId;
	private long _originalItemId;
	private boolean _setOriginalItemId;
	private long _divisionId;
	private long _originalDivisionId;
	private boolean _setOriginalDivisionId;
	private long _columnBitmask;
	private ItemDivision _escapedModel;
}