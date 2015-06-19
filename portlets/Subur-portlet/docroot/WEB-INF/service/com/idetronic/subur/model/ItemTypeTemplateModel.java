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

package com.idetronic.subur.model;

import com.idetronic.subur.service.persistence.ItemTypeTemplatePK;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ItemTypeTemplate service. Represents a row in the &quot;subur_ItemTypeTemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.idetronic.subur.model.impl.ItemTypeTemplateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.idetronic.subur.model.impl.ItemTypeTemplateImpl}.
 * </p>
 *
 * @author Mazlan Mat
 * @see ItemTypeTemplate
 * @see com.idetronic.subur.model.impl.ItemTypeTemplateImpl
 * @see com.idetronic.subur.model.impl.ItemTypeTemplateModelImpl
 * @generated
 */
public interface ItemTypeTemplateModel extends BaseModel<ItemTypeTemplate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a item type template model instance should use the {@link ItemTypeTemplate} interface instead.
	 */

	/**
	 * Returns the primary key of this item type template.
	 *
	 * @return the primary key of this item type template
	 */
	public ItemTypeTemplatePK getPrimaryKey();

	/**
	 * Sets the primary key of this item type template.
	 *
	 * @param primaryKey the primary key of this item type template
	 */
	public void setPrimaryKey(ItemTypeTemplatePK primaryKey);

	/**
	 * Returns the item type ID of this item type template.
	 *
	 * @return the item type ID of this item type template
	 */
	public long getItemTypeId();

	/**
	 * Sets the item type ID of this item type template.
	 *
	 * @param itemTypeId the item type ID of this item type template
	 */
	public void setItemTypeId(long itemTypeId);

	/**
	 * Returns the metadata property ID of this item type template.
	 *
	 * @return the metadata property ID of this item type template
	 */
	public long getMetadataPropertyId();

	/**
	 * Sets the metadata property ID of this item type template.
	 *
	 * @param metadataPropertyId the metadata property ID of this item type template
	 */
	public void setMetadataPropertyId(long metadataPropertyId);

	/**
	 * Returns the required of this item type template.
	 *
	 * @return the required of this item type template
	 */
	public boolean getRequired();

	/**
	 * Returns <code>true</code> if this item type template is required.
	 *
	 * @return <code>true</code> if this item type template is required; <code>false</code> otherwise
	 */
	public boolean isRequired();

	/**
	 * Sets whether this item type template is required.
	 *
	 * @param required the required of this item type template
	 */
	public void setRequired(boolean required);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.idetronic.subur.model.ItemTypeTemplate itemTypeTemplate);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.idetronic.subur.model.ItemTypeTemplate> toCacheModel();

	@Override
	public com.idetronic.subur.model.ItemTypeTemplate toEscapedModel();

	@Override
	public com.idetronic.subur.model.ItemTypeTemplate toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}