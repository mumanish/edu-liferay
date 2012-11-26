package com.liferayinaction.ipc;

import java.io.IOException;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.xml.namespace.QName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class PitcherPortlet extends GenericPortlet {

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


		@ProcessAction(name="pitchBall")
		public void pitchBall(ActionRequest request, ActionResponse response) {

			String pitchType = null;
			Random random = new Random(System.currentTimeMillis());
			int pitch = random.nextInt(3) + 1;

			switch(pitch) {
				case 1:
					pitchType = "Fast Ball";
					break;
				case 2:
					pitchType = "Curve Ball";
					break;
				case 3:
					pitchType = "Slider";
					break;

				default: 
					pitchType = "Screw Ball";
			}

		QName qName = new QName("http://liferay.com/events", "ipc.pitch");
		response.setEvent(qName, pitchType);
	}


}