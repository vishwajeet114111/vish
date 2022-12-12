package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing3 {

  @Test(groups = {"home page","login page","fund page"})
  public void G() 
  {
	  Reporter.log("G TC running", true);
  }
  @Test(groups = {"fund page"})
  public void H() 
  {
	  Reporter.log("H TC running", true);
  }
  @Test(groups = {"fund page"})
  public void I() 
  {
	  Reporter.log("I TC running", true);
  }
  @Test(groups = {"fund page"})
  public void J() 
  {
	  Reporter.log("J TC running", true);
  }
  }
