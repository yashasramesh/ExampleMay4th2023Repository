package com.sgtesting.test;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 
{
	public static WebDriver obj=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimize();
		importtasks();
		copyfile(null);
		deleteTasks();
		//logout();
		//closeApp();
}

private static void launch()
{
	try
	{
		obj=new ChromeDriver();
		obj.manage().window().maximize();
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
}

private static void login()
{
	try
	{
		obj.findElement(By.id("username")).sendKeys("admin");
		obj.findElement(By.name("pwd")).sendKeys("manager");
		Robot robot=new Robot();             //Robot class
		robot.keyPress(KeyEvent.VK_ENTER);  //VK = virtual key, clicking ENTER button on keyboard
		robot.keyRelease(KeyEvent.VK_ENTER);
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
private static void importtasks()
{
	try
	{
		obj.findElement(By.xpath("//div[text()='TASKS']")).click();
		Thread.sleep(2000);
		obj.findElement(By.xpath("//div[@class=\"addNewTaskButtonContainer\"]")).click();
		Thread.sleep(500);
		obj.findElement(By.xpath("//div[@class=\"item importTasks ellipsis\"]")).click();
		Thread.sleep(500);
		obj.findElement(By.id("dropzoneClickableArea")).click();
		Thread.sleep(2000);
		String fileName="C:\\ECLIPSE\\Sample.csv";
		copyfile(fileName);
		Thread.sleep(2000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        obj.findElement(By.id("loadTasksFromCSVPopup_commitBtn")).click();
        Thread.sleep(2000);
        obj.findElement(By.id("closeLoadTasksFromCSVPopupButton")).click();
        Thread.sleep(2000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void copyfile(String filename)
{
	StringSelection strselection=new StringSelection(filename);
	//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
	Toolkit toolkit=Toolkit.getDefaultToolkit();
	toolkit.getSystemClipboard();
	Clipboard clipboard=toolkit.getSystemClipboard();
	clipboard.setContents(strselection, null);
}
private static void deleteTasks()
{
	try {
		obj.findElement(By.xpath("//table[@class=\'createdTasksRowsTable\']")).click();
		Thread.sleep(500);
		obj.findElement(By.xpath("//div[@class=\"edit_task_sliding_panel sliding_panel\"]//div[@class=\"headerBlock\"]//div[@class=\"actionButton\"]")).click();
		obj.findElement(By.xpath("//div[@class=\"edit_task_sliding_panel sliding_panel\"]//div[@class=\"buttonsWrapper\"]//div[@class=\"deleteButton\"]")).click();
		obj.findElement(By.id("taskPanel_deleteConfirm_submitBtn")).click();
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