package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {

	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement name;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement description;
	
	@FindBy(xpath = "(//div[text()='- Select Customer -'])[1]")
	private WebElement selectoption;
	
	@FindBy(xpath = "//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement ourcompany;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement creatcustomer;
	
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']")
	private WebElement euals;
	
	
	public WebElement getEuals() {
		return euals;
	}




	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}




	public WebElement getAddnew() {
		return addnew;
	}




	public WebElement getNewcustomer() {
		return newcustomer;
	}




	public WebElement getName() {
		return name;
	}




	public WebElement getDescription() {
		return description;
	}




	public WebElement getSelectoption() {
		return selectoption;
	}




	public WebElement getourcompany() {
		return ourcompany;
	}




	public WebElement getCreatcustomer() {
		return creatcustomer;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
