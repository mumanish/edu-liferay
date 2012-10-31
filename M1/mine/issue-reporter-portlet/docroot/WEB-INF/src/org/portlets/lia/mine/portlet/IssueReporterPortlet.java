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
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import org.portlets.lia.mine.model.Issue;

import com.liferay.counter.service.CounterLocalServiceUtil;



public class IssueReporterPortlet extends MVCPortlet {


	protected String doneJSP = "/done.jsp";
	protected String checkStatusRedirJSP = "/check_status.jsp";
	protected String checkStatusJSP = "/check_status_done.jsp";
	

	public void addIssue(ActionRequest request, ActionResponse response)throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);


		Long issueId = CounterLocalServiceUtil.increment(Issue.class.getName());
		String id = issueId.toString();


		IssueLocalServiceUtil.addIssue(themeDisplay.getUserId(), issueId,
			request.getParameter("summary"), request.getParameter("description"), request.getParameter("requester"), "Not assigned",
				request.getParameter("priority"), "New");

		request.setAttribute("issue_id", id);
		response.setRenderParameter("jspPage", doneJSP);
	}

	public void checkStatusRedir(ActionRequest request, ActionResponse response)
		throws Exception {


			response.setRenderParameter("jspPage", checkStatusRedirJSP);

		}

	public void checkStatus(ActionRequest request, ActionResponse response)
		throws Exception {

			long issueId = ParamUtil.getLong(request, "id");
			Issue issue = IssueLocalServiceUtil.getIssue(issueId);

			request.setAttribute("status", issue.getStatus());
			request.setAttribute("id", request.getParameter("id"));
			response.setRenderParameter("jspPage", checkStatusJSP);
		}



}

