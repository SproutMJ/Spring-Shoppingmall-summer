package com.newlecture.web.entity;

public class OrderedProduct {
	private long id;
	private long orderId;
	private long productId;
	private long count;
	public OrderedProduct(long id, long orderId, long productId, long count) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.productId = productId;
		this.count = count;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "OrderedProduct [id=" + id + ", orderId=" + orderId + ", productId=" + productId + ", count=" + count
				+ "]";
	}

}
