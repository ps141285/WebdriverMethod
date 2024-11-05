package Session47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRM_Test 
{
	WebDriver driver;
	Login_POM_Type2 pom2;
	
	@BeforeClass
	void SetUp() throws InterruptedException
	{
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test(priority=1)
	void login_test()
	{
        pom2=new Login_POM_Type2(driver);
		pom2.SetUserName("Admin");
		pom2.SetValuePwd("admin123");
		pom2.ClickOnLogin();
	}
	
	@AfterClass
	void TearDown()
	{
		driver.quit();
	}

}
