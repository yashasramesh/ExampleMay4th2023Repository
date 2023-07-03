package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static WebDriver obj=null;
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
		Thread.sleep(2000);
	} catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void login()
{
	try {
		obj.findElement(By.id("username")).sendKeys("admin");
		obj.findElement(By.name("pwd")).sendKeys("manager");
		obj.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(5000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void minimize()
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
private static void createuser()
{
	try
	{
		obj.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(5000);
		obj.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(1000);
		obj.findElement(By.name("firstName")).sendKeys("user");
		obj.findElement(By.name("lastName")).sendKeys("u1");
		obj.findElement(By.name("email")).sendKeys("u1@gmail.com");
		obj.findElement(By.name("username")).sendKeys("u1user");
		obj.findElement(By.name("password")).sendKeys("u1234");
		obj.findElement(By.name("passwordCopy")).sendKeys("u1234");
		obj.findElement(By.xpath("//span[text()='Create User']")).click();
		Thread.sleep(3000);

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void modify()
{
	try {
		obj.findElement(By.xpath("//span[text()='u1, user']")).click();
		Thread.sleep(2000);
		obj.findElement(By.name("password")).sendKeys("u789");
		obj.findElement(By.name("passwordCopy")).sendKeys("u789");
		obj.findElement(By.xpath("//span[text()='Save Changes']")).click();
		Thread.sleep(2000);

	} catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void delete()
{
	try {
		obj.findElement(By.xpath("//span[text()='u1, user']")).click();
		Thread.sleep(2000);
		obj.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
  }
}