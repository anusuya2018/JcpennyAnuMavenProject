package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage1 {
	
	WebDriver driver;
 	public  CheckoutPage1(WebDriver ldriver)
 	{
 		this.driver=ldriver;
 	}
 	@FindBy(how=How.XPATH,using="//div[@class='CyeOe xl4 lg4 md5 LRUVU']//select[@name='quantity']")
	private static WebElement qty;
 	
 	@FindBy(how=How.XPATH,using="//div[@class='-gxXn']//input[@placeholder='Enter coupon or reward']")
 	private static WebElement Coupon;
 	@FindBy(how=How.XPATH,using="//div[@class='-gxXn']//button[@type='button'][contains(text(),'Apply')]")
 	private static WebElement Apply;	
 	
 	@FindBy(how=How.XPATH,using="//div[@data-automation-id='at-coupon-status']")
 	private static WebElement Status;
 	@FindBy(how=How.XPATH,using="//*[@id='content']//button[@data-automation-id='continue-shopping']")
 	private static WebElement OK;
 	
 	@FindBy(how=How.XPATH,using="//p[contains(text(),'The coupon entered has expired.')]")
 	private static WebElement ErrorMess;
 	
	
 	@FindBy(how=How.XPATH,using="//div[@data-automation-id='at-ordersummarywrapper-large']//button[@data-automation-id='test-automation-btn-checkout']")
 	private static WebElement COut;
 	//@FindBy(how=How.CSS,using="button[data-automation-id='test-automation-btn-checkout']")
 	
 		
 	
 	public static WebElement getQty() {
		return qty;
	}
	public static void setQty(WebElement qty) {
		CheckoutPage1.qty = qty;
	}
	public static WebElement getCoupon() {
		return Coupon;
	}
	public static void setCoupon(WebElement coupon) {
		Coupon = coupon;
	}
	public static WebElement getApply() {
		return Apply;
	}
	public static void setApply(WebElement apply) {
		Apply = apply;
	}
	public static WebElement getStatus() {
		return Status;
	}
	public static void setStatus(WebElement status) {
		Status = status;
	}
	public static WebElement getOK() {
		return OK;
	}
	public static void setOK(WebElement oK) {
		OK = oK;
	}
	public static WebElement getErrorMess() {
		return ErrorMess;
	}
	public static void setErrorMess(WebElement errorMess) {
		ErrorMess = errorMess;
	}
	public static WebElement getCOut() {
		return COut;
	}
	public static void setCOut(WebElement cOut) {
		COut = cOut;
	}
	
	public void ChkOut_Click(String quantity,String coupon) throws IOException
 	{
 	Select quan=new Select(qty);
	quan.selectByVisibleText(quantity);
	try {
	Coupon.sendKeys(coupon);
	Apply.click();
	//String error=ErrorMess.getText();
	System.out.println(Status.getText());
	OK.click();
	}
 	 catch(Exception e){
     File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
	FileUtils.copyFile(screenshotFile, new File("c:\\FailedTestCase.png"));
	
	}
     
	}
 	public void ChkOut_Click1()
 	{
 	WebDriverWait wait1 = new WebDriverWait(driver,10);
	try {
		wait1.until(ExpectedConditions.elementToBeClickable(COut));
		COut.click();
	} catch (Exception e) {
		System.out.println("Element not visible");
	}
 	}
}
