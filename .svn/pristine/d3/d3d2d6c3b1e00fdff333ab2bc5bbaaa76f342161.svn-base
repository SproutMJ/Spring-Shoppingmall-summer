package com.newlecture.web.dao.mybatis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.newlecture.web.dao.OrderedProductDao;
import com.newlecture.web.entity.OrderedProduct;

@SpringBootTest
class MybatisOrderedProductDaoTest {

	@Autowired
	private OrderedProductDao orderedProductDao;
	@Test
	void test() {
		orderedProductDao.createOrderedProduct(new OrderedProduct(0, 26, 404, 0));
	}

}
