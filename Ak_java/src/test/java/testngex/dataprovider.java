package testngex;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataprovider {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s, Integer k) {
	  
	  
	  System.out.println(n);
	  System.out.println(s);
	  System.out.println(k);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a",23 },
      new Object[] { 2, "b" , 50},
      new Object[] { 1, "a",23 },
    };
  }
}
