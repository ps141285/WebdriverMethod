package Session35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubble_click_Actions 
{

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver(); 
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	
	WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
	WebElement box2=driver.findElement(By.xpath("//input[@id='field2']"));
	WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	
	box1.clear();
	box1.sendKeys("manoj");
	
	
	Actions act=new Actions(driver);
	act.doubleClick(button).build().perform();
	
	//validation
	String txt=box2.getAttribute("value");
	System.out.println("given text is ="+txt);
	if(txt.equals("manoj"))
	{
		System.out.println("text copied");
	}
	else
	{
		System.out.println("text not copied");
	}

	}

}
