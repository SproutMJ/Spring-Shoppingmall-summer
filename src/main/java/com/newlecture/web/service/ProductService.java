package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.dto.CartItem;
import com.newlecture.web.dto.ProductItem;
import com.newlecture.web.entity.OrderedProduct;
import com.newlecture.web.entity.Product;

public interface ProductService {
	public long registerProduct(Product product);
	public long retrieveIdByName(String name);
	public long retrieveCurId();
	public List<ProductItem> retrieveProductItemListByCategoryId(String categoryId);
	public List<ProductItem> retrieveProductItemAll();
	public List<ProductItem> retrieveProductItemListRecentlyOneInCategory();
	public Product retrieveProductById(String productId);
	public ProductItem retrieveProductItemById(String productId);
	public List<ProductItem> retrieveRecentlyProductItemAll();
	public List<CartItem> retrieveCartItemByUserId(Long userId);
	public List<ProductItem> retrieveProductItemBySearch(String search);
	public int getCartItemSum(Long userId);
	public long updateProductByStock(OrderedProduct orderProduct);
}
