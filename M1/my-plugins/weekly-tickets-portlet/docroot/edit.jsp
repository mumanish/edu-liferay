<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<%@ page import = "java.util.*" %>

<jsp:useBean id="doSubmit" class = "java.lang.String" scope="request" />

<!-- getting days and statuses from ArrayList attributes -->
<jsp:useBean id="days" class="java.util.ArrayList" scope = "request" />
<jsp:useBean id="statuses" class="java.util.ArrayList" scope = "request" />

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

<!-- possible values for SELECTED option -->
<% String s1 = "planned";
	String s2 = "in progress";
	 String s3 = "completed";

	 String[] selected = new String[21];
	 
	 %>

<portlet:defineObjects />

<!-- Submit button for saving values action -->
<form
	id = "portlet:namespace />helloForm"
	action = "<%= doSubmit %>"
	method = "post">

<!-- main table -->
	<table>
	<tr>
		<td>Monday</td>
		<td><input type = "text" value = "<%=daysArr[1] %>" name = "dn1" size = "100%"></td>
		<td>
		<select name = "status1">
			<!-- setting SELECTED attribute for selected status -->
			<% if (statusesArr[1].equals(s1)) {
				selected[0] = "selected";
				}
				if (statusesArr[1].equals(s2)) {
				selected[1] = "selected";
				}
				if (statusesArr[1].equals(s3)) {
				selected[2] = "selected";
				}
				%>
  			<option value="<%=s1 %>" <%=selected[0] %>>planned</option>
  			<option value="<%=s2 %>" <%=selected[1] %>>in progress</option>
  			<option value="<%=s3 %>" <%=selected[2] %>>completed</option>
		</select>
	</tr>
	<tr>
		<td>Tuesday</td>
		<td><input type = "text" value = "<%=daysArr[2] %>" name = "dn2" size = "100%"></td>
		<td>
		<select name = "status2">
			<% if (statusesArr[2].equals(s1)) {
				selected[3] = "selected";
				}
				if (statusesArr[2].equals(s2)) {
				selected[4] = "selected";
				}
				if (statusesArr[2].equals(s3)) {
				selected[5] = "selected";
				}
				%>
  			<option value="<%=s1 %>" <%=selected[3] %>>planned</option>
  			<option value="<%=s2 %>" <%=selected[4] %>>in progress</option>
  			<option value="<%=s3 %>" <%=selected[5] %>>completed</option>
		</select>
	</tr>
	<tr>
		<td>Wednesday&nbsp&nbsp&nbsp</td>
		<td><input type = "text" value = "<%=daysArr[3] %>" name = "dn3" size = "100%"></td>
		<td>
		<select name = "status3">
			<% if (statusesArr[3].equals(s1)) {
				selected[6] = "selected";
				}
				if (statusesArr[3].equals(s2)) {
				selected[7] = "selected";
				}
				if (statusesArr[3].equals(s3)) {
				selected[8] = "selected";
				}
				%>
  			<option value="<%=s1 %>" <%=selected[6] %>>planned</option>
  			<option value="<%=s2 %>" <%=selected[7] %>>in progress</option>
  			<option value="<%=s3 %>" <%=selected[8] %>>completed</option>
		</select>
	</tr>
	<tr>
		<td>Thursday</td>
		<td><input type = "text" value = "<%=daysArr[4] %>" name = "dn4" size = "100%"></td>
		<td>
		<select name = "status4">
			<% if (statusesArr[4].equals(s1)) {
				selected[9] = "selected";
				}
				if (statusesArr[4].equals(s2)) {
				selected[10] = "selected";
				}
				if (statusesArr[4].equals(s3)) {
				selected[11] = "selected";
				}
				%>
  			<option value="<%=s1 %>" <%=selected[9] %>>planned</option>
  			<option value="<%=s2 %>" <%=selected[10] %>>in progress</option>
  			<option value="<%=s3 %>" <%=selected[11] %>>completed</option>
		</select>
	</tr>
	<tr>
		<td>Friday</td>
		<td><input type = "text" value = "<%=daysArr[5] %>" name = "dn5" size = "100%"></td>
		<td>
		<select name = "status5">
			<% if (statusesArr[5].equals(s1)) {
				selected[12] = "selected";
				}
				if (statusesArr[5].equals(s2)) {
				selected[13] = "selected";
				}
				if (statusesArr[5].equals(s3)) {
				selected[14] = "selected";
				}
				%>
  			<option value="<%=s1 %>" <%=selected[12] %>>planned</option>
  			<option value="<%=s2 %>" <%=selected[13] %>>in progress</option>
  			<option value="<%=s3 %>" <%=selected[14] %>>completed</option>
		</select>
	</tr>
	<tr>
		<td>Saturday</td>
		<td><input type = "text" value = "<%=daysArr[6] %>" name = "dn6" size = "100%"></td>
		<td>
		<select name = "status6">
			<% if (statusesArr[6].equals(s1)) {
				selected[15] = "selected";
				}
				if (statusesArr[6].equals(s2)) {
				selected[16] = "selected";
				}
				if (statusesArr[6].equals(s3)) {
				selected[17] = "selected";
				}
				%>
  			<option value="<%=s1 %>" <%=selected[15] %>>planned</option>
  			<option value="<%=s2 %>" <%=selected[16] %>>in progress</option>
  			<option value="<%=s3 %>" <%=selected[17] %>>completed</option>
		</select>
	</tr>
	<tr>
		<td>Sunday</td>
		<td><input type = "text" value = "<%=daysArr[7] %>" name = "dn7" size = "100%"></td>
		<td>
		<select name = "status7">
			<% if (statusesArr[7].equals(s1)) {
				selected[18] = "selected";
				}
				if (statusesArr[7].equals(s2)) {
				selected[19] = "selected";
				}
				if (statusesArr[7].equals(s3)) {
				selected[20] = "selected";
				}
				%>
  			<option value="<%=s1 %>" <%=selected[18] %>>planned</option>
  			<option value="<%=s2 %>" <%=selected[19] %>>in progress</option>
  			<option value="<%=s3 %>" <%=selected[20] %>>completed</option>
		</select>
	</tr>
	</table>

<input type = "submit" id = "submitButton" title = "Submit" value = "Submit">
</form>
