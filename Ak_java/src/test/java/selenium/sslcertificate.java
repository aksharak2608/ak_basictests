package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sslcertificate {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();	
		// Selenium Grid
		
	// cap=new DesiredCapabilities();
		
	//	cap.acceptInsecureCerts();
	//	WebDriver driver=new ChromeDriver(cap);
	
		ChromeOptions opt=new ChromeOptions();
	
		opt.setAcceptInsecureCerts(true);
		opt.setImplicitWaitTimeout(Duration.ofSeconds(3000));
		opt.addArguments("start-maximized");
		opt.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(opt);
		
		//driver.manage().window().maximize();
		
	driver.get("https://www.cacert.org/");
		
		
	}

}
