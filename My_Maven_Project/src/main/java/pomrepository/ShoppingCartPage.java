package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(name = "removefromcart")
	private WebElement removeCheckBox;
	
	@FindBy(name = "updatecart")
	private WebElement updatecartButton;

	public WebElement getRemoveCheckBox() {
		return removeCheckBox;
	}

	public WebElement getUpdatecartButton() {
		return updatecartButton;
	}
}
