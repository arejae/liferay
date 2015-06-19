<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This file is part of Liferay Social Office. Liferay Social Office is free
 * software: you can redistribute it and/or modify it under the terms of the GNU
 * Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Liferay Social Office is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Liferay Social Office. If not, see http://www.gnu.org/licenses/agpl-3.0.html.
 */
--%>

<%@ include file="/html/service_experience/init.jsp" %>

<%
User user2 = (User)request.getAttribute("view_user.jsp-user");

boolean showCompleteYourProfile = GetterUtil.getBoolean((String)request.getAttribute("view_user.jsp-showCompleteYourProfile"), false);

List<ServiceExperience> serviceExperiences = null;

if (user2 != null) {
	serviceExperiences = ServiceExperienceLocalServiceUtil.getUserServiceExperience(user2.getUserId());
}
%>

<c:if test="<%= (serviceExperiences != null) && !serviceExperiences.isEmpty() %>">

	<%
	for (ServiceExperience serviceExperience : serviceExperiences) {
		String startDate = dateFormatDate.format(serviceExperience.getStartDate());

		String endDate = null;

		if (serviceExperience.getEndDate() != null) {
			endDate = dateFormatDate.format(serviceExperience.getEndDate());
		}
		else {
			endDate = LanguageUtil.get(pageContext, "current");
		}
	%>

		<div class="field-group projects section" data-extension="true" data-sectionId="projects" data-title="<%= LanguageUtil.get(pageContext, "projects") %>">
			<h3><%= HtmlUtil.escape(serviceExperience.getTitle()) %>:</h3>

			<div class="project-date property-list">
				<span class="property"><%= startDate %> - <%= endDate %></span>
			</div>

			<div class="project-description property-list">
				<div class="property"><%=serviceExperience.getServiceData() %></div>
			</div>
		</div>

	<%
	}
	%>

</c:if>

<c:if test="<%= showCompleteYourProfile && (themeDisplay.getUserId() == user2.getUserId()) && serviceExperiences.isEmpty() %>">
	<div class="profile-actions">
		<p class="portlet-msg alert alert-info"><liferay-ui:message key="add-projects" />:</p>

		<div class="field-actions-toolbar">
			<ul class="settings-actions">
				<li class="action-field component lfr-token settings-field" data-extension="true" data-sectionId="projects" data-title="<%= LanguageUtil.get(pageContext, "projects") %>">
					<div class="settings-field-content">
						<i class="icon-plus-sign"></i>

						<span class="settings-label"><liferay-ui:message key="add" /></span>
					</div>
				</li>
			</ul>
		</div>
	</div>
</c:if>