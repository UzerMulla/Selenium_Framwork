package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomView 
{
  @FindBy(name="viewName")
  private WebElement viewNametb;
  
  @FindBy(name="button2")
  private WebElement saveBtn;
  
  public NewCustomView(WebDriver driver)
  {
	  PageFactory.initElements(driver, NewCustomView.class);
  }
}
