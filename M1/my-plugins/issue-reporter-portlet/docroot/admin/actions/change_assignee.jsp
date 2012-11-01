<%@ include file="/init.jsp" %>


<%
	Issue issue = (Issue)request.getAttribute("issue");
%>

<portlet:actionURL name = "changeAssignee" var = "chAssigneeURL" />
<portlet:actionURL name="viewIssue" var="viewIssueURL" />


<h5>Change Assignee:</h5><p>

<aui:form
	name="cha" action="<%= chAssigneeURL.toString() %>" 
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

	<aui:button-row>
		<aui:button type = "submit" value = "Save" />

		<aui:button name = "viewIssueURL" 
			onClick="<%=viewIssueURL.toString() %>" 
			type = "button" value = "Cancel" />
			
	</aui:button-row>

</aui:fieldset>
</aui:form>
