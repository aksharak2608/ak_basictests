package testngex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.helper;

public class draganddrop {
  @Test
  public void f() {
	  WebDriver driver=helper.browserSetup("chrome", "https://practiceseleniumelements.blogspot.com/p/demo-drag-and-drop.html");
	  WebElement src=driver.findElement(By.xpath("//p[@id='dragtarget1']"));
	  WebElement trg=driver.findElement(By.xpath("//div[@name='seconddiv']"));
	  Actions act= new Actions(driver);
	  //act.dragAndDrop(src, trg).build().perform();
	  act.clickAndHold(src).moveToElement(trg).release().build().perform();
  }
}
