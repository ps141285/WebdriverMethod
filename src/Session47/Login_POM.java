package Session47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_POM 
{
	WebDriver driver;
	
	//constructor
	Login_POM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//xpath
	By usertxt=By.xpath("//input[@placeholder='Username']");
	By userpwd=By.xpath("//input[@placeholder='Password']");
	By login_btn=By.xpath("//button[normalize-space()='Login']");
	
	//action method
	void SetUserName(String user)
	{
		driver.findElement(usertxt).sendKeys(user);
	}
	void SetValuePwd(String pwd)
	{
		driver.findElement(userpwd);
	}
	void ClickOnLogin()
	{
		driver.findElement(login_btn).click();
	}

}
