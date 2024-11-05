package Session45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParallelTest_Demo
{
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	void SetUp(String br,String URL) throws InterruptedException
	{
		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case"firefox":driver=new FirefoxDriver();break;
		default:System.out.println("Invalid browser");return;
		}
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test(priority=1)
	void TestLogo()
	{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	@Test(priority=2)
	void TestTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	@Test(priority=3)
	@Parameters({"url"})
	void TestURL(String url)
	{
		String URL=driver.getCurrentUrl();
		Assert.assertEquals(URL, url);
	}
	@AfterClass
	void TearDown()
	{
		driver.quit();
	}
	

}
