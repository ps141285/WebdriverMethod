package Session39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_link_demo_practice {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("total link of this page :"+links.size());
		int noOfBrokenLink=0;
		
		try
		{
	    for(WebElement linkElement:links)
		{
			String hrefvalue=linkElement.getAttribute("href");
			
			if(hrefvalue==null||hrefvalue.isEmpty())
			{
				System.out.println("link is empty so system is not able to check ");
				continue;
			}
			
			URL linkurl=new URL(hrefvalue);
			HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>400)
			{
				System.out.println(hrefvalue+"==========>broken links");
				noOfBrokenLink++;
			}
			else
			{
				System.out.println(hrefvalue+"============>not a broken link");
			}
			
		}
		}
		catch(Exception e)
		{
			
		}
		
		System.out.println("total number of broken links :"+noOfBrokenLink);

	}

}
