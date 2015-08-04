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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the StatViewItemType service. Represents a row in the &quot;Subur_StatViewItemType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.idetronic.subur.model.impl.StatViewItemTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.idetronic.subur.model.impl.StatViewItemTypeImpl}.
 * </p>
 *
 * @author Mazlan Mat
 * @see StatViewItemType
 * @see com.idetronic.subur.model.impl.StatViewItemTypeImpl
 * @see com.idetronic.subur.model.impl.StatViewItemTypeModelImpl
 * @generated
 */
public interface StatViewItemTypeModel extends BaseModel<StatViewItemType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a stat view item type model instance should use the {@link StatViewItemType} interface instead.
	 */

	/**
	 * Returns the primary key of this stat view item type.
	 *
	 * @return the primary key of this stat view item type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this stat view item type.
	 *
	 * @param primaryKey the primary key of this stat view item type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this stat view item type.
	 *
	 * @return the ID of this stat view item type
	 */
	public long getId();

	/**
	 * Sets the ID of this stat view item type.
	 *
	 * @param id the ID of this stat view item type
	 */
	public void setId(long id);

	/**
	 * Returns the per month of this stat view item type.
	 *
	 * @return the per month of this stat view item type
	 */
	public int getPerMonth();

	/**
	 * Sets the per month of this stat view item type.
	 *
	 * @param perMonth the per month of this stat view item type
	 */
	public void setPerMonth(int perMonth);

	/**
	 * Returns the per year of this stat view item type.
	 *
	 * @return the per year of this stat view item type
	 */
	public int getPerYear();

	/**
	 * Sets the per year of this stat view item type.
	 *
	 * @param perYear the per year of this stat view item type
	 */
	public void setPerYear(int perYear);

	/**
	 * Returns the item type ID of this stat view item type.
	 *
	 * @return the item type ID of this stat view item type
	 */
	public long getItemTypeId();

	/**
	 * Sets the item type ID of this stat view item type.
	 *
	 * @param itemTypeId the item type ID of this stat view item type
	 */
	public void setItemTypeId(long itemTypeId);

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
		com.idetronic.subur.model.StatViewItemType statViewItemType);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.idetronic.subur.model.StatViewItemType> toCacheModel();

	@Override
	public com.idetronic.subur.model.StatViewItemType toEscapedModel();

	@Override
	public com.idetronic.subur.model.StatViewItemType toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}