package Prac;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericLibrary.BaseClass;

public class Login extends BaseClass
{ 
	@Test
	 public void CreateFilter() throws Exception 
	 {
		 
		driver.findElement(By.linkText("Opportunities")).click();
		 
		// driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
		// Thread.sleep(4000);
	 }
	
}
