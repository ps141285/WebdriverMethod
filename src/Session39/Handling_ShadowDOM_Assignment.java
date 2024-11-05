package Session39;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_ShadowDOM_Assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();
		
		//This Element is inside single shadow DOM.
		String cssSelectorForHost1 = "#shadow-root";
		Thread.sleep(1000);
		SearchContext shadow = driver.findElement(By.cssSelector(cssSelectorForHost1)).getShadowRoot();
		Thread.sleep(1000);
		String element1_text=shadow.findElement(By.cssSelector("#shadow-element")).getText();
		
		System.out.println("The text of the 1st fetched element is : "+element1_text);
		
		//This Element is inside 2 nested shadow DOM.
		
		String cssSelectorForHost2 = "#inner-shadow-dom";
		Thread.sleep(1000);
		SearchContext shadow0 = driver.findElement(By.cssSelector(cssSelectorForHost1)).getShadowRoot();
		Thread.sleep(1000);
		SearchContext shadow1 = shadow0.findElement(By.cssSelector(cssSelectorForHost2)).getShadowRoot();
		Thread.sleep(1000);
		String element2_text=shadow1.findElement(By.cssSelector("#nested-shadow-element")).getText();
		
		System.out.println("The text of the 1st fetched element is :"+element2_text);
		
		//This Element is inside 3 nested shadow DOM.
		
		
		String cssSelectorForHost3 = "#nested-shadow-dom";
		SearchContext shadow2 = shadow1.findElement(By.cssSelector(cssSelectorForHost3)).getShadowRoot();
		Thread.sleep(1000);
		String element3_text=shadow2.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
		System.out.println("The text of the 3rd fetched element is :"+element3_text);
		
		

	}

}
