package Tests;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseDrivers.BaseDriver;
import BaseDrivers.PageDriver;
import Pages.Islamicbookpage;

public class Islamicbookpagetest extends BaseDriver {
	
	
	@BeforeClass
	public void start() {
		PageDriver.getCurrentDriver().get(baseURL);
	
		
	}
	
	@Test
	public void islamicbookpagetest() throws IOException, InterruptedException {
	Islamicbookpage islmaicbookpage = new Islamicbookpage();
	islmaicbookpage.islamicbookadd();
	
 

}

}