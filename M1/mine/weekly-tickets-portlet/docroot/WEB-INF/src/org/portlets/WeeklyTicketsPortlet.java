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

	public String[] receiveAttributes(PortletPreferences p, String attrN) {

		String[] daysArr = new String[8];

		for(int i = 1; i <= 7; i++) {
			daysArr[i] = (String)p.getValue(attrN+i, "no");
		} 
		return daysArr;
	}

	public void doView(RenderRequest renderRequest,
		RenderResponse renderResponse)throws IOException, PortletException {

		PortletPreferences prefs = renderRequest.getPreferences();
		
		String[] days = this.receiveAttributes(prefs, "d");
		String[] statuses = this.receiveAttributes(prefs, "status_");


		renderRequest.setAttribute("monDay", days[1]);
		renderRequest.setAttribute("tuesDay", days[2]);
		renderRequest.setAttribute("wednesDay", days[3]);
		renderRequest.setAttribute("thursDay", days[4]);
		renderRequest.setAttribute("friDay", days[5]);
		renderRequest.setAttribute("saturDay", days[6]);
		renderRequest.setAttribute("sunDay", days[7]);

		renderRequest.setAttribute("status_v1", statuses[1]);
		renderRequest.setAttribute("status_v2", statuses[2]);
		renderRequest.setAttribute("status_v3", statuses[3]);
		renderRequest.setAttribute("status_v4", statuses[4]);
		renderRequest.setAttribute("status_v5", statuses[5]);
		renderRequest.setAttribute("status_v6", statuses[6]);
		renderRequest.setAttribute("status_v7", statuses[7]);

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
		
		String[] days = this.receiveAttributes(prefs, "d");
		String[] statuses = this.receiveAttributes(prefs, "status_");


		renderRequest.setAttribute("monDay", days[1]);
		renderRequest.setAttribute("tuesDay", days[2]);
		renderRequest.setAttribute("wednesDay", days[3]);
		renderRequest.setAttribute("thursDay", days[4]);
		renderRequest.setAttribute("friDay", days[5]);
		renderRequest.setAttribute("saturDay", days[6]);
		renderRequest.setAttribute("sunDay", days[7]);

		renderRequest.setAttribute("status_e1", statuses[1]);
		renderRequest.setAttribute("status_e2", statuses[2]);
		renderRequest.setAttribute("status_e3", statuses[3]);
		renderRequest.setAttribute("status_e4", statuses[4]);
		renderRequest.setAttribute("status_e5", statuses[5]);
		renderRequest.setAttribute("status_e6", statuses[6]);
		renderRequest.setAttribute("status_e7", statuses[7]);

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
			prefs.setValue("d1", actionRequest.getParameter("mon"));
			prefs.setValue("d2", actionRequest.getParameter("tue"));
			prefs.setValue("d3", actionRequest.getParameter("wed"));
			prefs.setValue("d4", actionRequest.getParameter("thu"));
			prefs.setValue("d5", actionRequest.getParameter("fri"));
			prefs.setValue("d6", actionRequest.getParameter("sat"));
			prefs.setValue("d7", actionRequest.getParameter("sun"));

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