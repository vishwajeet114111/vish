package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void trueUse() 
  {
  
  boolean a=true;
  //if a is true then TC should b passed
  
  Assert.assertTrue(a, "TC is failed a is false");

  
  }

}
