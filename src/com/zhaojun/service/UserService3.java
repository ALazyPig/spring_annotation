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
	@Autowired //默认byType，通过类型来注入，在配置文件中找一个与userDao类型相似的注入
	//当有多个相似的userDao类型时，通过@Qualifier来指定确定的ID来注入
	public void setUserDAO(@Qualifier("userDao") UserDAO userDAO) {
		this.userDAO = userDAO;
	}*/
}
