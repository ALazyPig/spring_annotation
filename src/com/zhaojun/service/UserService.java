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
		System.out.println("���е�UserService��������");
		
	}
	@Autowired  //��ע�����������ʱ����û���ø�set������ͨ��������ʵ�֣�
	public void setUserDAO(UserDAO userDAO) {
		System.out.println("���е�set��");
		this.userDAO = userDAO;
	}
}
