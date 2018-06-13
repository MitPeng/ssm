package com.oracle.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.model.Category;
import com.oracle.service.ICategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private ICategoryService csi;
	
	@RequestMapping("/findCategoryPage")
	@ResponseBody
	public Object findCategoryPage(Integer page,Integer rows) {
		Map<String, Object> map = new HashMap<String, Object>();
		Integer startIndex = (page-1)*rows;
		map.put("startIndex", startIndex);
		map.put("rows", rows);
		Long total = csi.findTotalSize();
		List<Category> clist = csi.findCategoryPage(map);
		map.put("rows", clist);
		map.put("total", total);
		return map;
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public Map<String,Object> add(Category c) {
		Map<String,Object> map = new HashMap<String,Object>();
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String addDate = df.format(day);
		c.setAddDate(addDate);
		int res = csi.addCategory(c);
		if(res==1) {
			map.put("code", 200);
		}else {
			map.put("code", 500);
		}
		return map;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public Map<String,Object> update(Category c) {
		Map<String,Object> map = new HashMap<String,Object>();
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String updateDate = df.format(day);
		c.setUpdateDate(updateDate);
		int res = csi.updateCategoryById(c);
		if(res==1) {
			map.put("code", 200);
		}else {
			map.put("code", 500);
		}
		return map;
	}
	
	@RequestMapping("/delete")
	public Map<String,Object> delete(int id) {
		Map<String,Object> map = new HashMap<String,Object>();
		int res = csi.deleteCategoryById(id);
		if(res==1) {
			map.put("code", 200);
		}else {
			map.put("code", 500);
		}
		return map;
	}
}
