<%@ include file="/init.jsp" %>



<%
	Issue issue = (Issue)request.getAttribute("issue");
%>

<portlet:actionURL name = "changeStatus" var = "chStatusURL" />
<portlet:actionURL name="viewIssue" var="viewIssueURL" />


<h5>Change Status:</h5><p>

<aui:form
	name="chs" action="<%= chStatusURL.toString() %>" 
	method="post" >

<aui:fieldset>	

	<aui:input
		name="resourcePrimKey"
		value="<%= issue.getIssueId() %>"
		type="hidden" />

	<aui:select name="issueStatus">
		<c:choose>
			<c:when test="<%= issue.getStatus() != null %>" >
				<c:choose>
					<c:when test='<%= issue.getStatus().equals("New") %>' >
						<aui:option value="New" selected="true">New</aui:option>
					</c:when>
					<c:otherwise>
						<aui:option value="New">New</aui:option>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test='<%= issue.getStatus().equals("In Progress") %>' >
						<aui:option value="In Progress" selected="true">In Progress</aui:option>
					</c:when>
					<c:otherwise>
						<aui:option value="In Progress">In Progress</aui:option>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test='<%= issue.getStatus().equals("Completed") %>' >
						<aui:option value="Completed" selected="true">Completed</aui:option>
					</c:when>
					<c:otherwise>
						<aui:option value="Completed">Completed</aui:option>
					</c:otherwise>
				</c:choose>
			</c:when>
		</c:choose>
	</aui:select>

	<aui:button-row>
		<aui:button type = "submit" value = "Save" />

		<aui:button name = "viewIssueURL" 
			onClick="<%=viewIssueURL.toString() %>" 
			type = "button" value = "Cancel" />
	</aui:button-row>

</aui:fieldset>
</aui:form>
