<%@ include file="/init.jsp" %>


<portlet:actionURL name="checkStatus" var="checkStatusURL" />
<portlet:actionURL name="viewIssueForm" var="viewIssueFormURL" />

<aui:form action="<%= checkStatusURL.toString() %>" method="post">

	<aui:fieldset>
		Check your issue status by ID <p><aui:input name="id" size="10" />
		<aui:button type="submit" value="Check" />
		<aui:button onClick="<%=viewIssueFormURL.toString() %>" value="Cancel" />
	</aui:fieldset>

</aui:form>