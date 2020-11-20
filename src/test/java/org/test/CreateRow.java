package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateRow {

	
public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\gopal\\eclipse-workspace\\MavenProject\\Excel loc\\Maven.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(stream);
		Sheet st = wb.getSheet("sheet1");
		int rowCnt= st.getLastRowNum()+1;
	
		String[] value= {"karthick","Cloud Computing","8667304470","06/12/2020"};
	    Row newRw= st.createRow(rowCnt);
	    
	    for (int i = 0; i < 4; i++) {
	    	Cell newCl = newRw.createCell(i);
	    	newCl.setCellValue(value[i]);
		}

	    FileOutputStream fos= new FileOutputStream(f);
	    wb.write(fos);	
	    
	    

}
}


