package com.liferayinaction.portlet;

import javax.portlet.GenericPortlet;
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

public class HelloYouPortlet extends GenericPortlet {

	protected String editJSP;
	protected String viewJSP;

	private static Log _log = LogFactory.getLog(HelloYouPortlet.class);


	public void init() throws PortletException {

		editJSP = getInitParameter("edit-jsp");
		viewJSP = getInitParameter("view-jsp");
	}

	public void doView(RenderRequest renderRequest,
		RenderResponse renderResponse) throws IOException, PortletException {

		PortletPreferences prefs = renderRequest.getPreferences();
		String username = (String)prefs.getValue("name", "no");

		if(username.equalsIgnoreCase("no")) {
			username = "unknown";
		}

		renderRequest.setAttribute("userName", username);
		include(viewJSP, renderRequest, renderResponse);
	}

	public void doEdit(RenderRequest renderRequest,
		RenderResponse renderResponse) throws IOException, PortletException {

		renderResponse.setContentType("text/html");
		PortletURL addName = renderResponse.createActionURL();
		addName.setParameter("addName", "addName");
		renderRequest.setAttribute("addNameURL", addName.toString());
		include(editJSP, renderRequest, renderResponse);
	}


	public void processAction(ActionRequest actionRequest, 
		ActionResponse actionResponse) throws IOException, PortletException {

		String addName = actionRequest.getParameter("addName");

		if (addName != null) {

			PortletPreferences prefs = actionRequest.getPreferences();
			prefs.setValue("name", actionRequest.getParameter("username"));
			
			prefs.store();
			actionResponse.setPortletMode(PortletMode.VIEW);
		}
	}

	protected void include(String path, RenderRequest renderRequest,
		RenderResponse renderResponse) throws IOException, PortletException {

		PortletRequestDispatcher portletRequestDispatcher = 
		getPortletContext().getRequestDispatcher(path);

		if(portletRequestDispatcher == null) {
			_log.error(path + "is not a valid include");
		} 
		else {
			portletRequestDispatcher.include(renderRequest, renderResponse);
		}
	}

}
