package testngex;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest {
  @Test(groups={"reg"})
  public void f() {
	  System.out.println("reg test1");
	  System.out.println(Thread.currentThread().getId()+" is the thread id");
	  System.out.println(Thread.currentThread().getName()+" is the thread id");
  }
  @Test(groups={"reg"})
  public void f6() {
	  System.out.println("reg test6");
	  System.out.println(Thread.currentThread().getId()+" is the thread id");
	  System.out.println(Thread.currentThread().getName()+" is the thread id");
  }
  @Test(groups={"smoke"})
  public void f1() {
	  System.out.println("smoke test1");
	  System.out.println(Thread.currentThread().getId()+" is the thread id");
	  System.out.println(Thread.currentThread().getName()+" is the thread id");
	 Assert.assertEquals(false, true);
  }
  
  @Test(groups={"reg","smoke"},enabled = true)
  public void f4() {
	  System.out.println("reg test4");
	  System.out.println(Thread.currentThread().getId()+" is the thread id");
	  System.out.println(Thread.currentThread().getName()+" is the thread id");
  }
  @Test(groups={"smoke"})
  public void f5() {
	  System.out.println("smoke test5");
	  System.out.println(Thread.currentThread().getId()+" is the thread id");
	  System.out.println(Thread.currentThread().getName()+" is the thread id");
  }
  
  @Test(groups={"smoke"}, dependsOnGroups =  "reg")
  public void f2() {
	  System.out.println("reg test2");
	  System.out.println(Thread.currentThread().getId()+" is the thread id");
	  System.out.println(Thread.currentThread().getName()+" is the thread id");
  }
  
 @BeforeGroups({"reg","smoke"})
  public void groptest() {
	  System.out.println("start reg tests");
	  
  }

 @AfterGroups({"smoke"})
  public void groptest1() {
	  System.out.println("end smoke tests");
  }
  
}
