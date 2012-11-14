package org.portlets.hooks.events;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SimpleAction;

public class StartupAction extends SimpleAction {

	public void run(String[] ids) throws ActionException {
		System.out.println("####### StartupAction");

		for (int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
	}
}