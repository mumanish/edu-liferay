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
<%@ page import = "java.util.*" %>
<jsp:useBean id="goEditMode" class="java.lang.String" scope="request" />

<!-- getting days and statuses from ArrayList attributes -->
<jsp:useBean id="days" class="java.util.ArrayList" scope = "request" />
<jsp:useBean id="statuses" class="java.util.ArrayList" scope = "request" />


<portlet:defineObjects />


<!-- writing days and statuses ArrayList values to indexed Arrays for use in the table -->
<%		Iterator i = null;
		String[] daysArr = new String[8];
		String[] statusesArr = new String[8];

		int iD = 1;
			for (i = days.iterator(); i.hasNext();) {
			daysArr[iD] = (String)i.next();
			iD++;
			}

		int iS = 1;
			for (i = statuses.iterator(); i.hasNext();) {
			statusesArr[iS] = (String)i.next();
			iS++;
			}
		%>

<!-- main table -->
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
		<td><i><%=daysArr[1] %></i></td>
		<td><font color = "#3E6E2B"><%=statusesArr[1] %></td>
	</tr>
	<tr>
		<td><b>Tuesday</b></td>
		<td><i><%=daysArr[2] %></i></td>
		<td><font color = "#3E6E2B"><%=statusesArr[2] %></td>
	</tr>
	<tr>
		<td><b>Wednesday&nbsp&nbsp&nbsp</b></td>
		<td><i><%=daysArr[3] %></i></td>
		<td><font color = "#3E6E2B"><%=statusesArr[3] %></td>
	</tr>
	<tr>
		<td><b>Thursday</b></td>
		<td><i><%=daysArr[4] %></i></td>
		<td><font color = "#3E6E2B"><%=statusesArr[4]%></td>
	</tr>
	<tr>
		<td><b>Friday</b></td>
		<td><i><%=daysArr[5] %></i></td>
		<td><font color = "#3E6E2B"><%=statusesArr[5]%></td>
	</tr>
	<tr>
		<td><b>Saturday</b></td>
		<td><i><%=daysArr[6] %></i></td>
		<td><font color = "#3E6E2B"><%=statusesArr[6] %></td>
	</tr>
	<tr>
		<td><b>Sunday</b></td>
		<td><i><%=daysArr[7] %></i></td>
		<td><font color = "#3E6E2B"><%=statusesArr[7]%></td>
	</tr>
</table>

<p>
<!-- Edit button for goEdit action -->
<form
	id = "<portlet:namespace />wtForm"
	action = "<%= goEditMode %>"
	method = "post">

<input type = "submit" id = "editButton" title = "Edit" value = "Edit">
</form>