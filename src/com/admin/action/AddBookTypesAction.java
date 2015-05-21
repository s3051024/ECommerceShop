package com.admin.action;

import com.model.BookType;
import com.opensymphony.xwork2.ActionSupport;
import com.service.BookTypeService;

public class AddBookTypesAction extends ActionSupport{
	
	private BookTypeService bookTypeServiceImpl;
	private BookType bookType;


	public BookTypeService getBookTypeServiceImpl() {
		return bookTypeServiceImpl;
	}


	public void setBookTypeServiceImpl(BookTypeService bookTypeServiceImpl) {
		this.bookTypeServiceImpl = bookTypeServiceImpl;
	}


	public BookType getBookType() {
		return bookType;
	}


	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		BookType inbookType = new BookType();
		inbookType.setBookType(bookType.getBookType());
		bookTypeServiceImpl.insert(inbookType);

		
		return SUCCESS;
	}
	
	

}
