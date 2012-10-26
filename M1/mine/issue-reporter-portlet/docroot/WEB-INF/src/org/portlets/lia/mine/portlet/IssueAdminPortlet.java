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


public class IssueAdminPortlet extends MVCPortlet {

protected String doneJSP = "/admin/done.jsp";

	public void viewIssue(ActionRequest request, ActionResponse response)throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

		List<Issue> issues = IssueLocalServiceUtil.retrieveIssues(themeDisplay.getUserId());

		ArrayList issuesList = new ArrayList();


			for (Iterator i = issues.iterator(); i.hasNext();) {
			issuesList.add((Issue)i.next());
			}

		request.setAttribute("issues", issuesList);
		response.setRenderParameter("jspPage", doneJSP);
	}


	public void deleteIssue(ActionRequest request, ActionResponse response)
		throws Exception {

			long issueKey = ParamUtil.getLong(request, "resourcePrimKey");
			IssueLocalServiceUtil.deleteIssue(issueKey);

			viewIssue(request, response);
		}

}