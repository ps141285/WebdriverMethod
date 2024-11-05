package Session43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/*
 TC1
 1.login in to the application
 2.test search option
 3.test advance search option
 4.logout from the application
 */

public class Annotation_Demo_2
{
  @BeforeClass
  void Login() 
  {
	  System.out.println("login in to the application.....");
  }
  @AfterClass
  void Logout()
  {
	  System.out.println("logout from the application.....");
  }
  @Test(priority=1)
  void search_testing()
  {
	  System.out.println("tested search menu......");
  }
  @Test(priority=2)
  void Adv_search()
  {
	  System.out.println("advance search option has been tested....");
  }

}
