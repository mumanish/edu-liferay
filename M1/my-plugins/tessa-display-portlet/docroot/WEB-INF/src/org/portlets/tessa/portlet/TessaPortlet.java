package org.portlets.tessa.portlet;

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
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;


import org.portlets.tessa.service.base.TessaLocalServiceBaseImpl;
import org.portlets.tessa.service.TessaLocalServiceUtil;


import org.portlets.tessa.model.Tessa;
import com.liferay.portal.model.User;
import org.portlets.tessa.model.impl.TessaImpl;



import com.liferay.counter.service.CounterLocalServiceUtil;



public class TessaPortlet extends MVCPortlet {

	protected String viewJSP = "/view.jsp";
	

	public void addTessa(ActionRequest request, ActionResponse response)throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);


		Long tessaId = CounterLocalServiceUtil.increment(Tessa.class.getName());
		String id = tessaId.toString();

		Tessa tessa = new TessaImpl();

		tessa.setTessaText(request.getParameter("tessaText"));

		TessaLocalServiceUtil.addTessa(themeDisplay.getUserId(), tessaId,
			tessa.getTessaText());

		response.setRenderParameter("jspPage", viewJSP);
	}

}
