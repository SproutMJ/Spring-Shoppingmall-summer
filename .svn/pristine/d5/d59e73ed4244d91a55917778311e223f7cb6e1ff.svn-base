package com.newlecture.web.dto;

import java.util.Date;

import com.newlecture.web.entity.Product;

public class ProductItem extends Product{

	private String remoteName;
	
	public ProductItem(long id, long categoryId, String name, long price, long stock, String description,
			Date registerDate, String remoteName) {
		super(id, categoryId, name, price, stock, description, registerDate);
		this.remoteName = remoteName;
	}

	public String getRemoteName() {
		return remoteName;
	}

	public void setRemoteName(String remoteName) {
		this.remoteName = remoteName;
	}
}
