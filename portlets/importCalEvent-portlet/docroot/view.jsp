<%
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
%>

<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>

<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%> 

<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.liferay.portal.kernel.util.Constants" %>
<%@page import="java.util.List"%>
>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.liferay.portal.kernel.util.Constants" %>
<%@page import="javax.portlet.PortletPreferences" %>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.KeyValuePair"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="javax.portlet.WindowState" %>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>

<portlet:defineObjects />

This is the <b>ImportCalEvent</b> portlet.
<%
PortletURL addEntryUrl = renderResponse.createActionURL();
addEntryUrl.setParameter(ActionRequest.ACTION_NAME, "importCalendar");

%>

<aui:form name="fm" method="POST" action="<%= addEntryUrl.toString() %>" >
<aui:button type="submit" value="Import" />
</aui:form>