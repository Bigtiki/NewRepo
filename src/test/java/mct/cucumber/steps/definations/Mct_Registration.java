package mct.cucumber.steps.definations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class Mct_Registration {
	Mct_page_loader page;
	
	public Mct_Registration(Mct_page_loader page) {
		this.page = page;
		
	}
	
	
	
	@When("user go to sighnUp Page")
	public void user_go_to_sighnUp_Page() {
	    page.getHomePage().takeMetoSignUPPage();
	}

	@When("Use can register as a new user")
	public void use_can_register_as_a_new_user() {
	   page.getRegPage().completeREgistraionWith("Mr.abc023@gmail.com", "mrabc023", "Mr", "abc023");
	}

	@Then("User See profile name as Registered user")
	public void user_See_profile_name_as_Registered_user() {
		String User=page.getHomePage().getProfileNameLabel();
		Assert.assertEquals(User, "MR ABC023","The Actual Result did not match the Expected Result");
		page.getRegPage().waitFor(6000);
		System.out.println("\t\t\tThe Actual Result is the Expected Result.....");
	   
	}


}
