package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShirtsPage {

	
    WebDriver driver;
 	public ShirtsPage(WebDriver ldriver)
 	{
 		this.driver=ldriver;
 	}
	
 	@FindBy(how=How.XPATH,using="//*[@id='content']//div[@data-automation-id='gallery-product-list-undefined'][3]//li[@data-automation-id='list-item-0']//a")
 	private static WebElement SelectItem;
	@FindBy(how=How.XPATH,using="//select[@name='size range']")
	private static WebElement Range;
	@FindBy(how=How.CSS,using="select[name='size']")
	private static WebElement Size;
	@FindBy(how=How.CSS,using="img._3JaiK")
	private static List<WebElement> Color;
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Add To Cart')]")
	private static WebElement AddToCart;
	
			
	public static WebElement getSelectItem() {
		return SelectItem;
	}


	public static void setSelectItem(WebElement selectItem) {
		SelectItem = selectItem;
	}


	public static WebElement getRange() {
		return Range;
	}


	public static void setRange(WebElement range) {
		Range = range;
	}


	public static WebElement getSize() {
		return Size;
	}


	public static void setSize(WebElement size) {
		Size = size;
	}


	public static List<WebElement> getColor() {
		return Color;
	}


	public static void setColor(List<WebElement> color) {
		Color = color;
	}


	public static WebElement getAddToCart() {
		return AddToCart;
	}


	public static void setAddToCart(WebElement addToCart) {
		AddToCart = addToCart;
	}


	public void AddToCartClick(String range,String size)
	{
		try {
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SelectItem);
			SelectItem.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Select ran=new Select(Range);
		ran.selectByVisibleText(range);
		
		Select siz=new Select(Size);
		siz.selectByVisibleText(size);
		
		Color.get(3).click();
		
		try {
			Thread.sleep(3000);
			AddToCart.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
		
	
}
