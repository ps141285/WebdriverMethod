package Session44;
/*
 1.open application
 2.login in to the application
 3.test search option
 4.test advance search option
 5.logout from the application
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_method_demo
{
	@Test(priority=1)
	void openApp()
	{
		System.out.println("open the application");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods= {"openApp"})
	void login()
	{
		System.out.println("login in to the application....");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3,dependsOnMethods= {"openApp","login"})
	void search()
	{
		System.out.println("testing search option....");
		Assert.assertTrue(false);
	}
	
	@Test(priority=4,dependsOnMethods= {"search","login"})
	void adv_search()
	{
		System.out.println("testing advance search option....");
	}
	
	@Test(priority=5,dependsOnMethods= {"openApp","login"})
	void logout()
	{
		System.out.println("logout from the application.....");
	}
	

}
