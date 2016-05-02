package com.zhaojun.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zhaojun.model.User;
public class UserServiceTest {

	@Test//spring配置文件加载之后立即把有注解的全部注入。再接着往下运行
	public void testAdd(){
		System.out.println("最先运行吗？");
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("testAdd运行中");
		UserService service = (UserService)ctx.getBean("userService");
		service.add(new User());		
	}
	/*@Test
	public void testAdd2(){
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserService2 service = (UserService2)ctx.getBean("userService2");
		service.add(new User());		
	}
	*/
	@Test
	public void testBean2(){
		System.out.println("最先运行吗？");
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans2.xml");
		System.out.println("testAdd运行中");
		UserService2 service = (UserService2)ctx.getBean("userService");
		service.add(new User());	
	}	

}
