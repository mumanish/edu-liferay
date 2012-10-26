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

<aui:form action="<%= addIssueURL.toString() %>" method="post">
<aui:fieldset>
	<aui:input name="summary" size="75" value = "Sample summary must be viewed" />
	<aui:input name="requester" size="15" value = "Vladimir Frolov" />
	<aui:input name="priority" size="15" value = "Emergency" />
	<aui:input type = "textarea" name="description" />

	<aui:button-row>
		<aui:button type = "submit" value = "Report" />
		<aui:button type = "submit" value = "Check Status" />
	</aui:button-row>

</aui:fieldset>
</aui:form>


