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

	public void init() throws PortletException {

		editJSP = getInitParameter("edit-jsp");
		viewJSP = getInitParameter("view-jsp");
	}

	public void doView(RenderRequest renderRequest,
		RenderResponse renderResponse)throws IOException, PortletException {

		// getting values for Days and Statuses
		initializeValues(renderRequest);

		// Action URL for Edit button
		PortletURL goEdit = renderResponse.createActionURL();
		// parameter for processAction()
		goEdit.setParameter("goEdit", "goEdit");
		// attribute for view.jsp form action
		renderRequest.setAttribute("goEditMode", goEdit.toString());

		// dispatching to view.jsp
		include(viewJSP, renderRequest, renderResponse);
	}

	public void doEdit(RenderRequest renderRequest,
		RenderResponse renderResponse)throws IOException, PortletException {

		// getting values for Days and Statuses
		initializeValues(renderRequest);
		
		// Action URL for Days and Statuses
		PortletURL submit = renderResponse.createActionURL();
		// parameter for processAction()
		submit.setParameter("doSub", "doSub");
		// attribute for edit.jsp form action
		renderRequest.setAttribute("doSubmit", submit.toString());

		// dispatching to view.jsp
		include(editJSP, renderRequest, renderResponse);
	}

	public void processAction(ActionRequest actionRequest,
		ActionResponse actionResponse)throws IOException, PortletException {

		// getting URL actions parameters
		String editAction = actionRequest.getParameter("goEdit");
		String doSubmit = actionRequest.getParameter("doSub");

		// action for Edit button
		if (editAction != null) {
			actionResponse.setPortletMode(PortletMode.EDIT);
		}

		// action for Submit button
		if (doSubmit != null) {
			PortletPreferences prefs = actionRequest.getPreferences();

			String[] daysArr = new String[8];
			String[] attributes = {"d", "dn", "status_", "status"};

			for(int i = 1; i <= 7; i++) {
				prefs.setValue(attributes[0]+i, actionRequest.getParameter(attributes[1]+i));
				prefs.setValue(attributes[2]+i, actionRequest.getParameter(attributes[3]+i));
			} 

			prefs.store();
			actionResponse.setPortletMode(PortletMode.VIEW);
		}
	}

	
	// RequestDispatching helper
	public void include(String path, RenderRequest rq, 
		RenderResponse rp) throws PortletException, IOException {

		PortletRequestDispatcher portletRequestDispatcher =
		getPortletContext().getRequestDispatcher(path);
		portletRequestDispatcher.include(rq, rp);
	}

	// getting days and statuses values for view in edit.jsp and view.jsp
	public void initializeValues(RenderRequest renderRequest)throws IOException, PortletException {

		PortletPreferences prefs = renderRequest.getPreferences();
		
		ArrayList days = new ArrayList();
		days.add(prefs.getValue("d1", "no"));
		days.add(prefs.getValue("d2", "no"));
		days.add(prefs.getValue("d3", "no"));
		days.add(prefs.getValue("d4", "no"));
		days.add(prefs.getValue("d5", "no"));
		days.add(prefs.getValue("d6", "no"));
		days.add(prefs.getValue("d7", "no"));

		ArrayList statuses = new ArrayList();
		statuses.add(prefs.getValue("status_1", "no"));
		statuses.add(prefs.getValue("status_2", "no"));
		statuses.add(prefs.getValue("status_3", "no"));
		statuses.add(prefs.getValue("status_4", "no"));
		statuses.add(prefs.getValue("status_5", "no"));
		statuses.add(prefs.getValue("status_6", "no"));
		statuses.add(prefs.getValue("status_7", "no"));


		renderRequest.setAttribute("days", days);
		renderRequest.setAttribute("statuses", statuses);
	}



}