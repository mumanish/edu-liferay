
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>



<portlet:defineObjects />

<portlet:actionURL name="viewIssue" var="viewIssueURL" />

<aui:form action="<%= viewIssueURL.toString() %>" method="post">
<aui:fieldset>
	<aui:button-row>
		<aui:button type = "submit" value = "View" />
	</aui:button-row>

</aui:fieldset>
</aui:form>

