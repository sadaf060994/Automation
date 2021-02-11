package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {
	
	 	@Given("^User is on homepage$")
	    public void user_is_on_homepage() throws Throwable {
	 		System.out.println("User is on homepage");
	       
	    }

	    @When("^Username and password is entered$")
	    public void username_and_password_is_entered() throws Throwable {
	    	System.out.println("Username and password is entered");
	    }

	    @Then("^Homepage is populated$")
	    public void homepage_is_populated() throws Throwable {
	    	System.out.println("Homepage is populated");
	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	System.out.println("Cards are displayed");
	    }
	

}
