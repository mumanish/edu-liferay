package org.portlets.lia.mine.portlet.actions;


import com.liferay.util.bridges.mvc.ActionCommand;
import org.portlets.lia.mine.service.IssueLocalServiceUtil;
import javax.portlet.PortletException;
import java.io.IOException;
import java.io.*;
import java.util.*;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import org.portlets.lia.mine.model.Issue;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

public class CheckStatusActionCommand implements ActionCommand {

		protected String checkStatusJSP = "/check_status_done.jsp";

	public boolean processCommand (PortletRequest request, PortletResponse response)
		throws PortletException {

		try {
			
			long issueId = ParamUtil.getLong(request, "id");
			Issue issue = IssueLocalServiceUtil.getIssue(issueId);

			request.setAttribute("statusx", issue.getStatusx());
			request.setAttribute("id", request.getParameter("id"));
			request.setAttribute("jspPage", checkStatusJSP);

		} catch (SystemException se) {
			System.out.println(se);
		}  catch (PortalException pe) {
			System.out.println(pe);
		}

		return true;

		}
}