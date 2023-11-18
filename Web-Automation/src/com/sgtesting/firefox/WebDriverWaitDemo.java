package com.sgtesting.firefox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {
    private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		login();

	}
	private static void launchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--start-maximized");
			oBrowser=new ChromeDriver(options);
		}catch(Exception e)
		{
			e.addSuppressed(e);
		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
		//	WebDriverWait wait=new WebDriverWait(oBrowser,Duration.ofSeconds(30));
		//	wait.until(ExpectedConditions.titleIs("actiTIME-Login"));
			
		//	WebDriverWait wait=new WebDriverWait(oBrowser,Duration.ofSeconds(30));
	   //	wait.until(ExpectedConditions.titleContains("actiTIME-Login"));
			
			WebDriverWait wait=new WebDriverWait(oBrowser,Duration.ofSeconds(30));
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Please identify yourself']"));
			wait.until(ExpectedConditions.attributeToBe(oEle, "id", "headerContainer"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
