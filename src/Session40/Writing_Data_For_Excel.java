package Session40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_For_Excel 
{

	public static void main(String[] args) throws IOException
	{
		XSSFWorkbook workbook=new XSSFWorkbook(); 
		
		XSSFSheet sheet=workbook.createSheet("MySheet1");
		
		XSSFRow Header_row1=sheet.createRow(0);
		  Header_row1.createCell(0).setCellValue("Name");
		  Header_row1.createCell(1).setCellValue("Position");
		  Header_row1.createCell(2).setCellValue("salary");
		  
		XSSFRow row2=sheet.createRow(1);
		  row2.createCell(0).setCellValue("manoj");
		  row2.createCell(1).setCellValue("s/w Engg");
		  row2.createCell(2).setCellValue("1 lakh");
		   
		XSSFRow row3=sheet.createRow(2);
		  row3.createCell(0).setCellValue("meenu");
		  row3.createCell(1).setCellValue("Data Analyst");
		  row3.createCell(2).setCellValue("75 k");
		  
		XSSFRow row4=sheet.createRow(3);
		  row4.createCell(0).setCellValue("manasvi");
		  row4.createCell(1).setCellValue("Doctor");
		  row4.createCell(2).setCellValue("3 lakh");
		  
		XSSFRow row5=sheet.createRow(4);
		  row5.createCell(0).setCellValue("maanushi");
		  row5.createCell(1).setCellValue("pilot");
		  row5.createCell(2).setCellValue("80 k");
		  
		  FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\MyData.xlsx");
		  workbook.write(file);
		  workbook.close();
		  System.out.println("your data updated succsessfully......");
	}

}
