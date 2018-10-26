package page;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

public class My_Acc_page {
	WebDriver driver;
	public My_Acc_page(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(how=How.CSS,using="button.tooltip>div._1wvIT")
    private static WebElement My_Account;	
	
	@FindBy(how=How.CSS,using="li._32wp9._3tF7L._1_J76._2bm56[data-automation-id='list-item-0']>a")
	 private static WebElement My_Account1;	
	
	@FindBy(how=How.CSS,using="li._32wp9._3tF7L._1_J76._2bm56[data-automation-id='list-item-8']>a")
	private static WebElement Signout;
	
	
	@FindBy(how=How.XPATH,using="//button[@data-automation-id='manage_profile_icon']")
	private static WebElement manageAddress;
	
	@FindBy(how=How.XPATH,using="//span[@data-automation-id='my_address_default_address_line']")
	private static WebElement verifyAddress;
	
	
	public static WebElement getMy_Account() {
		return My_Account;
	}
	public static void setMy_Account(WebElement my_Account) {
		My_Account = my_Account;
	}
	public static WebElement getManageAddress() {
		return manageAddress;
	}
	public static void setManageAddress(WebElement manageAddress) {
		My_Acc_page.manageAddress = manageAddress;
	}
	public static WebElement getVerifyAddress() {
		return verifyAddress;
	}
	public static void setVerifyAddress(WebElement verifyAddress) {
		My_Acc_page.verifyAddress = verifyAddress;
	}
	
	public static WebElement getSignout() {
		return Signout;
	}
	public static void setSignout(WebElement signout) {
		Signout = signout;
	}
	
	public void verify_Address()
	{
		SoftAssert softAssert = new SoftAssert();
		//String actual=manageAddress.getText();
	    //softAssert.assertEquals(actual, "Manage Addresses");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", manageAddress);
		if(manageAddress.isDisplayed())
		{
			String verAdd=verifyAddress.getText();
			softAssert.assertEquals(verAdd, "1076 PARSONS AVE","Manage address card does not have the 1076 PARSONS AVE Address");
			System.out.println("-------------------------------");
			System.out.println("Manage address card has the 1076 PARSONS AVE Address");
			softAssert.assertAll();
		}
		
	}
	
	public void My_Account_Click() {
		My_Account.click();
		My_Account1.click();
	
	}
	public void Signout_Click() {
	My_Account.click();
	Signout.click();
	}
	
}
