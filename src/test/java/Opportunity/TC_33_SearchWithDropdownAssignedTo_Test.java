package Opportunity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.crm.vtiger.GenericLibrary.BaseClass;

public class TC_33_SearchWithDropdownAssignedTo_Test extends BaseClass
{
@Test(groups="SmokeTest")
public void AdvanceSearchRelatedTo() throws Throwable
{
	     //Step 1: Place the mouse cursor on "Opportunities"  Link
		 driver.findElement(By.linkText("Opportunities")).click();
		 
		 //Step 2: naviagate to "create new Opportunity"page by click on "+" image
		 driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
		 
		//Step 3: create a Opportunity with mandatory fields
		 //Opportunity name
		 //String OrgName = Ex.getExcelData("org","TC_33", "Org_Name");
		 //String ContName = Ex.getExcelData("contact", "TC_33", "contact");
		 String OrgName = fUtil.getPropertyKey("OrgName")+j.getRandomData();
 		 String ContName =fUtil.getPropertyKey("ContName");
		 
		 driver.findElement(By.name("potentialname")).sendKeys(OrgName);
		 
		 //Related to
		  WebElement RelatedTo = driver.findElement(By.id("related_to_type"));
		  wd.SelectByValue(RelatedTo, "Contacts");
		  driver.findElement(By.xpath("//img[@title='Select']")).click();
		  wd.SwitchToWindow(driver, "Contacts");
		  driver.findElement(By.linkText(ContName)).click();
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
		  
		  //Step 5: SearchWithDropdown "RelatedTo "
		  WebElement DropDown = driver.findElement(By.name("fcol0"));
		  wd.SelectByVisibleText(DropDown, "Assigned To");
		  driver.findElement(By.xpath("(//input[@value=' Search Now '])[2]")).click();
		  wd.AlertAccept(driver);
		 
}
}