package Session26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_method 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		//get(url)....open the url in the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//get title()-return tiltle of the page
		System.out.println(driver.getTitle());
		
		//get currenturl()-return current url of the page 
		System.out.println(driver.getCurrentUrl());
		
		//get pagesource()-return page source of the web page 
		//System.out.println(driver.getPageSource());
		
		//get windohandle()-its return id of the page whic is dynamic
		String Windowid=driver.getWindowHandle();
		System.out.println("window id -"+Windowid);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String>Windowids=driver.getWindowHandles();
		System.out.println(Windowids);
		
		
		
	

	}

}
