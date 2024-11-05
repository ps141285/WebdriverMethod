package Session31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BootstrapDropdown_Demo
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//for selecting single element
		driver.findElement(By.xpath("//input[@value='jQuery']")).click();
		
		//for selecting group of element 
		List<WebElement>Options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//li"));
		System.out.println(Options.size());
		
		/*for(int i=0;i<Options.size();i++)
		{
			System.out.println(Options.get(i).getText());
		}*/
		
		for(WebElement op:Options)
		{
			System.out.println(op.getText());
		}

	}

}
