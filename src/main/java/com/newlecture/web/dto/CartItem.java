package com.newlecture.web.dto;

public class CartItem {
	
	private String cartId;
	private String categoryName;
	private String name;
	private String price;
	private String count;
	private String remoteName;
	
	public CartItem(String cartId, String categoryName, String name, String price, String count, String remoteName) {
		this.cartId = cartId;
		this.categoryName = categoryName;
		this.name = name;
		this.price = price;
		this.count = count;
		this.remoteName = remoteName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getRemoteName() {
		return remoteName;
	}
	public void setRemoteName(String remoteName) {
		this.remoteName = remoteName;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
