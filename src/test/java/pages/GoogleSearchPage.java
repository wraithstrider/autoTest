package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends BasePage {

	public GoogleSearchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	@FindBy(name="q")
	WebElement searchBox;
	
	@FindBy(name="btnK")
	WebElement searchBtn;
	
	By searchBox1 = By.name("q");
	By searchBtn1 = By.name("btnK");

	public WebElement getSearchBox() {
		return driver.findElement(searchBox1);
//		return searchBox;
	}

	public WebElement getSearchBtn() {
		return driver.findElement(searchBtn1);
//		return searchBtn;
	}
	
}