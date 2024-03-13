package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import utils.helper;

public class frames {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=helper.browserSetup("chrome","https://practiceseleniumelements.blogspot.com/2021/08/iframes.html");
		
		driver.switchTo().frame("autocomplete");
		WebElement input=driver.findElement(By.xpath("//input[@id='myInput']"));
	
		input.click();
		helper.WaitForElementandentertext(input, driver, "i");
		

		List<WebElement>dpvalues=driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
		
		for(WebElement ele:dpvalues)
		{
			System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase("Isle of Man")) {
				ele.click();
				break;
			}
			
		}
		driver.switchTo().parentFrame();
		driver.switchTo().frame("simplealert");
		

		WebElement salert=driver.findElement(By.xpath("//button[text()='Try it']"));
		helper.WaitForElementClickable(salert, driver);
		Alert a=driver.switchTo().alert();
		Thread.sleep(1000);
		a.accept();
		String fpath=helper.screenshot(driver);
		System.out.println(fpath);
		
	}

}
