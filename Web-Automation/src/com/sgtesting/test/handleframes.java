package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleframes {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handleFrames();
	}
	
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void handleFrames()
	{
		try
		{
			oBrowser.switchTo().frame(0);
			oBrowser.findElement(By.linkText("org.openqa.selenium")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			oBrowser.switchTo().frame("packageFrame");
			oBrowser.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().defaultContent();
			WebElement oEle=oBrowser.findElement(By.xpath("//iframe[@title='Package, class and interface descriptions']"));
			oBrowser.switchTo().frame(oEle);
			
			String content=oBrowser.findElement(By.xpath("/html/body/main/div[2]")).getText();
			System.out.println(content);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}