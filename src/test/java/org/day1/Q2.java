package org.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MUGILAN\\eclipse-workspace\\MavenConf\\ExcelFile\\StudentsDetails.xlsx");
		FileInputStream file = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(file);
		Sheet sh = book.getSheet("sheet1");
		for (int i = 0; i <sh.getPhysicalNumberOfRows(); i++) {
			Row r = sh.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				if (cellType==1) {
					String value = c.getStringCellValue();
					System.out.println(value);
					
				}else if (DateUtil.isCellDateFormatted(c)) {
					Date value = c.getDateCellValue();
					SimpleDateFormat date = new SimpleDateFormat("dd-mmm-yyyy");
					System.out.println(date);
				}else {
					double dd = c.getNumericCellValue();
					long l = (long) dd;
					System.out.println(dd);
				}
			}
			
		}
	}

}
