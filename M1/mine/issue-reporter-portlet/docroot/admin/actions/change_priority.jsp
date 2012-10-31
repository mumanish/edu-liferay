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
