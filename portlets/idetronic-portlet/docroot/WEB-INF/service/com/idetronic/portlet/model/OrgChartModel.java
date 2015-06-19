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

package com.idetronic.portlet.model;

import com.idetronic.portlet.service.persistence.OrgChartPK;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the OrgChart service. Represents a row in the &quot;ide_OrgChart&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.idetronic.portlet.model.impl.OrgChartModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.idetronic.portlet.model.impl.OrgChartImpl}.
 * </p>
 *
 * @author Mazlan Mat
 * @see OrgChart
 * @see com.idetronic.portlet.model.impl.OrgChartImpl
 * @see com.idetronic.portlet.model.impl.OrgChartModelImpl
 * @generated
 */
public interface OrgChartModel extends BaseModel<OrgChart> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a org chart model instance should use the {@link OrgChart} interface instead.
	 */

	/**
	 * Returns the primary key of this org chart.
	 *
	 * @return the primary key of this org chart
	 */
	public OrgChartPK getPrimaryKey();

	/**
	 * Sets the primary key of this org chart.
	 *
	 * @param primaryKey the primary key of this org chart
	 */
	public void setPrimaryKey(OrgChartPK primaryKey);

	/**
	 * Returns the user ID of this org chart.
	 *
	 * @return the user ID of this org chart
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this org chart.
	 *
	 * @param userId the user ID of this org chart
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this org chart.
	 *
	 * @return the user uuid of this org chart
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this org chart.
	 *
	 * @param userUuid the user uuid of this org chart
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the parent ID of this org chart.
	 *
	 * @return the parent ID of this org chart
	 */
	public long getParentId();

	/**
	 * Sets the parent ID of this org chart.
	 *
	 * @param parentId the parent ID of this org chart
	 */
	public void setParentId(long parentId);

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
	public int compareTo(OrgChart orgChart);

	@Override
	public int hashCode();

	@Override
	public CacheModel<OrgChart> toCacheModel();

	@Override
	public OrgChart toEscapedModel();

	@Override
	public OrgChart toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}