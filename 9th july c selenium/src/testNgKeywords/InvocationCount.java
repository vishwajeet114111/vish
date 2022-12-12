package testNgKeywords;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount = 4)
  public void f() 
  {
	  Reporter.log("hi vishwajeet",true);
  }

}
