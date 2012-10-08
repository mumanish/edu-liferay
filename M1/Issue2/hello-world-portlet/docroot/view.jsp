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

<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<jsp:useBean id="userName" class="java.lang.String" scope="request" />
<jsp:useBean id="eMail" class="java.lang.String" scope="request" />
<jsp:useBean id="goEditMode" class="java.lang.String" scope="request" />

<portlet:defineObjects />


This is the <b>Hello You</b> portlet.
<p>Hello <%=userName %>!</p>
Your email is: <%=eMail %>.

<form 
		id = "<portlet:namespace />helloForm"
		action = "<%= goEditMode %>"
		method = "post">
	<input type = "submit" id = "goEditButton" title = "Go Edit" value = "Go Edit">
</form>


