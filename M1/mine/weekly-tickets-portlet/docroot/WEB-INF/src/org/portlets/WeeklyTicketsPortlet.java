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

		String status_1 = (String)prefs.getValue("status_1", "no");
		String status_2 = (String)prefs.getValue("status_2", "no");
		String status_3 = (String)prefs.getValue("status_3", "no");
		String status_4 = (String)prefs.getValue("status_4", "no");
		String status_5 = (String)prefs.getValue("status_5", "no");
		String status_6 = (String)prefs.getValue("status_6", "no");
		String status_7 = (String)prefs.getValue("status_7", "no");

		renderRequest.setAttribute("monDay", monday);
		renderRequest.setAttribute("tuesDay", tuesday);
		renderRequest.setAttribute("wednesDay", wednesday);
		renderRequest.setAttribute("thursDay", thursday);
		renderRequest.setAttribute("friDay", friday);
		renderRequest.setAttribute("saturDay", saturday);
		renderRequest.setAttribute("sunDay", sunday);

		renderRequest.setAttribute("status_v1", status_1);
		renderRequest.setAttribute("status_v2", status_2);
		renderRequest.setAttribute("status_v3", status_3);
		renderRequest.setAttribute("status_v4", status_4);
		renderRequest.setAttribute("status_v5", status_5);
		renderRequest.setAttribute("status_v6", status_6);
		renderRequest.setAttribute("status_v7", status_7);

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

		String status_e1 = (String)prefs.getValue("status_1", "no");
		String status_e2 = (String)prefs.getValue("status_2", "no");
		String status_e3 = (String)prefs.getValue("status_3", "no");
		String status_e4 = (String)prefs.getValue("status_4", "no");
		String status_e5 = (String)prefs.getValue("status_5", "no");
		String status_e6 = (String)prefs.getValue("status_6", "no");
		String status_e7 = (String)prefs.getValue("status_7", "no");

		renderRequest.setAttribute("monDay", monday);
		renderRequest.setAttribute("tuesDay", tuesday);
		renderRequest.setAttribute("wednesDay", wednesday);
		renderRequest.setAttribute("thursDay", thursday);
		renderRequest.setAttribute("friDay", friday);
		renderRequest.setAttribute("saturDay", saturday);
		renderRequest.setAttribute("sunDay", sunday);

		renderRequest.setAttribute("status_s1", status_e1);
		renderRequest.setAttribute("status_s2", status_e2);
		renderRequest.setAttribute("status_s3", status_e3);
		renderRequest.setAttribute("status_s4", status_e4);
		renderRequest.setAttribute("status_s5", status_e5);
		renderRequest.setAttribute("status_s6", status_e6);
		renderRequest.setAttribute("status_s7", status_e7);

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

			prefs.setValue("status_1", actionRequest.getParameter("status1"));
			prefs.setValue("status_2", actionRequest.getParameter("status2"));
			prefs.setValue("status_3", actionRequest.getParameter("status3"));
			prefs.setValue("status_4", actionRequest.getParameter("status4"));
			prefs.setValue("status_5", actionRequest.getParameter("status5"));
			prefs.setValue("status_6", actionRequest.getParameter("status6"));
			prefs.setValue("status_7", actionRequest.getParameter("status7"));

			prefs.store();
			actionResponse.setPortletMode(PortletMode.VIEW);

		}

	}


}