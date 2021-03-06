package com.newlecture.web.dao;

import java.util.List;

import com.newlecture.web.entity.Orders;

public interface OrdersDao {

	public long createOrders(Orders orders);
	
	public long retrieveLastIdByUserId(long id);
	
	public Orders retrieveOrdersById(long id);
	
	public long updateOrders(Orders orders);
	
	public long deleteOrdersById(long id);

	public List<Orders> retrieveOrderListByUserId(Long userId);
}
