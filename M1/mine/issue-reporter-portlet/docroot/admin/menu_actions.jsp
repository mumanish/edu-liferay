<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@ page import="java.util.List" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.Collections" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.CalendarFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry" %>
<%@ page import="com.liferay.portal.kernel.exception.SystemException" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.security.permission.ActionKeys" %>
<%@ page import="com.liferay.portal.kernel.util.ListUtil" %>
<%@ page import="com.liferay.portal.service.permission.PortalPermissionUtil" %>
<%@ page import="com.liferay.portal.service.permission.PortletPermissionUtil" %>
<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>



<%@ page import="org.portlets.lia.mine.service.IssueLocalServiceUtil" %>
<%@ page import="org.portlets.lia.mine.model.Issue" %>
<%@ page import = "java.util.*" %>
<%@ page import = "com.liferay.portal.kernel.util.ListUtil" %>




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

