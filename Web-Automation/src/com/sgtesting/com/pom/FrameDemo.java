package com.sgtesting.com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameDemo 
{
	public static WebDriver oBrowser=null;
	public static PageDemo oPage=null;

	public static void main(String[] args) 
	{
		launchBrowser();
		navigateUrl();
		frameworkOnGoogle();
		switchToFramework();
	}
	
	private static void launchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("---remote-allow-origins=*");
			options.addArguments("start-maximized");
			oBrowser=new ChromeDriver(options);
			oPage=new PageDemo(oBrowser);
		} catch (Exception e)
		{
				e.printStackTrace();
		}
	}
	
	private static void navigateUrl() 
	{	
		try
		{
			oBrowser.get("https://www.google.com/");
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}		
	}
	
	private static void frameworkOnGoogle()
	{
		try 
		{
			oPage.oSearchOnGoogle().sendKeys("Selenium Dev",(Keys.ENTER));
			Thread.sleep(1000);
			oPage.oClickOnSeleniumDev().click();
			Thread.sleep(1000);
			oPage.oClickOnDownloads().click();
			Thread.sleep(1000);
			oPage.oClickJavaApi().click();
			Thread.sleep(3000);
			oPage.oClickOnFrameOption().click();
			Thread.sleep(1000);
					
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void switchToFramework()
	{
		try 
		{
			oBrowser.switchTo().frame("packageListFrame");
			oBrowser.findElement(By.linkText("org.openqa.selenium")).click();
			Thread.sleep(1000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(1000);
			
			oBrowser.switchTo().frame(1);
			oBrowser.findElement(By.linkText("Alert")).click();
			Thread.sleep(1000);
			oBrowser.switchTo().defaultContent();
			Thread.sleep(1000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	} 
	
}