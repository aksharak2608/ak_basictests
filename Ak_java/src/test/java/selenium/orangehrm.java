package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.helper;

public class orangehrm {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver=helper.browserSetup("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
			WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		//driver=helper.WaitForElementClickable(user, driver);
	//	user.sendKeys("admin");
		driver=helper.WaitForElementandentertext(user, driver, "admin");
		
		driver=helper.WaitForElementandentertext(driver.findElement(By.xpath("//input[@name='password']")), driver, "admin123");
		driver=helper.WaitForElementClickable(driver.findElement(By.tagName("button")), driver);
		Thread.sleep(3000);
		driver=helper.WaitForElementClickable(driver.findElement(By.xpath("//*[text()='My Info']")), driver);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Vertical scroll down by 600 pixels 
	//	js.executeScript("window.scrollBy(0,300)");
		js.executeScript(" arguments[0].scrollIntoView(true),arguments[1].click()",driver.findElement(By.xpath("//*[text()='Test_Field']")), driver.findElement(By.xpath("//button[text()=' Add ']")));
		//js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[text()=' Add ']")));

		Thread.sleep(3000);
		driver.quit();
	}

}
