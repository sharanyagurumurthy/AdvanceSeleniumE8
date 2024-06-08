package integrationtestcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomrepository.ElectronicsPage;
import pomrepository.HomePage;

public class Script02_Electronics_Test extends BaseClass {
	@Test
	public void electronicsScript02() throws InterruptedException
	{
		hp = new HomePage(driver);
		hp.getElectronicsButton().click();
		ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		ep.getSmartphoneButton().click();
		ep.getAddToCartButton().click();
		Thread.sleep(3000);
	}
}
