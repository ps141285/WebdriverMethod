package Session31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown_demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		//hidden dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		//driver.findElement(By.xpath("//span[normalize-space()='Finance Manager']")).click();//select single option
        
		//count number of option
		List<WebElement>options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
    	System.out.println("total number of the position ="+options.size());	
    	
    	for(WebElement op:options)
    	{
    		System.out.println(op.getText());
    	}

	}

}
