package com.crm.vtiger.GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImgClass implements ITestListener
{
  public void onTestFailure(ITestResult result)
  {
	  String failedTestName = result.getMethod().getMethodName();
	  String DateTime = new Date().toString().replace(":","_").replace(" ", "_");
	  
	  EventFiringWebDriver ed=new EventFiringWebDriver(BaseClass.sdriver);
	  File srcImg = ed.getScreenshotAs(OutputType.FILE);
	  File destImg = new File("./Screenshot/"+failedTestName+DateTime+".png");
	  try {
		  FileUtils.copyFile(srcImg, destImg);
	  }
	  catch(IOException e)
	  {
		  
	  }
  }
}
