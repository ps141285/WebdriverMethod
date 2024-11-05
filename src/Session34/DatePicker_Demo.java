package Session34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_Demo
{
	static void selecting_Past_date(WebDriver driver,String year,String month,String Past_Date)
	{
		while(true)     //method2
		{
			driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(year.equals(current_year)&& month.equals(current_month))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
	List<WebElement>current_date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
        for(WebElement dt:current_date)
        {
     	   if(dt.getText().equals(Past_Date))
     	   {
     		   dt.click();
     		   System.out.println(dt.getText());
     		   break;
     	   }
        }
	}
	
	static void selecting_future_date(WebDriver driver,String year,String month,String Future_Date)
	{
		while(true)     //method2
		{
			driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(year.equals(current_year)&& month.equals(current_month))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
	List<WebElement>current_date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
        for(WebElement dt:current_date)
        {
     	   if(dt.getText().equals(Future_Date))
     	   {
     		   dt.click();
     		   System.out.println(dt.getText());
     		   break;
     	   }
        }
	}
	

		
		
	

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/14/1986");//method 1
		
		String P_year="2023";
		String month="July";
		String Past_Date="14";
		String Future_Date="16";
		String F_year="2036";
		
		/*while(true)     //method2
		{
			driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(year.equals(current_year)&& month.equals(current_month))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
	List<WebElement>current_date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		
        for(WebElement dt:current_date)
        {
     	   if(dt.getText().equals(Date))
     	   {
     		   dt.click();
     		   System.out.println(dt.getText());
     		   break;
     	   }
        }*/
		
		
 
		//select the date
		//DatePicker_Demo.selecting_future_date(driver, F_year, month, Future_Date);
		DatePicker_Demo.selecting_Past_date(driver, P_year, month, Past_Date);
		
		
	}

}
