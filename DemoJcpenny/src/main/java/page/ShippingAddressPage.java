package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage {
	WebDriver driver;
 	public  ShippingAddressPage(WebDriver ldriver)
 	{
 		this.driver=ldriver;
 	}
 	
 	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter your address']")
 	private static WebElement Address;
 	@FindBy(how=How.XPATH,using="//input[@name='zip']")
 	private static WebElement Zip;
 	@FindBy(how=How.XPATH,using="//select[@name='state']")
 	private static WebElement State;
 	@FindBy(how=How.XPATH,using="//button[@type='submit")
 	private static WebElement Continue;
 	
 	 	
 	public static WebElement getAddress() {
		return Address;
	}


	public static void setAddress(WebElement address) {
		Address = address;
	}


	public static WebElement getZip() {
		return Zip;
	}


	public static void setZip(WebElement zip) {
		Zip = zip;
	}


	public static WebElement getState() {
		return State;
	}


	public static void setState(WebElement state) {
		State = state;
	}


	public static WebElement getContinue() {
		return Continue;
	}


	public static void setContinue(WebElement continue1) {
		Continue = continue1;
	}


	public void Continue_button_click(String address,String zip,String state)
 	{
 		Address.sendKeys(address);
 		Zip.sendKeys(zip);
 		Select state1=new Select(State);
 		state1.selectByVisibleText(state);
 		Continue.click();
 			
 	}
 	
 	 	
}
