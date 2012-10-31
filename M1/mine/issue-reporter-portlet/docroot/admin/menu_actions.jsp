<%@ include file="/init.jsp" %>



<%
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Issue myIssue = (Issue)row.getObject();
	ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
	
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = Issue.class.getName();
	String primKey = String.valueOf(myIssue.getPrimaryKey());


%>

<liferay-ui:icon-menu>

<portlet:actionURL name="viewFullIssue" var="fullURL">
	<portlet:param name="resourcePrimKey" value="<%= primKey %>" />
</portlet:actionURL>

<portlet:actionURL name="editIssue" var="editURL">
	<portlet:param name="resourcePrimKey" value="<%= primKey %>" />
</portlet:actionURL>

<portlet:actionURL name="changeAssigneeMenu" var="chAssigneeMenuURL">
	<portlet:param name="resourcePrimKey" value="<%= primKey %>" />
</portlet:actionURL>

<portlet:actionURL name="changePriorityMenu" var="chPriorityURL">
	<portlet:param name="resourcePrimKey" value="<%= primKey %>" />
</portlet:actionURL>

<portlet:actionURL name="changeStatusMenu" var="chStatusURL">
	<portlet:param name="resourcePrimKey" value="<%= primKey %>" />
</portlet:actionURL>

<liferay-ui:icon image="edit" message="View Full Issue" url="<%= fullURL.toString() %>" />

<liferay-ui:icon image="edit" message="Change Assignee" url="<%= chAssigneeMenuURL.toString() %>" />
<liferay-ui:icon image="edit" message="Change Priority" url="<%= chPriorityURL.toString() %>" />
<liferay-ui:icon image="edit" message="Change Status" url="<%= chStatusURL.toString() %>" />


<liferay-ui:icon image="edit" message="Edit" url="<%= editURL.toString() %>" />


<portlet:actionURL name="deleteIssue" var="deleteURL">
	<portlet:param name="resourcePrimKey" value="<%= primKey %>" />
</portlet:actionURL>

<liferay-ui:icon-delete url="<%= deleteURL.toString() %>" />



</liferay-ui:icon-menu>

