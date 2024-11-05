package Session41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FD_Calculator {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
   
        String Filepath=System.getProperty("user.dir")+"\\TestData\\caldata.xlsx";
        String file_sheet="Sheet1";
        int row=Utility_Excel.getrowcount(Filepath,file_sheet );
     
        for(int i=1;i<=row;i++)
        {
        	//read data from the excel
        	String Price=Utility_Excel.getcelldata(Filepath, file_sheet, i, 0);
        	String Rate_Of_Intrest=Utility_Excel.getcelldata(Filepath, file_sheet, i, 1);
        	String Period1=Utility_Excel.getcelldata(Filepath, file_sheet, i, 2);
        	String Period2=Utility_Excel.getcelldata(Filepath, file_sheet, i, 3);
        	String fre=Utility_Excel.getcelldata(Filepath, file_sheet, i, 4);
        	String exp_val=Utility_Excel.getcelldata(Filepath, file_sheet, i, 5);
        	
        	//pass above data in to the application
        	
        	driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(Price);
        	driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(Rate_Of_Intrest);
        	driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(Period1);
        	
        	Select period_drpdwn=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
        	period_drpdwn.selectByVisibleText(Period2);
        	
        	Select fre_drpdwn=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
        	fre_drpdwn.selectByVisibleText(fre);
        	
        	driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
        	
        	 //validation part 
        	String actual_val=driver.findElement(By.xpath("//span[@class='gL_27']//strong")).getText();
        	
        	if(Double.parseDouble(actual_val)==Double.parseDouble(exp_val))
        	{
        		System.out.println("Test Passed");
        		Utility_Excel.SetCellData(Filepath, file_sheet, i, 7, "Passed");
        		Utility_Excel.FillGreenColor(Filepath, "Sheet1", i,7);
        		
        	}
        	else
        	{
        		System.out.println("Test Passed");
        		Utility_Excel.SetCellData(Filepath, file_sheet, i, 7, "Fail");
        		Utility_Excel.FillRedColor(Filepath, file_sheet, i,7);
        	}
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//img[@class='PL5']")).click();
        	
        }
      
        driver.quit();
        
	}

}
