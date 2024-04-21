package org.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rough {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MUGILAN\\eclipse-workspace\\MavenConf\\ExcelFile\\StudentsDetails.xlsx");
		FileInputStream file = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(file);
		Sheet sh = book.getSheet("sheet1");
		Row r = sh.createRow(11);
		Cell c = r.createCell(0);
		c.setCellValue("adck");
		FileOutputStream files = new FileOutputStream(f);
		book.write(files);
		System.out.println("done");
	}
}