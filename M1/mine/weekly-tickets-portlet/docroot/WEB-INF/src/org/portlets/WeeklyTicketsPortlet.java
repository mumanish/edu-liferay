package org.portlets;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import java.io.IOException;
import javax.portlet.ReadOnlyException;
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

public class WeeklyTicketsPortlet extends GenericPortlet {


	protected String editJSP;
	protected String viewJSP;
	Helper service;

	public void init() throws PortletException {

		editJSP = getInitParameter("edit-jsp");
		viewJSP = getInitParameter("view-jsp");
		service = new Helper();
	}

	public void doView(RenderRequest renderRequest,
		RenderResponse renderResponse)throws IOException, PortletException {

		PortletPreferences prefs = renderRequest.getPreferences();
		
		String[] days = service.getPreferencesValues(prefs, "d");
		String[] statuses = service.getPreferencesValues(prefs, "status_");

		service.setAttributeValues(renderRequest, "dv", days);
		service.setAttributeValues(renderRequest, "status_v", statuses);

		PortletURL goEdit = renderResponse.createActionURL();
		goEdit.setParameter("goEdit", "goEdit");
		renderRequest.setAttribute("goEditMode", goEdit.toString());

		include(viewJSP, renderRequest, renderResponse);
	}

	public void doEdit(RenderRequest renderRequest,
		RenderResponse renderResponse)throws IOException, PortletException {

		renderResponse.setContentType("text/html");

		PortletPreferences prefs = renderRequest.getPreferences();
		
		String[] days = service.getPreferencesValues(prefs, "d");
		String[] statuses = service.getPreferencesValues(prefs, "status_");

		service.setAttributeValues(renderRequest, "dv", days);
		service.setAttributeValues(renderRequest, "status_e", statuses);

		PortletURL submit = renderResponse.createActionURL();
		submit.setParameter("doSub", "doSub");
		renderRequest.setAttribute("doSubmit", submit.toString());

		include(editJSP, renderRequest, renderResponse);
	}

	public void processAction(ActionRequest actionRequest,
		ActionResponse actionResponse)throws IOException, PortletException {

		String editAction = actionRequest.getParameter("goEdit");
		String doSubmit = actionRequest.getParameter("doSub");

		if (editAction != null) {
			actionResponse.setPortletMode(PortletMode.EDIT);
		}

		if (doSubmit != null) {

			PortletPreferences prefs = actionRequest.getPreferences();

			service.setActionValues(prefs, actionRequest, "d", "dn");
			service.setActionValues(prefs, actionRequest, "status_", "status");

			prefs.store();
			actionResponse.setPortletMode(PortletMode.VIEW);

		}

	}

	
	
	public void include(String path, RenderRequest rq, 
		RenderResponse rp) throws PortletException, IOException {

		PortletRequestDispatcher portletRequestDispatcher =
		getPortletContext().getRequestDispatcher(path);
		portletRequestDispatcher.include(rq, rp);
	}



}