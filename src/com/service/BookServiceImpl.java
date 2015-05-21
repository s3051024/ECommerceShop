package com.service;

import java.util.List;

import com.dao.BookDAOImpl;
import com.model.Book;

public class BookServiceImpl implements BookService{

	
	private BookDAOImpl bookDAOImpl;
	
	

	public BookDAOImpl getBookDAOImpl() {
		return bookDAOImpl;
	}



	public void setBookDAOImpl(BookDAOImpl bookDAOImpl) {
		this.bookDAOImpl = bookDAOImpl;
	}



	@Override
	public void insert(Book book) {
		// TODO Auto-generated method stub
		bookDAOImpl.insert(book);
	}



	@Override
	public List<Book> showAll() {
		// TODO Auto-generated method stub
		return bookDAOImpl.showAll();
	}



	@Override
	public List<Book> queryByBookType(String bookType) {
		// TODO Auto-generated method stub
		return bookDAOImpl.queryByBookType(bookType);
	}



	@Override
	public List<Book> queryByBookName(String bookName) {
		// TODO Auto-generated method stub
		return bookDAOImpl.queryByBookName(bookName);
	}



	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		bookDAOImpl.deleteBook(book);
	}



	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		bookDAOImpl.updateBook(book);
	}



	@Override
	public Book queryByBookId(Integer id) {
		// TODO Auto-generated method stub
		return bookDAOImpl.queryByBookId(id);
	}

}
