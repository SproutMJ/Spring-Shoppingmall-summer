package com.newlecture.web.dao;

import java.util.List;

import com.newlecture.web.dto.OrderedProductDto;
import com.newlecture.web.entity.OrderedProduct;
import com.newlecture.web.entity.Orders;

public interface OrderedProductDao {
	public long createOrderedProduct(OrderedProduct orderedProduct);
	
	public OrderedProduct retrieveOrderedProductById(long id);
	
	public long updateOrderedProduct(OrderedProduct orderedProduct);
	
	public long deleteOrderedProductById(long id);

	public List<OrderedProductDto> retrieveOrderedProductByOrderList(List<Orders> orderList);
}
