package Session38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL_handling 
{

	public static void main(String[] args)
	{
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.expired.badssl.com/");
		driver.manage().window().maximize();
		
		driver.get("https://www.expired.badssl.com/");
		System.out.println("title of the page :"+driver.getTitle());

	}

}
