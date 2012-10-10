<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<jsp:useBean id="doSubmit" class = "java.lang.String" scope="request" />
<jsp:useBean id="monDay" class="java.lang.String" scope="request" />
<jsp:useBean id="tuesDay" class="java.lang.String" scope="request" />
<jsp:useBean id="wednesDay" class="java.lang.String" scope="request" />
<jsp:useBean id="thursDay" class="java.lang.String" scope="request" />
<jsp:useBean id="friDay" class="java.lang.String" scope="request" />
<jsp:useBean id="saturDay" class="java.lang.String" scope="request" />
<jsp:useBean id="sunDay" class="java.lang.String" scope="request" />

<jsp:useBean id="status_s1" class="java.lang.String" scope="request" />
<jsp:useBean id="status_s2" class="java.lang.String" scope="request" />
<jsp:useBean id="status_s3" class="java.lang.String" scope="request" />
<jsp:useBean id="status_s4" class="java.lang.String" scope="request" />
<jsp:useBean id="status_s5" class="java.lang.String" scope="request" />
<jsp:useBean id="status_s6" class="java.lang.String" scope="request" />
<jsp:useBean id="status_s7" class="java.lang.String" scope="request" />


<portlet:defineObjects />

<form
	id = "portlet:namespace />helloForm"
	action = "<%= doSubmit %>"
	method = "post">

	<table>
	<tr>
		<td>Monday</td>
		<td><input type = "text" value = "<%=monDay %>" name = "mon" size = "100%"></td>
		<td>
		<select name = "status1">
  			<option value="planned">planned</option>
  			<option value="in progress">in progress</option>
  			<option value="completed">completed</option>
		</select>
	</tr>
	<tr>
		<td>Tuesday</td>
		<td><input type = "text" value = "<%=tuesDay %>" name = "tue" size = "100%"></td>
		<td>
		<select name = "status2">
  			<option value="planned">planned</option>
  			<option value="in progress">in progress</option>
  			<option value="completed">completed</option>
		</select>
	</tr>
	<tr>
		<td>Wednesday&nbsp&nbsp&nbsp</td>
		<td><input type = "text" value = "<%=wednesDay %>" name = "wed" size = "100%"></td>
		<td>
		<select name = "status3">
  			<option value="planned">planned</option>
  			<option value="in progress">in progress</option>
  			<option value="completed">completed</option>
		</select>
	</tr>
	<tr>
		<td>Thursday</td>
		<td><input type = "text" value = "<%=thursDay %>" name = "thu" size = "100%"></td>
		<td>
		<select name = "status4">
  			<option value="planned">planned</option>
  			<option value="in progress">in progress</option>
  			<option value="completed" selected>completed</option>
		</select>
	</tr>
	<tr>
		<td>Friday</td>
		<td><input type = "text" value = "<%=friDay %>" name = "fri" size = "100%"></td>
		<td>
		<select name = "status5">
  			<option value="planned">planned</option>
  			<option value="in progress">in progress</option>
  			<option value="completed">completed</option>
		</select>
	</tr>
	<tr>
		<td>Saturday</td>
		<td><input type = "text" value = "<%=saturDay %>" name = "sat" size = "100%"></td>
		<td>
		<select name = "status6">
  			<option value="planned">planned</option>
  			<option value="in progress">in progress</option>
  			<option value="completed">completed</option>
		</select>
	</tr>
	<tr>
		<td>Sunday</td>
		<td><input type = "text" value = "<%=sunDay %>" name = "sun" size = "100%"></td>
		<td>
		<select name = "status7">
  			<option value="planned">planned</option>
  			<option value="in progress">in progress</option>
  			<option value="completed">completed</option>
		</select>
	</tr>
	</table>

<input type = "submit" id = "submitButton" title = "Submit" value = "Submit">
</form>
