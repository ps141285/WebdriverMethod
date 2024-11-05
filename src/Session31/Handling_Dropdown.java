package Session31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Dropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		    WebDriver driver=new ChromeDriver(); 
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			WebElement drpcountryele=driver.findElement(By.xpath("//select[@id='country']"));
			Select drpcountry=new Select(drpcountryele);
			drpcountry.selectByVisibleText("Canada");
		    Thread.sleep(5000);
			drpcountry.selectByValue("india");
			
		    List<WebElement>options=drpcountry.getOptions();
		    System.out.println(options.size());
		    
		   /* for(int i=0;i<options.size();i++)
		    {
		        System.out.println( options.get(i).getText());
		    }*/
		    for(WebElement op:options)
		    {
		    	System.out.println(op.getText());
		    }

	}

}
