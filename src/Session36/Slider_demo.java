package Session36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_demo 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//min slider
		WebElement min_slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("Default location of the slider:"+min_slider.getLocation());//(59, 289)
		act.dragAndDropBy(min_slider, 100, 289).build().perform();
        System.out.println("Location after moving of the slider:"+min_slider.getLocation());//(161, 289)
        
        //max slider
        WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
        
		System.out.println("Default location of the slider:"+max_slider.getLocation());//(544, 289)
		act.dragAndDropBy(max_slider, -100, 289).perform();
        System.out.println("Location after moving of the slider:"+max_slider.getLocation());//(442, 289)

	}

}
