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
import com.liferay.portal.model.User;
import org.portlets.lia.mine.model.impl.IssueImpl;



public class IssueAdminPortlet extends MVCPortlet {

protected String viewJSP = "/admin/view_issues.jsp";
protected String editJSP = "/admin/edit_issue.jsp";
protected String chAssigneeJSP = "/admin/actions/change_assignee.jsp";
protected String chPriorityJSP = "/admin/actions/change_priority.jsp";
protected String chStatusJSP = "/admin/actions/change_status.jsp";


	public void viewIssue(ActionRequest request, ActionResponse response)throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

		List<Issue> issues = IssueLocalServiceUtil.retrieveIssues(themeDisplay.getUserId());

		ArrayList issuesList = new ArrayList();


			for (Iterator i = issues.iterator(); i.hasNext();) {
			issuesList.add((Issue)i.next());
			}

		request.setAttribute("issues", issuesList);
		response.setRenderParameter("jspPage", viewJSP);
	}


	public void deleteIssue(ActionRequest request, ActionResponse response)
		throws Exception {

			long issueKey = ParamUtil.getLong(request, "resourcePrimKey");
			IssueLocalServiceUtil.deleteIssue(issueKey);

			viewIssue(request, response);
		}

	public void editIssue (ActionRequest request, ActionResponse response)
	throws Exception {

			long issueKey = ParamUtil.getLong(request, "resourcePrimKey");
			Issue issue = IssueLocalServiceUtil.getIssue(issueKey);

			request.setAttribute("issue", issue);
			response.setRenderParameter("jspPage", editJSP);
	}

	public void updateIssue(ActionRequest request, ActionResponse response)
		throws Exception {

			long issueKey = ParamUtil.getLong(request, "resourcePrimKey");

			Issue issue = IssueLocalServiceUtil.getIssue(issueKey);
			Issue requestIssue = issueFromRequest(request);

			issue.setAssignee(requestIssue.getAssignee());
			issue.setPriority(requestIssue.getPriority());
			issue.setStatus(requestIssue.getStatus());

			IssueLocalServiceUtil.updateIssue(issue);

		}



	public static Issue issueFromRequest (ActionRequest request) {

		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.
				THEME_DISPLAY);
		Issue issue = new IssueImpl();

		issue.setAssignee(ParamUtil.getString(request, "issueAssignee"));
		issue.setPriority(ParamUtil.getString(request, "issuePriority"));
		issue.setStatus(ParamUtil.getString(request, "issueStatus"));
		return issue;
	}


	/* task actions */


	public void changeAssigneeMenu(ActionRequest request, ActionResponse response)
		throws Exception {

			long issueKey = ParamUtil.getLong(request, "resourcePrimKey");
			Issue issue = IssueLocalServiceUtil.getIssue(issueKey);

			request.setAttribute("issue", issue);
			response.setRenderParameter("jspPage", chAssigneeJSP);
		}


	public void changeAssignee(ActionRequest request, ActionResponse response)
		throws Exception {

			long issueKey = ParamUtil.getLong(request, "resourcePrimKey");

			Issue issue = IssueLocalServiceUtil.getIssue(issueKey);
			Issue requestIssue = issueFromRequest(request);

			issue.setAssignee(requestIssue.getAssignee());

			IssueLocalServiceUtil.updateIssue(issue);


		}

	public void changePriorityMenu(ActionRequest request, ActionResponse response)
		throws Exception {

			long issueKey = ParamUtil.getLong(request, "resourcePrimKey");
			Issue issue = IssueLocalServiceUtil.getIssue(issueKey);

			request.setAttribute("issue", issue);
			response.setRenderParameter("jspPage", chPriorityJSP);

		}

	public void changePriority(ActionRequest request, ActionResponse response)
		throws Exception {

			long issueKey = ParamUtil.getLong(request, "resourcePrimKey");

			Issue issue = IssueLocalServiceUtil.getIssue(issueKey);
			Issue requestIssue = issueFromRequest(request);

			issue.setPriority(requestIssue.getPriority());

			IssueLocalServiceUtil.updateIssue(issue);

		}	

	public void changeStatusMenu(ActionRequest request, ActionResponse response)
		throws Exception {

			long issueKey = ParamUtil.getLong(request, "resourcePrimKey");
			Issue issue = IssueLocalServiceUtil.getIssue(issueKey);

			request.setAttribute("issue", issue);
			response.setRenderParameter("jspPage", chStatusJSP);

		}

	public void changeStatus(ActionRequest request, ActionResponse response)
		throws Exception {

			long issueKey = ParamUtil.getLong(request, "resourcePrimKey");

			Issue issue = IssueLocalServiceUtil.getIssue(issueKey);
			Issue requestIssue = issueFromRequest(request);

			issue.setStatus(requestIssue.getStatus());

			IssueLocalServiceUtil.updateIssue(issue);


		}	

	

}