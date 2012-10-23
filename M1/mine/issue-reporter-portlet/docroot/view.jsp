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
<%@ page import="org.portlets.lia.mine.service.IssueLocalServiceUtil" %>

<%@ page import = "java.util.*" %>
<jsp:useBean id="addIssue" class="java.lang.String" scope="request" />


<portlet:defineObjects />
<portlet:actionURL name="addIssue" var="addIssueURL" />

<form
	id = "<portlet:namespace />wtForm"
	action = "<%= addIssueURL.toString() %>"
	method = "post">

<input type = "submit" id = "addButton" title = "Report" value = "Report">
</form>


