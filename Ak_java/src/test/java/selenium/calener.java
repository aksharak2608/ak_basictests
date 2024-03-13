package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.helper;

public class calener {

	public static void main(String[] args) {
		
		WebDriver driver=helper.browserSetup("chrome","https://www.expedia.com/");
		WebElement calender=driver.findElement(By.xpath("//button[@name='EGDSDateRange-date-selector-trigger']"));
		helper.WaitForElementClickable(calender, driver);
		WebElement day=driver.findElement(By.xpath("//div[@class='uitk-month uitk-month-double uitk-month-double-right']//table[@class='uitk-month-table']//*[text()='19']"));
		helper.WaitForElementClickable(day, driver);
		
		WebElement done=driver.findElement(By.xpath("//footer[contains(@class,'uitk-spacing-padding-block-three')]//button"));
		helper.WaitForElementClickable(done, driver);

	}

}
