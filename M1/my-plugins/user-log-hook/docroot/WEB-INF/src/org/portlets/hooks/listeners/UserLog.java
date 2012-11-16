package org.portlets.hooks.listeners;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.model.BaseModelListener;

import com.liferay.portlet.blogs.model.BlogsEntry;
import com.liferay.portal.model.User;
import java.util.*;

public class UserLog extends BaseModelListener<User> {

	String logs;
	String mnameA, mnameB;

	public void onAfterCreate(User user) throws ModelListenerException {
		System.out.println("New user created : " + user.getFullName());
	}

	public void onBeforeUpdate(User user) throws ModelListenerException {

		mnameA = user.getMiddleName();

		mnameB = user.getJobTitle();

		user.setJobTitle(mnameA);	//AFTER CHANGE
		user.setLastName(mnameB);	//BEFORE CHANGE

		GregorianCalendar calendar = new GregorianCalendar();
		logs = user.getComments();


		if (mnameB != mnameA) {
			System.out.println("MNAME CHANGED!" + mnameB + "=" + mnameA);
		} else {
			System.out.println("MNAME NOT CHANGED" + mnameB + "=" + mnameA);

		}
		user.setComments(logs + "\nUpdated on: " + calendar.getTime() + "\n" + "Attribute changed. Middle Name: from " + mnameB + " to " + mnameA);

	}

	public void onAfterUpdate(User user) throws ModelListenerException {
		System.out.println("Updated user: " + user.getFullName());
		System.out.println(user.getComments());
	}

}