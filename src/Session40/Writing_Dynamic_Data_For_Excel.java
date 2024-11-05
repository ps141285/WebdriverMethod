package Session40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Dynamic_Data_For_Excel
{

	public static void main(String[] args) throws IOException
	{
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Dynamic_sheet");
		Scanner sc=new Scanner(System.in);
	    
		System.out.print("please enter total no of rows :");
		int total_row=sc.nextInt();
		
        System.out.print("please enter total no of cell :");
		int total_cell=sc.nextInt();
		
		for(int r=0;r<=total_row;r++)
		{
			XSSFRow current_row=sheet.createRow(r);
			for(int c=0;c<=total_cell;c++)
			{
				XSSFCell current_cell=current_row.createCell(c);
				current_cell.setCellValue(sc.next());
				//System.out.println();
				
			}
		}
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\Dynamic_data.xlsx");
		workbook.write(file);
		sc.close();
		workbook.close();
		System.out.println("entered data updated in the created sheet.......");
		
		
		
		
		

	}

}
