package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.OrdersDao;
import com.newlecture.web.entity.Orders;

@Service
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	private OrdersDao ordersDao;
	@Override
	public long createOrders(Orders orders) {
		ordersDao.createOrders(orders);
		return 0;
	}

	@Override
	public long retrieveLastIdByUserId(long id) {
		return ordersDao.retrieveLastIdByUserId(id);
	}

	@Override
	public List<Orders> getOrderListByUserId(Long userId) {
		// TODO Auto-generated method stub
		return ordersDao.retrieveOrderListByUserId(userId);
	}

}
