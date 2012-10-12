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


public class Helper  {


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

}