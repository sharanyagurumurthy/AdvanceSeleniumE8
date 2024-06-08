package genericlibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;



public class JavascriptExecutorScrollMethods {
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}

}
