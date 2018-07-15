package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	public WebDriver driver = null;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}