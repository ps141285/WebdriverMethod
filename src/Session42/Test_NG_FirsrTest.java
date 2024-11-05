package Session42;

import org.testng.annotations.Test;

public class Test_NG_FirsrTest 

{
	
	@Test(priority=1)
	public  void openapp()
	{
		System.out.println("opening the app....");
	}
	@Test(priority=2)
	public void login()
	{
		System.out.println("login in to the app...");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("logout from the app....");
	}

}
