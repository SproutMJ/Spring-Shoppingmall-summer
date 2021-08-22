package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.OrderedProductDao;
import com.newlecture.web.dto.OrderedProductDto;
import com.newlecture.web.entity.OrderedProduct;
import com.newlecture.web.entity.Orders;
@Service
public class OrderedProductImpl implements OrderedProductService {
	@Autowired
	private OrderedProductDao orderedProductDao;
	@Override
	public long createOrderedProduct(OrderedProduct orderedProduct) {
		orderedProductDao.createOrderedProduct(orderedProduct);
		return 0;
	}
	@Override
	public List<OrderedProductDto> getOrderedProductDtoListByOrderList(List<Orders> orderList) {
		// TODO Auto-generated method stub
		return orderedProductDao.retrieveOrderedProductByOrderList(orderList);
	}

}
