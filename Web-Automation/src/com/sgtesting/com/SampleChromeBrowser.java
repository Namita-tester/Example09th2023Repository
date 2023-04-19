package com.sgtesting.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleChromeBrowser 
{
	public static WebDriver driver=null;
	
	public static void main(String args[]) throws InterruptedException
	{
		launchBrowser();
		navigateToPage();
	}
	
	private static void launchBrowser() throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("start-maximized");

		driver=new ChromeDriver(options);
		Thread.sleep(500);
	}
	
	private static void navigateToPage()
	{
		try
		{
			driver.get("http://localhost:8081/login.do");
			Thread.sleep(2000);
			System.out.println("Before click on link Number of Popus:"+getPopupCount());
			driver.findElement(By.linkText("actiTIME Inc.")).click();
			System.out.println("After click on link number of popups:" +getPopupCount());
			if(getPopupCount()>0)
			{
				popupBrowsers();
			}

			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static int getPopupCount()
	{
		int count=0;
		count=driver.getWindowHandles().size()-1;
		return count;
	}
	
	private static void popupBrowsers()
	{
		try
		{
			String parentBrowser=null;
			parentBrowser=driver.getWindowHandle();
			System.out.println("Parent Browser :"+parentBrowser);
			Object[] popups=driver.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
				System.out.println("Child Browser :"+childBrowser);
				driver.switchTo().window(childBrowser);
				Thread.sleep(2000);
				String title=driver.getTitle();
				System.out.println("Title :"+title);
				String url=driver.getCurrentUrl();
				System.out.println("URL :"+url);
				Thread.sleep(2000);
				driver.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}