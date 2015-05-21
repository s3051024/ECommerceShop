package com.admin.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.model.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.BookService;

public class ViewBooksDetailAction extends ActionSupport {
	
	
	private BookService bookServiceImpl;
	private Book book;
	
  
	HttpServletRequest request = ServletActionContext.getRequest();
	String id = (String)request.getParameter("id");
	private String imgPath;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Integer bookId = Integer.parseInt(id);
		book = bookServiceImpl.queryByBookId(bookId);
		//request.setAttribute("books", books);
		//setBooks(books);
		imgPath ="../images/"+book.getBookImage();
		setImgPath(imgPath);
		
		return SUCCESS;
	}

	

	public Book getBook() {
		return book;
	}



	public void setBook(Book book) {
		this.book = book;
	}



	public BookService getBookServiceImpl() {
		return bookServiceImpl;
	}

	public void setBookServiceImpl(BookService bookServiceImpl) {
		this.bookServiceImpl = bookServiceImpl;
	}


	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	
	
	
	

}
