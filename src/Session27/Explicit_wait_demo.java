package Session27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_demo
{

	public static void main(String[] args) 
	{
		    WebDriver driver=new ChromeDriver(); 
		    WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
            txtusername.sendKeys("Admin");
            
            WebElement txtuserpwd=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
            txtuserpwd.sendKeys("admin123");
            
            WebElement login_btn=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	        login_btn.click();
	
	}   

}
