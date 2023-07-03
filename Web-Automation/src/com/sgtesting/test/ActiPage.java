package com.sgtesting.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage {

	public ActiPage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//Create WebElement for UserName
	private WebElement username;
	public WebElement getUserName()
	{ 
		return username;
	}

	//Create WebElement for Password
	private WebElement pwd;
	public WebElement getPassword()
	{ 
		return pwd;
	}

	//Create WebElement for Login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}

	//Create WebElement for FlyoutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//Create WebElement for Logout link
	@FindBy(linkText = "Logout")
	private WebElement oLogout;
	public WebElement getLogoutButton()
	{
		return oLogout;
	}
	//Create WebElement for UserTab
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement usertab;
	public WebElement getUserTab()
	{
		return usertab;
	}
	//Create WebElement for AddUser
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement adduser;
	public WebElement getAddUser()
	{
		return adduser;
	}
	//Create WebElement for FirstName
	private WebElement firstName;
	public WebElement getFirstName()
	{ 
		return firstName;
	}
	//Create WebElement for LastName
	private WebElement lastName;
	public WebElement getLastName()    
	{ 
		return lastName;
	}
	//Create WebElement for Email
	private WebElement email;
	public WebElement getEmail()
	{ 
		return email;
	}
	//Create WebElement for PasswordCopy
	private WebElement passwordCopy;
	public WebElement getPasswordCopy()    
	{ 
		return passwordCopy;
	}
	//Create WebElement for Password
	private WebElement password;
	public WebElement getUserPassword()
	{ 
		return password;
	}
	//Create WebElement for CreateUser Button
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement createuser;
	public WebElement getCreateUser()    
	{ 
		return createuser;
	}
	//Create WebElement for Modify
	@FindBy(xpath="//span[text()='u2, user2']")
	private WebElement modifyu2;
	public WebElement getModifyU2()
	{
		return modifyu2;
	}
	//Create WebElement for Modify
	@FindBy(xpath="//span[text()='u3, user3']")
	private WebElement modifyu3;
	public WebElement getModifyU3()
	{
		return modifyu3;
	}
	//Create WebElement for Modify
	@FindBy(xpath="//span[text()='u1, user1']")
	private WebElement modifyu1;
	public WebElement getModifyU1()
	{
		return modifyu1;
	}
	//Create WebElement for SaveChanges Button
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement savechanges;
	public WebElement getSaveChanges()
	{
		return savechanges;
	}
	//Create WebElement for Delete
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getDelete()
	{
		return userDataLightBox_deleteBtn;
	}
	//Create WebElement for TaskTab
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement tasktab;
	public WebElement getTaskTab()
	{
		return tasktab;
	}
	//Create WebElement for AddNew
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew;
	public WebElement getAddNew()
	{
		return addnew;
	}
	//Create WebElement for CreateCustomer
	@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	private WebElement newcustomer;
	public WebElement getNewCustomer()
	{
		return newcustomer; 
	}
	//Create WebElement for Enter Customer Name
	@FindBy(id="customerLightBox_nameField")
	private WebElement customername;
	public WebElement getCustomerName()
	{
		return customername;  
	}
	//Create WebElement for Customer Description
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerdescription;
	public WebElement getCustomerDescription()
	{
		return customerdescription;
	}
	//Create WebElement for Create Customer button
	@FindBy(id="customerLightBox_commitBtn")
	private WebElement createcustomer;
	public WebElement getCreateCustomer()
	{
		return createcustomer;
	}
	//Create WebElement for Select Customer Button
	@FindBy(xpath="//div[@class=\"itemsContainer\"]//div[@class=\"editButton available\"]")
	private WebElement selectcustomerbutton;
	public WebElement getSelectCustomerButton()
	{
		return selectcustomerbutton;
	}
	//Create WebElement for Delete Customer Actions
	@FindBy(xpath="//div[@class=\"actionButton\"]")
	private WebElement deletecustomeraction;
	public WebElement getDeleteCustomerAction()
	{
		return deletecustomeraction;
	}
	//Create WebElement for Delete Customer
	@FindBy(xpath="//div[@class=\"deleteButton\"]//div[@class=\"title\"]")
	private WebElement deletecustomer;
	public WebElement getDeleteCustomer()
	{
		return deletecustomer;
	}
	//Create WebElement for Delete Customer Permanently
	@FindBy(id="customerPanel_deleteConfirm_submitTitle")
	private WebElement deletecustomerpermanently;
	public WebElement getDeleteCustomerPermanently()
	{
		return deletecustomerpermanently;
	}
	//Create WebElement for Customer Active Status Button
	@FindBy(xpath="//div[@class=\"customerStatusButton editable active\"]")
	private WebElement customerActiveStatusButton;
	public WebElement getCustomerActiveStatusButton()
	{
		return customerActiveStatusButton;
	}
	//Create WebElement for Customer Archived Container
	@FindBy(xpath="//div[@class=\"item archivedContainer\"]")
	private WebElement archivedContainer;
	public WebElement getArchivedContainer()
	{
		return archivedContainer;
	}
	//Create WebElement for CreateProject
	@FindBy(xpath="//div[@class='item createNewProject ellipsis']")
	private WebElement newproject;
	public WebElement getNewProject()
	{
		return newproject; 
	}
	//Create WebElement for Project Name Field
	@FindBy(id="projectPopup_projectNameField")
	private WebElement projectNameField;
	public WebElement getProjectNameField()
	{
		return projectNameField; 
	}
	//Create WebElement for Project Description Field
	@FindBy(id="projectPopup_projectDescriptionField")
	private WebElement projectDescriptionField;
	public WebElement getProjectDescription()
	{
		return projectDescriptionField; 
	}
	//Create WebElement for Create Project Button
	@FindBy(id="projectPopup_commitBtn")
	private WebElement projectcommitBtn;
	public WebElement getProjectcommitBtn()
	{
		return projectcommitBtn; 
	}
	//Create WebElement for Project Status Button
	@FindBy(xpath="//div[contains(@class,'node projectNode')]//div[@class=\"editButton available\"]")
	private WebElement projectStatusButton;
	public WebElement getProjectStatusButton()
	{
		return projectStatusButton;
	}
	//Create WebElement for Delete Project Actions
	@FindBy(xpath="//div[@class=\"editProjectPanelHeader\"]//div[@class=\"actionButton\"]")
	private WebElement deleteprojectaction;
	public WebElement getDeleteProjectAction()
	{
		return deleteprojectaction;
	}
	//Create WebElement for Delete Project
	@FindBy(xpath="//div[contains(@class,\"edit_project\")]//div[@class=\"deleteButton\"]//div[@class=\"title\"]")
	private WebElement deleteproject;
	public WebElement getDeleteProject()
	{
		return deleteproject;
	}
	//Create WebElement for Delete Project Permanently
	@FindBy(id="projectPanel_deleteConfirm_submitTitle")
	private WebElement deleteprojectpermanently;
	public WebElement getDeleteProjectPermanently()
	{
		return deleteprojectpermanently;
	}
	//Create WebElement for Add New Tasks
	@FindBy(xpath="//div[@class=\"addNewTaskButtonContainer\"]")
	private WebElement addnewtask;
	public WebElement getAddNewTask()
	{
		return addnewtask;
	}
	//Create WebElement for Create New Tasks
	@FindBy(xpath="//div[@class=\"item createNewTask ellipsis\"]")
	private WebElement newtask;
	public WebElement getNewTask()
	{
		return newtask; 
	}
	//Create WebElement for New Tasks Container
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement newtaskcontainer;
	public WebElement getNewTaskContainer()
	{
		return newtaskcontainer; 
	}
	//Create WebElement for Create Tasks Button
	@FindBy(id="createTasksPopup_commitBtn")
	private WebElement taskcommitBtn;
	public WebElement getTaskscommitBtn()
	{
		return taskcommitBtn; 
	}
	//Create WebElement for Select Tasks
	@FindBy(xpath="//table[@class=\'createdTasksRowsTable\']")
	private WebElement selecttasks;
	public WebElement getSelectTasks()
	{
		return selecttasks; 
	}
	//Create WebElement for Delete Tasks Actions
	@FindBy(xpath="//div[@class=\"edit_task_sliding_panel sliding_panel\"]//div[@class=\"headerBlock\"]//div[@class=\"actionButton\"]")
	private WebElement deletetasksaction;
	public WebElement getDeleteTasksAction()
	{
		return deletetasksaction;
	}
	//Create WebElement for Delete Tasks
	@FindBy(xpath="//div[@class=\"edit_task_sliding_panel sliding_panel\"]//div[@class=\"buttonsWrapper\"]//div[@class=\"deleteButton\"]")
	private WebElement deletetasks;
	public WebElement getDeleteTasks()
	{
		return deletetasks;
	}
	//Create WebElement for Delete Tasks Permanently
	@FindBy(id="taskPanel_deleteConfirm_submitBtn")
	private WebElement deletetaskspermanently;
	public WebElement getDeleteTasksPermanently()
	{
		return deletetaskspermanently;   
	}
	//Create WebElement for Start exploring actiTIME
	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement startexploring;
	public WebElement getStartExploring()
	{
		return startexploring; 
	}
}

