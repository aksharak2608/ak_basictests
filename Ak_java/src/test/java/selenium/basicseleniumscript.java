package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.helper;

public class basicseleniumscript {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\EAI\\workspace\\Ak_java\\webdriver\\chromedriver.exe");
driver= new ChromeDriver();

driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
handlecapche();

WebElement searchField=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
driver=helper.WaitForElementClickable(searchField, driver);
searchField.sendKeys("smart watch");
searchField.clear();	
searchField.sendKeys("smart phone");
WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
driver=helper.WaitForElementClickable(searchbutton, driver);
searchbutton.click();
searchField=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
String input=searchField.getAttribute("value");

System.out.println(input);
System.out.println(driver.getTitle());



	}

	
	public static void handlecapche()
	{

WebElement amazoneIcon=driver.findElement(By.xpath("//a[@id='nav-logo-sprites' or @id='nav-bb-logo']"));
helper.WaitForElementClickable(amazoneIcon, driver);
amazoneIcon.click();
	}
}
