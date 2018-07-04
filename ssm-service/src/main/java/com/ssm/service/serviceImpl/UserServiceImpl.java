package com.ssm.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public String getName(int id) {
		System.out.println("in service");
		String name = userDao.getName(id);
		System.out.println("after dao");
		return name;
	}

}
