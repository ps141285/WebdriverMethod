package Session35;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_hover_Action {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement Desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement  mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(Desktop).moveToElement(mac).click().build().perform();
		//act.moveToElement(Desktop).moveToElement(mac).click().perform();

	}

}
