package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Mock8 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("file path");
		
		FileInputStream stream = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(stream);
		
		Sheet s = w.getSheet("sheet name");
		
		//Row r = s.getRow(1);
		
		//Cell c = r.getCell(1);
		//System.out.println(c);
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
				int type = c.getCellType();
				
				if (type == 1) {
					String name = c.getStringCellValue();
					System.out.println(name);
					
				}
				else if (type == 0) {
					if (DateUtil.isCellDateFormatted(c)) {
					Date date = c.getDateCellValue();
					SimpleDateFormat sf =new SimpleDateFormat("dd-mm-yyyy");
					String name1 = sf.format(date);
					System.out.println(name1);
					
					}
					else {
						double num = c.getNumericCellValue();
						
						long ln = (long) num;
						String name2 = String.valueOf(ln);
						System.out.println(name2);
					}
				}
			}
		}
		
	}

}
