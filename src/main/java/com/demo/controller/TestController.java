package com.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.UserDao;
import com.demo.dao.UserService;
import com.demo.entity.User;
import com.demo.entity.UserDemo;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestController {
	
	@Resource
	private UserDao userDao;
	
	@Resource
    private UserService userService;
	
	@RequestMapping("getuser")
	public UserDemo getUser() {
		
		UserDemo user=new UserDemo();
		user.setName("zy");
		return user;
	}
	@RequestMapping("/getuser2")
	public User getUser2() {
		return userDao.selectByPrimaryKey(1);
	}
	@RequestMapping("/showUser")
    @ResponseBody
    public User showUser(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        userId=1;
        User user = this.userDao.selectByPrimaryKey(userId);
        return user;
    }
	@RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() { // 通过model可以实现内容的传递
		return userDao.selectByPrimaryKey(1);
    }
}
