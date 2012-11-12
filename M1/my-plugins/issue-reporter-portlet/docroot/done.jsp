<%@ include file="/init.jsp" %>


<jsp:useBean id="issue_id" class="java.lang.String" scope="request" />
<jsp:useBean id="issue" class="org.portlets.lia.mine.model.impl.IssueImpl" scope="request" />

<portlet:actionURL name="viewIssueForm" var="viewIssueFormURL" />

<p><b><center><liferay-ui:message key="thankYou" /></center></b></p>

<b>Summary:</b> <%= issue.getSummary() %><p><p>
<b>Description:</b> <%= issue.getDescription() %><p>
<b>Requester:</b> <%= issue.getRequester() %><p>
<b>Assignee:</b> <i><%= issue.getAssignee() %></i><p>
<b>Priority:</b> <%= issue.getPriority() %><p>
<b>Status:</b> <i><%= issue.getStatusx() %></i><p>


Your issue id #: <b><%=issue_id %></b><p>

<aui:button onClick="<%=viewIssueFormURL.toString() %>" value="Cancel" />

