<%--
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
--%>

<%@ include file="/html/portlet/document_library/init.jsp" %>

<%
DLFolder folder = (DLFolder)request.getAttribute("view_entries.jsp-folder");

String folderImage = (String)request.getAttribute("view_entries.jsp-folderImage");

PortletURL tempRowURL = (PortletURL)request.getAttribute("view_entries.jsp-tempRowURL");

boolean showCheckBox = DLFolderPermission.contains(permissionChecker, folder, ActionKeys.DELETE) || DLFolderPermission.contains(permissionChecker, folder, ActionKeys.UPDATE);
%>

<div class="document-display-style display-descriptive <%= showCheckBox ? "selectable" : StringPool.BLANK %>" data-draggable="<%= showCheckBox ? Boolean.TRUE.toString() : Boolean.FALSE.toString() %>" data-title="<%= StringUtil.shorten(folder.getName(), 60) %>">
	<a class="document-link" data-folder="<%= Boolean.TRUE.toString() %>" data-folder-id="<%= folder.getFolderId() %>" href="<%= tempRowURL.toString() %>" title="<%= folder.getName() + " - " + folder.getDescription() %>">
		<span class="document-thumbnail">
			<img alt="" border="no" src="<%= themeDisplay.getPathThemeImages() + "/file_system/large/" + folderImage + ".png" %>" style="width: <%= PrefsPropsUtil.getLong(PropsKeys.DL_FILE_ENTRY_THUMBNAIL_MAX_WIDTH) %>;" />
		</span>

		<span class="entry-title"><%= folder.getName() %></span>

		<span class="document-description"><%= folder.getDescription() %></span>
	</a>

	<liferay-util:include page="/html/portlet/document_library/folder_action.jsp" />

	<c:if test="<%= showCheckBox %>">
		<aui:input cssClass="overlay document-selector" label="" name="<%= RowChecker.ROW_IDS + Folder.class.getSimpleName() %>" type="checkbox" value="<%= folder.getFolderId() %>" />
	</c:if>
</div>