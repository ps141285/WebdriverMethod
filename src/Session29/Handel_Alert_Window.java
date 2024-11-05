package Session29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handel_Alert_Window 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Thread.sleep(5000);
		//normal alert with ok button 
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		//alert window with ok and cancel button
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert myalert2=driver.switchTo().alert();
		System.out.println(myalert2.getText());
		Thread.sleep(5000);
		myalert2.dismiss();
		
		//alert window with prompt
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(5000);
		Alert myalert3=driver.switchTo().alert();
		myalert3.sendKeys("i am manoj bhadoriya");
		System.out.println(myalert3.getText());
		myalert3.accept();
		//myalert3.dismiss();

	}

}
