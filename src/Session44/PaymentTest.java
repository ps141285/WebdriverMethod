package Session44;

import org.testng.annotations.Test;

public class PaymentTest
{
	@Test(priority=1,groups= {"sanity","regression","fuctional"})
	void PaymentByDollor()
	{
	   System.out.println("this is payment by dollor method ...");
	}
	@Test(priority=2,groups= {"sanity","regression","fuctional"})
	void PaymentByINR()
	{
	   System.out.println("this is payment by INR method ...");
	}

}
