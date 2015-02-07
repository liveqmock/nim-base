package com.poweruniverse.nim.base.servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.poweruniverse.nim.base.bean.Environment;

/**
 */

public class BasePlateformServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String ContextPath = null;
	
	public void init() throws ServletException {
		super.init();
		
		if(this.ContextPath == null){
			this.ContextPath = this.getServletContext().getRealPath("/");
		}
		
		if(this.ContextPath.endsWith("/") || this.ContextPath.endsWith("\\")){
			
		}else{
			this.ContextPath+="/";
		}
	}
	
	public Environment getEnvironment(HttpServletRequest req){
		Environment env = (Environment)req.getSession().getAttribute(Environment.ENV);
		return env;
	}
	
	public static String getServletClientIp(HttpServletRequest req) {

	    String ip = req.getHeader("X-Forwarded-For");
	    if(ip != null) {
	        if(ip.indexOf(",") == -1) {
	            return ip;
	        }
	        return ip.split(",")[0];
	    }

	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	        ip = req.getHeader("Proxy-Client-IP");
	    }
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	        ip = req.getHeader("WL-Proxy-Client-IP");
	    }
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
	        ip = req.getRemoteAddr();
	    }

	    return ip;
	}


}