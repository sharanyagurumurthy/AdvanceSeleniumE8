package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {

	
	public BookPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement productDropDown;
	
	@FindBy(id = "products-pagesize")
	private WebElement productsizeDropDown;

	public WebElement getProductDropDown() {
		return productDropDown;
	}

	public WebElement getProductsizeDropDown() {
		return productsizeDropDown;
	}
}
