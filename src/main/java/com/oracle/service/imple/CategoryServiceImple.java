package com.oracle.service.imple;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.ICategoryDao;
import com.oracle.model.Category;
import com.oracle.service.ICategoryService;

@Service("csi")
public class CategoryServiceImple implements ICategoryService {

	@Autowired
	private ICategoryDao icd;
	
	@Override
	public int addCategory(Category c) {
		// TODO Auto-generated method stub
		return icd.addCategory(c);
	}

	@Override
	public int updateCategoryById(Category c) {
		// TODO Auto-generated method stub
		return icd.updateCategoryById(c);
	}

	@Override
	public int deleteCategoryById(int id) {
		// TODO Auto-generated method stub
		return icd.deleteCategoryById(id);
	}

	@Override
	public List<Category> findCategoryPage(Map map) {
		// TODO Auto-generated method stub
		return icd.findCategoryPage(map);
	}

	@Override
	public Long findTotalSize() {
		// TODO Auto-generated method stub
		return icd.findTotalSize();
	}

}
