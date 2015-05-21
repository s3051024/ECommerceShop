package com.service;

import java.util.List;

import com.dao.UserDAOImpl;
import com.model.User;

public class UserServiceImpl implements UserService{
	
	private UserDAOImpl userDAOImpl;

	public UserDAOImpl getUserDAOImpl() {
		return userDAOImpl;
	}

	public void setUserDAOImpl(UserDAOImpl userDAOImpl) {
		this.userDAOImpl = userDAOImpl;
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		userDAOImpl.insert(user);
		
	}

	@Override
	public List setUserCertification(String name, String password) {
		// TODO Auto-generated method stub
		return userDAOImpl.setUserCertification(name, password);
	}

	@Override
	public List<User> queryAllUser() {
		// TODO Auto-generated method stub
		return userDAOImpl.queryAllUser();
	}

	@Override
	public void updateUserInfo(User user) {
		// TODO Auto-generated method stub
		userDAOImpl.updateUserInfo(user);
	}

	

}
