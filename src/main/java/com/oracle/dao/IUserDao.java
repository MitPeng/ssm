package com.oracle.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.oracle.model.User;

public interface IUserDao {
	int addUser(User u);
	User queryUserByPhone(String phone);
	User queryUserByPhoneAndPassWord(@Param("phone") String phone,@Param("passWord") String passWord);
	List<User> findAllUser();
	
}
