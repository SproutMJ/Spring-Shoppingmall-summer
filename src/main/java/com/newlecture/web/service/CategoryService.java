package com.newlecture.web.service;

import java.util.HashMap;
import java.util.List;

import com.newlecture.web.entity.Category;

public interface CategoryService {
	
	public void registerCategory(Category category, String realPath);
	public List<Category> getCategoryList();
	public long retrieveIdByName(String name);
	public Category retrieveCategoryById(String categoryId);
	public HashMap<Long, String> retrieveCategoryMapAll();
}
