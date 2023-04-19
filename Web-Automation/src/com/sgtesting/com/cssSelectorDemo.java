package com.sgtesting.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssSelectorDemo {

		public static WebDriver oBrowser=null;
		
		
		private static void launchBrowser() throws InterruptedException
		{
			try 
			{
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("start-maximized");
				Thread.sleep(2000);
				oBrowser=new ChromeDriver(options);
				Thread.sleep(500);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}
		
		private static void navigateToPage()
		{
			try
			{
				oBrowser.get("file:///C:/Users/Namita/AppData/Local/Temp/Rar$EXa9684.7784/Sample.html");
				List <WebElement> oList=oBrowser.findElements(By.cssSelector("a[href]"));
				System.out.println("Number of input tags: "+oList.size());
				for(int i=0; i< oList.size(); i++)
				{
					WebElement link=oList.get(i);
					String str=link.getText();
					if(str.endsWith("Testing"))
					{
						link.click();
					}
				
					
				}
					
			} catch (Exception e) 
			{
					e.printStackTrace();
			}
			
		}
			public static void main(String args[]) throws InterruptedException
			{
				launchBrowser();
				navigateToPage();
			}
			

}
