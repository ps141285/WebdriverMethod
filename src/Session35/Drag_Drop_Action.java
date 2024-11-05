package Session35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Action 
{
	public static void move_drag_drop(WebDriver driver,WebElement rome,WebElement italy,WebElement washington,WebElement usa,WebElement oslo,WebElement norway,WebElement seoul,WebElement southcorea,WebElement madrid,WebElement spain,WebElement copenhagen,WebElement denmark,WebElement stockholm,WebElement sweden )
	{
		Actions act=new Actions(driver);
		Action move=act.dragAndDrop(rome,italy).dragAndDrop(washington,usa).dragAndDrop(oslo, norway).dragAndDrop(seoul, southcorea).dragAndDrop(madrid, spain).dragAndDrop(copenhagen, denmark).dragAndDrop(stockholm, sweden).build();
		move.perform();
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		
		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement usa=driver.findElement(By.xpath("//div[@id='box103']"));
		
		WebElement oslo=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement norway=driver.findElement(By.xpath("//div[@id='box101']"));
		
		WebElement seuol=driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement southcorea=driver.findElement(By.xpath("//div[@id='box105']"));
		
		WebElement madrid=driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement spain=driver.findElement(By.xpath("//div[@id='box107']"));
		
		WebElement copenhagen=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement denmark=driver.findElement(By.xpath("//div[@id='box104']"));
		
		WebElement stockholm=driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement sweden=driver.findElement(By.xpath("//div[@id='box102']"));
		
		Drag_Drop_Action.move_drag_drop(driver, rome, italy, washington, usa, oslo, norway, seuol, southcorea, madrid, spain, copenhagen, denmark, stockholm, sweden);
		
		
	}

}
