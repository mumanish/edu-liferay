<%
/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * This library is distributed in the hope that 
 */
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<form action = "do.jsp" method = "post">
	Name: <br><input type = "text" value = "type name"><p><p>
	<input type = "submit" value = "POST"><p>
</form>

This is the <b>Hello World</b> portlet [modified].

<%
	String host = "super " + request.getServerName();
%>

<p>Your host is: <%=host %>
