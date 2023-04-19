package com.sgtesting.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathAxesDemo 
{
	public static WebDriver driver=null;

	public static void main(String[] args) 
	{
		launchBrowser();
		navigateUrl();

	}

	public static void launchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("start-maximized");
			driver=new ChromeDriver(options);
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void navigateUrl()
	{
		try
		{
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
