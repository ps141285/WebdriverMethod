package Session31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestedDropdown_table 
{

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		List<WebElement>options=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='presentation']"));
        System.out.println("number of suggestion ="+options.size());
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
	}

}
