package Session38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshots_demo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize(); 
		
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File Source_file=ts.getScreenshotAs(OutputType.FILE);	
		
		File target_file=new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
		Source_file.renameTo(target_file);*/
		
		WebElement dynamic_button=driver.findElement(By.xpath("//div[@class='column-right-inner']"));
		File source_file=dynamic_button.getScreenshotAs(OutputType.FILE);
		File target_file=new File(System.getProperty("user.dir")+"\\Screenshots\\featurepage.png");
		source_file.renameTo(target_file);
		

	}

}
