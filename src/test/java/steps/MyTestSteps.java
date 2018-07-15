package steps;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GoogleResultPage;
import pages.GoogleSearchPage;

public class MyTestSteps{
	
	GoogleSearchPage googleSearchPage;
	GoogleResultPage googleResultPage;
	
	WebDriver driver = null;
	
	public MyTestSteps() {
		System.setProperty("webdriver.chrome.driver", "E:\\planit\\workspace\\autoTest\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Before
	public void setUp() {
		googleSearchPage = new GoogleSearchPage(driver);
		googleResultPage = new GoogleResultPage(driver);
	  }

	@Given("^I am user$")
	public void i_am_user() throws Throwable {
	}

	@When("^I go to website (.*?)$")
	public void i_go_to_website(String website) throws Exception {
		driver.get(website);
	}
	
	@When("^I search for (.*?)$")
	public void i_search_for_aratiles(String fruit) throws Exception {
	    googleSearchPage.getSearchBox().sendKeys(fruit);
	    googleSearchPage.getSearchBox().sendKeys(Keys.RETURN);
//	    googlePage.getSearchBtn().click();
	}
	
	@Then("^I should be on the search page$")
	public void i_should_be_onSearch_page() throws Exception {
		driver.getCurrentUrl().contains("search");
	}

	@Then("^I should see (.*?) in the result page$")
	public void i_should_see_fruit(String fruit) throws Exception {
		assertTrue(driver.getPageSource().contains(fruit));
	}

	@After
	public void tearDown() {
		driver.close();
	  }

}
