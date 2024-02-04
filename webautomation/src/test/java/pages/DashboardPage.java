package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basedrivers.pagedriver;

public class DashboardPage {
	
	public void DashbordPage(){
		PageFactory.initElements(pagedriver.getCurrentDriver(), this);
		
	}

	

       @FindBy(xpath="//a[@class='oxd-main-menu-item active']")
       WebElement admin;
       
   	  public void admin() throws InterruptedException {
		admin.click();
		Thread.sleep(10000);
	}

	

   	}