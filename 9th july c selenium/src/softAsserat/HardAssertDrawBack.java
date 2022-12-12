package softAsserat;

import org.testng.Assert;
import org.testng.annotations.Test;

import verificationUsingTestNG.AssertEquals;

public class HardAssertDrawBack {
  @Test
  public void Testing() 
  {
	  String a="abc";
	  String b="abc";
	  String c="ABC";
	  
	  Assert.assertEquals(a, b,"a and b not equal to TC is failed");
	  
	  Assert.assertEquals(a, c,"a and c not equal to TC is failed");

	  Assert.assertNull(b,"b is not null TC is failed");
	 	  
	  
  }
}
