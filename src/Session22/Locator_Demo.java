package Session22;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Demo
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("search")).sendKeys("mac");
		boolean logostatus=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logostatus);
		//driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.partialLinkText("lets")).click();
		List<WebElement> headerlinks=driver.findElements(By.className("list-inline-item"));
		System.out.println("total number of links = "+headerlinks.size());
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("total number of links ="+links.size());
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("total number of images ="+images.size());
		
	}

}
