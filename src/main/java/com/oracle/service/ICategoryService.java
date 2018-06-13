package com.oracle.service;

import java.util.List;
import java.util.Map;

import com.oracle.model.Category;

public interface ICategoryService {
	int addCategory(Category c);
	int updateCategoryById(Category c);
	int deleteCategoryById(int id);
	List<Category> findCategoryPage(Map map);
	Long findTotalSize();
}
