package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import basedrivers.pagedriver;

public class LoginPage {
	
	public LoginPage(){
		PageFactory.initElements(pagedriver.getCurrentDriver(), this);
		
	}
	
// use @FindBys for multiple Xpath or CSS for same locator, if any locator fail it will test it with another locator
	@FindBys ({
		@FindBy(xpath = "//input[@placeholder='Username']"),
		@FindBy(xpath = "//input[@name='username']")		
	})
    WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	
	public void login() throws InterruptedException {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginButton.click();
		Thread.sleep(10000);
	}
	
}
			
    
    
	
		
	

