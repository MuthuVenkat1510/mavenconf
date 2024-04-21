package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcel {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MUGILAN\\eclipse-workspace\\MavenConf\\ExcelFile\\SampleExcel.xlsx");
		FileInputStream data = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(data);
		Sheet sh = book.getSheet("sheet1");
		Row r = sh.getRow(1);
		Cell c = r.getCell(1);
		System.out.println(c);
		System.out.println("\n\n\nBy Using for loop\n======== ");
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);

			}
		}

	}
}
