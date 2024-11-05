package Session37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploading_file {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload and validation
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\meenu\\selenium course link.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("selenium course link.txt"))
		{
			System.out.println("file uploaded succsessfully");
		}
		else
		{
			System.out.println("file not uploaded ");
		}*/
		
		String file1="C:\\meenu\\selenium course link.txt";
		String file2="C:\\meenu\\manoj_cv.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int no_of_files=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(no_of_files==2)
		{
			System.out.println("file succsessfully uploaded");
		}
		else
		{
			System.out.println("file not uploaded or incorrect file");
		}
		
		
		

	}

}
