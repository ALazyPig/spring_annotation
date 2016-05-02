package com.zhaojun.service;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.zhaojun.dao.UserDAO;
import com.zhaojun.model.User;


//@Component("userService2")
public class UserService2 {
	
	private UserDAO userDAO;
	
	public void add(User user) {
		userDAO.save(user);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public UserService2() {
		System.out.println("运行到UserService2构造器中");
		
	}
	@Resource(name="userDAOImpl3")//优先byName，找不到再byType 
	public void setUserDAO(UserDAO userDAO) {
		System.out.println("运行到UserService2的setUserDAO中");
		this.userDAO = userDAO;
	}
}
