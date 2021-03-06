package com.newlecture.web.dao;

import java.util.HashMap;
import java.util.List;

import com.newlecture.web.entity.Category;

public interface CategoryDao {
	public void createCategory(Category category);
	public List<Category> retrieveCategoryAll();
	public long retrieveIdByName(String name);
	public Category retrieveCategoryById(String categoryId);
	public HashMap<Long, String> retrieveCategoryMapAll();
}
