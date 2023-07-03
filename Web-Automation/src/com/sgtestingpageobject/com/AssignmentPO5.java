package com.sgtestingpageobject.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sgtesting.test.ActiPage;

public class AssignmentPO5 {

	public static WebDriver obj=null;
	public static ActiPage oPage=null;
	public static void main(String[] args) 
	{
		launch();
		navigate();
		login();
		minimize();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApp();
	}
	private static void launch()
	{
		try
		{
			obj=new ChromeDriver();
			obj.manage().window().maximize();
			oPage=new ActiPage(obj);
		} catch (Exception e)
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
		} catch (Exception e)
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

	private static void minimize()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try {
			oPage.getTaskTab().click();
			Thread.sleep(2000);
			oPage.getAddNew().click();
            oPage.getNewCustomer().click();
			Thread.sleep(500);
			oPage.getCustomerName().sendKeys("Yashas");
			oPage.getCustomerDescription().sendKeys("Demo Customer");
			oPage.getCreateCustomer().click();
			Thread.sleep(1000);
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try {
			oPage.getAddNew().click();
            oPage.getNewProject().click();
			Thread.sleep(500);
			oPage.getProjectNameField().sendKeys("Demo Project");
			oPage.getProjectDescription().sendKeys("Demo");
			oPage.getProjectcommitBtn().click();
			Thread.sleep(1000);
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try {
			oPage.getProjectStatusButton().click();
			Thread.sleep(500);
			oPage.getDeleteProjectAction().click();
			oPage.getDeleteProject().click();
			Thread.sleep(500);
			oPage.getDeleteProjectPermanently().click();
			Thread.sleep(500);

		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		private static void deleteCustomer()
	{
		try {
			oPage.getSelectCustomerButton().click();
			Thread.sleep(1000);
			oPage.getDeleteCustomerAction().click();
			oPage.getDeleteCustomer().click();
			Thread.sleep(500);
			oPage.getDeleteCustomerPermanently().click();
			Thread.sleep(500);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
            oPage.getLogoutButton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApp()
	{
		try
		{
			obj.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}