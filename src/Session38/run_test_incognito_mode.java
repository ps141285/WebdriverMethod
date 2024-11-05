package Session38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class run_test_incognito_mode {

	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		
		//we can use this 
		WebDriver driver=new ChromeDriver(option);
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
