package stepdef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepdef1 {

    @Given("^User has landed to the login page$")
    public void user_has_landed_to_the_login_page() throws Throwable {
       System.out.println("given");
    }

    @When("^user has provided \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_has_provided_something_and_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1+""+strArg2);
    }

    @Then("^user is landed to the homepage$")
    public void user_is_landed_to_the_homepage() throws Throwable {
    	System.out.println("then");
    }

    @And("^clicks on login button$")
    public void clicks_on_login_button() throws Throwable {
    	System.out.println("and");
    }

}