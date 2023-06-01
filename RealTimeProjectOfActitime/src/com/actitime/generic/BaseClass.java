package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	
	 public static WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		
		Reporter.log("openbrowser", true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
	}
	
	
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closetheBrowser", true);
		driver.close();
	}
	
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
		Reporter.log("login", true);
		
		FileLib f=new FileLib();
		String url = f.getPropertydata("url");
		String un = f.getPropertydata("username");
		String pw = f.getPropertydata("password");
		
driver.get(url);
		
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pw);
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void logout() throws InterruptedException 
	{
		Reporter.log("logout", true);
		
		HomePage h=new HomePage(driver);
		Thread.sleep(2000);
		h.setLogout();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
