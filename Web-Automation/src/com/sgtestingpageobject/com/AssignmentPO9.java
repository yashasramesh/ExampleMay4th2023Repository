package com.sgtestingpageobject.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.test.ActiPage;

public class AssignmentPO9 {
	public static WebDriver obj=null;
	public static ActiPage oPage=null;
	public static void main(String[] args) {
		launch();
		navigate();
		loginadmin();
		minimize();
		createUsers();
		logoutadmin();
		userslogin();
		loginadmin();
		modifyusers();
		logoutadmin();
		usersloginnew();
		loginadmin();
		deleteusers();
		logoutadmin();
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
	private static void loginadmin()
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
	private static void createUsers()
	{
		try {
			oPage.getUserTab().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("user1");
			oPage.getLastName().sendKeys("u1");
			oPage.getEmail().sendKeys("u1@gmail.com");
			oPage.getUserName().sendKeys("u1user"); 
			oPage.getUserPassword().sendKeys("u1234");
			oPage.getPasswordCopy().sendKeys("u1234");
			oPage.getCreateUser().click();
			Thread.sleep(2000);
			
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("user2");
			oPage.getLastName().sendKeys("u2");
			oPage.getEmail().sendKeys("u2@gmail.com");
			oPage.getUserName().sendKeys("u2user"); 
			oPage.getUserPassword().sendKeys("u2345");
			oPage.getPasswordCopy().sendKeys("u2345");
			oPage.getCreateUser().click();
			Thread.sleep(2000);
			
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("user3");
			oPage.getLastName().sendKeys("u3");
			oPage.getEmail().sendKeys("u3@gmail.com");
			oPage.getUserName().sendKeys("u3user"); 
			oPage.getUserPassword().sendKeys("u3456");
			oPage.getPasswordCopy().sendKeys("u3456");
			oPage.getCreateUser().click();
			Thread.sleep(2000);
     	} catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void logoutadmin()
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
	private static void userslogin()
	{
		try {
			oPage.getUserName().sendKeys("u1user");
			oPage.getPassword().sendKeys("u1234");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
			oPage.getStartExploring().click();
			Thread.sleep(1000);
            oPage.getLogoutButton().click();
			Thread.sleep(2000);

			oPage.getUserName().sendKeys("u2user");
			oPage.getPassword().sendKeys("u2345");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
			oPage.getStartExploring().click();
			Thread.sleep(1000);
            oPage.getLogoutButton().click();
			Thread.sleep(2000);

			oPage.getUserName().sendKeys("u3user");
			oPage.getPassword().sendKeys("u3456");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
			oPage.getStartExploring().click();
			Thread.sleep(1000);
            oPage.getLogoutButton().click();
			Thread.sleep(2000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyusers()
	{
		try {
			oPage.getUserTab().click();
			Thread.sleep(2000);

			oPage.getModifyU1().click();
			Thread.sleep(2000);
			oPage.getUserPassword().sendKeys("u123");
			oPage.getPasswordCopy().sendKeys("u123");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);

			oPage.getModifyU2().click();
			Thread.sleep(2000);
			oPage.getUserPassword().sendKeys("u456");
			oPage.getPasswordCopy().sendKeys("u456");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);

			oPage.getModifyU3().click();
			Thread.sleep(2000);
			oPage.getUserPassword().sendKeys("u789");
			oPage.getPasswordCopy().sendKeys("u789");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void usersloginnew()
	{
		try {
			oPage.getUserName().sendKeys("u1user");
			oPage.getPassword().sendKeys("u123");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
            oPage.getLogoutButton().click();
			Thread.sleep(2000);

			oPage.getUserName().sendKeys("u2user");
			oPage.getPassword().sendKeys("u456");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
            oPage.getLogoutButton().click();
			Thread.sleep(2000);

			oPage.getUserName().sendKeys("u3user");
			oPage.getPassword().sendKeys("u789");
			oPage.getLoginButton().click();
			Thread.sleep(2000);
            oPage.getLogoutButton().click();
			Thread.sleep(2000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteusers()
	{
		try {
			oPage.getUserTab().click();
			Thread.sleep(2000);

			oPage.getModifyU1().click();
			Thread.sleep(2000);
			oPage.getDelete().click();
			Thread.sleep(2000);

			Alert oal1=obj.switchTo().alert();
			String content1=oal1.getText();
			Thread.sleep(2000);
			System.out.println(content1);
			oal1.accept();
			Thread.sleep(2000);

			oPage.getModifyU2().click();
			Thread.sleep(2000);
			oPage.getDelete().click();
			Thread.sleep(2000);

			Alert oal2=obj.switchTo().alert();
			String content2=oal2.getText();
			Thread.sleep(2000);
			System.out.println(content2);
			oal2.accept();
			Thread.sleep(2000);

			oPage.getModifyU3().click();
			Thread.sleep(2000);
			oPage.getDelete().click();
			Thread.sleep(2000);

			Alert oal3=obj.switchTo().alert();
			String content3=oal3.getText();
			Thread.sleep(2000);
			System.out.println(content3);
			oal3.accept();
			Thread.sleep(2000);
		}catch(Exception e) {
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
