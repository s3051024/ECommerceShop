package com.user.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.model.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.BookService;

public class UserViewBooksAction extends ActionSupport implements ModelDriven{
	
	private BookService bookServiceImpl;
	private Book book = new Book();
	//private BookInfor bookInfor = new BookInfor();
	private List<Book> books = new ArrayList<Book>();
	//private List<BookInfor>bookInfors = new ArrayList<BookInfor>();
	HttpServletRequest request = ServletActionContext.getRequest();
	String bookName = request.getParameter("bookName");
	String bookType = request.getParameter("bookType");


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		books  = bookServiceImpl.showAll();
		request.setAttribute("books", books);
		setBooks(books);
		
		return SUCCESS;
	}
	
	public String queryByBookName(){
		books = bookServiceImpl.queryByBookName(bookName);
		request.setAttribute("books", books);
		setBooks(books);		
		return SUCCESS;
	}
	
	public String queryByBookType(){
		books = bookServiceImpl.queryByBookType(bookType);
		request.setAttribute("books", books);
		setBooks(books);
		return SUCCESS;
	}
	
	
	public BookService getBookServiceImpl() {
		return bookServiceImpl;
	}

	public void setBookServiceImpl(BookService bookServiceImpl) {
		this.bookServiceImpl = bookServiceImpl;
	}


	public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}


	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return book;
	}


	
}
