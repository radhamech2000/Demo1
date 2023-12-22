package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReaderByColumnNumber {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\GKB Family\\Radhika\\Automation-Selenium\\supportDocuments\\datadrivenExcel.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		String str = cell.getStringCellValue();
		System.out.println(str);
		/*
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(3);
		double no = cell.getNumericCellValue();
		System.out.println(no);
		*/
		
		wb.close();
		fis.close();

	}

}
