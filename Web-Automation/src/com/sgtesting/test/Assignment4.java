package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static WebDriver obj=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimize();
		createCustomer();
		modify();
		deleteCustomer();
		logout();
		closeApp();
	}

	private static void launch() 
	{
		try{
			obj=new ChromeDriver();
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
	private static void login()
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
	private static void createCustomer()
	{
		try {
			obj.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(2000);
			obj.findElement(By.xpath("//div[text()='Add New']")).click();
			obj.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(500);
			obj.findElement(By.xpath("//input[@id=\"customerLightBox_nameField\"]")).sendKeys("Yashas");
			obj.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Demo Customer");
			obj.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(1000);
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void modify()
	{
		try {
			obj.findElement(By.xpath("//div[@class=\"itemsContainer\"]//div[@class=\"editButton available\"]")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//div[@class=\"customerStatusButton editable active\"]")).click();
			obj.findElement(By.xpath("//div[@class=\"item archivedContainer\"]")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//div[@class=\"itemsContainer\"]//div[@class=\"editButton available\"]")).click();
			Thread.sleep(1000);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try {
			obj.findElement(By.xpath("//div[@class=\"itemsContainer\"]//div[@class=\"editButton available\"]")).click();
			Thread.sleep(1000);
			obj.findElement(By.xpath("//div[@class=\"actionButton\"]")).click();
			obj.findElement(By.xpath("//div[@class=\"deleteButton\"]//div[@class=\"title\"]")).click();
			Thread.sleep(500);
			obj.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
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
			obj.findElement(By.linkText("Logout")).click(); 
			Thread.sleep(1000);

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
