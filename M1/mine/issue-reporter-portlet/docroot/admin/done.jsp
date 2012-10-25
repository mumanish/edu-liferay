
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<%@ page import="org.portlets.lia.mine.service.IssueLocalServiceUtil" %>
<%@ page import="org.portlets.lia.mine.model.Issue" %>
<%@ page import = "java.util.*" %>

<jsp:useBean id="issues" class="java.util.ArrayList" scope = "request" />


<table width = "100%">
	<tr>
		<td width = "40%">Summary</td>
		<td width = "15%">Requester</td>
		<td width = "15%">Priority</td>
	</tr>
	<p>
	<tr><td>&nbsp</td></tr>	
	<p>

	<%
		for (Iterator i = issues.iterator(); i.hasNext();) { 
		Issue is = (Issue)i.next(); %>
	
		<tr>
		<td><b><%= is.getSummary() %></b></td>
		<td><font color = "#3E6E9B"><%= is.getRequester() %></td>
		<td><font color = "#9E6E9B"><%= is.getPriority() %></td>
		</tr>

	<% } %>
