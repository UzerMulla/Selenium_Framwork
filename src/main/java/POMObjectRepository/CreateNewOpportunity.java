package POMObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericLibrary.WebDriverutilities;
/**
 * 
 * @author Uzer
 *
 */
public class CreateNewOpportunity extends WebDriverutilities
{
	WebDriver driver;

 
 
 @FindBy(name="potentialname")
 private WebElement OpportunityNametb;
 
 @FindBy(id="related_to_type")
 private WebElement RelatedToDD;
 
 @FindBy(xpath="//img[@title='Select']")
 private WebElement RelatedToSelectbtn;
 
 @FindBy(xpath="//input[@type='radio']")
 private WebElement AssignedToUserCB;
 
 @FindBy(name="sales_stage")
 private WebElement saleStageDD;
 
 @FindBy(xpath="input[@title='Save [Alt+S]']")
 private WebElement saveBtn;
 
 public CreateNewOpportunity(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 /**
  * Helps user to create Oppourtunity with mandatory field
  * @param OppoName
  * 
  * 
  */
  public void CreateNewOpportunity(String OppoName,String RelatedDropDown,String ChildWindowText,String Cont_Org_Name,String ParentWindowText,String SalesStageDDname)
  {
	  OpportunityNametb.sendKeys(OppoName);
	 SelectByVisibleText(RelatedToDD, RelatedDropDown);
	  RelatedToSelectbtn.click();
	  SwitchToWindow(driver, ChildWindowText);
	  driver.findElement(By.linkText(Cont_Org_Name)).click();
	  SwitchToWindow(driver, ParentWindowText);
	  AssignedToUserCB.click();
	  SelectByVisibleText(saleStageDD, SalesStageDDname);
	  saveBtn.click();
  }
 
 
}


