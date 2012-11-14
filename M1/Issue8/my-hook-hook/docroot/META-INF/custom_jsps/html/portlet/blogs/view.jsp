<%@ include file="/html/portlet/blogs/init.jsp" %>

<h6>Hooked Header</h6>

<liferay-util:buffer var="html">
	<liferay-util:include page="/html/portlet/blogs/view.portal.jsp" />
</liferay-util:buffer>

<%
	html = StringUtil.replace(html, "hello", "hola");
%>

<%= html %>