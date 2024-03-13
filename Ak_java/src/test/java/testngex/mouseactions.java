package testngex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.helper;

public class mouseactions {
  @Test
  @Parameters("url")
  public void f(String url) {
	 WebDriver driver= helper.browserSetup("chrome", url);
	 Actions act= new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//a[text() = 'Car Rentals']")));
	  act.build().perform();
	  act.contextClick().build().perform();
	  
	  
  }
}
