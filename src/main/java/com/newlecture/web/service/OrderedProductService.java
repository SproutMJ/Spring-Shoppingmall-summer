package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.dto.OrderedProductDto;
import com.newlecture.web.entity.OrderedProduct;
import com.newlecture.web.entity.Orders;

public interface OrderedProductService {
	public long createOrderedProduct(OrderedProduct orderedProduct);

	public List<OrderedProductDto> getOrderedProductDtoListByOrderList(List<Orders> orderList);
}
