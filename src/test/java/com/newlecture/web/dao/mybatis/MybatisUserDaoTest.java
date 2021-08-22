package com.newlecture.web.dao.mybatis;

import java.time.Instant;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.newlecture.web.dao.UsersDao;
import com.newlecture.web.entity.Users;

@SpringBootTest
public class MybatisUserDaoTest {

	@Autowired
	private UsersDao userdao;
	
	void createUserTest() {
		
		Users user = new Users(0, "test", "1234", "testName", "1234", 1, Date.from(Instant.now()), "서울");
		
		userdao.createUsers(user);
	}
	
	
	@Test
	void retrieveUsersByUserIdandPasswordTest() {
		Users user = userdao.retrieveUsersByUserIdandPassword("1", "2");
		if(user == null) {
			System.out.println("null 입니다");
		}
	}
}
