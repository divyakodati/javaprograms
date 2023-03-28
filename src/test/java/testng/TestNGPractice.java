package testng;

import org.testng.annotations.Test;

public class TestNGPractice {
  @Test(priority = 2)
  public void x() {
	  System.out.println("print x");
  }
  
  @Test(enabled = false)
  public void b() {
	  System.out.println("print b");
  }
  
  @Test(priority = 1)
  public void f() {
	  System.out.println("print f");
  }
}
