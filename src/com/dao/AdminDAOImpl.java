package com.dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;


public class AdminDAOImpl extends HibernateDaoSupport implements AdminDAO{

	@Override
	public List setAdminCertification(String name, String password) {
		// TODO Auto-generated method stub
		//return getHibernateTemplate().find("from Admin admin where name='"+name+"' and password ='"+password+"'");
		return getHibernateTemplate().findByNamedParam("from Admin admin where name = :name and password = :password", new String[]{"name","password"},new String[]{name,password});
		
	}

}
