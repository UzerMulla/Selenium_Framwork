package com.crm.vtiger.GenericLibrary;

import java.util.Date;
import java.util.Random;

/**
 * this Class contains java specific library 
 * @Uzer
 */
public class JavaUtilities 
{
   /**
    * Generate Random Number
    * @Uzer
    */
	public static String getRandomData()
	{
		Random random = new Random();
		int ran = random.nextInt(1000);
		return ""+ran;
	}
	
	/**
	 * Generate Current System Date
	 * @return 
	 * @Uzer 
	 */
	public static String getCurrentSystemDate()
	{
		Date date = new Date();
		String CurrentDate = date.toString();
		return CurrentDate;
	}
	
	/**
	 * Generate Current System Date without ':'
	 * @return 
	 * @Uzer 
	 */
	public static String getCurrentSystemDateWith_between()
	{
		Date date = new Date();
		String CurrentDate = date.toString().replace(":","_").replace(" ", "_");
		return CurrentDate;
	}
	
	
}
