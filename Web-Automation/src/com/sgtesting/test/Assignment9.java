package com.sgtesting.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {
	public static WebDriver obj=null;
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
	private static void loginadmin()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("admin");
			obj.findElement(By.name("pwd")).sendKeys("manager");
			obj.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
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
	private static void createUsers()
	{
		try {
			obj.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(5000);
			obj.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			obj.findElement(By.name("firstName")).sendKeys("user1");
			obj.findElement(By.name("lastName")).sendKeys("u1");
			obj.findElement(By.name("email")).sendKeys("u1@gmail.com");
			obj.findElement(By.name("username")).sendKeys("u1user");
			obj.findElement(By.name("password")).sendKeys("u1234");
			obj.findElement(By.name("passwordCopy")).sendKeys("u1234");
			obj.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);

			obj.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			obj.findElement(By.name("firstName")).sendKeys("user2");
			obj.findElement(By.name("lastName")).sendKeys("u2");
			obj.findElement(By.name("email")).sendKeys("u2@gmail.com");
			obj.findElement(By.name("username")).sendKeys("u2user");
			obj.findElement(By.name("password")).sendKeys("u2345");
			obj.findElement(By.name("passwordCopy")).sendKeys("u2345");
			obj.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);

			obj.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			obj.findElement(By.name("firstName")).sendKeys("user3");
			obj.findElement(By.name("lastName")).sendKeys("u3");
			obj.findElement(By.name("email")).sendKeys("u3@gmail.com");
			obj.findElement(By.name("username")).sendKeys("u3user");
			obj.findElement(By.name("password")).sendKeys("u3456");
			obj.findElement(By.name("passwordCopy")).sendKeys("u3456");
			obj.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void logoutadmin()
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
	private static void userslogin()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("u1user");
			obj.findElement(By.name("pwd")).sendKeys("u1234");
			obj.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			obj.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(1000);
			obj.findElement(By.linkText("Logout")).click(); 
			Thread.sleep(2000);

			obj.findElement(By.id("username")).sendKeys("u2user");
			obj.findElement(By.name("pwd")).sendKeys("u2345");
			obj.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			obj.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(1000);
			obj.findElement(By.linkText("Logout")).click(); 
			Thread.sleep(2000);

			obj.findElement(By.id("username")).sendKeys("u3user");
			obj.findElement(By.name("pwd")).sendKeys("u3456");
			obj.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			obj.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(1000);
			obj.findElement(By.linkText("Logout")).click(); 
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
			obj.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);

			obj.findElement(By.xpath("//span[text()='u1, user1']")).click();
			Thread.sleep(2000);
			obj.findElement(By.name("password")).sendKeys("u123");
			obj.findElement(By.name("passwordCopy")).sendKeys("u123");
			obj.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);

			obj.findElement(By.xpath("//span[text()='u2, user2']")).click();
			Thread.sleep(2000);
			obj.findElement(By.name("password")).sendKeys("u456");
			obj.findElement(By.name("passwordCopy")).sendKeys("u456");
			obj.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);

			obj.findElement(By.xpath("//span[text()='u3, user3']")).click();
			Thread.sleep(2000);
			obj.findElement(By.name("password")).sendKeys("u789");
			obj.findElement(By.name("passwordCopy")).sendKeys("u789");
			obj.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void usersloginnew()
	{
		try {
			obj.findElement(By.id("username")).sendKeys("u1user");
			obj.findElement(By.name("pwd")).sendKeys("u123");
			obj.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			obj.findElement(By.linkText("Logout")).click(); 
			Thread.sleep(2000);

			obj.findElement(By.id("username")).sendKeys("u2user");
			obj.findElement(By.name("pwd")).sendKeys("u456");
			obj.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			obj.findElement(By.linkText("Logout")).click(); 
			Thread.sleep(2000);

			obj.findElement(By.id("username")).sendKeys("u3user");
			obj.findElement(By.name("pwd")).sendKeys("u789");
			obj.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			obj.findElement(By.linkText("Logout")).click(); 
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
			obj.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);

			obj.findElement(By.xpath("//span[text()='u1, user1']")).click();
			Thread.sleep(2000);
			obj.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);

			Alert oal1=obj.switchTo().alert();
			String content1=oal1.getText();
			Thread.sleep(2000);
			System.out.println(content1);
			oal1.accept();
			Thread.sleep(2000);

			obj.findElement(By.xpath("//span[text()='u2, user2']")).click();
			Thread.sleep(2000);
			obj.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);

			Alert oal2=obj.switchTo().alert();
			String content2=oal2.getText();
			Thread.sleep(2000);
			System.out.println(content2);
			oal2.accept();
			Thread.sleep(2000);

			obj.findElement(By.xpath("//span[text()='u3, user3']")).click();
			Thread.sleep(2000);
			obj.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
