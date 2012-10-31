<%@ include file="/init.jsp" %>


<jsp:useBean id="status" class="java.lang.String" scope="request" />
<jsp:useBean id="id" class="java.lang.String" scope="request" />

<portlet:actionURL name="viewIssueForm" var="viewIssueFormURL" />


Issue ID-<%= id %> status is: <h4><b><%= status %></b></h4><p>


<aui:button onClick="<%=viewIssueFormURL.toString() %>" value="Cancel" />
