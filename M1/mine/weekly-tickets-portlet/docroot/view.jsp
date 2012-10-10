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
<jsp:useBean id="goEditMode" class="java.lang.String" scope="request" />
<jsp:useBean id="monDay" class="java.lang.String" scope="request" />
<jsp:useBean id="tuesDay" class="java.lang.String" scope="request" />
<jsp:useBean id="wednesDay" class="java.lang.String" scope="request" />
<jsp:useBean id="thursDay" class="java.lang.String" scope="request" />
<jsp:useBean id="friDay" class="java.lang.String" scope="request" />
<jsp:useBean id="saturDay" class="java.lang.String" scope="request" />
<jsp:useBean id="sunDay" class="java.lang.String" scope="request" />


<portlet:defineObjects />

<table>
	<tr>
		<td><b>Monday</b></td>
		<td><i><%=monDay %></i></td>
	</tr>
	<tr>
		<td><b>Tuesday</b></td>
		<td><i><%=tuesDay %></i></td>
	</tr>
	<tr>
		<td><b>Wednesday&nbsp&nbsp&nbsp</b></td>
		<td><i><%=wednesDay %></i></td>
	</tr>
	<tr>
		<td><b>Thursday</b></td>
		<td><i><%=thursDay %></i></td>
	</tr>
	<tr>
		<td><b>Friday</b></td>
		<td><i><%=friDay %></i></td>
	</tr>
	<tr>
		<td><b>Saturday</b></td>
		<td><i><%=saturDay %></i></td>
	</tr>
	<tr>
		<td><b>Sunday</b></td>
		<td><i><%=sunDay %></i></td>
	</tr>
</table>

<p>
<form
	id = "<portlet:namespace />wtForm"
	action = "<%= goEditMode %>"
	method = "post">

<input type = "submit" id = "editButton" title = "Edit" value = "Edit">
</form>