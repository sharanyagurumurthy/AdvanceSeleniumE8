package functionaltestcases;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomrepository.HomePage;

public class Script03_ShoppingCart_Test extends BaseClass {
	
	@Test
	
	public void shoppingCartScrip03() throws InterruptedException
	{
		hp = new HomePage(driver);
		hp.getShoppingcartButton().click();
		Thread.sleep(3000);
	}

}
