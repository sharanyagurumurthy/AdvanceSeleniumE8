package functionaltestcases;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import genericlibrary.JavascriptExecutorScrollMethods;
import pomrepository.HomePage;

public class Script04_SearchStore_Test extends BaseClass {
	
	@Test
	public void searchStoreScript04() throws InterruptedException
	{
		hp = new HomePage(driver);
		hp.getSearchBox().sendKeys("Jewelry");
		hp.getSearchButton().click();
		JavascriptExecutorScrollMethods js = new JavascriptExecutorScrollMethods();
		js.scrollDown(driver);
		Thread.sleep(3000);
	}

}
