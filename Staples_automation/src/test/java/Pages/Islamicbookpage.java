package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drivers.PageDriver;

public class Islamicbookpage {

	public Islamicbookpage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		
	}
	    @FindBy(xpath = "//ul[@class='sub-menu bangla-menu']/li[8]/a[contains(@href, '/islamic?ref=sm_p9')")
	    public WebElement islamicbook;
	    
	    @FindBy(xpath = "/html/body/header/div/nav/div/div[2]/div/div/div/ul[1]/li[8]/a")
	    public WebElement qurantafsir;
	    
	    @FindBy(xpath = "//div[@title='আমপাড়া (সাদা) حكيم الامت مولانا اشرف علي تهانوي رح ( হাকীমুল উম্মত মাওলানা আশরাফ আলী থানভী রহ.)']//div[1]//div[3]//button[1]")
	    public WebElement addampara;
	    
	
	
     public void islamicbookadd() throws IOException, InterruptedException {
    	 islamicbook.click();
    	 qurantafsir.click();
    	 addampara.click();
    	 Thread.sleep(10000);
    	 
     }
     }
     

