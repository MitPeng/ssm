package com.oracle.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.IUserDao;
import com.oracle.model.User;
import com.oracle.service.IUserService;

@Service("usi")
public class UserServiceImple implements IUserService {

	@Autowired
	private IUserDao iud;
	
	@Override
	public int addUser(User u) {
		// TODO Auto-generated method stub
		return iud.addUser(u);
	}

	@Override
	public User queryUserByPhone(String phone) {
		// TODO Auto-generated method stub
		return iud.queryUserByPhone(phone);
	}

	@Override
	public User login(String phone, String passWord) {
		// TODO Auto-generated method stub
		return iud.queryUserByPhoneAndPassWord(phone, passWord);
	}

}
