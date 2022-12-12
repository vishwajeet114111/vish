package testNgKeywords;


import org.testng.annotations.Test;

public class DependsOn {
  @Test(dependsOnMethods = {"g"})
  public void f() {
  }
  @Test
  public void g() {
	
  }
  @Test
  public void h() {
  }
}
