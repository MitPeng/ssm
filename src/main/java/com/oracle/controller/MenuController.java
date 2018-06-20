package com.oracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@RequestMapping("/category")
	public String getCategory() {
		return "admin/category";
	}
	
	@RequestMapping("/menu")
	public String getMenu() {
		return "admin/menu";
	}
	
	@RequestMapping("/role")
	public String getRole() {
		return "admin/role";
	}
	
	@RequestMapping("/user")
	public String getUser() {
		return "admin/user";
	}
	
	@RequestMapping("/commList")
	public String commList() {
		return "admin/commList";
	}
}
