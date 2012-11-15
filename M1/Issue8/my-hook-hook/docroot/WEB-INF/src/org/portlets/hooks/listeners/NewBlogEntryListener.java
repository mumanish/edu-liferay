package org.portlets.hooks.listeners;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.model.BaseModelListener;

import com.liferay.portlet.blogs.model.BlogsEntry;
import com.liferay.portal.model.User;

public class NewBlogEntryListener extends BaseModelListener<User> {

	public void onAfterCreate(User user) throws ModelListenerException {
		System.out.println("Boohoo! We got an new one user: " + user.getFullName());
	}
}