package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PlaceOrderPage {
	WebDriver driver;
 	public PlaceOrderPage(WebDriver ldriver)
 	{
 		this.driver=ldriver;
 	}
 	@FindBy(how=How.XPATH,using="//button[@data-automation-id='at-Continue-btn']")
 	private static WebElement Continue_To_Click;
 	@FindBy(how=How.XPATH,using="//input[@id='at-input-creditcard-number']")
 	private static WebElement CreditCard;
 	@FindBy(how=How.XPATH,using="//input[@id='at-input-cvv']")
 	private static WebElement Cvv;
 	@FindBy(how=How.XPATH,using="//button[contains(text(),'Review Order')]")
 	private static WebElement Review_Order;
 	@FindBy(how=How.XPATH,using="//div[@class='sticky-inner-wrapper']//button[@type='button'][contains(text(),'Place Order')]")
 	private static WebElement Place_Order;
	
 	public static WebElement getContinue_To_Click() {
		return Continue_To_Click;
	}

	public static void setContinue_To_Click(WebElement continue_To_Click) {
		Continue_To_Click = continue_To_Click;
	}

	public static WebElement getCreditCard() {
		return CreditCard;
	}

	public static void setCreditCard(WebElement creditCard) {
		CreditCard = creditCard;
	}

	public static WebElement getCvv() {
		return Cvv;
	}

	public static void setCvv(WebElement cvv) {
		Cvv = cvv;
	}

	public static WebElement getReview_Order() {
		return Review_Order;
	}

	public static void setReview_Order(WebElement review_Order) {
		Review_Order = review_Order;
	}

	public static WebElement getPlace_Order() {
		return Place_Order;
	}

	public static void setPlace_Order(WebElement place_Order) {
		Place_Order = place_Order;
	}

	public void Place_order_click(String credit,String cvv)
 	{
 		Continue_To_Click.click();
 		CreditCard.sendKeys(credit);
 		Cvv.sendKeys(cvv);
 		Review_Order.click();
 		Place_Order.click();
 		
 	}
	
		
}
