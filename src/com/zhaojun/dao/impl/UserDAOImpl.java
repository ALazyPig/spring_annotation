package com.zhaojun.dao.impl;

import com.zhaojun.dao.UserDAO;
import com.zhaojun.model.User;


public class UserDAOImpl implements UserDAO {
	public UserDAOImpl() {
		System.out.println("UserDAOImpl≥ı ºªØ");
	}
	public void save(User user) {
		System.out.println("user saved!");
	}

}
