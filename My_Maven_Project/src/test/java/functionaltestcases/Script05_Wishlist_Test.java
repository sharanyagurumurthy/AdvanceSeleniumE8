package functionaltestcases;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomrepository.HomePage;

public class Script05_Wishlist_Test extends BaseClass {
	
	@Test
	public void wishlistScript05() throws InterruptedException
	{
		hp = new HomePage(driver);
		hp.getWishlistButton().click();
		Thread.sleep(3000);
	}

}
