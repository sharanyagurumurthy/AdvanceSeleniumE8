package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ComputersPage {
	
	public ComputersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@title=\"Show products in category Desktops\"])[1]")
	private WebElement desktopsButton;
	
	@FindBy(xpath = "(//a[@title=\"Show products in category Accessories\"])[1]")
	private WebElement accessoriesButton;

	public WebElement getDesktopsButton() {
		return desktopsButton;
	}

	public WebElement getAccessoriesButton() {
		return accessoriesButton;
	}
}
