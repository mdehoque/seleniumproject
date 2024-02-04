package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import basedrivers.basedriver;
import basedrivers.pagedriver;
import pages.DashboardPage;
import pages.LoginPage;

public class DeshboardTest extends basedriver{
	
	@BeforeClass
	public void start() throws InterruptedException {
		pagedriver.getCurrentDriver().get(url);
		Thread.sleep(5000);
	}
	@Test
	public void DeshboardTest() throws InterruptedException {
		DashboardPage dashboardPage = new DashboardPage();
		dashboardPage.admin();

}
}