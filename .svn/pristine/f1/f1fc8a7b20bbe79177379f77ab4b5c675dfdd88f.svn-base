package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.web.dao.OrderedProductDao;
import com.newlecture.web.dto.OrderedProductDto;
import com.newlecture.web.entity.OrderedProduct;
import com.newlecture.web.entity.Orders;

@Repository
public class MybatisOrderedProductDao implements OrderedProductDao {

	private OrderedProductDao mapper;
	
	@Autowired
	public MybatisOrderedProductDao(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(OrderedProductDao.class);
	}
	
	@Override
	public long createOrderedProduct(OrderedProduct orderedProduct) {
		mapper.createOrderedProduct(orderedProduct);
		return 0;
	}

	@Override
	public OrderedProduct retrieveOrderedProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long updateOrderedProduct(OrderedProduct orderedProduct) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long deleteOrderedProductById(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrderedProductDto> retrieveOrderedProductByOrderList(List<Orders> orderList) {
		// TODO Auto-generated method stub
		return mapper.retrieveOrderedProductByOrderList(orderList);
	}

}
