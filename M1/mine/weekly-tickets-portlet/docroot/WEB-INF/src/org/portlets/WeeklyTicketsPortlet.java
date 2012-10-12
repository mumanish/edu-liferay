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

		PortletPreferences prefs = renderRequest.getPreferences();
		
		String[] days = getPreferencesValues(prefs, "d");
		String[] statuses = getPreferencesValues(prefs, "status_");

		setAttributeValues(renderRequest, "dv", days);
		setAttributeValues(renderRequest, "status_v", statuses);

		PortletURL goEdit = renderResponse.createActionURL();
		goEdit.setParameter("goEdit", "goEdit");
		renderRequest.setAttribute("goEditMode", goEdit.toString());

		include(viewJSP, renderRequest, renderResponse);
	}

	public void doEdit(RenderRequest renderRequest,
		RenderResponse renderResponse)throws IOException, PortletException {

		renderResponse.setContentType("text/html");

		PortletPreferences prefs = renderRequest.getPreferences();
		
		String[] days = getPreferencesValues(prefs, "d");
		String[] statuses = getPreferencesValues(prefs, "status_");

		setAttributeValues(renderRequest, "dv", days);
		setAttributeValues(renderRequest, "status_e", statuses);

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

			setActionValues(prefs, actionRequest, "d", "dn");
			setActionValues(prefs, actionRequest, "status_", "status");

			prefs.store();
			actionResponse.setPortletMode(PortletMode.VIEW);

		}

	}

	// service methods

	public String[] getPreferencesValues(PortletPreferences p, String attrN) {

		String[] daysArr = new String[8];

		for(int i = 1; i <= 7; i++) {
			daysArr[i] = (String)p.getValue(attrN+i, "no");
		} 
		return daysArr;
	}


	public void setActionValues(PortletPreferences p, ActionRequest ar, 
		String attr1, String attr2)throws ReadOnlyException {

		String[] daysArr = new String[8];

		for(int i = 1; i <= 7; i++) {
			p.setValue(attr1+i, ar.getParameter(attr2+i));
		} 
	}


	public void setAttributeValues(RenderRequest rr, String attrN, String[] setArr) {

		for(int i = 1; i <= 7; i++) {
		rr.setAttribute(attrN+i, setArr[i]);
		}

	}

	public void include(String path, RenderRequest rq, 
		RenderResponse rp) throws PortletException, IOException {

		PortletRequestDispatcher portletRequestDispatcher =
		getPortletContext().getRequestDispatcher(path);
		portletRequestDispatcher.include(rq, rp);
	}

}