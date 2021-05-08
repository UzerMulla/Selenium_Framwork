package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Uzer
 *
 */
public class Login 
{
  @FindBy(name="user_name")
  private WebElement usernameTb;
  
  @FindBy(name="user_password")
  private WebElement passwordTb;
  
  @FindBy(id="submitButton")
  private WebElement loginBtn;
  
  public Login(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void LoginBtn(String username,String password)
  {
	  usernameTb.sendKeys(username);
	  passwordTb.sendKeys(password);
	  loginBtn.click();
  }
  
  public void LoginBtn()
  {
	  usernameTb.sendKeys("admin");
	  passwordTb.sendKeys("admin");
	  loginBtn.click();
  }

public WebElement getUsernameTb() {
	return usernameTb;
}

public WebElement getPasswordTb() {
	return passwordTb;
}

public WebElement getLoginBtn() {
	return loginBtn;
}
}
