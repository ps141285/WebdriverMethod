package Session26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Conditional_method 
{

	public static void main(String[] args) 
	{
	    WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println(logo.isDisplayed());//
		
		//is displayed()-true
		boolean logostatus=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println(logostatus);
        
        //isEnabled()
        WebElement stasus=driver.findElement(By.xpath("//input[@id='FirstName']"));
        System.out.println("name feild status ="+stasus.isEnabled());
        
        //isSelected()
        System.out.println("before select the radio  button");
        
        WebElement male_rb=driver.findElement(By.xpath("//input[@id='gender-male']"));
        System.out.println("radio button male="+male_rb.isSelected());
        WebElement female_rb=driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println("radio button male="+female_rb.isSelected());
        
        System.out.println("after selecting the radio  button male");
        
        male_rb.click();
        System.out.println("radio button male="+male_rb.isSelected());
        System.out.println("radio button female="+female_rb.isSelected());
        
        System.out.println("after selecting the radio  button female");
        
        female_rb.click();
        System.out.println("radio button male="+male_rb.isSelected());
        System.out.println("radio button female="+female_rb.isSelected());
        
	}

}
