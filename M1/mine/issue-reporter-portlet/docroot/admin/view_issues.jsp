
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<%@ page import="org.portlets.lia.mine.service.IssueLocalServiceUtil" %>
<%@ page import="org.portlets.lia.mine.model.Issue" %>
<%@ page import = "java.util.*" %>
<%@ page import = "com.liferay.portal.kernel.util.ListUtil" %>
<%@ page import = "javax.portlet.PortletURL" %>



<jsp:useBean id="issues" class="java.util.ArrayList" scope = "request" />

<portlet:defineObjects />


<!-- TODO: pagination actions -->

<liferay-ui:search-container delta = "20">

<liferay-ui:search-container-results>
<%
	List<Issue> results2 = ListUtil.subList(
		issues, searchContainer.getStart(), searchContainer.getEnd());
	int total2 = issues.size();

	pageContext.setAttribute("results", results2);
	pageContext.setAttribute("total", total2);
%>
</liferay-ui:search-container-results>

<liferay-ui:search-container-row
	className="org.portlets.lia.mine.model.Issue"
	keyProperty="issueId"
	modelVar="issue">

	<liferay-ui:search-container-column-text
		name="id"
		property="issueId"
		/>

	<liferay-ui:search-container-column-text
		name="summary"
		property="summary"
		/>

	<liferay-ui:search-container-column-text
		name="requester"
		property="requester"
		/>

	<liferay-ui:search-container-column-text
		name="assignee"
		property="assignee"
		/>

	<liferay-ui:search-container-column-text
		name="priority"
		property="priority"
		/>

	<liferay-ui:search-container-column-text
		name="status"
		property="status"
		/>

	<liferay-ui:search-container-column-jsp
		path="/admin/menu_actions.jsp"
		align="right"
		/>

</liferay-ui:search-container-row>


<liferay-ui:search-iterator/>

</liferay-ui:search-container>

