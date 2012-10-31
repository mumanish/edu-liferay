<%@ include file="/init.jsp" %>


<%
	Issue issue = (Issue)request.getAttribute("issue");
%>

<portlet:actionURL name="changePriority" var="chPriorityURL" />
<portlet:actionURL name="viewIssue" var="viewIssueURL" />

<h5>Change Priority:</h5><p>

<aui:form
	name="chp" action="<%= chPriorityURL.toString() %>" 
	method="post" >

<aui:fieldset>
	
	<aui:input
		name="resourcePrimKey"
		value="<%= issue.getIssueId() %>"
		type="hidden" />

<aui:select name="issuePriority">
		<c:choose>
			<c:when test="<%= issue.getPriority() != null %>" >
				<c:choose>
					<c:when test='<%= issue.getPriority().equals("Low") %>' >
						<aui:option value="Low" selected="true">Low</aui:option>
					</c:when>
					<c:otherwise>
						<aui:option value="Low">Low</aui:option>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test='<%= issue.getPriority().equals("Normal") %>' >
						<aui:option value="Normal" selected="true">Normal</aui:option>
					</c:when>
					<c:otherwise>
						<aui:option value="Normal">Normal</aui:option>
					</c:otherwise>
				</c:choose>

				<c:choose>
					<c:when test='<%= issue.getPriority().equals("High") %>' >
						<aui:option value="High" selected="true">High</aui:option>
					</c:when>
					<c:otherwise>
						<aui:option value="High">High</aui:option>
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
