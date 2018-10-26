package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class My_Info_Page {
	WebDriver driver;
 	public  My_Info_Page(WebDriver ldriver)
 	{
 		this.driver=ldriver;
 	}
 	
 /*	//@FindBy(how=How.XPATH,using="//div[contains(text(),'My Info')]")
 	//@FindBy(how=How.XPATH,using="//div[@class='_9bcAk sL9TH']//ul[@class='parent-list']//li[3]//button[1]")
 	
 	//@FindBy(how=How.XPATH,using="//ul[@class='parent-list']//li[3]//button[1]//div[1]//div[3]")
 	
 	//@FindBy(how=How.CSS,using="main._1-d3i._2BWDM article.contentContainer.containerWidth div._3T_tj._7efwz.layout-container div._9bcAk.sL9TH ul.parent-list li.QhcTu.parent:nth-child(3) button._3urzx._10QDd._1LgnP._3MWjv > div._1PjUx")
 	////div[@class='_9bcAk sL9TH']//li[3]//li[3]
 	//@FindBy(how=How.XPATH,using="//ul[@class='parent-list']/li[3]/button[1]")
 	@FindBy(how=How.CSS,using="button._3urzx._10QDd._1LgnP._3MWjv")
 	private WebElement My_Info;*/
 	
 	@FindBy(how=How.CSS,using="button .sI13D>.text")
    private static List<WebElement> My_Info;	
 	
 	@FindBy(how=How.CSS,using="ul .sI13D>.text")
    private static List<WebElement>  Addresses;
 	
 	/*@FindBy(how=How.XPATH,using="//div[contains(text(),'Addresses')]")
 	private static WebElement Addresses;*/
 	
 	@FindBy(how=How.XPATH,using="//button[contains(text(),'Add An')]")
 	private static WebElement Add_An_Address;
 	
 	
	
	public static List<WebElement> getAddresses() {
		return Addresses;
	}
	public static void setAddresses(List<WebElement> addresses) {
		Addresses = addresses;
	}
	public static WebElement getAdd_An_Address() {
		return Add_An_Address;
	}
	public static void setAdd_An_Address(WebElement add_An_Address) {
		Add_An_Address = add_An_Address;
	}
	public static List<WebElement> getMy_Info() {
		return My_Info;
	}
	public static void setMy_Info(List<WebElement> my_Info) {
		My_Info = my_Info;
	}
	
	public void My_Info_Address_Click() {
		 System.out.println("-------------------------------");
		 for (WebElement options : My_Info) {
			
             System.out.println("option are : " + options.getText());
             if (options.getText().equalsIgnoreCase("My Info")) {
                    options.click();
                    break;
             }
             
      }
		/*WebDriverWait wait1 = new WebDriverWait(driver, 5);
		wait1.until(ExpectedConditions.visibilityOf(My_Info));
		My_Info.click();*/
	}
	public void Addresses_click()
	{
		 System.out.println("-------------------------------");
		 for (WebElement options : Addresses) {
			
             System.out.println("suboption are : " + options.getText());
             if (options.getText().equalsIgnoreCase("Addresses")) {
                    options.click();
                    break;
             }
             
      }
	}
	public void Add_An_Address_click()
		{
		WebDriverWait wait2 = new WebDriverWait(driver, 5);
		try {
			wait2.until(ExpectedConditions.visibilityOf(Add_An_Address));
			Add_An_Address.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
	}
	
	
	
}
