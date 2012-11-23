package org.portlets.lia.mine.portlet.actions;


import com.liferay.util.bridges.mvc.ActionCommand;
import org.portlets.lia.mine.service.IssueLocalServiceUtil;
import javax.portlet.PortletException;
import java.io.IOException;
import java.io.*;
import java.util.*;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import org.portlets.lia.mine.model.Issue;
import org.portlets.lia.mine.model.impl.IssueImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import com.liferay.counter.service.CounterLocalServiceUtil;

public class AddIssueActionCommand implements ActionCommand {

		protected String doneJSP = "/done.jsp";

	public boolean processCommand (PortletRequest request, PortletResponse response)
		throws PortletException {


		try {
			ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		ServiceContext serviceContext =
		            ServiceContextFactory.getInstance(
		                Issue.class.getName(), request);

		Long issueId = CounterLocalServiceUtil.increment(Issue.class.getName());
		String id = issueId.toString();

		Issue issue = new IssueImpl();
		issue.setAssignee("Not Assigned");

		issue.setSummary(request.getParameter("summary"));
		issue.setStatusx("New");
		issue.setDescription(request.getParameter("description"));
		issue.setRequester(request.getParameter("requester"));
		issue.setPriority(request.getParameter("priority"));

		issue.setCompanyId(themeDisplay.getCompanyId());
        issue.setGroupId(themeDisplay.getScopeGroupId());
        issue.setUserId(themeDisplay.getUserId());


		IssueLocalServiceUtil.addIssue(themeDisplay.getUserId(), issueId,
			issue.getSummary(), issue.getDescription(), issue.getRequester(), issue.getAssignee(), 
			issue.getPriority(), issue.getStatusx(), serviceContext);


		request.setAttribute("issue_id", id);
		request.setAttribute("issue", issue);

		request.setAttribute("jspPage", doneJSP);

		} catch (SystemException se) {
			System.out.println(se);
		}  catch (PortalException pe) {
			System.out.println(pe);
		}

		return true;

		}
}