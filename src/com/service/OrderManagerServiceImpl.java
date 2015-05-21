package com.service;

import java.util.List;

import com.dao.OrderManagerDAOImpl;
import com.model.Orders;
import com.model.OrderBooks;

public class OrderManagerServiceImpl implements OrderManagerService{
	
	private OrderManagerDAOImpl orderManagerDAOImpl;
	
	public OrderManagerDAOImpl getOrderManagerDAOImpl() {
		return orderManagerDAOImpl;
	}

	public void setOrderManagerDAOImpl(OrderManagerDAOImpl orderManagerDAOImpl) {
		this.orderManagerDAOImpl = orderManagerDAOImpl;
	}

	@Override
	public void insertOrder(Orders orders) {
		// TODO Auto-generated method stub
		orderManagerDAOImpl.insertOrder(orders);
		
	}

	@Override
	public void insertOrderBooks(OrderBooks orderBooks) {
		// TODO Auto-generated method stub
		orderManagerDAOImpl.insertOrderBooks(orderBooks);
	}

	@Override
	public List<Orders> queryByUserId(int user_id) {
		// TODO Auto-generated method stub
		return orderManagerDAOImpl.queryByUserId(user_id);
	}

	@Override
	public List<OrderBooks> queryBooksByOrderId(int order_id) {
		// TODO Auto-generated method stub
		return orderManagerDAOImpl.queryBooksByOrderId(order_id);
	}

	@Override
	public List<Orders> queryAll() {
		// TODO Auto-generated method stub
		return orderManagerDAOImpl.queryAll();
	}

	@Override
	public List<Orders> queryAllByDeals() {
		// TODO Auto-generated method stub
		return orderManagerDAOImpl.queryAllByDeals();
	}

	@Override
	public void deleteOrders(int order_id) {
		// TODO Auto-generated method stub
		orderManagerDAOImpl.deleteOrders(order_id);
	}

	@Override
	public void updateOrders(Orders orders) {
		// TODO Auto-generated method stub
		orderManagerDAOImpl.updateOrders(orders);
	}

	@Override
	public Orders queryByOrdersId(int order_id) {
		// TODO Auto-generated method stub
		return orderManagerDAOImpl.queryByOrdersId(order_id);
	}
	
	

}
