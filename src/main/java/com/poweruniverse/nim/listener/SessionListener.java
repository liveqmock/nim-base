package com.poweruniverse.nim.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.poweruniverse.nim.bean.Environment;

public class SessionListener implements HttpSessionListener{
	public void sessionCreated(HttpSessionEvent arg0) {
		Environment.userVisit();
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		Environment.userLeave();
		Environment env = (Environment)arg0.getSession().getAttribute(Environment.ENV);
		if(env!=null){
			env.userLogout();
		}
	}

}
