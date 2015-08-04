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

import com.idetronic.subur.model.StatViewPeriod;
import com.idetronic.subur.model.StatViewPeriodModel;
import com.idetronic.subur.model.StatViewPeriodSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the StatViewPeriod service. Represents a row in the &quot;subur_StatViewPeriod&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.idetronic.subur.model.StatViewPeriodModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link StatViewPeriodImpl}.
 * </p>
 *
 * @author Mazlan Mat
 * @see StatViewPeriodImpl
 * @see com.idetronic.subur.model.StatViewPeriod
 * @see com.idetronic.subur.model.StatViewPeriodModel
 * @generated
 */
@JSON(strict = true)
public class StatViewPeriodModelImpl extends BaseModelImpl<StatViewPeriod>
	implements StatViewPeriodModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a stat view period model instance should use the {@link com.idetronic.subur.model.StatViewPeriod} interface instead.
	 */
	public static final String TABLE_NAME = "subur_StatViewPeriod";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "itemId", Types.BIGINT },
			{ "perMonth", Types.INTEGER },
			{ "perYear", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table subur_StatViewPeriod (id_ LONG not null primary key,itemId LONG,perMonth INTEGER,perYear INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table subur_StatViewPeriod";
	public static final String ORDER_BY_JPQL = " ORDER BY statViewPeriod.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY subur_StatViewPeriod.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.idetronic.subur.model.StatViewPeriod"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.idetronic.subur.model.StatViewPeriod"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.idetronic.subur.model.StatViewPeriod"),
			true);
	public static long ITEMID_COLUMN_BITMASK = 1L;
	public static long ID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static StatViewPeriod toModel(StatViewPeriodSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		StatViewPeriod model = new StatViewPeriodImpl();

		model.setId(soapModel.getId());
		model.setItemId(soapModel.getItemId());
		model.setPerMonth(soapModel.getPerMonth());
		model.setPerYear(soapModel.getPerYear());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<StatViewPeriod> toModels(StatViewPeriodSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<StatViewPeriod> models = new ArrayList<StatViewPeriod>(soapModels.length);

		for (StatViewPeriodSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.idetronic.subur.model.StatViewPeriod"));

	public StatViewPeriodModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return StatViewPeriod.class;
	}

	@Override
	public String getModelClassName() {
		return StatViewPeriod.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("itemId", getItemId());
		attributes.put("perMonth", getPerMonth());
		attributes.put("perYear", getPerYear());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long itemId = (Long)attributes.get("itemId");

		if (itemId != null) {
			setItemId(itemId);
		}

		Integer perMonth = (Integer)attributes.get("perMonth");

		if (perMonth != null) {
			setPerMonth(perMonth);
		}

		Integer perYear = (Integer)attributes.get("perYear");

		if (perYear != null) {
			setPerYear(perYear);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@JSON
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

	@JSON
	@Override
	public int getPerMonth() {
		return _perMonth;
	}

	@Override
	public void setPerMonth(int perMonth) {
		_perMonth = perMonth;
	}

	@JSON
	@Override
	public int getPerYear() {
		return _perYear;
	}

	@Override
	public void setPerYear(int perYear) {
		_perYear = perYear;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			StatViewPeriod.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public StatViewPeriod toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (StatViewPeriod)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		StatViewPeriodImpl statViewPeriodImpl = new StatViewPeriodImpl();

		statViewPeriodImpl.setId(getId());
		statViewPeriodImpl.setItemId(getItemId());
		statViewPeriodImpl.setPerMonth(getPerMonth());
		statViewPeriodImpl.setPerYear(getPerYear());

		statViewPeriodImpl.resetOriginalValues();

		return statViewPeriodImpl;
	}

	@Override
	public int compareTo(StatViewPeriod statViewPeriod) {
		long primaryKey = statViewPeriod.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StatViewPeriod)) {
			return false;
		}

		StatViewPeriod statViewPeriod = (StatViewPeriod)obj;

		long primaryKey = statViewPeriod.getPrimaryKey();

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
		StatViewPeriodModelImpl statViewPeriodModelImpl = this;

		statViewPeriodModelImpl._originalItemId = statViewPeriodModelImpl._itemId;

		statViewPeriodModelImpl._setOriginalItemId = false;

		statViewPeriodModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<StatViewPeriod> toCacheModel() {
		StatViewPeriodCacheModel statViewPeriodCacheModel = new StatViewPeriodCacheModel();

		statViewPeriodCacheModel.id = getId();

		statViewPeriodCacheModel.itemId = getItemId();

		statViewPeriodCacheModel.perMonth = getPerMonth();

		statViewPeriodCacheModel.perYear = getPerYear();

		return statViewPeriodCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", itemId=");
		sb.append(getItemId());
		sb.append(", perMonth=");
		sb.append(getPerMonth());
		sb.append(", perYear=");
		sb.append(getPerYear());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.idetronic.subur.model.StatViewPeriod");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itemId</column-name><column-value><![CDATA[");
		sb.append(getItemId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>perMonth</column-name><column-value><![CDATA[");
		sb.append(getPerMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>perYear</column-name><column-value><![CDATA[");
		sb.append(getPerYear());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = StatViewPeriod.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			StatViewPeriod.class
		};
	private long _id;
	private long _itemId;
	private long _originalItemId;
	private boolean _setOriginalItemId;
	private int _perMonth;
	private int _perYear;
	private long _columnBitmask;
	private StatViewPeriod _escapedModel;
}