<%@ include file="/init.jsp" %>


<%
	Issue issue = (Issue)request.getAttribute("issue");
%>

<portlet:actionURL name = "updateIssue" var = "updateIssueURL" />
<portlet:actionURL name="viewIssue" var="viewIssueURL" />


<h5>Edit issue</h5><p>

<aui:form
	name="fm" action="<%= updateIssueURL.toString() %>" 
	method="post" >

<aui:fieldset>
	
	<aui:input
		name="resourcePrimKey"
		value="<%= issue.getIssueId() %>"
		type="hidden" />


	<aui:input
		name="issueAssignee"
		value="<%= issue.getAssignee() %>"
		size="20" />


	<aui:input
		name="issuePriority"
		value="<%= issue.getPriority() %>"
		size="20" />


	<aui:input
		name="issueStatus"
		value="<%= issue.getStatus() %>"
		size="20" />

	<aui:button-row>
		<aui:button type = "submit" value = "Save" />
		<aui:button name = "viewIssueURL" 
			onClick="<%=viewIssueURL.toString() %>" 
			type = "button" value = "Cancel" />
	</aui:button-row>

</aui:fieldset>
</aui:form>
