package BasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginwithExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try {
			File src= new File("D:\\Chanchal\\ExcelData\\Credentials.xlsx");
			FileInputStream fis=new FileInputStream(src);
			
			XSSFWorkbook wb=new XSSFWorkbook();
			XSSFSheet sh1= wb.getSheetAt(0);
			
			
			 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			 
			 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			 
			 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			 
			// here createCell will create column
			 
			// and setCellvalue will set the value
			 
			 sh1.getRow(0).createCell(2).setCellValue("2.41.0");
			 
			 sh1.getRow(1).createCell(2).setCellValue("2.5");
			 
			 sh1.getRow(2).createCell(2).setCellValue("2.39");
			 
			 
			// here we need to specify where you want to save file
			 
			 FileOutputStream fout=new FileOutputStream(new File("D:\\Chanchal\\ExcelData\\Credentials.xlsx"));
			 
			 
			// finally write content 
			 
			 wb.write(fout);
			 
			// close the file
			 
			 fout.close();
		} 
		 
		catch (Exception e) {
		 
		   System.out.println(e.getMessage());
		
		
		
		
	
	}

}}
