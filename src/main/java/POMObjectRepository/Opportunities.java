package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opportunities 
{
	
	public Opportunities(WebDriver driver)
	 {
		 PageFactory.initElements(driver, Opportunities.class);
	 }
	
  @FindBy(xpath="//img[@title='Create Opportunity...']")
  private WebElement AddBtn;
  
  @FindBy(linkText="Create Filter")
  private WebElement CreatFilterBtn;
  
  @FindBy(linkText="Edit")
  private WebElement EditBtn;
  
  @FindBy(linkText="Delete")
  private WebElement DeleteBtn;
  
  @FindBy(linkText="Go to Advanced Search")
  private WebElement AdvanceSearchBtn;
  
  @FindBy(name="fcol0")
  private WebElement AdvanceSearchDD1;
  
  @FindBy(name="fop0")
  private WebElement AdvanceSearchDD2;
  
  @FindBy(id="fval0")
  private WebElement AdvanceSearchTb;
  
  
  
  public void AddOppoBtn() 
  {
	AddBtn.click();
  }


public WebElement getCreatFilterBtn() {
	return CreatFilterBtn;
}


public WebElement getEditBtn() {
	return EditBtn;
}


public WebElement getDeleteBtn() {
	return DeleteBtn;
}


public WebElement getAdvanceSearchBtn() {
	return AdvanceSearchBtn;
}


public WebElement getAdvanceSearchDD1() {
	return AdvanceSearchDD1;
}


public WebElement getAdvanceSearchDD2() {
	return AdvanceSearchDD2;
}


public WebElement getAdvanceSearchTb() {
	return AdvanceSearchTb;
}


  
 
  
}
