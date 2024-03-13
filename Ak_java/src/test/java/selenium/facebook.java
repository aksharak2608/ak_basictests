package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.helper;

public class facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver=helper.browserSetup("chrome","https://www.facebook.com/");

Thread.sleep(20000);

driver.findElement(By.xpath("//a[text()='Create new account']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("akshara");
Select day=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));

day.selectByIndex(3);
Thread.sleep(3000);
day.selectByValue("9");
Thread.sleep(3000);
day.selectByVisibleText("20");
List<WebElement> gender=driver.findElements(By.xpath("//input[@name='sex']"));
for(WebElement ele:gender)
{
	ele.click();
	System.out.println(ele.isSelected());
}

Thread.sleep(2000);

driver.quit();

	}

}
