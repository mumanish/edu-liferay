package org.portlets.lia.mine.portlet;


import org.portlets.lia.mine.service.IssueLocalServiceUtil;
import javax.portlet.PortletException;
import java.io.IOException;
import javax.portlet.RenderRequest;
import javax.portlet.PortletMode;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.io.*;
import java.util.*;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;

import com.liferay.counter.service.CounterLocalServiceUtil;



public class IssueReporterPortlet extends MVCPortlet {


	public void processAction(ActionRequest request, ActionResponse response)
		throws IOException, PortletException {

			super.processAction(request, response);
			String jspPage = (String)request.getAttribute("jspPage");
			request.removeAttribute("jspPage");
			response.setRenderParameter("jspPage", jspPage);
	}

}

