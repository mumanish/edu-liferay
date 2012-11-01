<%@ include file="/init.jsp" %>


<%
	Issue issue = (Issue)request.getAttribute("issue");
%>


<portlet:actionURL name="viewIssue" var="viewIssueURL" />

<aui:form action="<%= viewIssueURL.toString() %>" method="post">
<aui:fieldset>

ID: <%= issue.getIssueId() %><p>
Summary: <%= issue.getSummary() %><p>
Description: <%= issue.getDescription() %><p>
Requester: <%= issue.getRequester() %><p>
Assignee: <%= issue.getAssignee() %><p>
Priority: <%= issue.getPriority() %><p>
Status: <%= issue.getStatus() %><p>
---<p>
Created Date: <%= issue.getCreateDate() %><p>

<aui:button-row>
	<aui:button type = "submit" value = "Cancel" />
</aui:button-row>

</aui:fieldset>
</aui:form>

