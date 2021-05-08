package Prac;

import org.testng.annotations.Test;

import com.crm.vtiger.GenericLibrary.ExcelUtility;

public class sdjb 
{
	@Test
   public  void ASdf() throws Throwable
   {
		ExcelUtility Ex = new ExcelUtility();
		String OrgName = Ex.getExcelData("org","TC_33", "Org_Name");
		 String ContName = Ex.getExcelData("contact", "TC_33", "contact");
		 System.out.println(OrgName);
   }
}
