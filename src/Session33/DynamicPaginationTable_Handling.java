package Session33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable_Handling
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement Username=driver.findElement(By.xpath("//input[@id='input-username']"));
		Username.clear();
		Username.sendKeys("demo");
		
		WebElement Pwd=driver.findElement(By.xpath("//input[@id='input-password']"));
		Pwd.clear();
		Pwd.sendKeys("demo");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		//customer main menu
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		//customer sub menu
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		//fetching total number of the page 
		String s=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(s);
		int total_pages=Integer.parseInt(s.substring(s.indexOf("(")+1,s.indexOf("Pages")-1));
	   
	    System.out.println("total number of pages= "+total_pages);
	    
	    for(int p=1;p<=5;p++)
	    {
	    	if(p>1)
	    	{
	    		WebElement Active_pages=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
	    		Active_pages.click();
	    	}
	 
	     }
	    //reading data from the page 
	    int total_rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
	    for(int r=1;r<=total_rows;r++)
	    {
	    	String Customer_Name=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
	    	//String Email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
	    	
	    	System.out.println(Customer_Name);
	    }

	}

}
