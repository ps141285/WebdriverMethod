package Session37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter_demo 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver(); 
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//JavascriptExecutor js=driver;
		
		WebElement inbox=driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','Manoj')", inbox);
		
		WebElement rd_btn=driver.findElement(By.xpath("//input[@id='male']"));
		
		js.executeScript("arguments[0].scrollIntoView();", rd_btn);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", rd_btn);
		
		
		//method 1->scrolling page by the pixel 
		//js.executeScript("window.scrollBy(0,1500)", "");
		//System.out.println("capture pixel of the web page:"+js.executeScript("return window.pageYOffset;",""));
		
		//method 2 -->scrolling the page till element is visible
		//js.executeScript("arguments[0].scrollIntoView();", rd_btn);
		//System.out.println("capture pixel of the web page:"+js.executeScript("return window.pageYOffset;",""));

		
		//method 3--->scrolling the page till end of the page 
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//System.out.println("capture pixel of the web page:"+js.executeScript("return window.pageYOffset;",""));
		
		//method 4--->scrolling the page till end of the page 
				//js.executeScript("window.scrollBy(-3000,document.body.scrollHeight)");
				//System.out.println("capture pixel of the web page:"+js.executeScript("return window.pageYOffset;",""));

	}

}
