package Session28;



import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handel_Browser_Window {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String>windowID=driver.getWindowHandles();
		
		//Approch1
		/*List<String>windowList=new ArrayList(windowID);
		String ParantID=windowList.get(0);
		String ChildID=windowList.get(1);
		
		driver.switchTo().window(ParantID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle());
        */
		
		//Approch 2
		
		for(String winID:windowID)
		{
			String title=driver.switchTo().window(winID).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
	}

}
