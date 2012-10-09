<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<jsp:useBean id="addNameURL" class="java.lang.String" scope="request" />
<jsp:useBean id="addDefault" class="java.lang.String" scope="request" />
<jsp:useBean id="userName" class="java.lang.String" scope="request" />
<jsp:useBean id="eMail" class="java.lang.String" scope="request" />


<portlet:defineObjects />


<form
	id = "<portlet:namespace />helloForm"
	action = "<%= addNameURL %>"
	method = "post">

<table>
	<tr>
		<td>Name:</td>
		<td><input type = "text" name = "username" value = "<%=userName %>"></td><p>
	</tr>
	<tr>
		<td>E-mail:</td>
		<td><input type = "text" name = "email" value = "<%=eMail %>"></td>
	</tr>
</table>

<input type = "submit" id = "nameButton" title = "Add Name" value = "Add Name"><p>
</form>

<form
	id = "<portlet:namespace />helloForm"
	action = "<%= addDefault %>"
	method = "post">

<input type = "submit" id = "nameButton" title = "Add Default" value = "Add Default"><p>
</form>