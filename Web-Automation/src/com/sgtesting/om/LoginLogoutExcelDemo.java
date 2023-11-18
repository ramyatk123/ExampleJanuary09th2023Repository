package com.sgtesting.om;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginLogoutExcelDemo {
    private static WebDriver oBrowser=null;
    public static ObjectMapExcel om=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		Login();
		minimizeFlyOutWindow();
		Logout();

	}
	private static void launchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
			
		//	oBrowser=new ChromeDriver();
			String fileName=".\\objectmap\\objectmap.xlsx";
			om=new ObjectMapExcel(fileName);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			oBrowser.findElement(om.getLocator("loginpageusername")).sendKeys("admin");
			oBrowser.findElement(om.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(om.getLocator("loginpageloginbtn")).click();
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
			oBrowser.findElement(om.getLocator("homepageflyoutwindow")).click();
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
			oBrowser.findElement(om.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
