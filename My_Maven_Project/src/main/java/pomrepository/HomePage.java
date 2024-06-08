package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "small-searchterms")
	private WebElement searchBox;
	
	@FindBy(xpath = "//input[@value=\"Search\"]")
	private WebElement searchButton;
	
	@FindBy(linkText = "Books")
	private WebElement bookButton;
	
	@FindBy(linkText = "Computers")
	private WebElement computerButton;
	
	@FindBy(linkText = "Electronics")
	private WebElement electronicsButton;
	
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement apparelshoesButton;
	
	@FindBy(linkText = "Digital downloads")
	private WebElement digitaldownloadsButton;
	
	@FindBy (linkText = "Jewelry")
	private WebElement jewelryButton;
	
	@FindBy(linkText = "Gift Cards")
	private WebElement giftcardsButton;
	
	@FindBy(xpath = "//span[text()=\"Shopping cart\"]")
	private WebElement shoppingcartButton;
	
	@FindBy(xpath = "//span[text()=\"Wishlist\"]")
	private WebElement wishlistButton;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutButton;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBookButton() {
		return bookButton;
	}

	public WebElement getComputerButton() {
		return computerButton;
	}

	public WebElement getElectronicsButton() {
		return electronicsButton;
	}

	public WebElement getApparelshoesButton() {
		return apparelshoesButton;
	}

	public WebElement getDigitaldownloadsButton() {
		return digitaldownloadsButton;
	}

	public WebElement getJewelryButton() {
		return jewelryButton;
	}

	public WebElement getGiftcardsButton() {
		return giftcardsButton;
	}

	public WebElement getShoppingcartButton() {
		return shoppingcartButton;
	}

	public WebElement getWishlistButton() {
		return wishlistButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

}

