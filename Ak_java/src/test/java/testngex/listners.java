package testngex;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class listners {
  @Test
  public void f() {
	  System.out.println("Test failed");
	  Assert.assertEquals(false, true);
	  
  }
  @Test
  public void f1() {
	  System.out.println("Test passed");
	  Assert.assertEquals(true, true);
	  
  }
  @Test(dependsOnMethods = "f")
  public void f2() {
	  System.out.println("Test passed");
	  Assert.assertEquals(true, true);
	  
  }
  
  @AfterMethod
  public void output(ITestResult r)
  {
	  int status=r.getStatus();
	  if(status==ITestResult.SUCCESS)
	  {
		  System.out.println("sucess");
	  }
	  else  if(status==ITestResult.FAILURE)
	  {
		  System.out.println("Failure");
		  System.out.println("Exception"+r.getThrowable().getMessage());
	  }
	  else  if(status==ITestResult.SKIP)
	  {
		  System.out.println("Skip");
	  }
  }
}
