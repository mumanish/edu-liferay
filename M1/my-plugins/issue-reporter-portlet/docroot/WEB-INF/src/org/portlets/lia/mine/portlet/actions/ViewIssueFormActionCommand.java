package org.portlets.lia.mine.portlet.actions;


import com.liferay.util.bridges.mvc.ActionCommand;
import javax.portlet.PortletException;
import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

public class ViewIssueFormActionCommand implements ActionCommand {

	protected String viewJSP = "/view.jsp";

	public boolean processCommand (PortletRequest request, PortletResponse response)
		throws PortletException {

			request.setAttribute("jspPage", viewJSP);

		return true;

		}
}