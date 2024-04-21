package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReWriteExcel {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MUGILAN\\eclipse-workspace\\MavenConf\\ExcelFile\\writeexcel.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("data");
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		if (value.equals("student")) {
			c.setCellValue("Staff");

		} else {
			c.setCellValue("Name");
		}
		FileOutputStream fiout = new FileOutputStream(f);
		book.write(fiout);
		System.out.println("done");

	}

}
