package Session38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Enable_Extentions {

	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		
		File file=new File("C:\\meenu\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		option.addExtensions(file);
		
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
		}// TODO Auto-generated method stub

	}

}
