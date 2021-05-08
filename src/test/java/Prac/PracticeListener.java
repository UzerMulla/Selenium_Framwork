package Prac;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericLibrary.BaseClass;

@Listeners(com.crm.vtiger.GenericLibrary.ListImgClass.class)
public class PracticeListener extends BaseClass 
{
	@Test
   public void CreatOrg()
   {
	   System.out.println("Execute CreateOrg test:");
	   System.out.println(10/0);
   }
   
	//@Test
   public void CreatOrgWithContact()
   {
	   System.out.println("Execute CreateOrgWithContact test:");
	   System.out.println(10/0);
   }
}
