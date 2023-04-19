package com.sgtesting.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertDemo 
{
    public static WebDriver obj=null;
	
	public static void main(String args[]) 
	{
		launch();
		navigate();
		login();
	}
	
	private static void launch()
	{
		try 
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("start-maximized");
			obj=new ChromeDriver(options);
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try 
		{
			obj.get("https://the-internet.herokuapp.com/javascript_alerts");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			obj.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
			Thread.sleep(1000);
			obj.switchTo().alert().accept();
			Thread.sleep(1000);
			
			obj.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
			Thread.sleep(1000);
			obj.switchTo().alert().dismiss();
			Thread.sleep(1000);
			
			obj.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
			obj.switchTo().alert().sendKeys("Hi JavaScript");
			Thread.sleep(1000);
			obj.switchTo().alert().getText();
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
