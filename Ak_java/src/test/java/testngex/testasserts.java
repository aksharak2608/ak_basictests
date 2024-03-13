package testngex;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testasserts {
  @Test
  
  public void f() {
	 
	  //Assert.assertEquals(false, true);
	  SoftAssert sa= new SoftAssert();
	  sa.assertEquals(false, true);
	  //sa.assertAll();
  }
  @Test(dependsOnMethods = "f")
  public void f1() {
	  System.out.println("test the assertsa");
	
	  Assert.assertEquals(true, true);
  }
}
