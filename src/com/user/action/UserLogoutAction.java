package com.user.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserLogoutAction extends ActionSupport{
	
	private HttpSession session = null;
	private HttpServletRequest request = null;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		request = ServletActionContext.getRequest();
		session = request.getSession();
		session.removeAttribute("user");
		session.removeAttribute("userName");
		session.invalidate();
		
		return SUCCESS;
	}
	
	

}
