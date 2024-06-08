package functionaltestcases;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomrepository.HomePage;

public class Script02_Computer_Test extends BaseClass {
	
	@Test
	public void computerScript02() throws InterruptedException
	{
		hp = new HomePage(driver);
		hp.getComputerButton().click();
		Thread.sleep(3000);
	}

}
