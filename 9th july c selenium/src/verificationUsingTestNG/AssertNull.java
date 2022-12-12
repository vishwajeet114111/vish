package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void assertNullUse() 
  {
	  
	  String a=null;
	  //TC should be passed if a is null
	  Assert.assertNull(a, "A value is not null TC is FAILED");
  }
  }

