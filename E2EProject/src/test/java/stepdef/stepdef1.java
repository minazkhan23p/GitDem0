package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import resources.base;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import PageObjects.ForgotPage;
import PageObjects.LoginPage;
import PageObjects.landingPage;

@RunWith(Cucumber.class)
public class stepdef1 extends base {
	WebDriver driver;
	landingPage lp;
	LoginPage lgp;

	@Given("^inititialize the driver with chrome$")
	public void inititialize_the_driver_with_chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}

	@Given("^navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		driver.get(arg1);

	}

	@When("^user clicks on Login in homepage and user has provided (.+) and (.+)$")
	public void user_clicks_on_login_in_homepage_and_user_has_provided_and(String username, String password)
			throws Throwable {
		lp= new landingPage(driver);
		if(lp.nothankspopup().size()>0){
			lp.nothanks().click();
		}
		//
		lgp = lp.login();
		lgp.email().sendKeys(username);
		lgp.passowrd().sendKeys(password);

	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		lgp.submit().click();
	}

	@Then("^user is landed to the homepage$")
	public void user_is_landed_to_the_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ForgotPage fp= new ForgotPage(driver);
		System.out.println(fp.alert().getText());
	}

	@And("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	}

}