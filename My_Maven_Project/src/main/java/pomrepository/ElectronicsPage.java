package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	
	public ElectronicsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Camera, photo")
	private WebElement cameraPhotoLink;
	
	@FindBy(linkText = "Cell phones")
	private WebElement cellPhoneLink;
	
	

	@FindBy(linkText = "Smartphone")
	private WebElement smartphoneLink;
	
	@FindBy(linkText = "Smartphone")
	private WebElement smartphoneButton;
	
	@FindBy(id = "add-to-cart-button-43")
	private WebElement addToCartButton;

	public WebElement getCameraPhotoLink() {
		return cameraPhotoLink;
	}

	public WebElement getSmartphoneLink() {
		return smartphoneLink;
	}

	public WebElement getSmartphoneButton() {
		return smartphoneButton;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	public WebElement getCellPhoneLink() {
		return cellPhoneLink;
	}

}
