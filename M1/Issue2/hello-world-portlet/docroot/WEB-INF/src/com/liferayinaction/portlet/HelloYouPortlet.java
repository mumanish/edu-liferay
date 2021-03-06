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
import java.io.*;
import java.util.*;

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
		String email = (String)prefs.getValue("email", "no");

		if(username.equalsIgnoreCase("no") || email.equalsIgnoreCase("no")) {
			username = "";
			email = "";
		}

		renderRequest.setAttribute("userName", username);
		renderRequest.setAttribute("eMail", email);


		PortletURL goEdit = renderResponse.createActionURL();
		goEdit.setParameter("goEdit", "goEdit");
		renderRequest.setAttribute("goEditMode", goEdit.toString());

		include(viewJSP, renderRequest, renderResponse);
	}

	public void doEdit(RenderRequest renderRequest,
		RenderResponse renderResponse) throws IOException, PortletException {

		PortletPreferences prefs = renderRequest.getPreferences();
		String username = (String)prefs.getValue("name", "n/a");
		String email = (String)prefs.getValue("email", "n/a");

		renderRequest.setAttribute("userName", username);
		renderRequest.setAttribute("eMail", email);

		renderResponse.setContentType("text/html");

		PortletURL addName = renderResponse.createActionURL();
		addName.setParameter("addName", "addName");
		renderRequest.setAttribute("addNameURL", addName.toString());

		PortletURL addDef = renderResponse.createActionURL();
		addDef.setParameter("addDef", "addDef");
		renderRequest.setAttribute("addDefault", addDef.toString());

		

		include(editJSP, renderRequest, renderResponse);
	}


	public void processAction(ActionRequest actionRequest, 
		ActionResponse actionResponse) throws IOException, PortletException {

		String addName = actionRequest.getParameter("addName");
		String addDef = actionRequest.getParameter("addDef");
		String goEdit = actionRequest.getParameter("goEdit");

		

		if (addName != null) {

			PortletPreferences prefs = actionRequest.getPreferences();
			prefs.setValue("name", actionRequest.getParameter("username"));
			prefs.setValue("email", actionRequest.getParameter("email"));
			
			prefs.store();

			actionResponse.setPortletMode(PortletMode.VIEW);

		}

		if (addDef != null) {

			PortletPreferences prefs = actionRequest.getPreferences();
			prefs.setValue("name", "DEFAULT");
			prefs.setValue("email", "default@liferay.com");
			
			prefs.store();
			actionResponse.setPortletMode(PortletMode.VIEW);
		}

		if (goEdit != null) {

			actionResponse.setPortletMode(PortletMode.EDIT);

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
