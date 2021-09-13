package stepDefinitions;

import java.io.IOException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.BenefitsPage;
import pageObjects.LandingPage;
import resources.base;

public class stepDefinitionverify3 extends base{

	@Given("Initialize the browser with Chrome once again")
	public void initialize_the_browser_with_chrome_once_again() throws IOException {
		 driver =initializeDriver();
	}

	@When("Navigate to {string} site once again")
	public void navigate_to_site_once_again(String string) {
		driver.get(prop.getProperty("url"));
	}

	@And("Click on {string} module and click on {string} column")
	public void click_on_module_and_click_on_column(String string, String string2) {
		LandingPage l=new LandingPage(driver);
	    l.getModule2().click();
	    l.getButton().click();
	}

	@Then("Verify that {string} are present in Benefits page.")
	public void verify_that_are_present_in_benefits_page(String string) {
		BenefitsPage b=new BenefitsPage(driver);
	    Assert.assertEquals(b.getMssg().getText(), "Mobile Check-In and Mobile Key");
		System.out.println("Test completed.");
	}

	@And("Close the browsers once again")
	public void close_the_browsers_once_again() {
		driver.close();
		driver=null;
	}
}
