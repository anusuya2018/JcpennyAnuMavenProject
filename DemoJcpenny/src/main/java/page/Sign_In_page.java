package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Sign_In_page {
	WebDriver driver;
	public Sign_In_page(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Sign in To your Account')]")
	private static WebElement sign_in_your_account;
	@FindBy(how=How.XPATH,using="//input[@placeholder='email@yourdomain.com']")
	private static WebElement Email;
	@FindBy(how=How.XPATH,using="//input[@name='pwd']")
	private static WebElement Password;
	@FindBy(how=How.XPATH,using="//button[@data-automation-id='signin_button']")
	private static WebElement Sign_In;
	
	public void Sign_In_Click(String email,String password)
	{
		sign_in_your_account.click();
		Email.sendKeys(email);
		Password.sendKeys(password);
		Sign_In.click();
		
		
	}
	
	
	
	

	
}
