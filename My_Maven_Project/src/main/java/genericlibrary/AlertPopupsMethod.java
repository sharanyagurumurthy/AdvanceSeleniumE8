package genericlibrary;

import org.openqa.selenium.WebDriver;

public class AlertPopupsMethod {
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}

}
