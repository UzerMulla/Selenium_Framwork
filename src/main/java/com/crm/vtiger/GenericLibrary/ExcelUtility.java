package com.crm.vtiger.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility 
{
	
	/**
	 * This method helps user to get the data from excel file
	 * @author Mulla
	 * @param Sheetname
	 * @param rownum
	 * @param cellnum
	 * @return value
	 * @throws Throwable
	 */
   public String getExcelData(String Sheetname, int rownum, int cellnum) throws Throwable
   {
	   FileInputStream file = new FileInputStream(IPConstant.Excel_path);
	   Workbook wb = WorkbookFactory.create(file);
	   Sheet sheet = wb.getSheet(Sheetname);
	   Row row = sheet.getRow(rownum);
	   Cell cell = row.getCell(cellnum);
	   String value = cell.getStringCellValue();
	   return value;   
   }
   
   /**
    * This method helps user to get the data from excel file
    * @author Mulla
    * @param sheetname
    * @param tcID
    * @param headervalue
    * @return value
    * @throws Throwable
    * @throws Throwable
    */
   public String getExcelData(String sheetname, String tcID , String headervalue) throws Throwable, Throwable
   {
	   FileInputStream file = new FileInputStream(IPConstant.Excel_path);
	   Workbook wb = WorkbookFactory.create(file);
	   Sheet sheet = wb.getSheet(sheetname);
	   int lastrow = sheet.getLastRowNum();
	   int expectedrow=0;
	   
	   for(int i=0;i<lastrow;i++)
	   {
		   String testcaseID = sheet.getRow(i).getCell(0).getStringCellValue();
		   if(testcaseID.equalsIgnoreCase(tcID))
		   {
			   expectedrow=i;
			   break;
		   }
	   }
	   expectedrow--;
	   
	   int expectedColumn=0;
	   int lastcell = sheet.getRow(expectedrow).getLastCellNum();
	   
	   for(int j=0;j<lastcell;j++)
	   {
		   String value = sheet.getRow(expectedrow).getCell(j).getStringCellValue();
		   if(value.equalsIgnoreCase(headervalue))
		   {
			   expectedColumn=j;
			   break;
		   }
	   }
	   
	  return sheet.getRow(expectedrow+1).getCell(expectedColumn).getStringCellValue();
	   
   }
   
   /**
    * This method helps user to write the data into excel file
    * @param Sheetname
    * @param row
    * @param cell
    * @param value
    * @throws Throwable
    * @throws Exception
    */
   public void writeExcelData(String Sheetname, int row,int cell,String value) throws Throwable, Exception
   {
	   FileInputStream file = new FileInputStream(IPConstant.Excel_path);
	   Workbook wb = WorkbookFactory.create(file);
	   wb.createSheet(Sheetname).createRow(row).createCell(cell).setCellValue(value);
	   FileOutputStream writefile=new FileOutputStream(IPConstant.Excel_path);
	   wb.write(writefile);
	   
   }
   
   
}
