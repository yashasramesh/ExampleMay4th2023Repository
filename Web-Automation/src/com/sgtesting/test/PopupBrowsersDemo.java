package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowsersDemo {

	public static WebDriver obj=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handlePopupBrowser();
	}
	private static void launchBrowser()
	{ 
		try {
			obj=new ChromeDriver();
			obj.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			obj.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);

		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void handlePopupBrowser() {
		WebElement oLink=null;
		try {
			oLink=obj.findElement(By.linkText("actiTIME Inc."));
			Thread.sleep(2000);
			System.out.println("Before Click on Link, Number of popups :"+popupCount());
			oLink.click();
			Thread.sleep(2000);
			System.out.println("After Click on Link, Number of popups :"+popupCount());
			if(popupCount() > 0 )
			{
				popupsOperations();
			}
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static int popupCount()
	{
		int count=0;
		count=obj.getWindowHandles().size()-1;
		return count;
	}
	private static void popupsOperations()
	{
		try {
			String parentBrowser=obj.getWindowHandle();
			System.out.println("Parent Browser :"+parentBrowser);
			
			Object[] popups=obj.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
			System.out.println("Child Browser :"+childBrowser);
			Thread.sleep(2000);
			obj.switchTo().window(childBrowser);
			String url=obj.getCurrentUrl();
			System.out.println("URL :"+url);
			String title=obj.getTitle();
			System.out.println("Title :"+title);
			obj.findElement(By.linkText("Log in")).click();
			Thread.sleep(2000);
			
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
