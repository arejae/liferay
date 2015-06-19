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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Subject in entity cache.
 *
 * @author Mazlan Mat
 * @see Subject
 * @generated
 */
public class SubjectCacheModel implements CacheModel<Subject>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{subjectId=");
		sb.append(subjectId);
		sb.append(", parentId=");
		sb.append(parentId);
		sb.append(", subjectName=");
		sb.append(subjectName);
		sb.append(", lft=");
		sb.append(lft);
		sb.append(", rgt=");
		sb.append(rgt);
		sb.append(", depositable=");
		sb.append(depositable);
		sb.append(", itemCount=");
		sb.append(itemCount);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Subject toEntityModel() {
		SubjectImpl subjectImpl = new SubjectImpl();

		subjectImpl.setSubjectId(subjectId);
		subjectImpl.setParentId(parentId);

		if (subjectName == null) {
			subjectImpl.setSubjectName(StringPool.BLANK);
		}
		else {
			subjectImpl.setSubjectName(subjectName);
		}

		subjectImpl.setLft(lft);
		subjectImpl.setRgt(rgt);
		subjectImpl.setDepositable(depositable);
		subjectImpl.setItemCount(itemCount);

		subjectImpl.resetOriginalValues();

		return subjectImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		subjectId = objectInput.readLong();
		parentId = objectInput.readLong();
		subjectName = objectInput.readUTF();
		lft = objectInput.readInt();
		rgt = objectInput.readInt();
		depositable = objectInput.readBoolean();
		itemCount = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(subjectId);
		objectOutput.writeLong(parentId);

		if (subjectName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subjectName);
		}

		objectOutput.writeInt(lft);
		objectOutput.writeInt(rgt);
		objectOutput.writeBoolean(depositable);
		objectOutput.writeInt(itemCount);
	}

	public long subjectId;
	public long parentId;
	public String subjectName;
	public int lft;
	public int rgt;
	public boolean depositable;
	public int itemCount;
}