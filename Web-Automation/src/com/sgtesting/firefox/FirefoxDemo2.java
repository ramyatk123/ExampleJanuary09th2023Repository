package com.sgtesting.firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxDemo2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();

	}
	private static void launchBrowser()
	{
		try
		{
			FirefoxProfile ffprofile=new FirefoxProfile();
            ffprofile.setPreference("browser.startup.homepage","http://www.sgtestinginstitute.com/");
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(ffprofile);
			oBrowser=new FirefoxDriver(options);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
