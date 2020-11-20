package org.test;

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

public class Maven1stDay {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\gopal\\eclipse-workspace\\MavenProject\\Excel loc\\Maven.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(stream);
		Sheet sht = wb.getSheet("sheet1");
		for (int i = 0; i < sht.getPhysicalNumberOfRows(); i++) {
			Row row = sht.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int ct = cell.getCellType();
				//System.out.println(ct);
				
			 	if (ct==1) {
					String scv = cell.getStringCellValue();
					System.out.println(scv);
					
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dcv = cell.getDateCellValue();
					SimpleDateFormat frt=new SimpleDateFormat("dd/MM/yyyy");
					String rs = frt.format(dcv);
					System.out.println(rs);
					
				} else {
					
					double ncv = cell.getNumericCellValue();
					//System.err.println(ncv);
					long l=(long) ncv;
					System.out.println(l);

				}
			
				
				
			}
			
			
		}
		
		//Row rw = sht.getRow(1);
		//Cell cell = rw.getCell(0);
		//String value = cell.getStringCellValue();
		//System.out.println(cell.getStringCellValue());
		
		
		
	}
	
}
