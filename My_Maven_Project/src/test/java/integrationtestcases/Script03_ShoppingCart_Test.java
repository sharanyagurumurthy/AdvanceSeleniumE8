package integrationtestcases;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomrepository.HomePage;
import pomrepository.ShoppingCartPage;

public class Script03_ShoppingCart_Test extends BaseClass {

	@Test
	public void shoppingcartScript03() throws InterruptedException
	{
		hp = new HomePage(driver);
		hp.getShoppingcartButton().click();
		sp = new ShoppingCartPage(driver);
		sp.getRemoveCheckBox().click();
		sp.getUpdatecartButton().click();
		Thread.sleep(5000);
	}
}
