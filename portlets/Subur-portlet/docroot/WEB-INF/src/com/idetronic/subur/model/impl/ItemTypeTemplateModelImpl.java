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

import com.idetronic.subur.model.ItemTypeTemplate;
import com.idetronic.subur.model.ItemTypeTemplateModel;
import com.idetronic.subur.service.persistence.ItemTypeTemplatePK;

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
 * The base model implementation for the ItemTypeTemplate service. Represents a row in the &quot;subur_ItemTypeTemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.idetronic.subur.model.ItemTypeTemplateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ItemTypeTemplateImpl}.
 * </p>
 *
 * @author Mazlan Mat
 * @see ItemTypeTemplateImpl
 * @see com.idetronic.subur.model.ItemTypeTemplate
 * @see com.idetronic.subur.model.ItemTypeTemplateModel
 * @generated
 */
public class ItemTypeTemplateModelImpl extends BaseModelImpl<ItemTypeTemplate>
	implements ItemTypeTemplateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a item type template model instance should use the {@link com.idetronic.subur.model.ItemTypeTemplate} interface instead.
	 */
	public static final String TABLE_NAME = "subur_ItemTypeTemplate";
	public static final Object[][] TABLE_COLUMNS = {
			{ "itemTypeId", Types.BIGINT },
			{ "metadataPropertyId", Types.BIGINT },
			{ "required", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table subur_ItemTypeTemplate (itemTypeId LONG not null,metadataPropertyId LONG not null,required BOOLEAN,primary key (itemTypeId, metadataPropertyId))";
	public static final String TABLE_SQL_DROP = "drop table subur_ItemTypeTemplate";
	public static final String ORDER_BY_JPQL = " ORDER BY itemTypeTemplate.id.itemTypeId ASC, itemTypeTemplate.id.metadataPropertyId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY subur_ItemTypeTemplate.itemTypeId ASC, subur_ItemTypeTemplate.metadataPropertyId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.idetronic.subur.model.ItemTypeTemplate"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.idetronic.subur.model.ItemTypeTemplate"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.idetronic.subur.model.ItemTypeTemplate"));

	public ItemTypeTemplateModelImpl() {
	}

	@Override
	public ItemTypeTemplatePK getPrimaryKey() {
		return new ItemTypeTemplatePK(_itemTypeId, _metadataPropertyId);
	}

	@Override
	public void setPrimaryKey(ItemTypeTemplatePK primaryKey) {
		setItemTypeId(primaryKey.itemTypeId);
		setMetadataPropertyId(primaryKey.metadataPropertyId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new ItemTypeTemplatePK(_itemTypeId, _metadataPropertyId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((ItemTypeTemplatePK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return ItemTypeTemplate.class;
	}

	@Override
	public String getModelClassName() {
		return ItemTypeTemplate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemTypeId", getItemTypeId());
		attributes.put("metadataPropertyId", getMetadataPropertyId());
		attributes.put("required", getRequired());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemTypeId = (Long)attributes.get("itemTypeId");

		if (itemTypeId != null) {
			setItemTypeId(itemTypeId);
		}

		Long metadataPropertyId = (Long)attributes.get("metadataPropertyId");

		if (metadataPropertyId != null) {
			setMetadataPropertyId(metadataPropertyId);
		}

		Boolean required = (Boolean)attributes.get("required");

		if (required != null) {
			setRequired(required);
		}
	}

	@Override
	public long getItemTypeId() {
		return _itemTypeId;
	}

	@Override
	public void setItemTypeId(long itemTypeId) {
		_itemTypeId = itemTypeId;
	}

	@Override
	public long getMetadataPropertyId() {
		return _metadataPropertyId;
	}

	@Override
	public void setMetadataPropertyId(long metadataPropertyId) {
		_metadataPropertyId = metadataPropertyId;
	}

	@Override
	public boolean getRequired() {
		return _required;
	}

	@Override
	public boolean isRequired() {
		return _required;
	}

	@Override
	public void setRequired(boolean required) {
		_required = required;
	}

	@Override
	public ItemTypeTemplate toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ItemTypeTemplate)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ItemTypeTemplateImpl itemTypeTemplateImpl = new ItemTypeTemplateImpl();

		itemTypeTemplateImpl.setItemTypeId(getItemTypeId());
		itemTypeTemplateImpl.setMetadataPropertyId(getMetadataPropertyId());
		itemTypeTemplateImpl.setRequired(getRequired());

		itemTypeTemplateImpl.resetOriginalValues();

		return itemTypeTemplateImpl;
	}

	@Override
	public int compareTo(ItemTypeTemplate itemTypeTemplate) {
		ItemTypeTemplatePK primaryKey = itemTypeTemplate.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ItemTypeTemplate)) {
			return false;
		}

		ItemTypeTemplate itemTypeTemplate = (ItemTypeTemplate)obj;

		ItemTypeTemplatePK primaryKey = itemTypeTemplate.getPrimaryKey();

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
	}

	@Override
	public CacheModel<ItemTypeTemplate> toCacheModel() {
		ItemTypeTemplateCacheModel itemTypeTemplateCacheModel = new ItemTypeTemplateCacheModel();

		itemTypeTemplateCacheModel.itemTypeId = getItemTypeId();

		itemTypeTemplateCacheModel.metadataPropertyId = getMetadataPropertyId();

		itemTypeTemplateCacheModel.required = getRequired();

		return itemTypeTemplateCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{itemTypeId=");
		sb.append(getItemTypeId());
		sb.append(", metadataPropertyId=");
		sb.append(getMetadataPropertyId());
		sb.append(", required=");
		sb.append(getRequired());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.idetronic.subur.model.ItemTypeTemplate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>itemTypeId</column-name><column-value><![CDATA[");
		sb.append(getItemTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>metadataPropertyId</column-name><column-value><![CDATA[");
		sb.append(getMetadataPropertyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>required</column-name><column-value><![CDATA[");
		sb.append(getRequired());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ItemTypeTemplate.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ItemTypeTemplate.class
		};
	private long _itemTypeId;
	private long _metadataPropertyId;
	private boolean _required;
	private ItemTypeTemplate _escapedModel;
}