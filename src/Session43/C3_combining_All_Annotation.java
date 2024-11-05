package Session43;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

public class C3_combining_All_Annotation
{
  @Test
  void PQR()
  {
	  System.out.println("pqr method from c3 class ......");
  }
  @BeforeSuite
  void bs()
  {
	  System.out.println("this is before suit....");
  }
  @AfterSuite
  void as()
  {
	  System.out.println("this is after suit....");
  }
}
