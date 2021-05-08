package com.crm.vtiger.GenericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import POMObjectRepository.Home;
import POMObjectRepository.Login;

public class BaseClass 
{
	
	public  WebDriver driver;
	public FileUtility fUtil = new FileUtility();
	public WebDriverutilities wd = new WebDriverutilities();
	public JavaUtilities j = new JavaUtilities();
	public ExcelUtility Ex =new ExcelUtility();
	public static WebDriver sdriver;
	
	
  @BeforeSuite(groups={"SmokeTest","RegressionTest"})
  public void ConfiqBS()
  {
	 //Connect to Database
  }
  
  @BeforeTest(groups={"SmokeTest","RegressionTest"})
  public void ConfiqBT()
  {
	  //Launch browser in parallel mode
  }
  
  @Parameters("browser")
  @BeforeClass(groups={"SmokeTest","RegressionTest"})
  public void ConfiqBC() throws IOException
  {
	  String BrowserName = fUtil.getPropertyKey("browser");
	  if(BrowserName.equalsIgnoreCase("Chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(BrowserName.equalsIgnoreCase("Firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  else if(BrowserName.equalsIgnoreCase("IE"))
	  {
		  driver=new InternetExplorerDriver();
	  }
	  
	  sdriver=driver;
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
  
  @BeforeMethod(groups={"SmokeTest","RegressionTest"})
  public void Setup() throws IOException
  {
	  String url = fUtil.getPropertyKey("url");
	  String username = fUtil.getPropertyKey("username");
	  String password = fUtil.getPropertyKey("password");
	  
	  //Navigating to the Application
	  driver.get(url);
	  //Login TO the Application
      /*
	  driver.findElement(By.name("user_name")).sendKeys(username);
      driver.findElement(By.name("user_password")).sendKeys(password);
	  driver.findElement(By.id("submitButton")).click();
	  */
	  Login login = new Login(driver);
	  login.LoginBtn(username, password);
	  //login.getUsernameTb().sendKeys(username);
	 // login.getPasswordTb().sendKeys(password);
	  //login.getLoginBtn().click();
	  
  }
  
  @AfterMethod(groups={"SmokeTest","RegressionTest"})
  public void tearDown()
  {
	 /*
	  WebElement administrator=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	  wd.MouseOver(driver, administrator);
	  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	  */
	  Home hm = new Home(driver);
	  hm.SignOutbtn();
	  
	  
  }
  
  
  @AfterClass(groups={"SmokeTest","RegressionTest"})
  public void ConfiqAC()
  {
	  driver.close();
  }
  
  
  @AfterTest(groups={"SmokeTest","RegressionTest"})
  public void ConfiqAT()
  {
	  //Close Driver ref in Parallel mode
  }
  
  @AfterSuite(groups={"SmokeTest","RegressionTest"})
  public void ConfiqAS()
  {
	  //Disconenct to Database
  }
}
