<%@ include file="/init.jsp" %>


<portlet:actionURL name="viewIssue" var="viewIssueURL" />

<aui:form action="<%= viewIssueURL.toString() %>" method="post">
<aui:fieldset>
	<aui:button-row>
		<aui:button type = "submit" value = "View" />
	</aui:button-row>

</aui:fieldset>
</aui:form>

