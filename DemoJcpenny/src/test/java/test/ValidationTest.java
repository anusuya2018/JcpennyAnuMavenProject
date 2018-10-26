package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import page.Add_An_Addresses;
import page.CreateAccountPage;
import page.My_Acc_page;
import page.My_Info_Page;
import page.New_Register_Page;
import page.Sign_In_page;
import util.BrowserFactory;
import util.Xls_Reader;

public class ValidationTest {
	Xls_Reader reader=new Xls_Reader("C:\\Users\\anusuya.balamurugan\\eclipse-workspace\\DemoJcpenny\\Data\\DemoJcpennyworksheet.xlsx");

	String firstname= reader.getCellData("Sheet1", "firstname", 2);
	String lastname=reader.getCellData("Sheet1", "lastname", 2);
	String email= reader.getCellData("Sheet1", "email", 2);
	String phone=reader.getCellData("Sheet1", "phone", 2);
	String password=reader.getCellData("Sheet1", "password", 2);
	String country=reader.getCellData("Sheet1", "country", 2);
	String address=reader.getCellData("Sheet1", "address", 2);
	String city=reader.getCellData("Sheet1", "city", 2);
	String state=reader.getCellData("Sheet1", "state", 2);
	String zip=reader.getCellData("Sheet1", "zip", 2);
	String address1=reader.getCellData("Sheet1", "address1", 2);
	String zip1=reader.getCellData("Sheet1", "zip1", 2);
	String city1=reader.getCellData("Sheet1", "city1", 2);
	String state1=reader.getCellData("Sheet1", "state1", 2);
	

	@Test
	public void ValidationTestPage() throws IOException, InterruptedException
	{
		WebDriver driver=BrowserFactory.startBrowser("chrome","https://www.jcpenney.com");
		//Properties prop=new Properties();
		
		New_Register_Page Register=PageFactory.initElements(driver,New_Register_Page.class);
			
		CreateAccountPage creAct=PageFactory.initElements(driver,CreateAccountPage.class);
		
		 My_Info_Page My_info=PageFactory.initElements(driver,My_Info_Page.class);
		
		 
		 Add_An_Addresses Add_Address=PageFactory.initElements(driver,Add_An_Addresses.class);
		
		 
		 My_Acc_page my_Account=PageFactory.initElements(driver, My_Acc_page.class);
		
		 Sign_In_page Sign_In=PageFactory.initElements(driver, Sign_In_page.class);
		
		 System.out.println(firstname);
		 System.out.println(lastname);
		 System.out.println(phone);

		 
		 		
			   Register.New_Register_Here();
			   creAct.Create_acc_click(firstname,lastname,email,phone,password);
			   Thread.sleep(10000);
			   My_info.My_Info_Address_Click();
			   My_info.Addresses_click();
			   My_info.Add_An_Address_click();
			   Thread.sleep(3000);
			   Add_Address.Add_Address_Click(firstname,lastname,country,address,zip,city,state,phone);
			   Add_Address.Address_Hub_Count();
			   Thread.sleep(3000);
			   My_info.Add_An_Address_click();
			   Thread.sleep(3000);
			   Add_Address.Add_Address_Click(firstname,lastname,country,address1,zip1,city1,state1,phone);
			   Thread.sleep(3000);
			   my_Account.My_Account_Click();
			   Thread.sleep(3000);
			   my_Account.verify_Address();
			   Thread.sleep(10000);
			   my_Account.Signout_Click();
			   Sign_In.Sign_In_Click(email,password);
			   Thread.sleep(10000);
			   My_info.My_Info_Address_Click();
			   My_info.Addresses_click(); 
			   Add_Address.Address_Hub_Count();
			 
	}
}
