package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.Listener.class)
public class Testing2 
{
	  @Test
	  public void mytest4() 
	  {
		  Reporter.log("MY Test4 is executing", true);
	  }
	  @Test
	  public void mytest5() 
	  {
		  Reporter.log("MY Test5 is executing", true);
		  Assert.fail();
	  }
	  @Test(dependsOnMethods = "mytest5")
	  public void mytest6() 
	  {
		  Reporter.log("MY Test6 is executing", true);
	  }
	  
}
