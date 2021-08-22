package com.newlecture.web.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.newlecture.web.dto.ProductItem;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@MybatisTest
@Transactional
class ProductDaoTest {

	@Autowired
	private ProductDao productDao;

	@Test
	@Rollback(false)
	void test() {

		List<ProductItem> productItemList = productDao.retrieveProductItemBySearch("치");
		for( ProductItem p : productItemList)
			System.out.println(p);

	}

}
