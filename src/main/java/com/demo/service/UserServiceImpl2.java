package com.demo.service;

import javax.annotation.Resource;

import com.demo.dao.UserDao;
import com.demo.dao.UserService;
import com.demo.entity.User;

public class UserServiceImpl2 implements UserService {

	@Resource
	private UserDao userDao;
	
	@Override
	public User GetUserById(int userId) {
		
		return userDao.selectByPrimaryKey(userId);
	}

	@Override
	public boolean addUser(User userRecord) {
		boolean result=false;
		try {
			userDao.insertSelective(userRecord);
			result=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
