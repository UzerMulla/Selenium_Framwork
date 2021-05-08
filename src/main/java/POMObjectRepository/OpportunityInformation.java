package POMObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityInformation 
{
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement OppoInfoText;
	
	@FindBy(id="dtlview_Opportunity Name")
	private WebElement OppoName;
	
	public WebElement getOppoName() {
		return OppoName;
	}

	public OpportunityInformation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOppoInfoText() {
		return OppoInfoText;
	}

}
