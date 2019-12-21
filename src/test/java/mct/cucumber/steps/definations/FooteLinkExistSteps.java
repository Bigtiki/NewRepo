package mct.cucumber.steps.definations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class FooteLinkExistSteps {

	Mct_page_loader page; 
	
	// Constructor 
	public FooteLinkExistSteps(Mct_page_loader page) {
		this.page = page;
	}
	@Given("User can see the footer links table")
	public void user_can_see_the_footer_links_table(DataTable optionTable) {
List<String> expOptionList = optionTable.asList();
		// Getting the List Of option from our Real MCT My Account Page 
		List<String> actualOptionResult = page.getFooterLink().getAllOptions();
		
		
		// Validation Both List are Identical 
		Assert.assertEquals(actualOptionResult, expOptionList, "not FOund");
	}

}
