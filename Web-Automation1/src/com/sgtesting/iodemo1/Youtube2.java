package com.sgtesting.iodemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Youtube2 {
    public static WebDriver oBrowser;
    public static Youtube opage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		//Login();
		//minimizeFlyOutWindow();
		//Logout();
		history();
	}
	private static void launchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
			opage=new Youtube(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrowser.navigate().to("https://www.youtube.com/");
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
		opage.getUserName().sendKeys("admin");
		opage.getPassword().sendKeys("manager");
		opage.getLogin().click();
		Thread.sleep(5000);	
	     }catch(Exception e)
	     {
		      e.printStackTrace();
	      }
    } 
	private static void minimizeFlyOutWindow()
	{
		try
		{
			opage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			opage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void history()
	{
		try {
			opage.gethistory1().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
