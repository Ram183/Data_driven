package org.datadriventask;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tools.ant.Main;
import org.baseclassforexcel.Base_Class;

public class FrameWork_DataDriven_Excel_Info {

	public static void main(String[] args) throws Exception {

		File f = new File("C:\\Users\\Ram\\eclipse-workspace\\Data_Driven\\Excel_File\\Excel_DataDriven.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook w = new XSSFWorkbook(fis);

		XSSFSheet sheet = w.getSheetAt(0);

		int row = sheet.getPhysicalNumberOfRows();

		System.out.println("No of Rows in Excel: " + row);

		XSSFRow r = sheet.getRow(0);

		int cells = r.getPhysicalNumberOfCells();

		System.out.println("No of Cells in Excel: " + cells);

	}
}
