package stepDefinitions;

import java.io.IOException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import resources.base;

public class stepDefinitionverify1 extends base{

	@Given("Initialize the browser with Chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
		driver =initializeDriver();
	}

	@When("Navigate to {string} site")
	public void navigate_to_site(String string) {
		driver.get(prop.getProperty("url"));
	}

	@Then("Click on {string} module and verify that {string} is listed in list")
	public void click_on_module_and_verify_that_is_listed_in_list(String string, String string2) {
		LandingPage l=new LandingPage(driver);
		l.getModule1().click(); 
		l.getListing().isDisplayed();	
		System.out.println("Test completed.");
	}

	@And("Close the browsers")
	public void close_the_browsers() {
		driver.close();
		driver=null;
	}

}
