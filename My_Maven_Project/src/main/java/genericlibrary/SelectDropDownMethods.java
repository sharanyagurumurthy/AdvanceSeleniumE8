package genericlibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownMethods {
	
	public void selectDropDownByValue(WebElement dropdown,String value)
	{
	   Select s=new Select(dropdown);
	   s.selectByValue(value);
	}
	
	public void selectDropDownByVisibleText(WebElement dropdown,String visibleText)
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText(visibleText);
	}
}
