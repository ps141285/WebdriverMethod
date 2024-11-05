package Session44;

import org.testng.annotations.Test;

public class loginTest
{
	@Test(priority=1,groups= {"sanity"})
	void LoginByEmail()
	{
	   System.out.println("this is login by email method ...");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void LoginByFacebook()
	{
	   System.out.println("this is login by Facebook method ...");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void LoginByTwitter()
	{
	   System.out.println("this is login by twitter method ...");
	}

}
