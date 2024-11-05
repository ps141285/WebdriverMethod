package Session34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_demo2
{
	public static void Selecting_year(WebDriver driver,String year)
	{
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		List<WebElement> required_year=driver.findElements(By.xpath("//select[@class='ui-datepicker-year']//option"));
		for(WebElement ry:required_year)
		{
			if(ry.getText().equals(year))
			{
				ry.click();
				break;
			}
		}
	}
	
	public static void Selecting_month(WebDriver driver,String month)
	{
		List<WebElement>required_month=driver.findElements(By.xpath("//select[@class='ui-datepicker-month']//option"));
		for(WebElement rm:required_month)
		{
			if(rm.getText().equals(month))
			{
				rm.click();
			}
		}
	}
	
	public static void Selecting_date(WebDriver driver,String Date )
	{
        List<WebElement>require_date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
		
		for(WebElement rd:require_date)
		{
			if(rd.getText().equals(Date))
			{
				rd.click();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		String Date="14";
		String month="Jul";
		String year="2017";
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		
		DatePicker_demo2.Selecting_year(driver, year);
		
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		
		DatePicker_demo2.Selecting_month(driver, month);
		
		
		DatePicker_demo2.Selecting_date(driver, Date);
		
		

	}

}
