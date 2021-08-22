package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.web.dao.OrdersDao;
import com.newlecture.web.entity.Orders;

@Repository
public class MybatisOrdersDao implements OrdersDao {

	private OrdersDao mapper;
	
	@Autowired
	public MybatisOrdersDao(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(OrdersDao.class);
	}
	
	@Override
	public long createOrders(Orders orders) {
		mapper.createOrders(orders);
		return 0;
	}

	@Override
	public Orders retrieveOrdersById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long updateOrders(Orders orders) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long deleteOrdersById(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long retrieveLastIdByUserId(long id) {
		return mapper.retrieveLastIdByUserId(id);
	}

	@Override
	public List<Orders> retrieveOrderListByUserId(Long userId) {
		// TODO Auto-generated method stub
		return mapper.retrieveOrderListByUserId(userId);
	}

}
