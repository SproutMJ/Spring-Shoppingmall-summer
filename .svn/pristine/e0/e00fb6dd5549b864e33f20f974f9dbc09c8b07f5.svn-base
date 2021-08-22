package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.newlecture.web.dao.CategoryDao;
import com.newlecture.web.entity.Category;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@SpringBootTest
class MybatisCategoryDaoTest {

	@Autowired
	private CategoryDao categoryDao;
	
	@Test
	void test() {
		System.out.println(categoryDao.retrieveIdByName("Ocean Foods"));
	}

}
