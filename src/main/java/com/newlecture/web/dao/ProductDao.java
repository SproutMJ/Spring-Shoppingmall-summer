package com.newlecture.web.dao;

import java.util.List;

import com.newlecture.web.dto.CartItem;
import com.newlecture.web.dto.ProductItem;
import com.newlecture.web.entity.OrderedProduct;
import com.newlecture.web.entity.Product;

public interface ProductDao {
	
	public long createProduct(Product product);
	
	public Product retrieveProductById(long id);
	
	public long updateProduct(Product product);
	
	public long deleteProductById(long id);
	
	public long retrieveIdByName(String name);
	
	public long retrieveCurId();
	
	public long retrieveNextId();

	public List<ProductItem> retrieveProductItemListByCategoryId(String categoryId);
	
	public List<ProductItem> retrieveProductItemListRecentlyOneInCategory();
	
	public List<ProductItem> retrieveProductItemAll();

	public ProductItem retrieveProductItemById(String productId);

	public List<ProductItem> retrieveRecentlyProductItemAll();

	public List<CartItem> retrieveCartItemByUserId(Long userId);
	
	public List<ProductItem> retrieveProductItemBySearch(String search);
	
	public long updateProductByStock(OrderedProduct orderProduct);
}
