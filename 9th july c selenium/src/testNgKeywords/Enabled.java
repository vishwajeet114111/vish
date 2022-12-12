package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
  @Test(enabled = false)
  public void f() {
	  Reporter.log("hi vishwajeet1",true);
  }
  @Test
  public void g() { Reporter.log("hi vishwajeet2",true);
  }
  @Test
  public void h() { Reporter.log("hi vishwajeet3",true);
  }
}
