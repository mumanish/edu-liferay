<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="org.portlets.lia.mine.service.IssueLocalServiceUtil" %>
<%@ page import = "java.util.*" %>

<jsp:useBean id="status" class="java.lang.String" scope="request" />
<jsp:useBean id="id" class="java.lang.String" scope="request" />

<portlet:defineObjects />


Issue ID-<%= id %> status is: <h4><b><%= status %></b></h4>