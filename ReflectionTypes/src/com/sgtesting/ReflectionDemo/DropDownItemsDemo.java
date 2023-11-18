package com.sgtesting.ReflectionDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDownItemsDemo {
    private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		selectItems();

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
    		oBrowser.navigate().to("file:///D:/HTML/Sample.html");
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
