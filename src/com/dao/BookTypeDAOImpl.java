package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.model.BookType;


public class BookTypeDAOImpl  extends HibernateDaoSupport implements BookTypeDAO{

	@Override
	public void insert(BookType bookType) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(bookType);
		
	}

	@Override
	public List<String> findBookTypes() {
		// TODO Auto-generated method stub
		
		
		List<String> booktypes = (List<String>) getHibernateTemplate().find("select bookType.bookType from BookType bookType");
		
		return booktypes ;
	
	}

}
