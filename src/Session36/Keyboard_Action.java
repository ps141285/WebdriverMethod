package Session36;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement feild_1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		feild_1.sendKeys("WELCOME MEENU,MANASVI,MANUSHI IN THIS NEW WORLD");
		
		//act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();//selecting text
		//act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();//copying text
		
		//act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();//performing tab for switch to another feild
		
		//act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();//pasting content 
		
		

	}

}
