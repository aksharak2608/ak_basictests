package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.helper;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=helper.browserSetup("chrome","https://practiceseleniumelements.blogspot.com/2021/08/simple-alert.html");
		
		WebElement salert=driver.findElement(By.xpath("//button[text()='Try it']"));
		helper.WaitForElementClickable(salert, driver);
		Alert a=driver.switchTo().alert();
		Thread.sleep(1000);
		a.accept();
		
		WebElement calert=driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
		helper.WaitForElementClickable(calert, driver);
		Thread.sleep(1000);
		 a=driver.switchTo().alert();
		a.accept();
		helper.WaitForElementClickable(calert, driver);
		 a=driver.switchTo().alert();
		 Thread.sleep(1000);
		a.dismiss();
		
		WebElement palert=driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
		helper.WaitForElementClickable(palert, driver);
		Thread.sleep(1000);
		 a=driver.switchTo().alert();
		 a.sendKeys("akshara");
		a.accept();
	}

}
