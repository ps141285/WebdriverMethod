package Session43;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 
{
	  @Test
	  void xyz() 
	  {
		  System.out.println("xyz method from c1 class..");
	  }
	  @AfterTest
	  void at()
	  {
		  System.out.println("this is after test method..");
	  }
}
