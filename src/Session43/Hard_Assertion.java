package Session43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion
{
  @Test
  public void test()
  {
	// Assert.assertEquals("manoj","manoj"); //pass
	 //Assert.assertEquals(123, 456);       //fail
	 
	 //Assert.assertEquals("123", 123);  //fail
	 // Assert.assertTrue(true);         //pass
	//  Assert.assertTrue(false);    //fail
	  
	 // Assert.assertTrue(1==1); //pass
	  
	  //Assert.assertFalse(true); //fail
	  //Assert.assertFalse(false); //pass
	  //Assert.assertFalse(1==2);//pass
	  
	  Assert.fail();
	  
	  
  }
}
