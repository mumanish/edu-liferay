<%@ include file="/init.jsp" %>


<jsp:useBean id="issue_id" class="java.lang.String" scope="request" />

<portlet:actionURL name="viewIssueForm" var="viewIssueFormURL" />

<p><b><liferay-ui:message key="thankYou" /></b></p>
Your issue id #: <b><%=issue_id %></b><p>

<aui:button onClick="<%=viewIssueFormURL.toString() %>" value="Cancel" />

