package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDrivers.PageDriver;


public class mainpage {
	
	public void mainpage(){
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		
	}
	//TC01 - click on the account button
	@FindBy (xpath="(//*[contains(@class, 'header__icon--desktop--text')])[2]\")")
	 WebElement clickaccount;



 	  public void clickaccount() throws InterruptedException {
 		clickaccount.click();
		Thread.sleep(10000);
	
   }



}
