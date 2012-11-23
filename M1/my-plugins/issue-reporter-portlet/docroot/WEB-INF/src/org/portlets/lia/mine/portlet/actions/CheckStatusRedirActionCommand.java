package org.portlets.lia.mine.portlet.actions;


import com.liferay.util.bridges.mvc.ActionCommand;
import javax.portlet.PortletException;
import java.io.IOException;
import java.io.*;
import java.util.*;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

public class CheckStatusRedirActionCommand implements ActionCommand {

	protected String checkStatusRedirJSP = "/check_status.jsp";

	public boolean processCommand (PortletRequest request, PortletResponse response)
		throws PortletException {

			request.setAttribute("jspPage", checkStatusRedirJSP);

		return true;

		}
}