package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDowmItemsDemo {
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
			oBrowser.navigate().to("file:///D:/HTML01/Sample.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void selectItems()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.id("tools"));
			Select oSelect=new Select(oEle);
			oSelect.selectByIndex(2);
			Thread.sleep(2000);
			oSelect.selectByValue("ide");
			Thread.sleep(2000);
			oSelect.deselectByVisibleText("Selenium WebDriver");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
