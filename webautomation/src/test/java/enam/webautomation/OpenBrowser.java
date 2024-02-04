package enam.webautomation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OpenBrowser extends BaseDriver {
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	@Test
	public void openurl() throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000); //(1000 = 1 second)
	}

}
