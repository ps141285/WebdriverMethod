package Session21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase 
{

	public static void main(String[] args)
	{
	
		//ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String Act_title=driver.getTitle();
		
		if(Act_title.equals("OrangeHRM"))
		{
			System.out.println("test got passed");
		}
		else
		{
			System.out.println("test got failed");
		}

	}

}
