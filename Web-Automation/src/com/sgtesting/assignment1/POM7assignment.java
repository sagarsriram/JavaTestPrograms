package com.sgtesting.assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM7assignment {

	protected static WebDriver getbrowser=null;
	protected static POMactitimeDemo getpage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
		logout();
		closeBrowser(); 
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\TestAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			getbrowser= new ChromeDriver();
			getbrowser.manage().window().maximize();
			getpage=new POMactitimeDemo(getbrowser);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			getbrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			getpage.getusername().sendKeys("admin");
			getpage.getpasswordlogin().sendKeys("manager");
			getpage.getloginbutton().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			getpage.getminimizepanelid().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createCustomer()
	{
		try
		{
			getpage.gettaskRadioButton().click();Thread.sleep(1000);
			getpage.getaddCstmrorProjectRadioButton().click();
			getpage.getaddCustomrtRadioButton().click();
			getpage.getCustomernamefield().sendKeys("customer1");
			Thread.sleep(1000);
			getpage.getcustomercreationcommitbutton().click(); Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void createProject()
	{
		try
		{
			getpage.getaddCstmrorProjectRadioButton().click();Thread.sleep(1000);
			getpage.getaddProjectRadioButton().click();Thread.sleep(1000);
			getpage.getProjectnamefield().sendKeys("New-project");Thread.sleep(1000);
			getpage.getProjectcreationcommitbutton().click();Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createTask()
	{
		try
		{
			getpage.getaddTaskRadioButton().click();Thread.sleep(1000);
			getpage.getaddTaskCreateRadioButton().click();Thread.sleep(1000);
			getpage.getTaskInsertontablerow1().sendKeys("Task-1");
			getpage.getTaskInsertontablerow2().sendKeys("Task-2");
			getpage.getTaskcreatedconfirmationButton().click();Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteTask()
	{
		try
		{
			getpage.getTaskSelectionfromtabletask1().click();Thread.sleep(1000);
			getpage.getTaskSelectedActionButton().click();Thread.sleep(1000);
			getpage.getTaskSelectedDeleteButton().click();Thread.sleep(1000);
			getpage.getTaskSelectedDeleteConfirmationButton().click();Thread.sleep(1000);
			getbrowser.navigate().refresh();Thread.sleep(2000);

			getpage.getTaskSelectionfromtabletask2().click();Thread.sleep(1000);
			getpage.getTaskSelectedActionButton().click();Thread.sleep(1000);
			getpage.getTaskSelectedDeleteButton().click();Thread.sleep(1000);
			getpage.getTaskSelectedDeleteConfirmationButton().click();Thread.sleep(1000);
			getbrowser.navigate().refresh();Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			getpage.getlogoutLink().click();Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeBrowser()
	{
		try
		{	
			getbrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}