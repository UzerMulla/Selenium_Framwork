package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericLibrary.WebDriverutilities;
/**
 * 
 * @author Mulla
 *
 */
public class Home extends WebDriverutilities
{
	WebDriver driver;
	@FindBy(linkText="Opportunities")
	private WebElement Opportunitybtn;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrator;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement SignOutbtn;
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void OpportunityBtn()
	{
		Opportunitybtn.click();
	}

	public WebElement getAdministrator() {
		return administrator;
	}

	public void SignOutbtn()
	{
		MouseOver(driver, getAdministrator());
		SignOutbtn.click();
	}
	

}
