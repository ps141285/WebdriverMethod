package Session43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Demo 
{
  @Test
  void TestTitle() 
  {
	  String exp_title="Opencart";
	  String act_title="Opencart";
	  
	 /*
	    if(act_title.equals(exp_title))
	  
	  {
		  System.out.println("test passed..");
	  }
	  else
	  {
		  System.out.println("test failed..");
	  }
	  */
	 // Assert.assertEquals(act_title, exp_title);
	  
	  if(act_title.equals(exp_title))
	  {
		  System.out.println("test passed..");
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  System.out.println("test failed..");
		  Assert.assertTrue(false);
	  }
  }
}
