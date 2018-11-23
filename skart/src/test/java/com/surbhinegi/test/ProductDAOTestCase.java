package com.surbhinegi.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.surbhinegi.Dao.ProductDao;
import com.surbhinegi.model.Product;

public class ProductDAOTestCase {

	static ProductDao productDao;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		productDao=(ProductDao)context.getBean("productDao");
	}
	
	@Ignore
	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProductname("WindowCurtain");
		product.setPrice("WindowCurtain");
		product.setQuantity("WindowCurtain");
		product.setProductdetails("WindowCurtain");
	
		
		
		assertTrue("Problem in Adding the Product",productDao.add(product));
	}

}
