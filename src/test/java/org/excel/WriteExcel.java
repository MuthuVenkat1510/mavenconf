package org.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\MUGILAN\\eclipse-workspace\\MavenConf\\ExcelFile\\writeexcel.xlsx");
	Workbook book = new XSSFWorkbook();
	Sheet sh = book.createSheet("data");
	Row r = sh.createRow(0);
	Cell c = r.createCell(0);
	c.setCellValue("student");
	FileOutputStream file = new FileOutputStream(f);
	book.write(file);
	System.out.println("done");
	
	
	
}
}
