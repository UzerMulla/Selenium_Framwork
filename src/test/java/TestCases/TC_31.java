package TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericLibrary.BaseClass;

import POMObjectRepository.CreateNewOpportunity;
import POMObjectRepository.Home;
import POMObjectRepository.Opportunities;
import POMObjectRepository.OpportunityInformation;

public class TC_31 extends BaseClass
{
   @Test
   public void CreateOrg() throws IOException
   {
	   //Navigating to the Opportunity Page
	   Home hm = new Home(driver);
	   hm.OpportunityBtn();
	   
	   String OppoName=fUtil.getPropertyKey("OppoName")+j.getRandomData();
	   String ContactName = fUtil.getPropertyKey("ContName");
	   
	   //Navigating to the Create Oppoutunit Page
	   Opportunities oppo=new Opportunities(driver);
	   oppo.AddOppoBtn();
	   
	   //Createing the Opportunity with manadatory Fields  with the Contact Name 
	   CreateNewOpportunity CreateNewOppo = new CreateNewOpportunity(driver);
	   CreateNewOppo.CreateNewOpportunity(OppoName,"Contacts","Contacts", ContactName, "Potentials", "Prospecting");
 	   
	   //Varification
	   OpportunityInformation OppoInfo=  new OpportunityInformation(driver);
	   String ActOppoInfo = OppoInfo.getOppoInfoText().getText();
	   Assert.assertTrue(ActOppoInfo.contains(OppoName));
	   
	   String ActOppoName =OppoInfo.getOppoName().getText();
	   Assert.assertEquals(ActOppoName,OppoName);
			   
	   hm.OpportunityBtn();
   
   
   
   }
}
