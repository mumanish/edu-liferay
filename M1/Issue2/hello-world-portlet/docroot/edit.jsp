<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<jsp:useBean id="addNameURL" class="java.lang.String" scope="request" />

<portlet:defineObjects />


<form
	id = "<portlet:namespace />helloForm"
	action = "<%= addNameURL %>"
	method = "post">

<table>
	<tr>
		<td>Name:</td>
		<td><input type = "text" name = "username"></td><p>
	</tr>
	<tr>
		<td>E-mail:</td>
		<td><input type = "text" name = "email"></td>
	</tr>
</table>

<input type = "submit" id = "nameButton" title = "Add Name" value = "Add Name">
</form>
