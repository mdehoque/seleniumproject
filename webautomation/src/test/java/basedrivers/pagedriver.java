package basedrivers;

import org.openqa.selenium.WebDriver;

public class pagedriver {
	public static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	private static pagedriver instace = null;
	private static pagedriver instance;
	
	private pagedriver() {
		
	}
	
	public static pagedriver getInstance() {
		if(instance == null) {
			instance = new pagedriver();		
			
		}
		return instance;
	}
	
	public WebDriver getdriver() {
		return webDriver.get();
		
	}
	public void setDriver(WebDriver driver) {
		webDriver.set(driver);
	}
	
	public static WebDriver getCurrentDriver() {
		return getInstance().getdriver();
		
	}
	
	
}
