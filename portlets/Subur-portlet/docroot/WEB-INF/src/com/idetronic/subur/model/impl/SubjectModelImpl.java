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

import com.idetronic.subur.model.Subject;
import com.idetronic.subur.model.SubjectModel;
import com.idetronic.subur.model.SubjectSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
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
 * The base model implementation for the Subject service. Represents a row in the &quot;subur_Subject&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.idetronic.subur.model.SubjectModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SubjectImpl}.
 * </p>
 *
 * @author Mazlan Mat
 * @see SubjectImpl
 * @see com.idetronic.subur.model.Subject
 * @see com.idetronic.subur.model.SubjectModel
 * @generated
 */
@JSON(strict = true)
public class SubjectModelImpl extends BaseModelImpl<Subject>
	implements SubjectModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a subject model instance should use the {@link com.idetronic.subur.model.Subject} interface instead.
	 */
	public static final String TABLE_NAME = "subur_Subject";
	public static final Object[][] TABLE_COLUMNS = {
			{ "subjectId", Types.BIGINT },
			{ "parentId", Types.BIGINT },
			{ "subjectName", Types.VARCHAR },
			{ "lft", Types.INTEGER },
			{ "rgt", Types.INTEGER },
			{ "depositable", Types.BOOLEAN },
			{ "itemCount", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table subur_Subject (subjectId LONG not null primary key,parentId LONG,subjectName VARCHAR(75) null,lft INTEGER,rgt INTEGER,depositable BOOLEAN,itemCount INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table subur_Subject";
	public static final String ORDER_BY_JPQL = " ORDER BY subject.subjectName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY subur_Subject.subjectName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.idetronic.subur.model.Subject"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.idetronic.subur.model.Subject"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.idetronic.subur.model.Subject"),
			true);
	public static long DEPOSITABLE_COLUMN_BITMASK = 1L;
	public static long SUBJECTNAME_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Subject toModel(SubjectSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Subject model = new SubjectImpl();

		model.setSubjectId(soapModel.getSubjectId());
		model.setParentId(soapModel.getParentId());
		model.setSubjectName(soapModel.getSubjectName());
		model.setLft(soapModel.getLft());
		model.setRgt(soapModel.getRgt());
		model.setDepositable(soapModel.getDepositable());
		model.setItemCount(soapModel.getItemCount());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Subject> toModels(SubjectSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Subject> models = new ArrayList<Subject>(soapModels.length);

		for (SubjectSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.idetronic.subur.model.Subject"));

	public SubjectModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _subjectId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSubjectId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _subjectId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Subject.class;
	}

	@Override
	public String getModelClassName() {
		return Subject.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("subjectId", getSubjectId());
		attributes.put("parentId", getParentId());
		attributes.put("subjectName", getSubjectName());
		attributes.put("lft", getLft());
		attributes.put("rgt", getRgt());
		attributes.put("depositable", getDepositable());
		attributes.put("itemCount", getItemCount());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long subjectId = (Long)attributes.get("subjectId");

		if (subjectId != null) {
			setSubjectId(subjectId);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		String subjectName = (String)attributes.get("subjectName");

		if (subjectName != null) {
			setSubjectName(subjectName);
		}

		Integer lft = (Integer)attributes.get("lft");

		if (lft != null) {
			setLft(lft);
		}

		Integer rgt = (Integer)attributes.get("rgt");

		if (rgt != null) {
			setRgt(rgt);
		}

		Boolean depositable = (Boolean)attributes.get("depositable");

		if (depositable != null) {
			setDepositable(depositable);
		}

		Integer itemCount = (Integer)attributes.get("itemCount");

		if (itemCount != null) {
			setItemCount(itemCount);
		}
	}

	@JSON
	@Override
	public long getSubjectId() {
		return _subjectId;
	}

	@Override
	public void setSubjectId(long subjectId) {
		_subjectId = subjectId;
	}

	@JSON
	@Override
	public long getParentId() {
		return _parentId;
	}

	@Override
	public void setParentId(long parentId) {
		_parentId = parentId;
	}

	@JSON
	@Override
	public String getSubjectName() {
		if (_subjectName == null) {
			return StringPool.BLANK;
		}
		else {
			return _subjectName;
		}
	}

	@Override
	public void setSubjectName(String subjectName) {
		_columnBitmask = -1L;

		_subjectName = subjectName;
	}

	@JSON
	@Override
	public int getLft() {
		return _lft;
	}

	@Override
	public void setLft(int lft) {
		_lft = lft;
	}

	@JSON
	@Override
	public int getRgt() {
		return _rgt;
	}

	@Override
	public void setRgt(int rgt) {
		_rgt = rgt;
	}

	@JSON
	@Override
	public boolean getDepositable() {
		return _depositable;
	}

	@Override
	public boolean isDepositable() {
		return _depositable;
	}

	@Override
	public void setDepositable(boolean depositable) {
		_columnBitmask |= DEPOSITABLE_COLUMN_BITMASK;

		if (!_setOriginalDepositable) {
			_setOriginalDepositable = true;

			_originalDepositable = _depositable;
		}

		_depositable = depositable;
	}

	public boolean getOriginalDepositable() {
		return _originalDepositable;
	}

	@JSON
	@Override
	public int getItemCount() {
		return _itemCount;
	}

	@Override
	public void setItemCount(int itemCount) {
		_itemCount = itemCount;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Subject.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Subject toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Subject)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SubjectImpl subjectImpl = new SubjectImpl();

		subjectImpl.setSubjectId(getSubjectId());
		subjectImpl.setParentId(getParentId());
		subjectImpl.setSubjectName(getSubjectName());
		subjectImpl.setLft(getLft());
		subjectImpl.setRgt(getRgt());
		subjectImpl.setDepositable(getDepositable());
		subjectImpl.setItemCount(getItemCount());

		subjectImpl.resetOriginalValues();

		return subjectImpl;
	}

	@Override
	public int compareTo(Subject subject) {
		int value = 0;

		value = getSubjectName().compareTo(subject.getSubjectName());

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

		if (!(obj instanceof Subject)) {
			return false;
		}

		Subject subject = (Subject)obj;

		long primaryKey = subject.getPrimaryKey();

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
		SubjectModelImpl subjectModelImpl = this;

		subjectModelImpl._originalDepositable = subjectModelImpl._depositable;

		subjectModelImpl._setOriginalDepositable = false;

		subjectModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Subject> toCacheModel() {
		SubjectCacheModel subjectCacheModel = new SubjectCacheModel();

		subjectCacheModel.subjectId = getSubjectId();

		subjectCacheModel.parentId = getParentId();

		subjectCacheModel.subjectName = getSubjectName();

		String subjectName = subjectCacheModel.subjectName;

		if ((subjectName != null) && (subjectName.length() == 0)) {
			subjectCacheModel.subjectName = null;
		}

		subjectCacheModel.lft = getLft();

		subjectCacheModel.rgt = getRgt();

		subjectCacheModel.depositable = getDepositable();

		subjectCacheModel.itemCount = getItemCount();

		return subjectCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{subjectId=");
		sb.append(getSubjectId());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append(", subjectName=");
		sb.append(getSubjectName());
		sb.append(", lft=");
		sb.append(getLft());
		sb.append(", rgt=");
		sb.append(getRgt());
		sb.append(", depositable=");
		sb.append(getDepositable());
		sb.append(", itemCount=");
		sb.append(getItemCount());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.idetronic.subur.model.Subject");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>subjectId</column-name><column-value><![CDATA[");
		sb.append(getSubjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectName</column-name><column-value><![CDATA[");
		sb.append(getSubjectName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lft</column-name><column-value><![CDATA[");
		sb.append(getLft());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rgt</column-name><column-value><![CDATA[");
		sb.append(getRgt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>depositable</column-name><column-value><![CDATA[");
		sb.append(getDepositable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itemCount</column-name><column-value><![CDATA[");
		sb.append(getItemCount());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Subject.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Subject.class
		};
	private long _subjectId;
	private long _parentId;
	private String _subjectName;
	private int _lft;
	private int _rgt;
	private boolean _depositable;
	private boolean _originalDepositable;
	private boolean _setOriginalDepositable;
	private int _itemCount;
	private long _columnBitmask;
	private Subject _escapedModel;
}