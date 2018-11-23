package com.surbhinegi.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.surbhinegi.Dao.SupplierDao;
import com.surbhinegi.model.Supplier;

public class SupplierDAOTestCase {
	static SupplierDao supplierDao;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		supplierDao=(SupplierDao)context.getBean("supplierDao");
	}
	
	@Ignore
	@Test
	public void addProductTest()
	{
		Supplier supplier=new Supplier();
		supplier.setSuppliername("WindowCurtain");
		supplier.setSupplieraddress("WindowCurtain");
	
		supplier.setSuppliercontactdetail("WindowCurtain");
	
		
		
		assertTrue("Problem in Adding the Product",supplierDao.add(supplier));
	}

}
