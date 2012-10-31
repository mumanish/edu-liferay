<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="org.portlets.lia.mine.service.IssueLocalServiceUtil" %>
<%@ page import = "java.util.*" %>


<portlet:defineObjects />

<portlet:actionURL name="checkStatus" var="checkStatusURL" />

<aui:form action="<%= checkStatusURL.toString() %>" method="post">

	<aui:fieldset>
		Check your issue status by ID <p><aui:input name="id" size="10" />
	<aui:button type="submit" value="Check" />
	</aui:fieldset>

</aui:form>