package base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {
	public static WebDriver driver;
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest logger;

	
@BeforeTest
public void beforeTestMethod()

{
	sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator + "rep" + File.separator + "SDETADDAExtentReport.html");
	extent = new ExtentReports();
	extent.attachReporter(sparkReporter);
	sparkReporter.config().setTheme(Theme.DARK);
	extent.setSystemInfo("HostName", "HEL8");
	extent.setSystemInfo("UserName", "root");
	sparkReporter.config().setDocumentTitle("Automation Report");
	sparkReporter.config().setReportName("Automation Tests Results by SDET ADDA");

}
}

@BeforeMethod
@Parameters("browser")
public void beforeMethodMethod(String browser)

		
	@AfterMethod
	@AfterTest
	
	
	
}
