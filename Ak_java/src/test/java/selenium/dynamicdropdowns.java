package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.helper;

public class dynamicdropdowns {

	public static void main(String[] args) {
		
		WebDriver driver=helper.browserSetup("chrome","https://practiceseleniumelements.blogspot.com/2021/08/autocomplete.html");
		WebElement input=driver.findElement(By.xpath("//input[@id='myInput']"));
		driver.navigate().refresh();
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
		
		
	//	helper.WaitForElementClickable(done, driver);

	}

}
