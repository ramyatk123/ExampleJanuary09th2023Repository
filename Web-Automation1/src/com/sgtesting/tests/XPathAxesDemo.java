package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPathAxesDemo {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
	//	entersalaryForPersonSachinTendulkar();
	//	enterSalaryForPersonWhoIsNextToSachinTendulkar();
	//	makeIndianFreedomFighterstatusAsActive();
	//	makestatusAsActiveWhoIsPreviousToRahulDravid();
	//	makeStatusAsActiveBasedOnSalaryField();
		basedOnTableEnterSalaryFor4thPerson();

	}
	private static void launchBrowser()
	{
		try
		{
		
			oBrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrowser.navigate().to("file://D:\\\\HTML01/WebTableHTML.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * following-sibling
	 * Case 1:Enter the salary for person Sachin Tendulkar
	 */
	private static void entersalaryForPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
	}
	 /**
	  * following
	  * Case 2:Enter the salary for person who is next to Sachin Tendulkar
	  */
	private static void enterSalaryForPersonWhoIsNextToSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("15000");
	}
	/**
	 * preceding-sibling
	 * Case 3: Make Indian Freedom Fighter Status  As Active
	 * 
	 */
	private static void makeIndianFreedomFighterstatusAsActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	/**
	 * preceding
	 * Case 4:Make the status As Active for person who is previous to Rahul Dravid
	 * 
	 */
	private static void makestatusAsActiveWhoIsPreviousToRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
	}
	/**
	 * ancestor
	 * Case 5:Make the status As Active Based on Salary Text Field
	 * 
	 */
	private static void makeStatusAsActiveBasedOnSalaryField()
	{
		oBrowser.findElement(By.xpath("//input[@id='edit2']/ancestor::tr[1]/td[1]/input")).click();
		
	}
	 /**
	  * descendant
	  * Case 6:Based on Table tagName enter salary for 4th Record
	  * 
	  */
	private static void basedOnTableEnterSalaryFor4thPerson()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[6]/input")).sendKeys("16000");
	}

}
