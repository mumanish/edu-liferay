package org.portlets;

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

public class WeeklyTicketsPortlet extends GenericPortlet {


	protected String editJSP;
	protected String viewJSP;


	public void init() throws PortletException {

		editJSP = getInitParameter("edit-jsp");
		viewJSP = getInitParameter("view-jsp");
	}

	public void doView(RenderRequest renderRequest,
		RenderResponse renderResponse)throws IOException, PortletException {

		PortletPreferences prefs = renderRequest.getPreferences();
		String monday = (String)prefs.getValue("monday", "no");
		String tuesday = (String)prefs.getValue("tuesday", "no");
		String wednesday = (String)prefs.getValue("wednesday", "no");
		String thursday = (String)prefs.getValue("thursday", "no");
		String friday = (String)prefs.getValue("friday", "no");
		String saturday = (String)prefs.getValue("saturday", "no");
		String sunday = (String)prefs.getValue("sunday", "no");

		renderRequest.setAttribute("monDay", monday);
		renderRequest.setAttribute("tuesDay", tuesday);
		renderRequest.setAttribute("wednesDay", wednesday);
		renderRequest.setAttribute("thursDay", thursday);
		renderRequest.setAttribute("friDay", friday);
		renderRequest.setAttribute("saturDay", saturday);
		renderRequest.setAttribute("sunDay", sunday);

		PortletURL goEdit = renderResponse.createActionURL();
		goEdit.setParameter("goEdit", "goEdit");
		renderRequest.setAttribute("goEditMode", goEdit.toString());

		PortletRequestDispatcher portletRequestDispatcher = 
		getPortletContext().getRequestDispatcher(viewJSP);

		portletRequestDispatcher.include(renderRequest, renderResponse);

	}

	public void doEdit(RenderRequest renderRequest,
		RenderResponse renderResponse)throws IOException, PortletException {

		renderResponse.setContentType("text/html");

		PortletURL submit = renderResponse.createActionURL();
		submit.setParameter("doSub", "doSub");
		renderRequest.setAttribute("doSubmit", submit.toString());


		PortletRequestDispatcher portletRequestDispatcher = 
		getPortletContext().getRequestDispatcher(editJSP);


		portletRequestDispatcher.include(renderRequest, renderResponse);
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
			prefs.setValue("monday", actionRequest.getParameter("mon"));
			prefs.setValue("tuesday", actionRequest.getParameter("tue"));
			prefs.setValue("wednesday", actionRequest.getParameter("wed"));
			prefs.setValue("thursday", actionRequest.getParameter("thu"));
			prefs.setValue("friday", actionRequest.getParameter("fri"));
			prefs.setValue("saturday", actionRequest.getParameter("sat"));
			prefs.setValue("sunday", actionRequest.getParameter("sun"));
			prefs.store();
			actionResponse.setPortletMode(PortletMode.VIEW);

		}

	}


}