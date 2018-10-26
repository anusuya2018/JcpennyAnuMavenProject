package page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Add_An_Addresses {
	WebDriver driver;
 	public  Add_An_Addresses(WebDriver ldriver)
 	{
 		this.driver=ldriver;
 	}
 	
 	
 	@FindBy(how=How.XPATH,using="//input[@id='firstName']")
 	private static WebElement Firstname;

 	@FindBy(how=How.XPATH,using="//input[@id='lastName']")
 	private static WebElement Lastname;
 	
 	@FindBy(how=How.XPATH,using="//div[@class='_1Nydh']//div[3]//div[1]//div[1]//select[1]")
 	private static WebElement Country;
 	
 	@FindBy(how=How.XPATH,using="//input[@id='addressLineOne']")
 	private static WebElement Street_Address;
 	
 	@FindBy(how=How.XPATH,using="//input[@id='zip']")
 	private static WebElement Zip;
 	
 	@FindBy(how=How.XPATH,using="//input[@id='city']")
 	private static WebElement City;
 	
 	@FindBy(how=How.XPATH,using="//div[@class='_1Nydh']//div[6]//div[1]//div[1]//select[1]")
 	private static WebElement State;
 	
 	@FindBy(how=How.XPATH,using="//input[@id='phone']")
 	private static WebElement Phone;
 	
 	@FindBy(how=How.XPATH,using="//button[@type='submit']")
 	private static WebElement Save;
 	
 	@FindBy(how=How.XPATH,using="//div[@class='sm12 md12 lg6 xl6']")
 	private static List<WebElement> AddressHub;
 	 		
 	public static WebElement getFirstname() {
		return Firstname;
	}


	public static void setFirstname(WebElement firstname) {
		Firstname = firstname;
	}


	public static WebElement getLastname() {
		return Lastname;
	}


	public static void setLastname(WebElement lastname) {
		Lastname = lastname;
	}


	public static WebElement getCountry() {
		return Country;
	}


	public static void setCountry(WebElement country) {
		Country = country;
	}


	public static WebElement getStreet_Address() {
		return Street_Address;
	}


	public static void setStreet_Address(WebElement street_Address) {
		Street_Address = street_Address;
	}


	public static WebElement getZip() {
		return Zip;
	}


	public static void setZip(WebElement zip) {
		Zip = zip;
	}


	public static WebElement getCity() {
		return City;
	}


	public static void setCity(WebElement city) {
		City = city;
	}


	public static WebElement getState() {
		return State;
	}


	public static void setState(WebElement state) {
		State = state;
	}


	public static WebElement getPhone() {
		return Phone;
	}


	public static void setPhone(WebElement phone) {
		Phone = phone;
	}


	public static WebElement getSave() {
		return Save;
	}


	public static void setSave(WebElement save) {
		Save = save;
	}
	public static List<WebElement> getAddressHub() {
		return AddressHub;
	}


	public static void setAddressHub(List<WebElement> addressHub) {
		AddressHub = addressHub;
	}


	public void Add_Address_Click(String firstname,String lastname,String country,String address,String zip,String city,String state,String phone) throws InterruptedException {
 		Firstname.sendKeys(firstname);
 		Lastname.sendKeys(lastname);
 		
 		Select country1=new Select(Country);
		country1.selectByVisibleText(country);
		Street_Address.sendKeys(address);
		Zip.sendKeys(zip);
		Thread.sleep(2000);
		
		Select state1=new Select(State);
		state1.selectByVisibleText(state);
		Thread.sleep(2000);
		City.clear();
		City.sendKeys(city);
		//City.clear();
		Phone.sendKeys(phone);
		Save.click();

	}
	public void Address_Hub_Count()
	{
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Total Number of Address" + AddressHub.size());
		for (WebElement options : AddressHub) {
		softAssert.assertEquals(options, "1076 PARSONS AVE");
		System.out.println("-------------------------------");
		System.out.println(options.getText());
		//System.out.println("Manage address card has the 1076 PARSONS AVE Address");
		}
		 
  	      	    
	}

	public void Address_Hub_Count1()
	{
		
		List<String> list = new ArrayList<String>();

		for(int j=1;j<AddressHub.size();j++){  
		  System.out.println("-------------------------------");
		  System.out.println("address hub page have"+j+ " address index"+list.add(AddressHub.get(j).getText()));
		}
	}
	
}
