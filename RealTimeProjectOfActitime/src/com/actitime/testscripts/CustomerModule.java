package com.actitime.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TasksPage;


@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void testcreatCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("createcustomer", true);
		Thread.sleep(4000);
		
		Thread.sleep(3000);
		HomePage h=new HomePage(driver);
		
		h.setTask();
		
		TasksPage t=new TasksPage(driver);
		
		t.getAddnew().click();
		t.getNewcustomer().click();
		
		FileLib f=new FileLib();
		String name = f.getExceldata("Creatcustomer", 1, 2);
		String des = f.getExceldata("Creatcustomer", 1, 3);
		SoftAssert s=new SoftAssert();
		
		
		t.getName().sendKeys(name);
		t.getDescription().sendKeys(des);
		
		t.getSelectoption().click();
		t.getourcompany().click();
		t.getCreatcustomer().click();
		Thread.sleep(2000);
		
		String actualtest = t.getEuals().getText();
		
		
		s.assertEquals(actualtest, name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
