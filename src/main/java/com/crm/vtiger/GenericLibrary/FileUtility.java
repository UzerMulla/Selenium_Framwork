package com.crm.vtiger.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FileUtility
{
	
	/**
	 * This method helps user to get the date from peroperty file
	 * @author Mulla
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyKey(String key) throws IOException
	{
	FileInputStream fs =  new FileInputStream(IPConstant.PROPERTY_FILEPATH);
		Properties p = new Properties();
		p.load(fs);
		return p.getProperty(key); 
		
	}
	
	/**
	 * This method helps user to get the data from JSON file
	 * @author Mulla
	 * @param jsonkey
	 * @return
	 * @throws IOException
	 * @throws ParseException
	 */
	public String getDataFromJson(String jsonkey) throws IOException, ParseException
	{
		FileReader reader = new FileReader(IPConstant.Json_path);
		JSONParser parser = new JSONParser();
		Object object = parser.parse(reader);
		JSONObject jsonobj=(JSONObject) object;
		String value=(String) jsonobj.get(jsonkey);
		return value;
		
	}
}
