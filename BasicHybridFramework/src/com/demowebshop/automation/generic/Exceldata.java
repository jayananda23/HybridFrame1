package com.demowebshop.automation.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Exceldata 
{
	public  static Object[][]getdata(String Sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./excel/Testdata.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet(Sheet);
		int actual_row = sh.getPhysicalNumberOfRows();
		int actual_cell = sh.getRow(0).getPhysicalNumberOfCells();
		Object[][] arr=new Object[actual_row-1][actual_cell];
		for(int i=0;i<actual_row-1;i++)
		{
			for(int j=0;j<actual_cell;j++)
			{
				arr[i][j] =sh.getRow(i+1).getCell(j).toString();
			}
		}
		return arr;
	}
}	
//	C:\\Users\\Admin\\Desktop\\Book1.xlsx