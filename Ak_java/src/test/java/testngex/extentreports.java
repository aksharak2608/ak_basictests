package testngex;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.helper;

public class extentreports {
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
		String title=driver.getTitle();
		if(title.equals("opensource"))
		{
			logger.log(Status.FAIL, "test passed");
		}
		else
		{
			logger.log(Status.PASS, "test failed");
			logger.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(System.getProperty("user.dir")+"\\screenshots\\abc.png").build());
					//MediaEntityBuilder.createScreenCaptureFromPath(
					//System.getProperty("user.dir")+"\\screenshots\\abc.png"));
		}
		
		ExtentTest test = ext.createTest("MyFirstTestscreenshot");

		// reference image saved to disk
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir")+"\\screenshots\\abc.png").build());

		// base64
		test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());

		ext.flush();
	}
}
