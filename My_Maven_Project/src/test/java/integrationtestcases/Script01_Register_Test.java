package integrationtestcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import genericlibrary.UtilityMethods;
import pomrepository.LoginPage;
import pomrepository.RegisterPage;

public class Script01_Register_Test {
	public WebDriver driver;
	public UtilityMethods um = new UtilityMethods();
	public RegisterPage rp;
	public LoginPage lp;
	@Test
	public void registerScript01(@Optional("Chrome") String browser) throws IOException, InterruptedException
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
		
		rp = new RegisterPage(driver);
		rp.getRegisterLink().click();
		rp.getFemaleRadioButton().click();
		rp.getFirstNameTextfield().sendKeys(um.getDataFromExcelFile("Sheet1", 0, 0));
		rp.getLastNameTextfield().sendKeys(um.getDataFromExcelFile("Sheet1", 0, 1));
		rp.getEmailTextfield().sendKeys(um.getDataFromExcelFile("Sheet1", 0, 2));
		rp.getPasswordTextfield().sendKeys(um.getDataFromExcelFile("sheet1", 0, 3));
		rp.getConfirmPasswordTextfield().sendKeys(um.getDataFromExcelFile("Sheet1", 0, 4));
		rp.getRegisterButton().click();
		
		lp = new LoginPage(driver);
		lp.getLoginLink().click();
		lp.getEmailTextField().sendKeys(um.getDataFromPropertyFile("email"));
		lp.getPasswordTextField().sendKeys(um.getDataFromPropertyFile("password"));
		lp.getClickLogin().click();
		Thread.sleep(3000);
		driver.close();
		
	}
	}


