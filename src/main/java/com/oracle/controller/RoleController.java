package com.oracle.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.model.Role;
import com.oracle.service.IRoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private IRoleService rsi;
	
	@RequestMapping("/addRole")
	@ResponseBody
	public Map<String,Object> save(Role role){
		Map<String,Object> map = new HashMap<String,Object>();
		int res = rsi.addRole(role);
		if(res==1) {
			map.put("code", 200);
		}else {
			map.put("code", 500);
		}
		return map;
	}
	
	@RequestMapping("/addUserAndRole")
	@ResponseBody
	public Map<String,Object> saveUserAndRole(Integer roleId,String userIds){
		Map<String,Object> map = new HashMap<String,Object>();
		for(String userId:userIds.split(",")) {
			if(!StringUtils.isEmpty(userId)) {
				rsi.addUserAndRole(roleId, Integer.valueOf(userId));
			}
		}
			map.put("code", 200);
		return map;
	}
	
	
	@RequestMapping("/findPageData")
	@ResponseBody
	public Object findPageData(Integer page,Integer rows) {
		Integer startIndex = (page-1)*rows;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("startIndex", startIndex);
		map.put("rows", rows);
		List<Role> roles = rsi.findRolePage(map);
		map.put("rows", roles);
		map.put("total", rsi.findTotleSize());
		return map;
	}
	@RequestMapping("/findUserANdRole")
	@ResponseBody
	public Map findRoleANdUser(Integer roleId,Integer userId) {
		Map<String,Object> map = new HashMap<String,Object>();
		Long res = rsi.findUserANdRole(roleId, userId);
		if(res!=0) {
			map.put("code", 200);
		}else {
			map.put("code", 500);
		}
		return map;
	}
}
