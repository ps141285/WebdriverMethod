package Session43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertion_vs_SoftAssertion
{

 @Test(priority=1)
 public void test_hardAssertion()
  {
	  System.out.println("testing.....");
	  System.out.println("testing.....");
	  
	  
	  Assert.assertEquals(1,2);
	  
	  System.out.println("testing.....");
	  System.out.println("testing.....");
	  
  } 
  @Test(priority=2)
  public void test_softAssertion()
  {
	  SoftAssert sa=new SoftAssert();
	  
	  System.out.println("testing.....");
	  System.out.println("testing.....");
	  
	  sa.assertEquals(1, 2);
	  
	  System.out.println("testing.....");
	  System.out.println("testing.....");
	  
	  sa.assertAll();
  }
}
