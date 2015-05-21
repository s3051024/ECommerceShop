package com.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.model.Book;


public class BookDAOImpl extends HibernateDaoSupport implements BookDAO{

	@Override
	public void insert(Book book) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(book);
	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Book> showAll() {
		// TODO Auto-generated method stub
		return (List<Book>) getHibernateTemplate().execute(new HibernateCallback(){

			@Override
			public Object doInHibernate(Session session)
					throws HibernateException {
				// TODO Auto-generated method stub
				List<Book>books = session.createQuery("From Book book") .list();	
				
				return books;
			}
			
		});
		
		//return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> queryByBookType(String bookType) {
		// TODO Auto-generated method stub
		//return getHibernateTemplate().find("from Book book where book.bookType = '"+bookType+"'");
	    return (List<Book>) getHibernateTemplate().findByNamedParam("from Book book where book.bookType = :bookType","bookType",bookType);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> queryByBookName(String bookName) {
		// TODO Auto-generated method stub
		 //return getHibernateTemplate().find("from Book book where book.bookName = '"+bookName+"'");
		return (List<Book>) getHibernateTemplate().findByNamedParam("from Book book where book.bookName = :bookName" ,"bookName", bookName);
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(book);
		//getHibernateTemplate().findByNamedParam("delete Book book where book.id = :id", id, id);
		
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(book);
		
	}

	@Override
	public Book queryByBookId(Integer id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Book.class, id);
	}

}
