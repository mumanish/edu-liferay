
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<%@ page import="org.portlets.lia.mine.service.IssueLocalServiceUtil" %>
<%@ page import = "java.util.*" %>

<jsp:useBean id="test" class="java.lang.String" scope = "request" />


<p><b><liferay-ui:message key="thankYou" /></b></p>

<%= test %>