package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo 
{

	public static WebDriver obj=null;
	public static void main(String[] args) {
		//launch();
		//navigate();
		launchloginlogout();
		//minimize();
		//logout();
		//closeApp();
}

/*private static void launch()
{
	try
	{
		obj=new ChromeDriver();
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
}

private static void navigate()
{
	try
	{		
		obj.navigate().to("http://localhost/login.do");
		Thread.sleep(3000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}*/

private static void launchloginlogout()
{
	try
	{
		obj=new ChromeDriver();

		obj.navigate().to("http://localhost/login.do");
		Thread.sleep(3000);

		obj.findElement(By.id("username")).sendKeys("admin");
		obj.findElement(By.name("pwd")).sendKeys("manager");
		obj.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(5000);
		
		obj.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(1000);
		
		obj.findElement(By.linkText("Logout")).click(); //content btw open tag and close tag-->linkText
		Thread.sleep(4000);
		
		obj.close();

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

/*private static void minimize()
{
	try
	{
		
		obj.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(3000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void logout()
{
	try
	{
		obj.findElement(By.linkText("Logout")).click();
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
  }*/
}