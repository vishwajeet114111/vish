package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void assertNotNullUse() 
  {
	  
	  String a="ABC";
	  
	  //TC should be passed if a value is not null
	  
	  Assert.assertNotNull(a, "A value is null, TC is failed");

  }
}
