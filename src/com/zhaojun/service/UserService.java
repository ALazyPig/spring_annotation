package com.zhaojun.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.zhaojun.dao.UserDAO;
import com.zhaojun.model.User;



public class UserService {
	
	private UserDAO userDAO;
	
	public void add(User user) {
		userDAO.save(user);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	
	public UserService() {
		System.out.println("运行到UserService构造器中");
		
	}
	@Autowired  //当注解放在域上面时，就没调用该set方法。通过反射来实现？
	public void setUserDAO(UserDAO userDAO) {
		System.out.println("运行到set中");
		this.userDAO = userDAO;
	}
}
