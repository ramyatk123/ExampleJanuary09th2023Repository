package com.sgtesting.products;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class product {

	@Test
	public void createproduct()
	{
		System.out.println("The product demouser1 has created successfully");
	}
	@Test
	public void modifyproduct()
	{
		System.out.println("The product demouser1 has modified succesfully");
	}
	@Test
	public void deleteproduct()
	{
		System.out.println("The product demouser1 has deleted successfully");
	}
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch Chrome Browser,Navigate the URL and Login into the Application");
	}
	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout from the Application and close Application");
	} 

}
