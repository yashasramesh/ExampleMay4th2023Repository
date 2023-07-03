package com.sgtestingpageobject.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sgtesting.test.ActiPage;

public class AssignmentPO1 {

	public static WebDriver obj=null;
	public static ActiPage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		logout();
		closeApplication();
	}
		private static void launchBrowser()
	{
		try
		{
			obj=new ChromeDriver();
			oPage=new ActiPage(obj);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		private static void navigate()
	{
		try
		{
			obj.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyoutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oPage.getLogoutButton().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			obj.close();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}