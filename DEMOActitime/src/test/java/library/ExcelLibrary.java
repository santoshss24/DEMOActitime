package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary 
{
	public static Object[][] getData(String path,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fin=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fin);
		
		Sheet sheet = wb.getSheet(sheetName);
		
		Object[][] arr=new Object[sheet.getPhysicalNumberOfRows()][2];
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
				
			 arr[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return arr;
	}
	
	public static String getValue(String path, String sheetName,int r,int c) throws EncryptedDocumentException, IOException
	{
		FileInputStream fin=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fin);
		
		Sheet sheet = wb.getSheet(sheetName);
		
		String value=sheet.getRow(r).getCell(c).getStringCellValue();
		
		return value;
	}
			
}
