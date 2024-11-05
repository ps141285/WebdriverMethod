package Session24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Demo
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Expression of x path
		//tagname[@attribute='value']
		//*[@attribute='value']
		
		//xpath with single attributes
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T shirts");

		//x path with multiple attributes
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T shirts");
		
		//and or operator
		
		//driver.findElement(By.xpath("//input[@name=\"search\" and @placeholder=\"Search\"]")).sendKeys("man");	
		//driver.findElement(By.xpath("//input[@name=\"search\" or @placeholder=\"Search\"]")).sendKeys("man");
	
		//x path with text-inner text
		//boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		//System.out.println(displaystatus);
		
		//String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		//System.out.println(value);
		
		//x path with contains method
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("man");
		
		//xpath with starts with method
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("man");
		
		//chained x path
		
		
		
	}

}
