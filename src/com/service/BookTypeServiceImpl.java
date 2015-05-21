package com.service;

import java.util.List;

import com.dao.BookTypeDAOImpl;
import com.model.BookType;

public class BookTypeServiceImpl implements BookTypeService{
	
	private BookTypeDAOImpl bookTypeDAOImpl;
	

	public BookTypeDAOImpl getBookTypeDAOImpl() {
		return bookTypeDAOImpl;
	}


	public void setBookTypeDAOImpl(BookTypeDAOImpl bookTypeDAOImpl) {
		this.bookTypeDAOImpl = bookTypeDAOImpl;
	}


	@Override
	public void insert(BookType bookType) {
		// TODO Auto-generated method stub
		bookTypeDAOImpl.insert(bookType);
		
	}


	@Override
	public List<String> findBookTypes() {
		// TODO Auto-generated method stub
		return bookTypeDAOImpl.findBookTypes();
	}
	
	
	
	

}
