package Session44;

import org.testng.annotations.Test;

public class SignupTest 
{
	@Test(priority=1,groups= {"regression"})
	void SignupByEmail()
	{
	   System.out.println("this is signup by email method ...");
	}
	@Test(priority=2,groups= {"regression"})
	void SignupByFacebook()
	{
	   System.out.println("this is signup by facebook method ...");
	}
	@Test(priority=3,groups= {"regression"})
	void SignupByTwitter()
	{
	   System.out.println("this is signup by twitter method ...");
	}

}
