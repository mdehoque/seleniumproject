package tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import basedrivers.basedriver;
import basedrivers.pagedriver;
import pages.LoginPage;

public class LoginTest extends basedriver{
	
	@BeforeClass
	public void start() throws InterruptedException {
		pagedriver.getCurrentDriver().get(url);
		Thread.sleep(5000);
		
	}
	@Test
	public void LoginTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		loginPage.login();
	}

}
