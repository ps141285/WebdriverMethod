package Session26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_webDriver_Method
{

	public static void main(String[] args) 
	{
		 WebDriver driver=new ChromeDriver(); 
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			 //try each and every method in this assignment
			
			WebElement name_feild=driver.findElement(By.xpath("//input[@id='name']"));
			System.out.println("name feld status= "+name_feild.isEnabled());
			
			WebElement male_rb=driver.findElement(By.xpath("//input[@id='male']"));
			WebElement female_rb=driver.findElement(By.xpath("//input[@id='female']"));
			System.out.println("after selecting the male radio button");
			male_rb.click();
			System.out.println("male radio button status="+male_rb.isSelected());
			System.out.println("after selecting the female radio button");
			female_rb.click();
			System.out.println("female radio button status ="+female_rb.isSelected());

	}

}
