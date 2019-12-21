package mct.cucumber.steps.definations;

import io.cucumber.java.en.Given;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class Product_Availability_Steps {
	
	Mct_page_loader page;
	public Product_Availability_Steps(Mct_page_loader page) {
		this.page = page;
	}
	@Given("User can see atleast  {int} prducts")
	public void user_can_see_atleast_prducts(int ProductCount) {
	    page.getHomePage().getProductCount(ProductCount);
	    
	}

}
