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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FAQEntry}.
 * </p>
 *
 * @author Idetronic Sdn Bhd
 * @see FAQEntry
 * @generated
 */
public class FAQEntryWrapper implements FAQEntry, ModelWrapper<FAQEntry> {
	public FAQEntryWrapper(FAQEntry faqEntry) {
		_faqEntry = faqEntry;
	}

	@Override
	public Class<?> getModelClass() {
		return FAQEntry.class;
	}

	@Override
	public String getModelClassName() {
		return FAQEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("entryId", getEntryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("question", getQuestion());
		attributes.put("category", getCategory());
		attributes.put("answer", getAnswer());
		attributes.put("isactive", getIsactive());
		attributes.put("displayOrder", getDisplayOrder());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
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

		String question = (String)attributes.get("question");

		if (question != null) {
			setQuestion(question);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String answer = (String)attributes.get("answer");

		if (answer != null) {
			setAnswer(answer);
		}

		Boolean isactive = (Boolean)attributes.get("isactive");

		if (isactive != null) {
			setIsactive(isactive);
		}

		Long displayOrder = (Long)attributes.get("displayOrder");

		if (displayOrder != null) {
			setDisplayOrder(displayOrder);
		}
	}

	/**
	* Returns the primary key of this f a q entry.
	*
	* @return the primary key of this f a q entry
	*/
	@Override
	public long getPrimaryKey() {
		return _faqEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this f a q entry.
	*
	* @param primaryKey the primary key of this f a q entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_faqEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the entry ID of this f a q entry.
	*
	* @return the entry ID of this f a q entry
	*/
	@Override
	public long getEntryId() {
		return _faqEntry.getEntryId();
	}

	/**
	* Sets the entry ID of this f a q entry.
	*
	* @param entryId the entry ID of this f a q entry
	*/
	@Override
	public void setEntryId(long entryId) {
		_faqEntry.setEntryId(entryId);
	}

	/**
	* Returns the company ID of this f a q entry.
	*
	* @return the company ID of this f a q entry
	*/
	@Override
	public long getCompanyId() {
		return _faqEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this f a q entry.
	*
	* @param companyId the company ID of this f a q entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_faqEntry.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this f a q entry.
	*
	* @return the group ID of this f a q entry
	*/
	@Override
	public long getGroupId() {
		return _faqEntry.getGroupId();
	}

	/**
	* Sets the group ID of this f a q entry.
	*
	* @param groupId the group ID of this f a q entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_faqEntry.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this f a q entry.
	*
	* @return the user ID of this f a q entry
	*/
	@Override
	public long getUserId() {
		return _faqEntry.getUserId();
	}

	/**
	* Sets the user ID of this f a q entry.
	*
	* @param userId the user ID of this f a q entry
	*/
	@Override
	public void setUserId(long userId) {
		_faqEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this f a q entry.
	*
	* @return the user uuid of this f a q entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this f a q entry.
	*
	* @param userUuid the user uuid of this f a q entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_faqEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this f a q entry.
	*
	* @return the user name of this f a q entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _faqEntry.getUserName();
	}

	/**
	* Sets the user name of this f a q entry.
	*
	* @param userName the user name of this f a q entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_faqEntry.setUserName(userName);
	}

	/**
	* Returns the create date of this f a q entry.
	*
	* @return the create date of this f a q entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _faqEntry.getCreateDate();
	}

	/**
	* Sets the create date of this f a q entry.
	*
	* @param createDate the create date of this f a q entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_faqEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this f a q entry.
	*
	* @return the modified date of this f a q entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _faqEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this f a q entry.
	*
	* @param modifiedDate the modified date of this f a q entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_faqEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the question of this f a q entry.
	*
	* @return the question of this f a q entry
	*/
	@Override
	public java.lang.String getQuestion() {
		return _faqEntry.getQuestion();
	}

	/**
	* Sets the question of this f a q entry.
	*
	* @param question the question of this f a q entry
	*/
	@Override
	public void setQuestion(java.lang.String question) {
		_faqEntry.setQuestion(question);
	}

	/**
	* Returns the category of this f a q entry.
	*
	* @return the category of this f a q entry
	*/
	@Override
	public java.lang.String getCategory() {
		return _faqEntry.getCategory();
	}

	/**
	* Sets the category of this f a q entry.
	*
	* @param category the category of this f a q entry
	*/
	@Override
	public void setCategory(java.lang.String category) {
		_faqEntry.setCategory(category);
	}

	/**
	* Returns the answer of this f a q entry.
	*
	* @return the answer of this f a q entry
	*/
	@Override
	public java.lang.String getAnswer() {
		return _faqEntry.getAnswer();
	}

	/**
	* Sets the answer of this f a q entry.
	*
	* @param answer the answer of this f a q entry
	*/
	@Override
	public void setAnswer(java.lang.String answer) {
		_faqEntry.setAnswer(answer);
	}

	/**
	* Returns the isactive of this f a q entry.
	*
	* @return the isactive of this f a q entry
	*/
	@Override
	public java.lang.Boolean getIsactive() {
		return _faqEntry.getIsactive();
	}

	/**
	* Sets the isactive of this f a q entry.
	*
	* @param isactive the isactive of this f a q entry
	*/
	@Override
	public void setIsactive(java.lang.Boolean isactive) {
		_faqEntry.setIsactive(isactive);
	}

	/**
	* Returns the display order of this f a q entry.
	*
	* @return the display order of this f a q entry
	*/
	@Override
	public long getDisplayOrder() {
		return _faqEntry.getDisplayOrder();
	}

	/**
	* Sets the display order of this f a q entry.
	*
	* @param displayOrder the display order of this f a q entry
	*/
	@Override
	public void setDisplayOrder(long displayOrder) {
		_faqEntry.setDisplayOrder(displayOrder);
	}

	@Override
	public boolean isNew() {
		return _faqEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_faqEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _faqEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_faqEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _faqEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _faqEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_faqEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _faqEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_faqEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_faqEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_faqEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FAQEntryWrapper((FAQEntry)_faqEntry.clone());
	}

	@Override
	public int compareTo(com.idetronic.portlet.model.FAQEntry faqEntry) {
		return _faqEntry.compareTo(faqEntry);
	}

	@Override
	public int hashCode() {
		return _faqEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.idetronic.portlet.model.FAQEntry> toCacheModel() {
		return _faqEntry.toCacheModel();
	}

	@Override
	public com.idetronic.portlet.model.FAQEntry toEscapedModel() {
		return new FAQEntryWrapper(_faqEntry.toEscapedModel());
	}

	@Override
	public com.idetronic.portlet.model.FAQEntry toUnescapedModel() {
		return new FAQEntryWrapper(_faqEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _faqEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _faqEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_faqEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FAQEntryWrapper)) {
			return false;
		}

		FAQEntryWrapper faqEntryWrapper = (FAQEntryWrapper)obj;

		if (Validator.equals(_faqEntry, faqEntryWrapper._faqEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FAQEntry getWrappedFAQEntry() {
		return _faqEntry;
	}

	@Override
	public FAQEntry getWrappedModel() {
		return _faqEntry;
	}

	@Override
	public void resetOriginalValues() {
		_faqEntry.resetOriginalValues();
	}

	private FAQEntry _faqEntry;
}