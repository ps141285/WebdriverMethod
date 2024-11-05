package Session42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//1)open application
//2)login into the application
//3)check orangeHRM icon is visible or not
//4)close the application

public class OrangeHRM_Test_NG
{
  WebDriver driver;
	
  @Test(priority=1)
  public void openApp() 
  {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }
  @Test(priority=2)
  public void login()
  {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
  }
  @Test(priority=3)
  public void checkIcon() throws InterruptedException
  {
	  Thread.sleep(5000);
	 boolean display_icon= driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
	 if(display_icon=true)
	 {
		 System.out.println("icon is visible :"+display_icon);
	 }
	 else
	 {
		 System.out.println("icon not visible :"+display_icon);
	 }
	  
  }
  @Test(priority=4)
  public void closeApp() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.quit();
  }
}
