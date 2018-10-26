package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {
	
	WebDriver driver;
 	public  CheckOutPage(WebDriver ldriver)
 	{
 		this.driver=ldriver;
 	}
	
 	@FindBy(how=How.CSS,using="button._3urzx._10QDd._3VfsG._2t2ZY")
	private static WebElement CheckOut;
	
 	 	//driver.findElement(By.cssSelector("main._1-d3i._2BWDM._1xO87 article.contentContainer.containerWidth section._33xuo:nth-child(1) section.hOi0J:nth-child(1) div._1ifCT div.AUJHg.gwkoj.lg4.xl4.qZbmt._1NaFA:nth-child(2) div.sticky-outer-wrapper div.sticky-inner-wrapper div._2jlrF._3PrzC div.row._3OBUC section._16h_M div:nth-child(2) div:nth-child(2) > button._3urzx._10QDd._3VfsG.UueGh._29mlv")).click();
	
	public static WebElement getCheckOut() {
		return CheckOut;
	}

	public static void setCheckOut(WebElement checkOut) {
		CheckOut = checkOut;
	}
	
	public void Checkout_click()
	{
		
	WebDriverWait wait = new WebDriverWait(driver, 5);
	try {
		wait.until(ExpectedConditions.visibilityOf(CheckOut));
		CheckOut.click();
	} catch (Exception e) {
		System.out.println("Element not visible");
	}
	
	
	}
	
}
