package stepDefinitions;

import java.io.IOException;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HotelsPage;
import pageObjects.LandingPage;
import resources.base;

public class stepDefinitionverify2 extends base{

	@Given("Initialize the browser with Chrome again")
	public void initialize_the_browser_with_chrome_again() throws IOException {
		driver =initializeDriver();
	}

	@When("Navigate to {string} site again")
	public void navigate_to_site_again(String string) {
		driver.get(prop.getProperty("url"));
	}
	
	@And("Enter {string} of choice and Click on {string} button")
	public void enter_of_choice_and_click_on_button(String string, String string2) {
		LandingPage l=new LandingPage(driver);
		l.getCity().click();
		l.getCity().sendKeys(string);
		l.getSearch().click();
		System.out.println(string2+" button is clicked.");
	}

	@Then("Verify that address of 1st hotel displayed has correct city name")
	public void verify_that_address_of_1st_hotel_displayed_has_correct_city_name() {
		HotelsPage h=new HotelsPage(driver);
		Assert.assertEquals(h.getAddress().getText(), "    1 JBS Haldane Avenue Kolkata, India 700046     ");
		System.out.println("Test completed.");
	}
	
	@And("Close the browsers again")
	public void close_the_browsers_again() {
		driver.close();
		driver=null;
	}
}
