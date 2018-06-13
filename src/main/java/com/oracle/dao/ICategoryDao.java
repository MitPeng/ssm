package com.oracle.dao;

import java.util.List;
import java.util.Map;

import com.oracle.model.Category;

public interface ICategoryDao {
	int addCategory(Category c);
	int updateCategoryById(Category c);
	int deleteCategoryById(int id);
	List<Category> findCategoryPage(Map map);
	Long findTotalSize();
}
