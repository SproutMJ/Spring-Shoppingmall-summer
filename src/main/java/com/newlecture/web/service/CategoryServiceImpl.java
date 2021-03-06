package com.newlecture.web.service;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.CategoryDao;
import com.newlecture.web.entity.Category;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public void registerCategory(Category category, String realPath) {
				
		File savePath = new File(realPath);
		
		if(!savePath.exists()) {
			savePath.mkdirs();
		}
		categoryDao.createCategory(category);
	}

	@Override
	public List<Category> getCategoryList() {
		return categoryDao.retrieveCategoryAll();
	}

	@Override
	public long retrieveIdByName(String name) {
		return categoryDao.retrieveIdByName(name);
	}

	@Override
	public Category retrieveCategoryById(String categoryId) {
		// TODO Auto-generated method stub
		return categoryDao.retrieveCategoryById(categoryId);
	}

	@Override
	public HashMap<Long, String> retrieveCategoryMapAll() {
		return categoryDao.retrieveCategoryMapAll();
	}
}
