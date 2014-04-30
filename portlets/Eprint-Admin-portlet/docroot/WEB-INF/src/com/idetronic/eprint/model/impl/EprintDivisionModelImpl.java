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

package com.idetronic.eprint.model.impl;

import com.idetronic.eprint.model.EprintDivision;
import com.idetronic.eprint.model.EprintDivisionModel;
import com.idetronic.eprint.service.persistence.EprintDivisionPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the EprintDivision service. Represents a row in the &quot;Eprints_EprintDivision&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.idetronic.eprint.model.EprintDivisionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EprintDivisionImpl}.
 * </p>
 *
 * @author Mazlan Mat
 * @see EprintDivisionImpl
 * @see com.idetronic.eprint.model.EprintDivision
 * @see com.idetronic.eprint.model.EprintDivisionModel
 * @generated
 */
public class EprintDivisionModelImpl extends BaseModelImpl<EprintDivision>
	implements EprintDivisionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a eprint division model instance should use the {@link com.idetronic.eprint.model.EprintDivision} interface instead.
	 */
	public static final String TABLE_NAME = "Eprints_EprintDivision";
	public static final Object[][] TABLE_COLUMNS = {
			{ "eprintId", Types.BIGINT },
			{ "divisionId", Types.VARCHAR },
			{ "divisionName", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Eprints_EprintDivision (eprintId LONG not null,divisionId VARCHAR(128) not null,divisionName VARCHAR(255) null,primary key (eprintId, divisionId))";
	public static final String TABLE_SQL_DROP = "drop table Eprints_EprintDivision";
	public static final String ORDER_BY_JPQL = " ORDER BY eprintDivision.id.eprintId ASC, eprintDivision.id.divisionId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Eprints_EprintDivision.eprintId ASC, Eprints_EprintDivision.divisionId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.idetronic.eprint.model.EprintDivision"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.idetronic.eprint.model.EprintDivision"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.idetronic.eprint.model.EprintDivision"));

	public EprintDivisionModelImpl() {
	}

	@Override
	public EprintDivisionPK getPrimaryKey() {
		return new EprintDivisionPK(_eprintId, _divisionId);
	}

	@Override
	public void setPrimaryKey(EprintDivisionPK primaryKey) {
		setEprintId(primaryKey.eprintId);
		setDivisionId(primaryKey.divisionId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new EprintDivisionPK(_eprintId, _divisionId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((EprintDivisionPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return EprintDivision.class;
	}

	@Override
	public String getModelClassName() {
		return EprintDivision.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eprintId", getEprintId());
		attributes.put("divisionId", getDivisionId());
		attributes.put("divisionName", getDivisionName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eprintId = (Long)attributes.get("eprintId");

		if (eprintId != null) {
			setEprintId(eprintId);
		}

		String divisionId = (String)attributes.get("divisionId");

		if (divisionId != null) {
			setDivisionId(divisionId);
		}

		String divisionName = (String)attributes.get("divisionName");

		if (divisionName != null) {
			setDivisionName(divisionName);
		}
	}

	@Override
	public long getEprintId() {
		return _eprintId;
	}

	@Override
	public void setEprintId(long eprintId) {
		_eprintId = eprintId;
	}

	@Override
	public String getDivisionId() {
		if (_divisionId == null) {
			return StringPool.BLANK;
		}
		else {
			return _divisionId;
		}
	}

	@Override
	public void setDivisionId(String divisionId) {
		_divisionId = divisionId;
	}

	@Override
	public String getDivisionName() {
		if (_divisionName == null) {
			return StringPool.BLANK;
		}
		else {
			return _divisionName;
		}
	}

	@Override
	public void setDivisionName(String divisionName) {
		_divisionName = divisionName;
	}

	@Override
	public EprintDivision toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EprintDivision)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EprintDivisionImpl eprintDivisionImpl = new EprintDivisionImpl();

		eprintDivisionImpl.setEprintId(getEprintId());
		eprintDivisionImpl.setDivisionId(getDivisionId());
		eprintDivisionImpl.setDivisionName(getDivisionName());

		eprintDivisionImpl.resetOriginalValues();

		return eprintDivisionImpl;
	}

	@Override
	public int compareTo(EprintDivision eprintDivision) {
		EprintDivisionPK primaryKey = eprintDivision.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EprintDivision)) {
			return false;
		}

		EprintDivision eprintDivision = (EprintDivision)obj;

		EprintDivisionPK primaryKey = eprintDivision.getPrimaryKey();

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
	public CacheModel<EprintDivision> toCacheModel() {
		EprintDivisionCacheModel eprintDivisionCacheModel = new EprintDivisionCacheModel();

		eprintDivisionCacheModel.eprintId = getEprintId();

		eprintDivisionCacheModel.divisionId = getDivisionId();

		String divisionId = eprintDivisionCacheModel.divisionId;

		if ((divisionId != null) && (divisionId.length() == 0)) {
			eprintDivisionCacheModel.divisionId = null;
		}

		eprintDivisionCacheModel.divisionName = getDivisionName();

		String divisionName = eprintDivisionCacheModel.divisionName;

		if ((divisionName != null) && (divisionName.length() == 0)) {
			eprintDivisionCacheModel.divisionName = null;
		}

		return eprintDivisionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{eprintId=");
		sb.append(getEprintId());
		sb.append(", divisionId=");
		sb.append(getDivisionId());
		sb.append(", divisionName=");
		sb.append(getDivisionName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.idetronic.eprint.model.EprintDivision");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>eprintId</column-name><column-value><![CDATA[");
		sb.append(getEprintId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>divisionId</column-name><column-value><![CDATA[");
		sb.append(getDivisionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>divisionName</column-name><column-value><![CDATA[");
		sb.append(getDivisionName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EprintDivision.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EprintDivision.class
		};
	private long _eprintId;
	private String _divisionId;
	private String _divisionName;
	private EprintDivision _escapedModel;
}