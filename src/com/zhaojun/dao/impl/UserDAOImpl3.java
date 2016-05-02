package com.zhaojun.dao.impl;

import org.springframework.stereotype.Component;

import com.zhaojun.dao.UserDAO;
import com.zhaojun.model.User;

/*将该类当成一个资源注入到需要的初始化的地方去，扫描到后。产生一个(key,value)，
key是UserDAOImpl3，value即是对象*/
@Component("userDAOImpl3")
public class UserDAOImpl3 implements UserDAO {
	
	public UserDAOImpl3() {
		System.out.println("UserDAOImpl3初始化");
	}

	public void save(User user) {
		System.out.println("user saved!");
	}

}
