package pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(linkText = "Register")
	WebElement registerLink;
	@FindBy(id = "gender-female")
	WebElement femaleRadioButton;
	@FindBy(id = "FirstName")
	WebElement firstNameTextfield;
	@FindBy(id = "LastName")
	WebElement lastNameTextfield;
	@FindBy(id = "Email")
	WebElement emailTextfield;
	@FindBy(id = "Password")
	WebElement passwordTextfield;
	@FindBy(id = "ConfirmPassword")
	WebElement confirmPasswordTextfield;
	@FindBy(id = "register-button")
	WebElement registerButton;
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}
	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}
	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	public WebElement getConfirmPasswordTextfield() {
		return confirmPasswordTextfield;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}

}
