package testngex;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import utils.helper;

public class fluentwaitex {
  @Test
  public void f() {
	  
	  WebDriver driver=helper.browserSetup("chrome", "https://practiceseleniumelements.blogspot.com/2021/06/blog-post.html");
	  helper.WaitForElementClickable(driver.findElement(By.xpath("//button[text()='Display timed text']")), driver);
	  
	  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(250))
				.ignoring(WebDriverException.class);
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			  public WebElement apply(WebDriver driver) {
			    return driver.findElement(By.xpath("//div[@id='txt'][text()='Selenium']"));
			  }
			});
  }
}
