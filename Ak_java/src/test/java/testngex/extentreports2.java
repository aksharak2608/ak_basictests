package testngex;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.helper;

public class extentreports2 {
	@Test
	public void test()
	{
		String rp="D:\\EAI\\workspace\\Ak_java\\reports";
		Boolean actual=true;
		ExtentSparkReporter spark= new ExtentSparkReporter(rp+"\\report.html");
		ExtentReports ext= new ExtentReports();
		ext.attachReporter(spark);
		ExtentTest logger=ext.createTest("basic test");
		if(actual.equals(false))
		{
			logger.log(Status.FAIL, "test failed");
		}
		else
		{
			logger.log(Status.PASS, "test Passed");
		}
		ExtentTest logger2=ext.createTest("second test");
		WebDriver driver=helper.browserSetup("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		String title=driver.getTitle();
		if(title.equals("opensource"))
		{
			logger2.log(Status.FAIL, "test passed");
		}
		else
		{
			logger2.log(Status.PASS, "test failed");
		}			try {
				logger2.fail(MediaEntityBuilder.createScreenCaptureFromPath(helper.screenshot(driver)).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					//MediaEntityBuilder.createScreenCaptureFromPath(
					//System.getProperty("user.dir")+"\\screenshots\\abc.png"));
		
		
		ExtentTest test = ext.createTest("MyFirstTestscreenshot");

		// reference image saved to disk
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir")+"\\screenshots\\abc.png").build());

		// base64
		test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());

		ext.flush();
	}
}
