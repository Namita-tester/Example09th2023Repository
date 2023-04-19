package com.sgtesting.com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageDemo 
{
	public PageDemo(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	
	private WebElement q;
	public WebElement oSearchOnGoogle()
	{
		return q;
	}
	
	@FindBy(xpath="//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/div")
	private WebElement oClickSeleniumDev;
    public WebElement oClickOnSeleniumDev()
    {
    	return oClickSeleniumDev;
    }
    
    @FindBy(xpath="//*[@id=\"main_navbar\"]/ul/li[3]")
    private WebElement oClickOnDownloads;
    public WebElement oClickOnDownloads()
    {
    	return  oClickOnDownloads;
    }
	
    @FindBy(xpath="/html/body/div/main/div[5]/div[3]/div/div[2]/p[4]/a")
    private WebElement oClickOnJavaApi;
    public WebElement oClickJavaApi()
    {
    	return oClickOnJavaApi;
    }
    
    @FindBy(xpath="/html/body/header/nav/div[1]/div[2]/ul[1]/li[1]/a")
    private WebElement oFrames;
    public WebElement oClickOnFrameOption()
    {
    	return oFrames;
    }
    
/*	private WebElement packageListFrame;
	public WebElement oSelectFirstOptionInFirstFrame()
	{
		return packageListFrame;
	}
	
	private WebElement packageFrame;
	public WebElement oSelectFirstOptionInSecondFrame()
	{
		return packageFrame;
	}
	
	@FindBy(xpath="//*[@id=\'i0\']/th/code")
	private WebElement oFirstMethodInThirdFrame;
	public WebElement oFirstMethodInThirdFrame()
	{
		return oFirstMethodInThirdFrame;
	} */
}
