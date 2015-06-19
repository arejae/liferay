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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the MetadataProperty service. Represents a row in the &quot;subur_MetadataProperty&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.idetronic.subur.model.impl.MetadataPropertyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.idetronic.subur.model.impl.MetadataPropertyImpl}.
 * </p>
 *
 * @author Mazlan Mat
 * @see MetadataProperty
 * @see com.idetronic.subur.model.impl.MetadataPropertyImpl
 * @see com.idetronic.subur.model.impl.MetadataPropertyModelImpl
 * @generated
 */
public interface MetadataPropertyModel extends BaseModel<MetadataProperty> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a metadata property model instance should use the {@link MetadataProperty} interface instead.
	 */

	/**
	 * Returns the primary key of this metadata property.
	 *
	 * @return the primary key of this metadata property
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this metadata property.
	 *
	 * @param primaryKey the primary key of this metadata property
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the metadata property ID of this metadata property.
	 *
	 * @return the metadata property ID of this metadata property
	 */
	public long getMetadataPropertyId();

	/**
	 * Sets the metadata property ID of this metadata property.
	 *
	 * @param metadataPropertyId the metadata property ID of this metadata property
	 */
	public void setMetadataPropertyId(long metadataPropertyId);

	/**
	 * Returns the metadata schema ID of this metadata property.
	 *
	 * @return the metadata schema ID of this metadata property
	 */
	public long getMetadataSchemaId();

	/**
	 * Sets the metadata schema ID of this metadata property.
	 *
	 * @param metadataSchemaId the metadata schema ID of this metadata property
	 */
	public void setMetadataSchemaId(long metadataSchemaId);

	/**
	 * Returns the element of this metadata property.
	 *
	 * @return the element of this metadata property
	 */
	@AutoEscape
	public String getElement();

	/**
	 * Sets the element of this metadata property.
	 *
	 * @param element the element of this metadata property
	 */
	public void setElement(String element);

	/**
	 * Returns the scope of this metadata property.
	 *
	 * @return the scope of this metadata property
	 */
	@AutoEscape
	public String getScope();

	/**
	 * Sets the scope of this metadata property.
	 *
	 * @param scope the scope of this metadata property
	 */
	public void setScope(String scope);

	/**
	 * Returns the note of this metadata property.
	 *
	 * @return the note of this metadata property
	 */
	@AutoEscape
	public String getNote();

	/**
	 * Sets the note of this metadata property.
	 *
	 * @param note the note of this metadata property
	 */
	public void setNote(String note);

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
		com.idetronic.subur.model.MetadataProperty metadataProperty);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.idetronic.subur.model.MetadataProperty> toCacheModel();

	@Override
	public com.idetronic.subur.model.MetadataProperty toEscapedModel();

	@Override
	public com.idetronic.subur.model.MetadataProperty toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}