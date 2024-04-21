package org.excel;

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

public class Sample2 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MUGILAN\\eclipse-workspace\\MavenConf\\ExcelFile\\SampleExcel.xlsx");
		FileInputStream data = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(data);
		Sheet sh = book.getSheet("sheet1");
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd-mmm-yyyy");
					String value = sim.format(dateCellValue);
					System.out.println(value);
					
				}
				else {
					double dd = cell.getNumericCellValue();
					long l =(long) dd;
					System.out.println(l);
					String value = String.valueOf(l);
					System.out.println(value);
					
				}
			}
		}

	}

}
