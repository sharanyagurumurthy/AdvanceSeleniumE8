package genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickOnElementMethods extends BaseClass {
	
	public void clickOnElement(WebElement targetElement)
	{
		Actions actions = new Actions(driver);
		actions.click(targetElement).perform();
	}
	
	public void doubleClickOnElement(WebElement tarElement)
	{
		Actions actions = new Actions(driver);
		actions.doubleClick(tarElement).perform();
	}
    
	public void rightClickOnElement(WebElement tarElement)
	{
		Actions actions = new Actions(driver);
		actions.contextClick(tarElement).perform();
	}
	
}
