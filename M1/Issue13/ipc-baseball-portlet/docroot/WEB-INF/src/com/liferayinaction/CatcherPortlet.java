package com.liferayinaction.ipc;

import java.io.IOException;

import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessEvent;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



public class CatcherPortlet extends GenericPortlet {

	protected String viewJSP;
	private static Log _log = LogFactory.getLog(PitcherPortlet.class);

	public void init() throws PortletException {
		viewJSP = getInitParameter("view-jsp");
	}

	public void doView(RenderRequest req, RenderResponse res)
		throws IOException, PortletException {
			include(viewJSP, req, res);
		}

	protected void include(
		String path, RenderRequest req, RenderResponse res)
		throws IOException, PortletException {
			PortletRequestDispatcher prd = getPortletContext().getRequestDispatcher(path);

		if (prd == null) {
			_log.error(path + " is not valid");
		} else {
			prd.include(req, res);
		}

	}

	@ProcessEvent(qname="{http://liferay.com/events}ipc.pitch")
	public void catchBall(EventRequest request, EventResponse response) {

		Event event = request.getEvent();
		String pitch = (String)event.getValue();
		response.setRenderParameter("pitch", pitch);

	}


}