<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<jsp:useBean id="doSubmit" class = "java.lang.String" scope="request" />

<portlet:defineObjects />

<form
	id = "portlet:namespace />helloForm"
	action = "<%= doSubmit %>"
	method = "post">

	<table border = "-2">
	<tr>
		<td>Monday</td>
		<td><input type = "text" value = "Populating issue storage with just created issues" name = "mon"></td>
	</tr>
	<tr>
		<td>Tuesday</td>
		<td><input type = "text" value = "Populating issue storage with just created issues" name = "tue"></td>
	</tr>
	<tr>
		<td>Wednesday</td>
		<td><input type = "text" value = "Populating issue storage with just created issues" name = "wed"></td>
	</tr>
	<tr>
		<td>Thursday</td>
		<td><input type = "text" value = "Populating issue storage with just created issues" name = "thu"></td>
	</tr>
	<tr>
		<td>Friday</td>
		<td><input type = "text" value = "Populating issue storage with just created issues" name = "fri"></td>
	</tr>
	<tr>
		<td>Saturday</td>
		<td><input type = "text" value = "Populating issue storage with just created issues" name = "sat"></td>
	</tr>
	<tr>
		<td>Sunday</td>
		<td><input type = "text" value = "Populating issue storage with just created issues" name = "sun"></td>
	</tr>
	</table>

<input type = "submit" id = "submitButton" title = "Submit" value = "Submit">
</form>
