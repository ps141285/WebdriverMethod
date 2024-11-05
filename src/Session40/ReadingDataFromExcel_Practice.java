package Session40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel_Practice 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int total_row=sheet.getLastRowNum();
		int total_cell=sheet.getRow(0).getLastCellNum();
		
		System.out.println("total no of rows :"+total_row);
		System.out.println("total no of cell :"+total_cell);
		
		for(int r=0;r<total_row;r++)
		{
			XSSFRow current_row=sheet.getRow(r);
			for(int c=0;c<total_cell;c++)
			{
				XSSFCell current_cell=current_row.getCell(c);
				System.out.print(current_cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();

	}

}
