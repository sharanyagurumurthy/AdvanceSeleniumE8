package genericlibrary;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pomrepository.BookPage;
import pomrepository.ElectronicsPage;
import pomrepository.HomePage;
import pomrepository.LoginPage;
import pomrepository.RegisterPage;
import pomrepository.ShoppingCartPage;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExtentSparkReporter sparkReporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	public UtilityMethods um =new UtilityMethods();
	public LoginPage lp;
	public HomePage hp;
	public RegisterPage rp;
	public BookPage bp;
	public ElectronicsPage ep;
	public ShoppingCartPage sp;
	
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite()
	{
		sparkReporter = new ExtentSparkReporter("./extentreportse8"+um.getCurrentTime()+".html");
		reports = new ExtentReports();
		reports.attachReporter(sparkReporter);
	}
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass(@Optional("Chrome")String browser) throws IOException
	{
		if(browser.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}else if (browser.equals("Edge"))
		{
			driver = new EdgeDriver();
		}else {
			System.out.println("Please enter a valid browser name ");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(um.getDataFromPropertyFile("url"));
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(Method method) throws IOException
	{
		test= reports.createTest(method.getName());
		test.log(Status.INFO, "Execution Started");
		lp= new LoginPage(driver);
		lp.getLoginLink().click();
		test.log(Status.INFO, "User has clicked on login link");
		lp.getEmailTextField().sendKeys(um.getDataFromPropertyFile("email"));
		lp.getPasswordTextField().sendKeys(um.getDataFromPropertyFile("password"));
		lp.getClickLogin().click();
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterMethod()
	{
		
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass()
	{
		driver.close();
	}
	
	@AfterSuite(alwaysRun = true)
	public void afterSuite()
	{
		reports.flush();
	}

}
