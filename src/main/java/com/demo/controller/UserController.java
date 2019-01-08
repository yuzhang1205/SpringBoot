package com.demo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.cluster.UserDao;
import com.demo.dao.master.fam_tb_UploadSchemeOfSuitDao;
import com.demo.entity.User;
import com.demo.entity.fam_tb_UploadSchemeOfSuit;

@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	//private UserService userService;
	//private UserDao userDao;
	private UserDao userDao;
	
	@Resource
	private fam_tb_UploadSchemeOfSuitDao uploadSuitDao;
	
	@RequestMapping("/showUser")
	public User toIndex(HttpServletRequest request) {
		int userId=Integer.parseInt(request.getParameter("id"));
		User user=this.userDao.selectByPrimaryKey(userId);
		return user;
	}
	@RequestMapping("/showUser2")
	public User getUser2() {
		return userDao.selectByPrimaryKey(1);
	}
	@RequestMapping("/getAllUser")
	public List<User> getAllUser(){
		return userDao.selectUserList();
	}
	@RequestMapping("/upLoadSuit")
	public List<fam_tb_UploadSchemeOfSuit> getAllUp(){
		return uploadSuitDao.selectAllSuit();
	}
}
