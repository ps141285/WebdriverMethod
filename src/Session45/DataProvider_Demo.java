package Session45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Demo 
{
	WebDriver driver;
	@BeforeClass
	void Setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@DataProvider(name="dp",indices= {0,3,2})//we can use specific data from  data provider using "indices"
	Object[] [] Logindata()
	{
		Object[][] Data= {
				           {"manoj123@gmail.com","manoj@123"},
				           {"meenu123@gmail.com","meenu@123"},
				           {"manasvi123@gmail.com","manasvi@123"},
				           {"ps141285@gmail.com","monu@321"},
				           {"maanushi123@gmail.com","maanushi@123"}
				
		                 };
		return Data;
		
	}
	@Test(dataProvider="dp")
	void Login(String email,String pwd) throws InterruptedException
	{
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else
		{
			//System.out.println("expected element not present on the web page ");
			Assert.fail();
		}
	
		
	}
	@AfterClass
	void TearDown()
	{
		driver.quit();
	}
	

	

}
