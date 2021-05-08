package Opportunity;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.crm.vtiger.GenericLibrary.BaseClass;

public class TC_32_SearchWithDropdownExpectedCloseDate_Test extends BaseClass
{
@Test(groups="SmokeTest")
public void AdvanceSearch() throws IOException
{
		 //Step 1: Place the mouse cursor on "Opportunities"  Link
		 driver.findElement(By.linkText("Opportunities")).click();
		 
		 //Step 2: naviagate to "create new Opportunity"page by click on "+" image
		 driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
		 
		//Step 3: create a Opportunity with mandatory fields
		 //Opportunity name
		 driver.findElement(By.name("potentialname")).sendKeys(fUtil.getPropertyKey("OrgName"));
		 
		 //Related to
		  WebElement RelatedTo = driver.findElement(By.id("related_to_type"));
		  wd.SelectByValue(RelatedTo, "Contacts");
		  driver.findElement(By.xpath("//img[@title='Select']")).click();
		  wd.SwitchToWindow(driver, "Contacts");
		  driver.findElement(By.linkText(fUtil.getPropertyKey("ContName"))).click();
		  wd.SwitchToWindow(driver, "Potentials");
		  
		  //Assigned to
		  driver.findElement(By.xpath("//input[@type='radio']")).click();
		  
		  //Sales Stage
		  WebElement SalesStage = driver.findElement(By.name("sales_stage"));
		  wd.SelectByValue(SalesStage, "Prospecting");
		  
		  //save
		  driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		  
		  //Step 4:Place the mouse cursor on "Advance Search "  Link
		  //navigating to Oppoutunity Page
		  driver.findElement(By.linkText("Opportunities")).click();
		  
		  driver.findElement(By.linkText("Go to Advanced Search")).click();
		  
		  
}

}
