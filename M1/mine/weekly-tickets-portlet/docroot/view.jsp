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

<jsp:useBean id="status_v1" class="java.lang.String" scope = "request" />
<jsp:useBean id="status_v2" class="java.lang.String" scope = "request" />
<jsp:useBean id="status_v3" class="java.lang.String" scope = "request" />
<jsp:useBean id="status_v4" class="java.lang.String" scope = "request" />
<jsp:useBean id="status_v5" class="java.lang.String" scope = "request" />
<jsp:useBean id="status_v6" class="java.lang.String" scope = "request" />
<jsp:useBean id="status_v7" class="java.lang.String" scope = "request" />


<portlet:defineObjects />

<table width = "100%">
	<tr>
		<td width = "20%"><u>Day</u></td>
		<td width = "60%"><u>Summary</u></td>
		<td width = "20%"><u>Status</u></td>
	</tr>
	<p>
	<tr>
		<td>&nbsp</td>
		
	</tr>
	<tr>
		<td><b>Monday</b></td>
		<td><i><%=monDay %></i></td>
		<td><font color = "#3E6E2B"><%=status_v1 %></td>
	</tr>
	<tr>
		<td><b>Tuesday</b></td>
		<td><i><%=tuesDay %></i></td>
		<td><font color = "#82DE5D"><%=status_v2 %></td>
	</tr>
	<tr>
		<td><b>Wednesday&nbsp&nbsp&nbsp</b></td>
		<td><i><%=wednesDay %></i></td>
		<td><font color = "#D0E6C8"><%=status_v3 %></td>
	</tr>
	<tr>
		<td><b>Thursday</b></td>
		<td><i><%=thursDay %></i></td>
		<td><font color = "#D0E6C8"><%=status_v4 %></td>
	</tr>
	<tr>
		<td><b>Friday</b></td>
		<td><i><%=friDay %></i></td>
		<td><font color = "#D0E6C8"><%=status_v5 %></td>
	</tr>
	<tr>
		<td><b>Saturday</b></td>
		<td><i><%=saturDay %></i></td>
		<td><font color = "#D0E6C8"><%=status_v6 %></td>
	</tr>
	<tr>
		<td><b>Sunday</b></td>
		<td><i><%=sunDay %></i></td>
		<td><font color = "#D0E6C8"><%=status_v7 %></td>
	</tr>
</table>

<p>
<form
	id = "<portlet:namespace />wtForm"
	action = "<%= goEditMode %>"
	method = "post">

<input type = "submit" id = "editButton" title = "Edit" value = "Edit">
</form>