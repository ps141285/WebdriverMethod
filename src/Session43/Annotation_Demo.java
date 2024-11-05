package Session43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
TC1
1.Login in to the application
2.test search menu
3.Logout from the application
4.Login in to the application
5.test advance search menu
6.Logout from the application
*/
public class Annotation_Demo
{
  @BeforeMethod 
  void login()
  {
	  System.out.println("login in to the application");
  }
  @AfterMethod
  void logout()
  {
	  System.out.println("logout from the application.....");
  }
  @Test(priority=2)
  void search()
  {
	  System.out.println("tested search menu.....");
  }
  @Test(priority=1)
  void adv_search()
  {
	  System.out.println("tested advance search menu......");
  }

}
