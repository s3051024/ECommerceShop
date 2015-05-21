package com.dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;


public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{
	
	

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
		
	}

	
	@SuppressWarnings("rawtypes")
	@Override
	public List setUserCertification(String name, String password) {
		// TODO Auto-generated method stub
		//return getHibernateTemplate().find("from User user where name='"+name+"' and password ='"+password+"'");
		return getHibernateTemplate().findByNamedParam("from User user where name= :name and password = :password", new String[]{"name","password"}, new String[]{name,password});
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<User> queryAllUser() {
		// TODO Auto-generated method stub
		return (List<User>) getHibernateTemplate().find("from User user");
	}

	@Override
	public void updateUserInfo(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(user);
	}

	
	

}
