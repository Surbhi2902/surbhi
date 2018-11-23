package com.surbhinegi.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.surbhinegi.Dao.UserDao;
import com.surbhinegi.model.User;

public class UserDAOTestCase {
	static UserDao userDao;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		userDao=( UserDao)context.getBean("userDao");
	}
	
	@Ignore
	@Test
	public void addUserTest()
	{
		User user=new User();
		user.setUseremailid("WindowCurtain");
		user.setUsername("WindowCurtain");
		user.setUsercontact("WindowCurtain");
		user.setUseraddress("WindowCurtain");
		user.setUserpassword("WindowCurtain");
	
		
		
		assertTrue("Problem in Adding the Product",userDao.add(user));
	}

}
