package com.demo.service;

import java.util.List;

import javax.annotation.Resource;

import com.demo.dao.UserDao;
import com.demo.entity.User;

public class UserServiceImpl implements UserDao {

	@Resource
	private UserDao userDao;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return userDao.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return userDao.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public List<User> selectUserList() {
		// TODO Auto-generated method stub
		return userDao.selectUserList();
	}
}
