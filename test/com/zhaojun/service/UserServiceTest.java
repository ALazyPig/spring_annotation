package com.zhaojun.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zhaojun.model.User;
public class UserServiceTest {

	@Test//spring�����ļ�����֮����������ע���ȫ��ע�롣�ٽ�����������
	public void testAdd(){
		System.out.println("����������");
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("testAdd������");
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
		System.out.println("����������");
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans2.xml");
		System.out.println("testAdd������");
		UserService2 service = (UserService2)ctx.getBean("userService");
		service.add(new User());	
	}	

}
