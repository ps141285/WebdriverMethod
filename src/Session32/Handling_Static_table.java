package Session32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Static_table 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("total numbers of rows= "+rows);
		
		int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("total number of colum= "+col);
		
		//String ele_name=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        //System.out.println(ele_name);
        
        for(int r=2;r<rows;r++)
        {
        	for(int c=1;c<=col;c++)
        	{
        		String table_data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
        		System.out.print(table_data+"\t");
        	}
        	System.out.println();
        }
	}

}
