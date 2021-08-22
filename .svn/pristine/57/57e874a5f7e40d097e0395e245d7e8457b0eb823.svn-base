package com.newlecture.web.dao.mybatis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.newlecture.web.dao.CartDao;
import com.newlecture.web.entity.Cart;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@SpringBootTest
public class MybatisCartDaoTest {
	
	@Autowired
	private CartDao cartDao;
	
	@Test
	public void cartCreateTest() {
		cartDao.createCart(new Cart(0, 404, 21, 5));
	}
	
}
