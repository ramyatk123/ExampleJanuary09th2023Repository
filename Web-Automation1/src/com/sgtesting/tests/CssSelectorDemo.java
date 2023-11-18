package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelectorDemo {
    private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
	//	absolutecssSelector();
	//	relativecssPathUsingTagName();
	//	relativecssPathUsingTagNameAndIdAttribute();
	//	relativecssPathUsingIdAttributevalue();
	//	relativecssPathUsingTagNameAndClassAttributeValue();
	//	relativecssPathUsingClassAttributeValue();
		relativecssPathUsingTagNameWithAttributeNameValue();
	//	relativecssPathUsingAttributeNameValue();
	//	relativecssPathUsingTagNameWithMultipleAttributeNAmeValue();
	//	relativecssPathUsingTagNameWithAttributeNameAndPartialAttributeValue();
	//	relativecssPathUsingTagNameWithAttributeName();
	//	relativecssPathUsingTagNameWithAttributeName-1();
	//	relativecssPathUsingTagNameWithAttributeName-2();
	//	relativecssPathUsingParentElementReference();
	//	relativecssPathUsingnthChild();
	//	relativecssPathUsingSibling();
		closeApp();
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
    /*
     * case 1:identify the element based on tagName
     * Syntax:<tagName>
     */
    private static void absolutecssSelector()
    {
    	try
    	{
    		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    /*
     * case 2:identify the element based on tagName with id attribute value
     * Syntax:<tagName>#<id attribute value>
     */
    private static void relativecssPathUsingTagName()
    {
    	try
    	{
    		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser2");
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    /*
     * case 3:identify the element based on id attribute value
     * Syntax:#<id attribute value>
     */
    private static void relativecssPathUsingTagNameAndIdAttribute()
    {
    	try
    	{
    		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser3");
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    /*
     * case 4:identify the element based on tagName with class attribute value
     * Syntax:<tagName><class attribute value>
     */
    private static void relativecssPathUsingIdAttributevalue()
    {
    	try
    	{
    		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser4");
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    /*
     * case 5:identify the element based on class attribute value
     * Syntax:<class attribute value>
     */
    private static void relativecssPathUsingTagNameAndClassAttributeValue()
    {
    	try
    	{
    		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUser5");
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    /*
     * case 6:identify the element based on <tagName> with attribute Name and value combination
     *Syntax:<tagName>[attributeName='attributeValue']
     */
    private static void relativecssPathUsingClassAttributeValue()
    {
    	try
    	{
    		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser6");
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    /*
     * case 7:identify the element based on attribute Name and value combination
     * Syntax:*[attributeName='attributeValue']
     */
    private static void relativecssPathUsingTagNameWithAttributeNameValue()
    {
    	try
    	{
    		oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    /*
     * case 8:identify the element based on<tagName> with multiple attribute Name and Value
     * Syntax:<tagName>[attributeName='attributeValue']
     *                 [attributeName='attributeValue']
     */
    private static void relativecssPathUsingAttributeNameValue()
    {
    	try
    	{
    		oBrowser.findElement(By.cssSelector("*[value='Submit']")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    /*
     * case 9:identify the element based on<tagName> with attribute Name and partial Value combination
     * Syntax:<tagName>[attributeName^='attributeValue']
     *                 [attributeName$='attributeValue']
     *                 [attributeName*='attributeValue']
     */
    private static void relativecssPathUsingTagNameWithMultipleAttributeNAmeValue()
    {
    	oBrowser.findElement(By.cssSelector("input[type='button'][value='Submit']")).click();
    }
    /*
     * case 10:identify the element based on<tagName> with attribute Name
     * Syntax:<tagName>[attributeName]
     */
    private static void relativecssPathUsingTagNameWithAttributeNameAndPartialAttributeValue()
    {
     //	oBrowser.findElement(By.cssSelector("input[id^='btn1']")).click();
    //	oBrowser.findElement(By.cssSelector("input[id$='button']")).click();
    //	oBrowser.findElement(By.cssSelector("input[id*='Submit']")).click();
    }
    /*
     * case 10:identify the element based on<tagName> with attribute Name
     * Syntax:<tagName>[attributeName]
     */
    private static void relativecssPathUsingTagNameWithAttributeName()
    {
    	//Find Number of links available in the WebPage 
    	List<WebElement> oLinks=oBrowser.findElements(By.cssSelector("a[href]"));
    	 
    	System.out.println("Number of Links:"+oLinks.size());
    }
    private static void relativecssPathUsingTagNameWithAttributeName_1()
    {
    	//Display Names of Links available in the WebPage
    	List<WebElement>
    	oLinks=oBrowser.findElements(By.cssSelector("a[href]"));
    	for(int i=0;i<oLinks.size();i++)
    	{
    		WebElement link=oLinks.get(i);
    		System.out.println(link.getText());
    	}
    }
    private static void relativecssPathUsingTagNameWithAttribute_2()
    {
    	//  Reproduce the state Element Reference Exception 
    	//  org.openqa.Selenium.stateElementReferenceException:state element reference:
    	//  Element is not attached to the page document
    	List<WebElement>
    	oLinks=oBrowser.findElements(By.cssSelector("a[href]"));
    	for(int i=0;i<oLinks.size();i++)
    	{
    		WebElement link=oLinks.get(i);
    		String linkText=link.getText();
    		if(linkText.endsWith("Testing"))
    		{
    			link.click();
    		}
    	}
    }
    /*
     * case 11:identify the element based on parent element Reference
     * Syntax:<ParentELement><ChildElement>
     */
    private static void relativecssPathUsingParentElementReference()
    {
    	oBrowser.findElement(By.cssSelector("form#frm3>input")).sendKeys("DemoUser1");
    }
    /*
     * case 12:identify the element based on nth child concept 
     * Syntax:nth child
     */
    private static void relativecssPathUsingnthChild()
    {
    	oBrowser.findElement(By.cssSelector("form#frm3>input:nth-child(4)")).sendKeys("DemoUser4");
    	oBrowser.findElement(By.cssSelector("form#frm3>input:nth-child(5)")).sendKeys("Demouser5");
    	oBrowser.findElement(By.cssSelector("form#frm3>input:nth-child(6)")).sendKeys("DemoUser6");
    }
    /*
     * case 13:identify the element based on sibling concept
     * Syntax:sibling+sibling+sibling
     */
    private static void relativecssPathUsingSibling()
    {
    	oBrowser.findElement(By.cssSelector("form#frm3>input+input")).sendKeys("DemoUser2");
    	oBrowser.findElement(By.cssSelector("form#frm3>input+input+input")).sendKeys("DemoUser3");
    	oBrowser.findElement(By.cssSelector("form#frm3>input+input+input+input")).sendKeys("DemoUser4");
    }
    private static void closeApp()
    {
    	try
    	{
    		oBrowser.quit();
    		Thread.sleep(2000);
    	}catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
}
