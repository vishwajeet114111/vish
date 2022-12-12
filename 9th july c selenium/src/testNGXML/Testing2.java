package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing2 {
	@Test(groups = {"home page"})//we create group for use include & exclude easy way
	  public void A() 
	  {
		  Reporter.log("A TC running", true);
	  }
	  @Test(groups = {"login page"})
	  public void B() 
	  {
		  Reporter.log("B TC running", true);
	  }
	  @Test(groups = {"home page"})
	  public void C() 
	  {
		  Reporter.log("C TC running", true);
	  }
	  @Test(groups = {"home page"})
	  public void D() 
	  {
		  Reporter.log("D TC running", true);
	  }
	  @Test(groups = {"login page"})
	  public void E() 
	  {
		  Reporter.log("E TC running", true);
	  }
	  @Test(groups = {"login page"})
	  public void F() 
	  {
		  Reporter.log("F TC running", true);
	  }
	 
}
