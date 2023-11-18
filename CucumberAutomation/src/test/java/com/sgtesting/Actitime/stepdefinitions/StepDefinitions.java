package com.sgtesting.Actitime.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	private static WebDriver oBrowser=null;

	/*
	 * I launch the Chrome Browser
	 */
	@Given("^I launch the Chrome Browser$")
	public void I_launch_the_Chrome_Browser()
	{
		try
		{
	
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/*
	 * I navigate the Application url
	 */
	@Given("^I navigate the Application url$")
	public void I_navigate_the_Application_url()
	{
		try
		{
			oBrowser.navigate().to("http:localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/*
	 * I enter the username in username text field
	 */
	@When("^I enter the username in username text field$")
	public void I_enter_the_username_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/*
	 * I enter the password in password text feild
	 */
	@And("^I enter the password in password text feild$")
	public void I_enter_the_password_in_password_text_feild()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * I click on login button
	 */
	@And("^I click on login button$")
	public void I_click_on_login_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * I find the HomePage
	 */
	@Then("^I find the HomePage$")
	public void I_find_the_HomePage()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[2]/a"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * I minimize the flyout window
	 */
	@And("^I minimize the flyout window$")
	public void I_minimize_the_flyout_window()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	/*
	 * I click on user button
	 */
	@And("^I click on user button$")
	public void I_click_on_user_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@And("^I click on add user$")
	public void I_click_on_add_user()
	{
		try
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@When("^I enter the first name in First Name text field$")
	public void I_enter_the_first_name_in_First_Name_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys("shivu");
			Thread.sleep(2000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@And("^I enter the last name in Last Name text field$")
	public void I_enter_the_first_name_in_Last_Name_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("lastName")).sendKeys("Gowda");
			Thread.sleep(2000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@And("^I enter the email in Email text feild$")
	public void I_enter_the_email_in_Email_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			Thread.sleep(2000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@And("^I enter the username in Username text field$")
	public void I_enter_the_username_in_Username_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("shivu1");
			Thread.sleep(2000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@And("^I enter the password in Password text field$")
	public void I_enter_the_password_in_Password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			Thread.sleep(2000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@And("^I enter the passwordcopy in Retype Password text field$")
	public void I_enter_the_passwordcopy_in_Retype_Password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			Thread.sleep(2000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@When("^I click on create user button")
	public void I_click_on_create_user_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	/*
	 * I click modify password button
	 */
	@And("^I click modify password button$")
	public void I_click_modify_password_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * I click on newuser password button
	 */
	@And("^I click on newuser password button$")
	public void I_click_on_newuser_password_button()
	{
		try
		{
			oBrowser.findElement(By.name("password")).sendKeys("akshara");	
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * I click on Retype password button
	 */
	@And("^I click on Retype password button$")
	public void I_click_on_Retype_password_button()
	{
		try
		{
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("akshara");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * I click on save changes button
	 */
	@When("^I click on save changes button$")
	public void I_click_on_save_changes_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/*
	 * I click on logout link
	 */
	@When("^I click on logout link$")
	public void I_click_on_logout_link()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I find the login Page
	 */
	@Then("^I find the login Page$")
	public void I_find_the_login_Page()
	{
		try
		{
			String expected,actual;
			expected="actiTIME - Login";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}
