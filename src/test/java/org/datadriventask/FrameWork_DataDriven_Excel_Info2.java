package org.datadriventask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclassforexcel.Base_Class;

public class FrameWork_DataDriven_Excel_Info2 extends Base_Class {

	public static void main(String[] args) throws Exception {

		excelWrite2(11, 0, "TestKumar");
		System.out.println("test1");
	}

}
