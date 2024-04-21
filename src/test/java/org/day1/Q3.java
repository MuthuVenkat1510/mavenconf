package org.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q3 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MUGILAN\\eclipse-workspace\\MavenConf\\ExcelFile\\StudentsDetails.xlsx");
		FileInputStream file = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(file);
		Sheet sh = book.getSheet("sheet1");
		Row r = sh.createRow(11);
		for (int i = 0; i < 6; i++) {
			Cell c = r.createCell(i);
			String[] s = new String [5];
			s[0]="abc";
			s[1]="cvbh";
			s[2]="a3bc";
			s[3]="cv2bh";
			s[4]="ab1c";
			for (int j = 0; j <s.length; j++) {			
				System.out.println(s[3]);
		        c.setCellValue(s[j]);	
			}
		}
		FileOutputStream files = new FileOutputStream(f);
		book.write(files);
		System.out.println("done");
	}

	
	}


