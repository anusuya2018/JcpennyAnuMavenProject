package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import page.CheckOutPage;
import page.CheckoutPage1;
import page.CreateAccountPage;
import page.HomePage;
import page.PlaceOrderPage;
import page.ShippingAddressPage;
import page.ShirtsPage;
import util.BrowserFactory;
import util.Xls_Reader;

public class OrderTest {
	Xls_Reader reader=new Xls_Reader("C:\\Users\\anusuya.balamurugan\\eclipse-workspace\\DemoJcpenny\\Data\\DemoJcpennyworksheet.xlsx");

	String item= reader.getCellData("Sheet1", "item", 3);
	
	String range= reader.getCellData("Sheet1", "range", 3);
	String size= reader.getCellData("Sheet1", "size", 3);
	
	String quantity= reader.getCellData("Sheet1", "quantity", 3);
	String coupon= reader.getCellData("Sheet1", "coupon", 3);
	
	String firstname= reader.getCellData("Sheet1", "firstname", 3);
	String lastname=reader.getCellData("Sheet1", "lastname", 3);
	String email= reader.getCellData("Sheet1", "email", 3);
	String phone=reader.getCellData("Sheet1", "phone", 3);
	String password=reader.getCellData("Sheet1", "password", 3);
	
	
	String address=reader.getCellData("Sheet1", "address", 3);
	String state=reader.getCellData("Sheet1", "state", 3);
	String zip=reader.getCellData("Sheet1", "zip", 3);
	
	String credit=reader.getCellData("Sheet1", "creditcard", 3);
	String cvv=reader.getCellData("Sheet1", "cvv", 3);
	
	
	

@Test
public void OrderTestPage() throws IOException
{
	WebDriver driver=BrowserFactory.startBrowser("chrome","https://www.jcpenney.com");
	//Properties prop=new Properties();

	HomePage home=PageFactory.initElements(driver,HomePage.class);
	
	ShirtsPage ShirtsSearch=PageFactory.initElements(driver,ShirtsPage.class);
	
	CheckOutPage CheckOut=PageFactory.initElements(driver,CheckOutPage.class);
	
	CheckoutPage1 chkout=PageFactory.initElements(driver,CheckoutPage1.class);
	
	CreateAccountPage creAct=PageFactory.initElements(driver,CreateAccountPage.class);
	
	ShippingAddressPage Shipping=PageFactory.initElements(driver,ShippingAddressPage.class);
	
	PlaceOrderPage Place_Order=PageFactory.initElements(driver,PlaceOrderPage.class);
	
	
	
	home.Searching(item);
	
	ShirtsSearch.AddToCartClick(range,size);
	
	CheckOut.Checkout_click();
		
	chkout.ChkOut_Click(quantity,coupon);
	chkout.ChkOut_Click1();
	
	creAct.Create_acc_click1();
	creAct.Create_acc_click(firstname,lastname,email,phone,password);
	
	Shipping.Continue_button_click(address,zip,state);
		
	Place_Order.Place_order_click(credit,cvv);
	
	
}
}
