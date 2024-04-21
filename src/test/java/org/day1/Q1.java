package org.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q1 {
	public static int count = 0;

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MUGILAN\\eclipse-workspace\\MavenConf\\ExcelFile\\StudentsDetails.xlsx");
		FileInputStream data = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(data);
		Sheet sheet = book.getSheet("sheet1");
		int totalRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total NO of Rows" + totalRows);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell c = row.getCell(j);
				System.out.println(c);
				count = count + 1;
			}
		}
		System.out.println("Total no of Cells" + count);
	}
}
