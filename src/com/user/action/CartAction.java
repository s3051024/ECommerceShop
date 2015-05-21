package com.user.action;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.model.Book;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.BookService;



public class CartAction extends ActionSupport{
	

	private BookService bookServiceImpl;
	private Book book;
	private Integer selectid;
    private Integer quantity;


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
				
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		//int totalPrice = 0;
		String bookId = request.getParameter("bookId");
		selectid = Integer.parseInt(bookId);
		setSelectid(selectid);
		

		List<Book>selectbooks = new ArrayList<Book>();
		
		if(session.getAttribute("selectbooks") == null){
			session.setAttribute("selectbooks", selectbooks );
		}
		else{
			//�ª��ʪ������e
			selectbooks = (List<Book>) session.getAttribute("selectbooks");
		}
		
		int quantity = 0;
		//�N�s��request parameter id�P�ª��ʪ������e�����,�P�_�O�_����
			
		for(Book book : selectbooks){
		
			if(bookId.equals(book.getId()+"")){
				
				quantity++;
			    book.setBookAmount(1);
				//setQuantity(1);
			}
			
		}
		
		if(quantity==0){
			
		book = bookServiceImpl.queryByBookId(selectid);
		//�s�W�s���Ѩ��ʪ���
		selectbooks.add(book);
		book.setBookAmount(1);
		int totalPrice = 0;
		if(session.getAttribute("totalPrice")== null){
			session.setAttribute("totalPrice", book.getPrice());
		}else{
			
	      totalPrice = (Integer) session.getAttribute("totalPrice");
	      totalPrice +=book.getPrice();
	      session.removeAttribute("totalPrice");
	      session.setAttribute("totalPrice", totalPrice);
		}
		
		//session �����ª��ʪ������e
		session.removeAttribute("selectbooks");
		//session �N�s���ʪ�����JMap
		session.setAttribute("selectbooks", selectbooks);
		}

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


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Integer getSelectid() {
		return selectid;
	}

	public void setSelectid(Integer selectid) {
		this.selectid = selectid;
	}


	
	
}
