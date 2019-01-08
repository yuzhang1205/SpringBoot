package com.demo.dao;

import com.demo.entity.User;

public interface UserService {
	public User GetUserById(int userId);
	
	boolean addUser(User userRecord);
}
