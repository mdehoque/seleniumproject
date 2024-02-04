package Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;

import BaseDrivers.BaseDriver;
import BaseDrivers.PageDriver;


public class mainpagetest extends BaseDriver {
	
	
	@BeforeClass
	public void start() throws InterruptedException {
		PageDriver.getCurrentDriver().get(url);
		Thread.sleep(5000);
	}
	
	

}
