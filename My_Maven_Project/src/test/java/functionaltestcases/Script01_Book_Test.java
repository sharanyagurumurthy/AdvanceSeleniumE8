package functionaltestcases;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomrepository.BookPage;
import pomrepository.HomePage;

public class Script01_Book_Test extends BaseClass {
	
	@Test
	public void loginScript01() throws InterruptedException
	{
		hp= new HomePage(driver);
		hp.getBookButton().click();
		Thread.sleep(3000);
	}
	
	

}
