package Session36;


import java.util.ArrayList;
import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLink_in_newtab 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement new_link= driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM']"));
		//act.keyDown(Keys.CONTROL).click(new_link).keyUp(Keys.CONTROL).perform();
		
		//Set<String> id=driver.getWindowHandles();
		List<String> ID=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(ID.get(1));
		
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		driver.findElement(By.xpath("//input[@id='Form_getForm_FullName']")).sendKeys("Manoj");
		
		Thread.sleep(5000);
		
		driver.switchTo().window(ID.get(0));

	}

}
