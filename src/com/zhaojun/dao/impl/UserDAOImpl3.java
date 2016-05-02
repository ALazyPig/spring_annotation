package com.zhaojun.dao.impl;

import org.springframework.stereotype.Component;

import com.zhaojun.dao.UserDAO;
import com.zhaojun.model.User;

/*�����൱��һ����Դע�뵽��Ҫ�ĳ�ʼ���ĵط�ȥ��ɨ�赽�󡣲���һ��(key,value)��
key��UserDAOImpl3��value���Ƕ���*/
@Component("userDAOImpl3")
public class UserDAOImpl3 implements UserDAO {
	
	public UserDAOImpl3() {
		System.out.println("UserDAOImpl3��ʼ��");
	}

	public void save(User user) {
		System.out.println("user saved!");
	}

}
