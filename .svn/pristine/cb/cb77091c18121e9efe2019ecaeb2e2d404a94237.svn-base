package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.web.dao.ProductDao;
import com.newlecture.web.dto.CartItem;
import com.newlecture.web.dto.ProductItem;
import com.newlecture.web.entity.OrderedProduct;
import com.newlecture.web.entity.Product;

@Repository
public class MybatisProductDao implements ProductDao {

	private ProductDao mapper;
	
	@Autowired
	public MybatisProductDao(SqlSession sqlSession) {
		mapper = sqlSession.getMapper(ProductDao.class);
	}
	
	@Override
	public long createProduct(Product product) {
		mapper.createProduct(product);
		return 0;
	}

	@Override
	public Product retrieveProductById(long id) {
		return mapper.retrieveProductById(id);
	}

	@Override
	public long updateProduct(Product product) {
		mapper.updateProduct(product);
		return 0;
	}

	@Override
	public long deleteProductById(long id) {
		mapper.deleteProductById(id);
		return 0;
	}

	@Override
	public long retrieveIdByName(String name) {
		return mapper.retrieveIdByName(name);
	}

	@Override
	public long retrieveCurId() {
		return mapper.retrieveCurId();
	}

	@Override
	public long retrieveNextId() {
		return mapper.retrieveNextId();
	}

	@Override
	public List<ProductItem> retrieveProductItemListByCategoryId(String categoryId) {
		return mapper.retrieveProductItemListByCategoryId(categoryId);
	}

	@Override
	public List<ProductItem> retrieveProductItemAll() {
		return mapper.retrieveProductItemAll();
	}

	@Override
	public List<ProductItem> retrieveProductItemListRecentlyOneInCategory() {
		return mapper.retrieveProductItemListRecentlyOneInCategory();
	}

	@Override
	public ProductItem retrieveProductItemById(String productId) {
		return mapper.retrieveProductItemById(productId);
	}

	@Override
	public List<ProductItem> retrieveRecentlyProductItemAll() {
		// TODO Auto-generated method stub
		return mapper.retrieveRecentlyProductItemAll();
	}


	@Override
	public List<CartItem> retrieveCartItemByUserId(Long userId) {
		// TODO Auto-generated method stub
		return mapper.retrieveCartItemByUserId(userId);
	}

	@Override
	public List<ProductItem> retrieveProductItemBySearch(String search) {
		return mapper.retrieveProductItemBySearch(search);
	}

	@Override
	public long updateProductByStock(OrderedProduct orderProduct) {
		mapper.updateProductByStock(orderProduct);
		return 0;
	}

}
