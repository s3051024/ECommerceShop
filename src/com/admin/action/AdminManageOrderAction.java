package com.admin.action;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.model.OrderBooks;
import com.model.Orders;
import com.opensymphony.xwork2.ActionSupport;
import com.service.OrderManagerService;

public class AdminManageOrderAction extends ActionSupport{
	
	private OrderManagerService orderManagerServiceImpl;
	private Integer totalPrice;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		List<Orders>orders = orderManagerServiceImpl.queryAll();
		session.setAttribute("orders", orders);
		
		return SUCCESS;
	}
	
	public String processOrders()throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String id = request.getParameter("id");
		Integer order_id = Integer.parseInt(id);
		Orders updateorders = orderManagerServiceImpl.queryByOrdersId(order_id);
		updateorders.setIsDealed("1");
		orderManagerServiceImpl.updateOrders(updateorders);
		
		
		HttpSession session = request.getSession();
		List<Orders>orders = orderManagerServiceImpl.queryAll();
		session.removeAttribute("orders");
		session.setAttribute("orders", orders);
		
		return SUCCESS;
	}
	
	public String deteOrders(){
		
		return SUCCESS;
	}
	
	public String queryOrderBooks() throws Exception{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		Integer order_id = Integer.parseInt(id);
		List<OrderBooks> orderBooks= orderManagerServiceImpl.queryBooksByOrderId(order_id);
		Orders singleOrders = orderManagerServiceImpl.queryByOrdersId(order_id);
		
		totalPrice = singleOrders.getTotalPrice();
		
		setTotalPrice(totalPrice);
		
		
		session.setAttribute("orderBooks", orderBooks);
		session.setAttribute("singleOrders", singleOrders);
		
		
		return SUCCESS;
	}
	

	public OrderManagerService getOrderManagerServiceImpl() {
		return orderManagerServiceImpl;
	}

	public void setOrderManagerServiceImpl(
			OrderManagerService orderManagerServiceImpl) {
		this.orderManagerServiceImpl = orderManagerServiceImpl;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
    
}
