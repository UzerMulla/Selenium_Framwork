package Prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericLibrary.WebDriverutilities;

public class Calender 
{
	WebDriverutilities wd = new WebDriverutilities();
	WebDriver driver;
 @Test
 public void CreateFilter()
 {
	 //Step 0:Opening the Browser
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 wd.ImpliciteWait(driver);
	 
	 //Step 1:navigate to application
	 driver.get("http://localhost:8888/");
	 
	 //Step 2: Login to Application
	 driver.findElement(By.name("user_name")).sendKeys("admin");
	 driver.findElement(By.name("user_password")).sendKeys("admin");
	 driver.findElement(By.id("submitButton")).click();
	 
	 //Step 3: Place the mouse cursor on "Opportunities"  Link
	 driver.findElement(By.linkText("Opportunities")).click();
	 
	 //Step 4: naviagate to "create new Opportunity"page by click on "+" image
	 driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
	 
	 //Step 5: create a Opportunity with mandatory fields
	  
	 
	 //expected Close Date
	 driver.findElement(By.id("jscal_trigger_closingdate")).click();
	 WebElement YearClick = driver.findElement(By.xpath("//td[@class='button nav']"));
	 WebElement MonthClick = driver.findElement(By.xpath("(//td[@class='button nav'])[2]"));
	
	 //driver.findElement(By.linkText(linkText))
	 int count=0;
	 
	 //driver.findElement(By.xpath("//input[@Value='2019-01-09']"));
	 
	 while(count<11)
	  {
	   try 
	   {
		   driver.findElement(By.xpath("//input[@Value='2016-04-29']")).click();
	    break;
	   }
	   
	   catch(Exception e) 
	   {
	    driver.findElement(By.xpath("//td[@class='button nav']")).click();
	    count++;
	   }
	   
	  }
	 
	
}
}