<%@ include file="/init.jsp" %>

<portlet:actionURL name="addIssue" var="addIssueURL" />
<portlet:actionURL name="checkStatusRedir" var="checkStatusRedirURL" />

<aui:form action="<%= addIssueURL.toString() %>" method="post">
<aui:fieldset>
	<aui:input name="summary" size="75" value = "Sample summary must be viewed" />
	<aui:input name="requester" size="25" value = "Vladimir Frolov" />
	<aui:select name="priority">
		<aui:option value="Low" selected="true">Low</aui:option>
		<aui:option value="Normal">Normal</aui:option>
		<aui:option value="High">High</aui:option>
	</aui:select>
	<aui:input type="textarea" name="description" rows="10" cols="77"/>

	<aui:button-row>
		<aui:button type = "submit" value = "Report" />
		<aui:button name = "checkStatusRedirURL" 
					onClick="<%=checkStatusRedirURL.toString() %>" 
					type = "button" value = "Check Status" />
		</aui:button-row>
</aui:fieldset>
</aui:form>


