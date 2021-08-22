package com.newlecture.web.dto;

import com.newlecture.web.entity.OrderedProduct;

public class OrderedProductDto extends OrderedProduct{

	private String name;
	private String description;
	private long price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public OrderedProductDto(long id, long orderId, long productId, long count, String name, String description, long price) {
		super(id, orderId, productId, count);
		this.name = name;
		this.description = description;
		this.price = price;
	}

}
