package org.portlets.hooks.listeners;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.model.BaseModelListener;

import com.liferay.portlet.blogs.model.BlogsEntry;
import com.liferay.portal.model.User;
import java.util.*;

public class UserLog extends BaseModelListener<User> {

	String logs, oldValue;
	String[] attributes, tempValue = new String[20];
	

	public void setTempValue(String t, int i) {
		this.tempValue[i] = t;
	}

	public String getTempValue(int i) {
		return tempValue[i];
	}

	public void onBeforeUpdate(User user) throws ModelListenerException {
		
		attributes = new String[20];

		attributes[0] = user.getScreenName();
		attributes[1] = user.getEmailAddress();
		attributes[2] = user.getFirstName();
		attributes[3] = user.getMiddleName();
		attributes[4] = user.getLastName();
		attributes[5] = user.getJobTitle();

		for (int i = 0; i < 6; i++) {
			doLog(attributes[i], i, user);
		}		
	}


	public void onAfterUpdate(User user) throws ModelListenerException {
		System.out.println("Updated user: " + user.getFullName());
		System.out.println("<br>===| LOG |===<br>" + user.getComments());
	}



	public void doLog(String attr, int i, User user) {

		oldValue = getTempValue(i);		
		setTempValue(attr, i);

		GregorianCalendar calendar = new GregorianCalendar();
		logs = user.getComments();

		if (attr.equals(oldValue)) {
			System.out.println("<br><br>VALUE NOT CHANGED: " + oldValue + "=" + attr);
			
		} else {
			System.out.println("<br><br>VALUE CHANGED: " + oldValue + "=" + attr);
			user.setComments(logs + "<br><br>Updated on: " + calendar.getTime() + "<br>" + "Attribute changed: from " + oldValue + " to " + attr);
		}		
	}	

}