package com.user.action;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class RegisterAction extends ActionSupport{
	
	private UserService userServiceImpl;
	
	private User user;
	
	public User getUser() {
		return user;
	}




	public void setUser(User user) {
		this.user = user;
	}




	public UserService getUserServiceImpl() {
		return userServiceImpl;
	}




	public void setUserServiceImpl(UserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}




	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		User inuser = new User();
		inuser.setName(user.getName());
		inuser.setUserRealName(user.getUserRealName());
		inuser.setPassword(user.getPassword());
		inuser.setAddress(user.getAddress());
		inuser.setPhone(user.getPhone());
		inuser.setMobilePhone(user.getMobilePhone());
		inuser.setEmail(user.getEmail());
		
		userServiceImpl.insert(inuser);
		
		
		return SUCCESS;
		
		
	}
	
	
	
	

}
