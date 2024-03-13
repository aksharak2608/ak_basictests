package testngex;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 {
  @Test(priority = 1)
  public void f() {
	  System.out.println("first ");
	  Assert.assertEquals(false, true);
  }
  
  
  @Test( dependsOnMethods ="f")
  public void f4() {
	  System.out.println("fourth ");
  }
  
  @Test(priority = 3)
  public void f3() {
	  System.out.println("second ");
  }
  @Test(priority = 2)
  public void f1() {
	  System.out.println("third ");
  }
  @Test(priority = 5)
  public void f5() {
	  System.out.println("five ");
  }
}
