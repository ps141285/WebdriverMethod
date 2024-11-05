package Session23;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='search']")).sendKeys("mac");//tag and attributes 
	

	}

}
