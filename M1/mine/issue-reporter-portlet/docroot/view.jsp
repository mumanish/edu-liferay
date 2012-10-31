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

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="org.portlets.lia.mine.service.IssueLocalServiceUtil" %>
<%@ page import = "java.util.*" %>


<portlet:defineObjects />
<portlet:actionURL name="addIssue" var="addIssueURL" />
<portlet:actionURL name="checkStatusRedir" var="checkStatusRedirURL" />

<aui:form action="<%= addIssueURL.toString() %>" method="post">
<aui:fieldset>
	<aui:input name="summary" size="75" value = "Sample summary must be viewed" />
	<aui:input name="requester" size="25" value = "Vladimir Frolov" />
	<aui:select name="priority">
		<aui:option value="Low" selected="true">Low</aui:option>
		<aui:option value="Normal">Normal</aui:option>
		<aui:option value="High">High</aui:option>
	</aui:select>
	<aui:input type="textarea" name="description" rows="10" cols="77"/>

	<aui:button-row>
		<aui:button type = "submit" value = "Report" />
		<aui:button name = "checkStatusRedirURL" 
					onClick="<%=checkStatusRedirURL.toString() %>" 
					type = "button" value = "Check Status" />
		</aui:button-row>
</aui:fieldset>
</aui:form>


