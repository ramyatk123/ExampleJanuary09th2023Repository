package com.sgtesting.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUpBrowserDemo {
    public static WebDriver oBrowser;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		handlePopUps();

	}
	private static void launchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void handlePopUps()
	{
		try
		{
			System.out.println("Before click on link Number of popups :+getpopupCount");
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			Thread.sleep(2000);
			System.out.println("Afetr click on link Number of popups :+getpopupCount");
			if(getPopUpCount()>0)
			{
				popupBrowsers();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static int getPopUpCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	private static void popupBrowsers()
	{
		try
		{
			String ParentBrowser=null;
			ParentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+ParentBrowser);
			Object[]popUps=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popUps.length;i++)
			{
				String ChildBrowser=popUps[i].toString();
				System.out.println("Child Browser :"+ChildBrowser);
				oBrowser.switchTo().window(ChildBrowser);
				Thread.sleep(2000);
				String title=oBrowser.getTitle();
				System.out.println("Title :"+title);
				String Url=oBrowser.getCurrentUrl();
				System.out.println("URL :"+Url);
				Thread.sleep(2000);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
