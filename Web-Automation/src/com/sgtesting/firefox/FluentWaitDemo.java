package com.sgtesting.firefox;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {
    private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();

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
			FluentWait<WebDriver> wait=new FluentWait<WebDriver>(oBrowser)
					.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(2))
                    .ignoring(NoSuchElementException.class,ElementNotInteractableException.class);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Please identify yourself']"));
			wait.until(ExpectedConditions.attributeToBe(oEle, "id", "headerContainer"));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
