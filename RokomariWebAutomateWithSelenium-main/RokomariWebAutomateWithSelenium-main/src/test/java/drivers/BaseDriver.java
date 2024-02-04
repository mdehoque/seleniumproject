package drivers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseDriver {
    public static String baseURL = "https://www.rokomari.com/book";

    public WebDriver driver = null;

    @BeforeSuite
    public void start(){
        String browser = System.getProperty("browser", "chrome");

        if(browser.contains("chrome")){

           //WebDriverManager.chromedriver().setup();
           //driver = new ChromeDriver();
           //not working with chrome version 116...(main version), so we are going to hard code for now; 
           //Next, we will pass it as variable with try catch statement to by bypass the hard coding after the fix
            //WebDriverManager.chromedriver().driverVersion("121.0.6167.140").setup();
            
            //ChromeOptions options = new ChromeOptions(); 
            //options.addArguments("--remote-allow-origins=*"); 
           // options.addArguments("--start-maximized");
            
            //driver =  new ChromeDriver(options); 
        	
        	ChromeOptions options = new ChromeOptions();
        	 options.addArguments("--remote-allow-origins=*"); 
        	      options.addArguments("--start-maximized");  
        	    WebDriver driver = new ChromeDriver(options);

        }
        else if(browser.contains("firefox")){
        	FirefoxOptions options = new FirefoxOptions();
       	 options.addArguments("--remote-allow-origins=*"); 
       	      options.addArguments("--start-maximized");  
       	    WebDriver driver = new FirefoxDriver(options);
            //WebDriverManager.firefoxdriver().setup();
            //driver = new FirefoxDriver();
        }
        else{
        	EdgeOptions options = new EdgeOptions();
       	 options.addArguments("--remote-allow-origins=*"); 
       	      options.addArguments("--start-maximized");  
       	    WebDriver driver = new EdgeDriver(options);
        	
            //WebDriverManager.edgedriver().setup();
            //driver = new EdgeDriver();
        }

        PageDriver.getInstance().setDriver(driver);
    }

    @AfterSuite
    public void close(){
        // driver.quit();
        PageDriver.getCurrentDriver().quit();
    }
}
