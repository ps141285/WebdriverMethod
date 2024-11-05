package Session47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_POM_Type2 
{
	WebDriver driver;
	
	//constructor
	Login_POM_Type2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//XPATH
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement user_txt;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement user_pwd;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Login_btn;
	
	
	
	//Action Method
	void SetUserName(String user)
	{
		user_txt.sendKeys(user);
	}
	void SetValuePwd(String pwd)
	{
		user_pwd.sendKeys(pwd);
	}
	void  ClickOnLogin()
	{
		Login_btn.click();
	}
	

}
