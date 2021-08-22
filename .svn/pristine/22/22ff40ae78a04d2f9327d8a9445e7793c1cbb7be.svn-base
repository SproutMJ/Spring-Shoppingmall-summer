package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.newlecture.web.dao.CategoryDao;
import com.newlecture.web.dao.ProductDao;
import com.newlecture.web.dto.CartItem;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@SpringBootTest
@Transactional
class MybatisProductDaoTest {
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Test
	void test() {
		List<CartItem> itemList = productDao.retrieveCartItemByUserId((long) 41);
		System.out.println(itemList.size());
		System.out.println(itemList.get(0).getRemoteName());
	}

}
