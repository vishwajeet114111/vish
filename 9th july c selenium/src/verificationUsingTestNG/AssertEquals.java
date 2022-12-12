package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertEquals {
  @Test
  public void assertEqualsUse() 
  {
	  String a="pune";
	  String b="pune";
	//I need to verify a and b are equal or not?
	//if a and b are equal TC is passed or TC is failed 
	  
	  Assert.assertEquals(a,b,"A and B are not matching TC is failed");
	
  }
}
