package com.crm.vtiger.GenericLibrary;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * THis class contains webdriver specific generic methods 
 * @Uzer
 *
 */
public class WebDriverutilities
{
  
	/**
   * This method wait for 20 sec for page loading
   * @param driver
   */
	
	public void ImpliciteWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/**
	 * @param element 
	 * @throws InterruptedException 
	 * 
	 * 
	 */
	public void waitAndClick(WebElement element) throws InterruptedException
	{
		int count=0;
		while(count>40)
		{
			try {
				element.click();
				break;
			}
			catch(Throwable e)
			{
				Thread.sleep(5000);
				count++;
			}
		}
	}
	
	/**
	 * this methods enables user to handle dropdown using visible text
	 * @param element
	 * @param option
	 */
	
	public void SelectByVisibleText(WebElement element ,String Text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(Text);
	}
	
	/**
	 * this methods enables user to handle dropdown using visible text
	 * @param element
	 * @param index
	 */
	public void SelectByIndex(WebElement element ,int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	/**
	 * this methods enables user to handle dropdown using value
	 * @param element
	 * @param value
	 */
	public void SelectByValue(WebElement element ,String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	/**
	 * this method enables user to handle mouse over 
	 * @param driver
	 * @param target
	 */
	public void MouseOver(WebDriver driver , WebElement target)
	{
		Actions a = new Actions(driver);
		a.moveToElement(target).build().perform();		
	}
	
	/**
	 * this method enables user to handle Double click 
	 * @param driver
	 * @param target
	 */
	public void DoubleClick(WebDriver driver , WebElement target)
	{
		Actions a = new Actions(driver);
		a.doubleClick(target).build().perform();		
	}
	
	/**
	 * this method enables user to handle Double click 
	 * @param driver
	 * @param target
	 */
	public void RightClick(WebDriver driver , WebElement target)
	{
		Actions a = new Actions(driver);
		a.contextClick(target).perform();		
	}
	
	
	/**
	 * Accept alert method
	 * @param driver
	 */
	public void AlertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * Dismiss alert method
	 * @param driver
	 */
	public void AlertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * this method helps user to handle the mulptiple windows
	 * @param driver
	 * @param PartialWinTitle
	 */
	 public void SwitchToWindow(WebDriver driver, String PartialWinTitle)
	 {
		 Set<String> window = driver.getWindowHandles();
		 Iterator<String> it = window.iterator();
		 while(it.hasNext())
		 {
			 String winId=it.next();
			 String title = driver.switchTo().window(winId).getTitle();
			 if(title.contains(PartialWinTitle)) 
			 {
				 break;
			 }
		 }
		 
	 }
	 
	 /**
	  * this method is enable user to switch to parent window
	  * 
	  */
	 public void SwitchToParent(WebDriver driver)
	 {
		 driver.switchTo().defaultContent();
	 }
	 
	 /**
	  * 
	  * 
	  * 
	  */
	 public void SwitchToFrame(WebDriver driver)
	 {
		 driver.switchTo().frame(1);
	 }
}
