package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void assertNotEqualsUse() 
  {
	//my TC should be passed when two things are not equals-->
	  
	  String a="MH";
	  String b="MH";
	  
	  Assert.assertNotEquals(a, b,"A and B are equal TC is failed");
	  Reporter.log("TC is passed A and B are not Matching", true); 
  }
}
