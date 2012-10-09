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

		PortletRequestDispatcher portletRequestDispatcher = 
		getPortletContext().getRequestDispatcher(viewJSP);

		portletRequestDispatcher.include(renderRequest, renderResponse);

	}

	public void doEdit(RenderRequest renderRequest,
		RenderResponse renderResponse)throws IOException, PortletException {

		PortletRequestDispatcher portletRequestDispatcher = 
		getPortletContext().getRequestDispatcher(editJSP);

		portletRequestDispatcher.include(renderRequest, renderResponse);
	}


}