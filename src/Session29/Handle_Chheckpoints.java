package Session29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Chheckpoints {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select specified checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
        
		//select group of checkboxses
		List<WebElement>chckboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*for(int i=0;i<chckboxes.size();i++)
		{
			chckboxes.get(i).click();
		}*/
		
		/*for(WebElement CB:chckboxes)
		{
			CB.click();
		}*/
		
		for(int i=4;i<chckboxes.size();i++)
		{
			
			chckboxes.get(i).click();
		}
		Thread.sleep(5000);
		for(int i=4;i<chckboxes.size();i++)
		{
			if(chckboxes.get(i).isSelected())
			{
				chckboxes.get(i).click();
			}
		}
		for(int i=0;i<3;i++)
		{
			chckboxes.get(i).click();
		}
	}

}
