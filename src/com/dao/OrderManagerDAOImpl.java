package com.dao;


import java.util.*;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import com.model.Orders;
import com.model.OrderBooks;


public class OrderManagerDAOImpl extends HibernateDaoSupport implements OrderManagerDAO{

	@Override
	public void insertOrder(Orders orders) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(orders);
		
	}

	@Override
	public void insertOrderBooks(OrderBooks orderBooks) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(orderBooks);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Orders> queryByUserId(int user_id) {
		// TODO Auto-generated method stub
		//�z�L�~��d��
		return (List<Orders>) getHibernateTemplate().find("from Orders orders where orders.user.id ="+user_id+" order by orderTime desc");
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<OrderBooks> queryBooksByOrderId(int order_id) {
		// TODO Auto-generated method stub
		return (List<OrderBooks>) getHibernateTemplate().find("from OrderBooks orderbooks where orderbooks.order.id = "+order_id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Orders> queryAll() {
		// TODO Auto-generated method stub
		return (List<Orders>) getHibernateTemplate().find("from Orders orders  order by orderTime desc");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Orders> queryAllByDeals() {
		// TODO Auto-generated method stub
		return (List<Orders>) getHibernateTemplate().find("from Orders orders where isDealed = '1' order by orderTime desc");
	}

	@Override
	public void deleteOrders(int order_id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.getHibernateTemplate().get(Orders.class, order_id));
	}

	@Override
	public void updateOrders(Orders orders) {
		// TODO Auto-generated method stub
        getHibernateTemplate().update(orders);
	}

	@Override
	public Orders queryByOrdersId(int order_id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Orders.class, order_id);
	}
	
	

}
