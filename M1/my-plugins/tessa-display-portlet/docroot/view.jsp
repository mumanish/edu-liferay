<%
/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

<%@ include file="/init.jsp" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:actionURL name="addTessa" var="addTessaURL" />

<%
Tessa tessa = (Tessa)request.getAttribute(org.portlets.tessa.util.WebKeys.TESSA_ENTRY);
String redirect = ParamUtil.getString(request, "redirect");

long resourcePrimKey = BeanParamUtil.getLong(tessa, request, "tessaId");
%>

<aui:form action="<%= addTessaURL.toString() %>" method="post">
<aui:fieldset>
	<aui:input name="tessaText" size="75" value = "Sample summary must be viewed" />

	<aui:button-row>
		<aui:button type = "submit" value = "Report" />
	</aui:button-row>
	
</aui:fieldset>
</aui:form>