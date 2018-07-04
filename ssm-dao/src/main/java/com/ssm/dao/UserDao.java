package com.ssm.dao;

import java.util.List;

import com.ssm.dao.entities.User;

public interface UserDao {
	
	public String getName(int id);
	
	public int addUser(User user);
	
	public int deleteUser(int id);
	
	public int updateUser(User user);
	
	public User getUser(int id);
	
	public List<User> getUserList();

}