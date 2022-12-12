package testNgKeywords;

import org.testng.annotations.Test;

public class TimeOut {
  @Test(timeOut = 1000)
  public void f() {
  }
  @Test
  public void g() {
  }
  @Test
  public void h() {
  }
}
