package com.sgtestingpageobject.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sgtesting.test.ActiPage;

public class AssignmentPO2 {

	public static WebDriver obj=null;
	public static ActiPage oPage=null;
	public static void main(String[] args) 
	{
		launch();
		navigate();
		login();
		minimize();
		createuser();
		modify();
		delete();
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
	private static void createuser()
	{
		try
		{
			oPage.getUserTab().click();
			Thread.sleep(2000);
			oPage.getAddUser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("user");
			oPage.getLastName().sendKeys("u1");
			oPage.getEmail().sendKeys("u1@gmail.com");
			oPage.getUserName().sendKeys("u1user"); 
			oPage.getUserPassword().sendKeys("u1234");
			oPage.getPasswordCopy().sendKeys("u1234");
			oPage.getCreateUser().click();
			Thread.sleep(2000);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modify()
	{
		try {
            oPage.getModifyU1().click();
			Thread.sleep(2000);
			oPage.getUserPassword().sendKeys("u789");
			oPage.getPasswordCopy().sendKeys("u789");
			oPage.getSaveChanges().click();
			Thread.sleep(2000);

		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void delete()
	{
		try {
            oPage.getModifyU1().click();
			Thread.sleep(2000);
			oPage.getDelete().click();
			Thread.sleep(2000);

			Alert ol=obj.switchTo().alert();
			String content=ol.getText();
			Thread.sleep(2000);
			System.out.print(content);
			ol.accept();
			Thread.sleep(2000);
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