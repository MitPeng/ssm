package com.oracle.service;

import com.oracle.model.User;

public interface IUserService {
	int addUser(User u);
	User queryUserByPhone(String phone);
	User login(String phone,String passWord);
}
