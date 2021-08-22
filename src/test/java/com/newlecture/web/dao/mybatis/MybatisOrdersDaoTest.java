package com.newlecture.web.dao.mybatis;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.newlecture.web.dao.OrdersDao;
import com.newlecture.web.entity.Orders;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@SpringBootTest
@Transactional
class MybatisOrdersDaoTest {

	@Autowired
	private OrdersDao ordersDao;
	
	@Test
	@Rollback(value = false)
	void test() {
		ordersDao.createOrders(new Orders(0, Date.from(Instant.now()), "aa", "bb", "cc", 101, 1));
		
		System.out.println(ordersDao.retrieveLastIdByUserId(101));
	}

}
