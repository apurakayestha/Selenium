package StepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class StepDefinations {

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Initialize");
		System.out.println("Again");
		System.out.println("2 Again");
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//	driver.get(arg1);
		System.out.println("navigate");
	}

	@Given("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
		System.out.println("Click");
	}

	

	
	 @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		 
		 System.out.println(username);
		 System.out.println(password);
		 }
	
	 @Then("^Verify that user is succesfully logged in$")
		public void verify_that_user_is_succesfully_logged_in() throws Throwable {
		    System.out.println("Verify");
		}
	 
	 @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	  
	    }
	


}
