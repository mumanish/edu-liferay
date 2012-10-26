package org.portlets.lia.mine.portlet;

import javax.portlet.GenericPortlet;
import org.portlets.lia.mine.service.IssueLocalServiceUtil;
import javax.portlet.PortletException;
import java.io.IOException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequestDispatcher;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.portlet.PortletURL;
import javax.portlet.PortletMode;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.io.*;
import java.util.*;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;


public class IssueReporterPortlet extends MVCPortlet {


	protected String doneJSP = "/done.jsp";

	public void addIssue(ActionRequest request, ActionResponse response)throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

		IssueLocalServiceUtil.addIssue(themeDisplay.getUserId(), 
			request.getParameter("summary"), request.getParameter("description"), request.getParameter("requester"), "Not assigned",
				request.getParameter("priority"), "New");

		response.setRenderParameter("jspPage", doneJSP);
	}

}