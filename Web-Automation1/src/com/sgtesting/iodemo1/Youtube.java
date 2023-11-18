package com.sgtesting.iodemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Youtube {
     public Youtube(WebDriver oBrowser)
     {
    	PageFactory.initElements(oBrowser,this); 
	 }
     
     //WebElement for user Name text field
     private WebElement username;
     public WebElement getUserName()
     {
    	 return username;
     }
     
     //WebElement for password text field
     private WebElement pwd;
     public WebElement getPassword()
     {
    	 return pwd;
     }
     
     //WebElement for login Button
     @FindBy(xpath="//div[text()='Login ']")
     private WebElement oLogin;
     public WebElement getLogin()
     {
    	 return oLogin;
     }
     
     //WebElement for flyoutWindow
     private WebElement gettingStartedShortcutsPanelId;
     public WebElement getFlyOutWindow()
     {
    	 return gettingStartedShortcutsPanelId;
     }
     
     //WebElement for Logout Link
     @FindBy(linkText="Logout")
     private WebElement oLogout;
     public WebElement getLogout()
     {
    	 return oLogout;
     }
    @FindBy( xpath="//*[@id='icon']/yt-icon-shape/icon-shape/div")
     private WebElement history;
     public WebElement gethistory1()
     
     {
    	 return history;
     }

}
