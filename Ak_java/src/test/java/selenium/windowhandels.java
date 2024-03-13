package selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.helper;

public class windowhandels {
	public static void main(String args[]) {
		WebDriver driver = helper.browserSetup("chrome", "https://docs.oracle.com/en/java/");
		WebElement link = driver
				.findElement(By.xpath("//a[@href='https://www.oracle.com/technetwork/java/javase/documentation']"));
		helper.WaitForElementClickable(link, driver);
		
		List<WebElement> links = driver.findElements(By.xpath("//li/a[@class='new-window']"));
		for (WebElement ele : links) {
			ele.click();
			System.out.println(driver.getTitle());
			driver.switchTo().window(driver.getWindowHandle());
		}
String handel=driver.getWindowHandle();
		Set<String> whandels = driver.getWindowHandles();
		System.out.println(driver.getWindowHandle());
		for (String h : whandels) {
			System.out.println(h);
			if (handel.equalsIgnoreCase(h)) {
				driver.switchTo().window(h);
			} else {
				driver.switchTo().window(h);
				System.out.println(driver.getTitle());
				// driver.close();
			}

		}

	}
}
