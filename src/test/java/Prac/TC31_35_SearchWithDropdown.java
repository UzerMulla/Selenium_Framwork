package Prac;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericLibrary.BaseClass;

public class TC31_35_SearchWithDropdown extends BaseClass
{
	
	 @Test
	 public void SearchWithDropdownRelatedTo() throws IOException
	 { 
		 //Step 1: Place the mouse cursor on "Opportunities"  Link
		 driver.findElement(By.linkText("Opportunities")).click();
		 
		 //Step 2: naviagate to "create new Opportunity"page by click on "+" image
		 driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
		 
		 //Step 3: create a Opportunity with mandatory fields
		 //Opportunity name
		 String Name=fUtil.getPropertyKey("OrgName")+j.getRandomData();
		 driver.findElement(By.name("potentialname")).sendKeys(Name);
		 
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
		  
		  //Step 4:Place the mouse cursor on "Create Filter "  Link
		  driver.findElement(By.linkText("Opportunities")).click();
		  
		  driver.findElement(By.linkText("Create Filter")).click();
		  
		  //Step 5:After filling all "Mandatory Fields" click on "save" Button
		  
		  driver.findElement(By.name("viewName")).sendKeys(fUtil.getPropertyKey("ViewName"));
		  driver.findElement(By.name("button2")).click();
		  
		  //Step 6: Click on "Editfilter"
		  driver.findElement(By.linkText("Edit")).click();
		  
		  //Step 7:Click on "Editdelete"
		  driver.navigate().back();
		  driver.findElement(By.linkText("Delete")).click();
		  wd.AlertAccept(driver);
	 }

	 @Test
	 public void SearchWithDropdownExpectedCloseDate() throws IOException
	 {
	 		 //Step 1: Place the mouse cursor on "Opportunities"  Link
	 		 driver.findElement(By.linkText("Opportunities")).click();
	 		 
	 		 //Step 2: naviagate to "create new Opportunity"page by click on "+" image
	 		 driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
	 		 
	 		//Step 3: create a Opportunity with mandatory fields
	 		 //Opportunity name
	 		String Name=fUtil.getPropertyKey("OrgName")+j.getRandomData();
	 		 driver.findElement(By.name("potentialname")).sendKeys(Name);
	 		 
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
	 
	 @Test
	 public void SearchWithDropdownAssignedTo() throws Throwable
	 {

	 		 //Step 1: Place the mouse cursor on "Opportunities"  Link
	 		 driver.findElement(By.linkText("Opportunities")).click();
	 		 
	 		 //Step 2: naviagate to "create new Opportunity"page by click on "+" image
	 		 driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
	 		 
	 		//Step 3: create a Opportunity with mandatory fields
	 		 //Opportunity name
	 		 String OrgName = fUtil.getPropertyKey("OrgName")+j.getRandomData();;
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
	 
	 @Test
	 public void SearchWithDropdownSalesStage() throws IOException 
	 { 
	 		 //Step 3: Place the mouse cursor on "Opportunities"  Link
	 		 driver.findElement(By.linkText("Opportunities")).click();
	 		 
	 		 //Step 4: naviagate to "create new Opportunity"page by click on "+" image
	 		 driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
	 		 
	 		//Step 5: create a Opportunity with mandatory fields
	 		 //Opportunity name
	 		 String OrgName = fUtil.getPropertyKey("OrgName")+j.getRandomData();;
	 		 String ContName = fUtil.getPropertyKey("ContName");
	 		 
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
	 		  
	 		  //Step 6:Place the mouse cursor on "Advance Search "  Link
	 		  //navigating to Oppoutunity Page
	 		  driver.findElement(By.linkText("Opportunities")).click();
	 		  
	 		  driver.findElement(By.linkText("Go to Advanced Search")).click();
	 		  
	 		  //Step 7: SearchWithDropdown "RelatedTo "
	 		  WebElement DropDown = driver.findElement(By.name("fcol0"));
	 		  wd.SelectByVisibleText(DropDown, "Related To");
	 		  
	 		  driver.findElement(By.xpath("(//input[@value=' Search Now '])[2]")).click();
	 		  //alert Pop up
	 		  wd.AlertAccept(driver);
	 		  
	 		  //Step8:SearchWithDropdown "RelatedTo " Dropdown "Equals"
	 		  //Related DropDown
	 		  wd.SelectByVisibleText(DropDown, "Related To");
	 		  
	 		  //Equals DropDown
	 		  WebElement CompareDD = driver.findElement(By.id("fop0"));
	 		  wd.SelectByVisibleText(CompareDD, "equals");
	 		  
	 		  //Step 9: After filling all "Fields" click on "Search Now" Button
	 		  String Tc_ComName = fUtil.getPropertyKey("TC_compareName");
	 		  driver.findElement(By.id("fval0")).sendKeys(Tc_ComName);
	 		  driver.findElement(By.xpath("(//input[@value=' Search Now '])[2]")).click();
	 		  
	 		  
	 }
	 
	 @Test
	 public void SearchWithDropdownRelatedToandSecondDropdownEqual() throws IOException
	 {
	 		 //Step 3: Place the mouse cursor on "Opportunities"  Link
	 		 driver.findElement(By.linkText("Opportunities")).click();
	 		 
	 		 //Step 4: naviagate to "create new Opportunity"page by click on "+" image
	 		 driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
	 		 
	 		//Step 5: create a Opportunity with mandatory fields
	 		 //Opportunity name
	 		 String OrgName = fUtil.getPropertyKey("OrgName")+j.getRandomData();;
	 		 String ContName = fUtil.getPropertyKey("ContName");
	 		 
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
	 		  
	 		  //Step 6:Place the mouse cursor on "Advance Search "  Link
	 		  //navigating to Oppoutunity Page
	 		  driver.findElement(By.linkText("Opportunities")).click();
	 		  
	 		  driver.findElement(By.linkText("Go to Advanced Search")).click();
	 		  
	 		  //Step 7: SearchWithDropdown "RelatedTo "
	 		  WebElement DropDown = driver.findElement(By.name("fcol0"));
	 		  wd.SelectByVisibleText(DropDown, "Related To");
	 		  
	 		  driver.findElement(By.xpath("(//input[@value=' Search Now '])[2]")).click();
	 		  //alert Pop up
	 		  wd.AlertAccept(driver);
	 		  
	 		  //Step8:SearchWithDropdown "RelatedTo " Dropdown"NotEquals"
	 		  //RelatedTo DropDown
	 		  wd.SelectByVisibleText(DropDown, "Related To");
	 		  
	 		  //NotEquals DropDown
	 		  WebElement CompareDD = driver.findElement(By.id("fop0"));
	 		  wd.SelectByVisibleText(CompareDD, "not equal to");
	 		  
	 		  //Step 9: After filling all "Fields" click on "Search Now" Button
	 		  String Tc_ComName = fUtil.getPropertyKey("TC_compareName");
	 		  driver.findElement(By.id("fval0")).sendKeys(Tc_ComName);
	 		  
	 		  driver.findElement(By.xpath("(//input[@value=' Search Now '])[2]")).click();
	 }
}
