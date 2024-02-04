package BaseDrivers;

import org.openqa.selenium.WebDriver;

public class PageDriver {
	public static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	private static PageDriver instace = null;
	private static PageDriver instance;
	
	private void Pagedriver() {
		
	}
	
	public static PageDriver getInstance() {
		if(instance == null) {
			instance = new PageDriver();		
			
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


