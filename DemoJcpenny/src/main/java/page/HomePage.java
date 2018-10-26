package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(how=How.ID,using="searchInputId")
	private static WebElement search;
	@FindBy(how=How.XPATH,using="//button[@type='button']")
	private static WebElement searchbutton;
	
	public static WebElement getSearch() {
		return search;
	}

	public static void setSearch(WebElement search) {
		HomePage.search = search;
	}

	public static WebElement getSearchbutton() {
		return searchbutton;
	}

	public static void setSearchbutton(WebElement searchbutton) {
		HomePage.searchbutton = searchbutton;
	}

	public void Searching(String item)
	{
		search.sendKeys(item);
		searchbutton.click();
	}
}
