<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<jsp:useBean id="doSubmit" class = "java.lang.String" scope="request" />

<jsp:useBean id="dv1" class="java.lang.String" scope="request" />
<jsp:useBean id="dv2" class="java.lang.String" scope="request" />
<jsp:useBean id="dv3" class="java.lang.String" scope="request" />
<jsp:useBean id="dv4" class="java.lang.String" scope="request" />
<jsp:useBean id="dv5" class="java.lang.String" scope="request" />
<jsp:useBean id="dv6" class="java.lang.String" scope="request" />
<jsp:useBean id="dv7" class="java.lang.String" scope="request" />

<jsp:useBean id="status_e1" class="java.lang.String" scope="request" />
<jsp:useBean id="status_e2" class="java.lang.String" scope="request" />
<jsp:useBean id="status_e3" class="java.lang.String" scope="request" />
<jsp:useBean id="status_e4" class="java.lang.String" scope="request" />
<jsp:useBean id="status_e5" class="java.lang.String" scope="request" />
<jsp:useBean id="status_e6" class="java.lang.String" scope="request" />
<jsp:useBean id="status_e7" class="java.lang.String" scope="request" />

<% String s1 = "planned";
	String s2 = "in progress";
	 String s3 = "completed";

	 String[] selected = new String[21];
	 
	 %>

<portlet:defineObjects />

<form
	id = "portlet:namespace />helloForm"
	action = "<%= doSubmit %>"
	method = "post">

	<table>
	<tr>
		<td>Monday</td>
		<td><input type = "text" value = "<%=dv1 %>" name = "dn1" size = "100%"></td>
		<td>
		<select name = "status1">
			<% if (status_e1.equals(s1)) {
				selected[0] = "selected";
				}
				if (status_e1.equals(s2)) {
				selected[1] = "selected";
				}
				if (status_e1.equals(s3)) {
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
		<td><input type = "text" value = "<%=dv2 %>" name = "dn2" size = "100%"></td>
		<td>
		<select name = "status2">
			<% if (status_e2.equals(s1)) {
				selected[3] = "selected";
				}
				if (status_e2.equals(s2)) {
				selected[4] = "selected";
				}
				if (status_e2.equals(s3)) {
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
		<td><input type = "text" value = "<%=dv3 %>" name = "dn3" size = "100%"></td>
		<td>
		<select name = "status3">
			<% if (status_e3.equals(s1)) {
				selected[6] = "selected";
				}
				if (status_e3.equals(s2)) {
				selected[7] = "selected";
				}
				if (status_e3.equals(s3)) {
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
		<td><input type = "text" value = "<%=dv4 %>" name = "dn4" size = "100%"></td>
		<td>
		<select name = "status4">
			<% if (status_e4.equals(s1)) {
				selected[9] = "selected";
				}
				if (status_e4.equals(s2)) {
				selected[10] = "selected";
				}
				if (status_e4.equals(s3)) {
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
		<td><input type = "text" value = "<%=dv5 %>" name = "dn5" size = "100%"></td>
		<td>
		<select name = "status5">
			<% if (status_e5.equals(s1)) {
				selected[12] = "selected";
				}
				if (status_e5.equals(s2)) {
				selected[13] = "selected";
				}
				if (status_e5.equals(s3)) {
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
		<td><input type = "text" value = "<%=dv6 %>" name = "dn6" size = "100%"></td>
		<td>
		<select name = "status6">
			<% if (status_e6.equals(s1)) {
				selected[15] = "selected";
				}
				if (status_e6.equals(s2)) {
				selected[16] = "selected";
				}
				if (status_e6.equals(s3)) {
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
		<td><input type = "text" value = "<%=dv7 %>" name = "dn7" size = "100%"></td>
		<td>
		<select name = "status7">
			<% if (status_e7.equals(s1)) {
				selected[18] = "selected";
				}
				if (status_e7.equals(s2)) {
				selected[19] = "selected";
				}
				if (status_e7.equals(s3)) {
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
