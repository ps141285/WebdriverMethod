package Session39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_link_demo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total numbers of links :"+links.size());
		int no_of_broken_links=0;
		
		
		try
		{
		     for(WebElement linkelement:links)
		  {
			 String hrefvalue=linkelement.getAttribute("href");
			
			 if(hrefvalue==null ||hrefvalue.isEmpty())
			 {
				System.out.println("href value is null or empty its not possible to check");
				continue;
			  }
			    URL linkurl=new URL(hrefvalue);//Converted string value to Uri object
			    HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
			    conn.connect();
			    
			    if(conn.getResponseCode()>400)
			    {
			    	System.out.println(hrefvalue+"===========> Broken Link");
			    	no_of_broken_links++;
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
		
		System.out.println("total number of broken links :"+no_of_broken_links);
		
		

	}

}
