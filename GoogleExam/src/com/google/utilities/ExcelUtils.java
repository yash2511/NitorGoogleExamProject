package com.google.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class ExcelUtils {
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFRow row;
	public static List<String> list = new ArrayList<String>();

	public static void setExcelFile(int sheetnumb) {
		String userdir = System.getProperty("user.dir");
		try {

			File file = new File(userdir + "/src/test/resources/Configuration/TestData.xlsx");

			FileInputStream inputfile = new FileInputStream(file);

			ExcelWBook = new XSSFWorkbook(inputfile);

			ExcelWSheet = ExcelWBook.getSheetAt(sheetnumb);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String setExcelFile(int row, int col) throws IOException {
	
		
	

			File file = new File("C://Users//yashodeep.patil//workspace//GoogleExam//Resources//TestData.xlsx");

			FileInputStream inputfile = new FileInputStream(file);

			ExcelWBook = new XSSFWorkbook(inputfile);

			ExcelWSheet = ExcelWBook.getSheetAt(0);
			
			ExcelUtils.setExcelFile(0);
			String value = ExcelWSheet.getRow(row).getCell(col).getStringCellValue();
			return value;
			
		
		
}
}