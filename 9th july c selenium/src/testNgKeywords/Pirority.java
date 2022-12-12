package testNgKeywords;

import org.testng.annotations.Test;

public class Pirority {
  @Test
  public void A() {
  }
  @Test (priority = -5)
  public void B() {
  }
  //-3,-2,-1,0,1,2,
  @Test(priority = -4)
  public void C() {
  }
  @Test(priority = -3)
  public void D() {
  }
  @Test(priority = -2)
  public void E() {
  }
  @Test(priority = -1)
  public void F() {
  }
  
}
