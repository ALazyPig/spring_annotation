package com.zhaojun.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.zhaojun.dao.UserDAO;
import com.zhaojun.model.User;



public class UserService3 {
	
	/*private UserDAO userDAO;
	
	public void add(User user) {
		userDAO.save(user);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	@Autowired //Ĭ��byType��ͨ��������ע�룬�������ļ�����һ����userDao�������Ƶ�ע��
	//���ж�����Ƶ�userDao����ʱ��ͨ��@Qualifier��ָ��ȷ����ID��ע��
	public void setUserDAO(@Qualifier("userDao") UserDAO userDAO) {
		this.userDAO = userDAO;
	}*/
}
